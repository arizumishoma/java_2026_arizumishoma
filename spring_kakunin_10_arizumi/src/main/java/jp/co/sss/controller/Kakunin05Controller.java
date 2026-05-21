package jp.co.sss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jp.co.sss.entity.Inquiry;
import jp.co.sss.form.GetForm;
import jp.co.sss.repository.InquiryRepository;

@Controller
public class Kakunin05Controller {
	@Autowired
	InquiryRepository inqRepo;

	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Inquiry> inqList = inqRepo.findAll();
		for (Inquiry inq : inqList) {
			System.out.println("一覧: "+inq);
		}
		model.addAttribute("inquiries", inqList);
		return "pages/list";

	}
}