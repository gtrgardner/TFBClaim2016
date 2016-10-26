package com.tfbclaim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tfbclaim.model.MemberRepository;
@Controller
public class TfbClaimController {

//	@Autowired
//	MemberRepository repo;


	@RequestMapping("/index")
	public String index(/*Model model*/) {
//		model.addAttribute("member", repo.findAll());
		return "index";
	}
	
	@RequestMapping("/contest")
	public String contest(/*Model model*/) {
//		model.addAttribute("member", repo.findAll());
		return "contest";
	}


}
