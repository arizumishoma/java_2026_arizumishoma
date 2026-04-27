package kakunin06.question11;

/**
 * オーバーロード
 */
public class Main {
	public static void main(String[] args) {

		// 1
		Main school1 = new Main();
		school1.setStudent("太郎");
		school1.setStudent(10);

		Main school2 = new Main();
		school2.setStudent("花子", 11); 
	
	
		Main school3 = new Main();
		school3.setStudent("春男", 12); 


		// 2

		// 3

	}
}
