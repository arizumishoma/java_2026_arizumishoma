package jp.co.sss.practice.p04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Practice0401Controller {

	@GetMapping("/bmi/input")
	public String method1() {
		return "practice04/01/bmi_input";

	}

	@PostMapping("/bmi/result")
	public String method2(BmiForm bmiForm, Model model) {

		//⚫ 入力された値(身長と体重)で BMI を計算
		//― 計算式: BMI=体重(kg)÷(身長(cm)/100)2
		Double height = bmiForm.getHeight();
		Double weight = bmiForm.getWeight();
		Double bmi = weight/((height/100)*(height/100));
		//⚫ 計算結果の BMI 値をフォームにセット
		//⚫ フォームをリクエストスコープに保存
		model.addAttribute("name",bmiForm.getName());
		model.addAttribute("height", height);
		model.addAttribute("weight", weight);
		model.addAttribute("bmi",bmi);
		return "practice04/01/bmi_result";
	}
}
