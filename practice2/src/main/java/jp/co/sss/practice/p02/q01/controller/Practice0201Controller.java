package jp.co.sss.practice.p02.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {

	// 3章 ソースコード 3-1
	@RequestMapping("/first")
	public String before() {
		return "practice02/01/before_redirect";
	}
	@RequestMapping( "/second" )
	public String index() {
		return "redirect:/third";
	}
	// 3章 ソースコード 3-1
	@RequestMapping("/third")
	public String after() {
		return "practice02/01/after_redirect";
	}

	// 3章 ソースコード 3-4
	@RequestMapping("/transition")
	public String sampleTransition() {
		return "sample_transition";
	}

	// 3章 ソースコード 3-4
	@RequestMapping("/index_f")
	public String indexForward() {
		return "index";
	}

	// 3章 ソースコード 3-6
	@RequestMapping("/index_r")
	public String indexRedirect() {
		return "redirect:/";
	}

	// 12章 ソースコード 12-10
	@RequestMapping("/layout_view")
	public String layoutView() {
		return "layout_view";
	}
}