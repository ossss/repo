package com.itstatistics.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index() {
		return "/WEB-INF/views/index.jsp";
	}

}
