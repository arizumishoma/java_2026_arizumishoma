package jp.co.sss.practice.p01.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Practice0102Controlle {
	@RequestMapping(path = "/opening")
	public String index() {
		return "hello";
	}
}
