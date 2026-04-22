package question11;

public class Question11_02 {

	public static void main(String[] args) {
		Cat cat = new Cat();

		cat.tall = 52.3;
		cat.hebii = 4.8;
		cat.eat = "ささみ";

		System.out.println("身長は" + cat.tall + "です。");
		System.out.println("体重は" + cat.hebii  + "歳です。");
		System.out.println("好きな食べ物は" + cat.eat  + "です。");
	}

}
