package j10_접근지정자;

import j10_접근지정자.a.Student;
import j10_접근지정자.b.Teacher;

public class UserMain {
	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		//앞으로는 다른 패키지내 클래스를 불러와서 변수를 입력하는 것은 없어야 함.
		//정보 은닉 : 클래스 내 변수를 private으로 설정하여 타 클래스, 패키지에서 불러올 수 없게 하는 것.
		
//		student.name = "김준일";
//		student.schoolName = "코리아아이티";
		
//		teacher.name = "김준이";
//		teacher.address = "부산";
		
		student.setName("김준일");
		System.out.println(student.getName());
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-9988-1916");
		teacher.showInfo();
		
	}
}
