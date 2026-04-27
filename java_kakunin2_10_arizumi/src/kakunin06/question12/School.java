package kakunin06.question12;

/**
 * コンストラクタ
 */
public class School {

	private Student[] students;
	private int lastIdx;

	// 1
public School () {
	students = new Student[3];
}

public School(int capacity) {
	students = new Student[capacity];
	lastIdx = 0;

	System.out.println("【スクール開講】　座席数:" + capacity );
}

	// 3
public void attendStudent(Student s) {


}
}
