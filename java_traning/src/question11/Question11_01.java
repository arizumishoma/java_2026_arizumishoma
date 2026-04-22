package question11;



public class Question11_01 {

	public static void main(String[] args) {
		 Cat cat = new Cat();

		// フィールドに値を代入
		cat.name = "コタロウ";
		cat.age = 7;

		// フィールドの値を出力
		System.out.println("名前は" + cat.name + "です。");
		System.out.println("年齢は" + cat.age  + "歳です。");
	}
}
