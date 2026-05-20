package jp.co.sss.practice.p02.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0202Controller {
	// 3章 ソースコード 3-1
		@RequestMapping("/show/redirect_page")
		public String before() {
			return "practice02/02/redirect_link" ;
		}

		// 3章 ソースコード 3-1
		@RequestMapping("/absolute")
		public String after() {
			return "redirect:https://www.google.co.jp";
		}

		// 3章 ソースコード 3-4
		@RequestMapping("/relative")
		public String sampleTransition() {
			return "redirect:/result";
		}

		// 3章 ソースコード 3-4
		@RequestMapping("/result")
		public String indexForward() {
			return "practice02/02/redirect_result";
		}


		}


