package jp.co.sss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.form.GetForm;

@Controller
public class Kakunin03Controller {
	@GetMapping("/get")
	public String get(int no) {
		System.out.println("get():"+no);
		return "pages/get";
	}

	@PostMapping("/post")
	public String post(GetForm form) {
		System.out.println("post():"+form.getNo());
		return "redirect:/";
	}
}