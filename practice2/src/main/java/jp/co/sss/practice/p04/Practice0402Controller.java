package jp.co.sss.practice.p04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {

	@GetMapping("/numguess/start")
	public String method1(HttpSession session) {
//		⚫ Math クラスの random メソッドを利用した下記の処理で、1～9 のランダ
//		ムな数値を生成
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
//
//
//		⚫ 生成した数値をセッションスコープに保存
		session.setAttribute("hitNumber",hitNumber);
//		⚫ 当たりの数値をコンソールに出力(動作確認用)
		System.out.println(hitNumber);
		return "practice04/02/numguess_start";

	}

	@GetMapping("/numguess/input")
	public String method2() {
		return "practice04/02/numguess_input";

	}
	@GetMapping("/numguess/judge")
	public String method3(HttpSession session,Integer inputNum) {
//		⚫ セッションスコープから当たりの数値を取り出す
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
//		⚫ 当たりの数値と入力された数値を比較
		if(hitNumber==inputNum) {
//			⚫ 当たりの(当たりの数値と入力された数値が同じ)場合、終了処理へリダイ
//			レクト
			return "redirect:/numguess/hit";
		}else{
//			⚫ はずれの(当たりの数値と入力された数値が異なる)場合、判定結果を表示
			return "practice04/02/numguess_judge";

		}

	}
	@GetMapping("/numguess/hit")
	public String method4(Model model,HttpSession session) {
//		⚫ セッションスコープから当たりの数値を取り出す
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
//		⚫ 当たりの数値を使って、String 型のメッセージを作成
//		― メッセージの例：「当たりです！ 正解は○でした。」○の部分に数値
		String msg= "当たりです！ 正解は"+hitNumber+"でした。";
//		⚫ メッセージをリクエストスコープに保存
		model.addAttribute("msg",msg);
//		⚫ セッションスコープから当たりの数値を削除
		session.removeAttribute("hitNumber");
		return "practice04/02/numguess_end";

	}
}
