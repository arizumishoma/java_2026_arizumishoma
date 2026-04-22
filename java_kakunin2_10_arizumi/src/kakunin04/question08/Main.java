package kakunin04.question08;

/**
 * クラス
 */
public class Main {
	public static void main(String[] args) {

		// 1
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println("1人目は"+ s1 );
		System.out.println("2人目は"+ s2 );

		// 2
         s1.name = "太郎";
         s2.name = "花子";
         System.out.println("名前:"+ s1.name );
 		System.out.println("名前:"+ s2.name );

		// 3
 		School school = new School();
 		school.students[0] = s1;
 		school.students[1] = s2;
// 		for (int i = 0; i<3; i++) {
// 		if (res == 3) {
// 		}
	}
}
