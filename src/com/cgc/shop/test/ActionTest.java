package com.cgc.shop.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class ActionTest extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("ActionTest execute()!");
		return "success";
	}
	
}
