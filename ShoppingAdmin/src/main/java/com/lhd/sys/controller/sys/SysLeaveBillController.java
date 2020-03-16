package com.lhd.sys.controller.sys;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.sys.common.Constast;
import com.lhd.sys.common.ResultObject;
import com.lhd.sys.entity.SysUser;
import com.lhd.sys.service.SysLeaveBillService;
import com.lhd.sys.untils.LaYuiPage;
import com.lhd.sys.vo.SysLeaveBillVO;

/**
 * 请假
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/sysLeaveBill")
public class SysLeaveBillController {
	
	@Autowired
	private SysLeaveBillService sysLeaveBill ;
	
	
	
	@RequestMapping("/leaveBillMessage")
	public String leaveBillMessage () {
		return "leaveBill/leaveBillManage.html" ;
	}
	

	@RequestMapping("/leaveBillInfo")
	@ResponseBody
	public LaYuiPage leaveBillInfo ( SysLeaveBillVO vo , HttpSession session ) {
		SysUser user = (SysUser) session.getAttribute("user") ;
		if ( user.getType() == Constast.USER_TYPE_SUPER ) {
			LaYuiPage page = this.sysLeaveBill.allLeaveBill(vo) ;
			return page ;
		} else {
			vo.setUserid(user.getId()) ;
			LaYuiPage page = this.sysLeaveBill.allLeaveBill(vo) ;
			return page ;
		}
		
	}
	
	@RequestMapping("/addLeaveBill")
	@ResponseBody
	public ResultObject addLeaveBill ( SysLeaveBillVO vo ) {
		try {
			this.sysLeaveBill.addLeaveBill(vo);
			return ResultObject.ADD_SUCCESS ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return ResultObject.ADD_ERROR ;
		}
		
	}
	
	
	@RequestMapping("/updateLeaveBill")
	@ResponseBody
	public ResultObject updateLeaveBill ( SysLeaveBillVO vo ) {
		try {
			this.sysLeaveBill.updateLeaveBill(vo);
			return ResultObject.UPDATE_SUCCESS ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return ResultObject.UPDATE_ERROR ;
		}
	}
	
	
	
	@RequestMapping("/deleteLaeveBill")
	@ResponseBody
	public ResultObject deleteLaeveBill ( Integer id ) {
		try {
			this.sysLeaveBill.deleteLeaveBill(id);
			return ResultObject.DELETE_SUCCESS ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return ResultObject.UPDATE_ERROR ;
		}
	}
	
	
	@RequestMapping("/batechDelete")
	@ResponseBody
	public ResultObject batechDelete ( Integer [] ids ) {
		try {
			this.sysLeaveBill.batechDelete(ids);
			return ResultObject.DELETE_SUCCESS ;
		} catch (Exception e) {
			e.printStackTrace() ;
			return ResultObject.DELETE_ERROR ;
		}
	}

}
