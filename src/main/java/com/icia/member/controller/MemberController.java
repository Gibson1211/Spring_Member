package com.icia.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired // MemberService를 주입받는 것. spring이 객체를 주입받는 것
	private MemberService ms;
	
	//회원가입 페이지 출력
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String saveForm() {
		return "save";
	}
	
	//회원가입 처리
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute MemberDTO member) {
		System.out.println("MemberController.save(): " + member);
		int result = ms.save(member);
		return "index";
	
	}
	
}
