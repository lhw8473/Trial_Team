package com.spring.pr.controller;



/*import java.text.SimpleDateFormat;*/

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pr.announcement.service.IAnnouncementService;
import com.spring.pr.command.AncmtVO;
import com.spring.pr.util.PageCreator;

import com.spring.pr.util.SearchVO;

@Controller
@RequestMapping("/announcement")
public class AnnouncementController {

	
		@Autowired
		private IAnnouncementService service;
		
		/*
		 * @GetMapping("/announcementList") 
		 * public String list(PageVO paging, Modelmodel, @RequestParam("page") int page) {
		 * System.out.println("/announcement/announcementList : GET");
		 * System.out.println("페이징!"+page);
		 * 
		 * paging.setPageNum(page);
		 * 
		 * List<AncmtVO> list = service.getList(paging);
		 * System.out.println("페이징 처리 후 게시물의 수: " + list.size());
		 * 
		 * PageCreator pc = new PageCreator(); 
		 * pc.setPaging(paging);
		 * pc.setArticleTotalCount(service.getTotal(paging));
		 * 
		 * System.out.println("pc: "); 
		 * model.addAttribute("anmList",service.getList(paging)); 
		 * model.addAttribute("pc", pc);
		 * 
		 * return "announcement/announcementList"; }
		 */
		
		@GetMapping("/announcementList")
		public String list(SearchVO search, Model model, @RequestParam("page") int page) {
			
			System.out.println("page는"+ page);
			System.out.println("search는" +search);
			search.setPageNum(page);
			List<AncmtVO> list = service.getList(search);
			
			
			//버튼 배치 
			PageCreator pc = new PageCreator(); 
			
			pc.setPaging(search);
			pc.setArticleTotalCount(service.getTotal(search));
		
			model.addAttribute("anmList", list);
			model.addAttribute("pc", pc);
			
			return "announcement/announcementList";
		}
		
		@GetMapping("/announcementUpload")
		public void upload() {
			System.out.println("/announcement/announcementUpload : GET");
		}
		
		@PostMapping("/announcementRegist")
		public String upload(AncmtVO vo) {
			System.out.println("registVO"+vo);
	
			service.regist(vo);
			return "redirect:/announcement/announcementList?page=1&cpp=10";
			
		}
		
		//글 상세보기 처리
		@GetMapping("/announcementDetail/{ano}")
		public String getContent(@PathVariable int ano, Model model) {
			System.out.println("상세보기 요청됨.");
			model.addAttribute("anm", service.getContent(ano));
			return "announcement/announcementDetail";
		}
		
		@GetMapping("/announcementRewrite/{ano}")
		public String update (@PathVariable int ano, AncmtVO vo, Model model) {
			System.out.println("수정 페이지 요청 들어옴!");
			
			model.addAttribute("anmUpdate", service.getContent(ano));
			return "announcement/announcementRewrite";
		}
		
		//기관 수정 요청 처리
		@PostMapping("/announcementRewrite")
		public String update(AncmtVO vo) {
			
			System.out.println("수정요청의"+ vo);
			
			service.update(vo);
			
			//여기 내일 여쭤보고 수정하기
			return "redirect:/announcement/announcementList?page=1&cpp=10";
			//return "redirect:/announcement/announcementDetail";
		}
		
		@GetMapping("/announcementDelete/{ano}")
		public String delete(@PathVariable int ano) {
			
			System.out.println("삭제 요청들어옴");
			
			service.delete(ano);
			return "redirect:/announcement/announcementList?page=1&cpp=10";
		
		}
		
		
		
}



















