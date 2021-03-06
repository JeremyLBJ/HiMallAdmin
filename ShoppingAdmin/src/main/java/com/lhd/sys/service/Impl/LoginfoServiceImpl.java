package com.lhd.sys.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lhd.sys.dao.SysLogInfoMapper;
import com.lhd.sys.dao.SysLogMapper;
import com.lhd.sys.entity.SysLog;
import com.lhd.sys.entity.SysLogInfo;
import com.lhd.sys.entity.SysLogInfoExample;
import com.lhd.sys.service.LoginfoService;
import com.lhd.sys.untils.LaYuiPage;
import com.lhd.sys.vo.LoginfoVO;
import com.lhd.sys.vo.SysLogVO;

@Service("LoginfoService")
public class LoginfoServiceImpl implements LoginfoService{
	
	@Autowired
	private SysLogInfoMapper sysLogInfoMapper ;
	
	@Autowired
	private SysLogMapper sysLog  ;

	@Override
	public LaYuiPage findAllOrderList(int page, int limit) {
		SysLogInfoExample example = new SysLogInfoExample();
		example.setOrderByClause("logintime desc");
		// 后面改为count()函数
		//List<SysLogInfo> list2 = sysLogInfoMapper.selectByExample(null);
		Page<Object> startPage = PageHelper.startPage(page, limit);
		List<SysLogInfo> list = sysLogInfoMapper.selectByExample(example);
		long total = startPage.getTotal() ;
		return new LaYuiPage(list, total);
	}

	/**
	 * 全查询
	 */
	@Override
	public LaYuiPage findAllLoginfo(LoginfoVO loginfoVO) {
		// TODO Auto-generated method stub
		Page<Object> page = PageHelper.startPage(loginfoVO.getPage(), loginfoVO.getLimit()) ;
		List<SysLogInfo> list = sysLogInfoMapper.allFindSysLoginfo( loginfoVO.getLoginip(), loginfoVO.getLoginname()
																				, loginfoVO.getStartTime(), loginfoVO.getEndTime() ) ;
		long total = page.getTotal() ;
		return new LaYuiPage(list, total);
	}
	
	

	
	/**
	 * 删除
	 * 
	 */
	@Override
	@Transactional
	public void removeSysLoginfo(Integer id) {
		sysLogInfoMapper.deleteByPrimaryKey(id) ;
		
	}

	/**
	 * 批量删除
	 * 
	 */
	@Override
	@Transactional
	public void removeSysLoginfos(Integer[] ids) {
		// TODO Auto-generated method stub
		sysLogInfoMapper.batchDelete(ids) ;
		
	}

	/**
	 * 登录日志
	 * 
	 */
	@Override
	@Transactional
	public void loginMessage(SysLogInfo info) {
		sysLogInfoMapper.insert(info) ;
	}

	
	/**
	 * 全查询
	 * 
	 */
	@Override
	public LaYuiPage findAllSysLog(SysLogVO logVO) {
		Page<Object> startPage = PageHelper.startPage(logVO.getPage(), logVO.getLimit()) ;
		List<SysLog> list = this.sysLog.allFindSysLog(logVO.getIp(), logVO.getLoginname()
								,logVO.getStartTime() ,logVO.getEndTime() ) ;
		long total = startPage.getTotal() ;
		return new LaYuiPage(list, total) ;
	}

	
	/**
	 * 
	 * 
	 * 按照id删除登录日志
	 * 
	 */
	@Override
	@Transactional
	public void removeSysLog(Integer id) {
		this.sysLog.deleteByPrimaryKey(id) ;
		
	}

	/**
	 * 批量删除
	 * 
	 */
	@Override
	@Transactional
	public void removeSysLogs(Integer[] ids) {
		this.sysLog.batchDelete(ids) ;
		
	}

	/**
	 * 添加登录日志
	 * 
	 */
	@Override
	@Transactional
	public void SysLogin(SysLogVO logVO) {
		this.sysLog.insert(logVO) ;
		
	}

}
