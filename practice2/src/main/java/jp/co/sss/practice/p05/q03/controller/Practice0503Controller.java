package jp.co.sss.practice.p05.q03.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.sss.practice.p05.bean.FruitsSeasonBean;
import jp.co.sss.practice.p05.entity.FruitsSeason;
import jp.co.sss.practice.p05.repository.FruitsSeasonRepository;

@Controller
public class Practice0503Controller {
	@Autowired
	FruitsSeasonRepository repository;
	@GetMapping("/fruits/list/sort/id")
	public String method1(Model model) {
		model.addAttribute("fruits", repository.findAllByOrderByFruitIdAsc());
		return "practice05/03/fruits_list";

	}

	@GetMapping("/fruits/detail/{fruitId}")
	public String method2(@PathVariable Integer fruitId,Model model) {
//		⚫ 入力された値を受け取り、データベースの検索条件として利用
		FruitsSeason fs = repository.getReferenceById(fruitId);
//		⚫ JavaBean のオブジェクトを生成
		FruitsSeasonBean bean = new FruitsSeasonBean();
//		⚫ 検索結果(Fruit エンティティ)を JavaBean のオブジェクトにコピー
		BeanUtils.copyProperties(fs,bean);
//		⚫ JavaBean のオブジェクトをリクエストスコープに保存
		model.addAttribute("fruits", bean);
		return "practice05/03/fruit_detail";

	}

}
