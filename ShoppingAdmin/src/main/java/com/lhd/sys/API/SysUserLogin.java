package com.lhd.sys.API;

import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.sys.common.ActiverUser;
import com.lhd.sys.common.ResultObject;
import com.lhd.sys.common.WebUntils;
import com.lhd.sys.entity.SysLogInfo;
import com.lhd.sys.service.LoginfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(value="管理员登录功能" , description="管理员登录功能")
@RequestMapping("/sysUser")
public class SysUserLogin {
	
	@Autowired
	private LoginfoService loginfoService ;
	
	
	/**
	 * 使用Shiro进行登录
	 */
	@ApiOperation(value="根据用户用户姓名和密码进行验证登录")
	@PostMapping(value="/sysUserLoginByShiro")
	@ResponseBody
	public ResultObject adminLoginByShiro (@ApiParam("用户名") @RequestParam("name") String name , @ApiParam("密码")   @RequestParam("password") String password ) {
		//1.获取Subject
		Subject subject = SecurityUtils.getSubject() ;
		
		//封装用户信息
		UsernamePasswordToken token = new UsernamePasswordToken( name , password ) ;
		
		try {
			//登录方法
			subject.login(token);
			//登录成功
			//设置到session中
			ActiverUser user = (ActiverUser) subject.getPrincipal() ;
			WebUntils.getSession().setAttribute("user", user.getSysUser());
			
			//登录日志记录
			SysLogInfo info = new SysLogInfo() ;
			info.setLoginname(user.getSysUser().getName()+"-"+user.getSysUser().getLoginname());
			info.setLogintime(new Date());
			info.setLoginip(WebUntils.getRequest().getRemoteAddr());
			loginfoService.loginMessage(info);
			
			return  ResultObject.LONG_SUCCESS ;
		} catch (UnknownAccountException e) {
			//用户名不存在
			//返回登录页面
			return ResultObject.LONG_ERROR_PASS ;
		} catch (IncorrectCredentialsException e) {
			//密码错误
			//返回登录页面
			return ResultObject.LONG_ERROR_PASS ;
		}
		
	}


}
