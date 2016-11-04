package com.tfbclaim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TfbClaimController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homepage() {
		return "index";
	}
	
	/*@RequestMapping("/contest")
	public String contest() {
		return "contest";
	}
	
	@RequestMapping("/form")
	public String form(){
		return "form";
	}
	*/
	
}
