package j15_스태틱.student;

public class Student {
	
	private static int auto_increment = 20220000;
	private int student_code;
	private String student_name;
	private int student_year;

	//생성자에는 자료형과 return이 없음.
	public Student() {
		
	}
	
	public Student(String student_name, int student_year) {
		//매개변수로 따로 만들필요 없음.
		this.student_code = ++auto_increment;
		this.student_name = student_name;
		this.student_year = student_year;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + student_code);
		System.out.println("이름 : " + student_name);
		System.out.println("학년 : " + student_year + "학년");
		System.out.println();
	}
	
}
