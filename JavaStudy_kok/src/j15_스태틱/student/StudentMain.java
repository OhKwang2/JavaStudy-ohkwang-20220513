package j15_스태틱.student;

/*
 * 1. 변수 만들기
 * student_code (정수)
 * student_name(이름)
 * student_year(학년)
 * 
 * 2. 문제
 * 학생을 한 명 생성할 때 마다 자동으로 student_code의 값이 1씩 증가하여 부여될 수 있게 작성.
 * 코드의 형태는 20220001, 20220002
 * 
 */

public class StudentMain {
	
	public static void main(String[] args) {
		
		System.out.println("=====일반 메소드로 만들 경우=====");
		System.out.println();
		
		Student s1 = new Student("김준일", 1);
		Student s2 = new Student("김준이", 3);
		Student s3 = new Student("김준삼", 3);
		Student s4 = new Student("김준사", 2);
		Student s5 = new Student("김준오", 1);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		s5.showInfo();
		
	}

}
