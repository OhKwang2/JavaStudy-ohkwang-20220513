package j01_firstClass;

public class HelloJava {

	public static void main(String[] args) {
		// main 내의 명령어들이 순서대로 실행
		// TODO Auto-generated method stub
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");
		System.out.print(10 + 5 );
		System.out.println( "10 + 5" );
		
		System.out.print("이름 : ");
		System.out.println("김준일");
		System.out.print("직업 : ");
		System.out.println("강사");
		System.out.print("나이 : ");
		System.out.println(29+1);
		
		int age = 29;
		// 앞전에 선언한 변수는 다시 선언하지 않는다.
		// 변수명을 한번 선언하면 다른 자료형에 같은 변수명을 사용할 수 없다.
		// 변수값을 변경할 때는 자료형을 선언하지 않고 변수명만 사용
		age = 10;
		
		System.out.println(age);

		
		age = 30;
		System.out.println(age);
		
		age = age + 1;
		System.out.println(age);
		
		
	}

}
