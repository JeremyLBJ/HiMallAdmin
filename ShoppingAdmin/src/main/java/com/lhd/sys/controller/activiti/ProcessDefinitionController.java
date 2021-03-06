package com.lhd.sys.controller.activiti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhd.sys.common.DataGridView;
import com.lhd.sys.service.WolkFlowService;
import com.lhd.sys.vo.WolkFlowVO;

/**
 * 
 * 
 * 流程 定义
 * @author ASUS
 *
 */
@Controller
@RequestMapping("/activitiDefinition")
public class ProcessDefinitionController {
	
	@Autowired
	private WolkFlowService wolkFlowService ;
	
	
	@RequestMapping("/processDefinition")
	@ResponseBody
	public DataGridView processDefinition ( WolkFlowVO vo ) {
		DataGridView gridView = wolkFlowService.queryAllProcessDefinition(vo) ;
		return gridView ;
	}

}
