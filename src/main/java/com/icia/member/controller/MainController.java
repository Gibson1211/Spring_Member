package com.icia.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icia.member.dto.MemberDTO;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}

//	@RequestMapping(value="/save", method=RequestMethod.POST)
//	public String save(@ModelAttribute MemberDTO member) {
//		System.out.println("MemberController.save: " + member);		
//		return "index";
//	}
	
	
	
}
