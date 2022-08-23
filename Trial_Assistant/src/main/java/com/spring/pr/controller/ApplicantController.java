package com.spring.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

	@GetMapping("/applicantList")
	public String list() {
		return "/applicant/applicantList";
	}
}
