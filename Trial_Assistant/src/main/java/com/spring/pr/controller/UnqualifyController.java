package com.spring.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pr.command.UnqualifyVO;
import com.spring.pr.unqualify.service.IUnqualifyService;
import com.spring.pr.util.PageCreator;
import com.spring.pr.util.SearchVO;

@Controller
@RequestMapping("/unq")
public class UnqualifyController {
	
	@Autowired
	private IUnqualifyService service;
	
	@GetMapping("/unqList")
	public String list(SearchVO search, Model model, @RequestParam("page") int page) {

		System.out.println("page는"+ page);
		System.out.println("search는" +search);
		search.setPageNum(page);
		List<UnqualifyVO> list = service.getList(search);
		
		
		//버튼 배치 
		PageCreator pc = new PageCreator(); 
		
		pc.setPaging(search);
		pc.setArticleTotalCount(service.getTotal(search));
	
		model.addAttribute("unq", list);
		model.addAttribute("pc", pc);
		
		return "unq/unqList";
	
	}
}
