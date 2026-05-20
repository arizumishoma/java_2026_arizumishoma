package jp.co.sss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jp.co.sss.form.GetForm;

@Controller
public class Kakunin04Controller {
	@GetMapping("/request")
	public String request(String str1, Model model) {
		System.out.println("文字列1:"+str1);
		model.addAttribute("data1",str1);
		return "pages/request";
	}

	@PostMapping("/session")
	public String session(String str2, HttpSession session) {
		System.out.println("文字列2:"+str2);
		session.setAttribute("data2",str2);

		return "redirect:/";
	}
}