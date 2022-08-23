package com.spring.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pr.approval.service.IApprovalService;
import com.spring.pr.command.AncmtVO;
import com.spring.pr.command.SlctnVO;
import com.spring.pr.util.PageCreator;
import com.spring.pr.util.SearchVO;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	
	@Autowired
	private IApprovalService service;
	
	@GetMapping("/approvalList")
	public String list(SearchVO search, Model model, @RequestParam("page") int page) {

		System.out.println("page는"+ page);
		System.out.println("search는" +search);
		search.setPageNum(page);
		List<SlctnVO> list = service.getList(search);
		
		
		//버튼 배치 
		PageCreator pc = new PageCreator(); 
		
		pc.setPaging(search);
		pc.setArticleTotalCount(service.getTotal(search));
	
		model.addAttribute("slctnList", list);
		model.addAttribute("pc", pc);
		
		return "approval/approvList";
	
	}
	
		//글 상세보기 처리
		@GetMapping("/approvalDetail/{ano}")
		public String getContent(@PathVariable int ano, Model model) {
			System.out.println("상세보기 요청됨.");
			model.addAttribute("app", service.getContent(ano));
			return "approval/approvDetail";
		}
		
		
		@GetMapping("/approvalDelete/{ano}")
		public String delete(@PathVariable int ano) {
			
			System.out.println("삭제 요청들어옴");
			
			service.delete(ano);
			return "redirect:/approval/approvalList?page=1&cpp=10";
		
		}
	
	

}
