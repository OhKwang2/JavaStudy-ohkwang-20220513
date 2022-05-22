package j08_메소드;

// 클래스 안에 정의된 함수를 메소드라고 한다.

public class Method02 {
	
	// 매개변수가 없으면서 반환도 없는 메소드
	// void - 보이는 것이 없다, 공허하다 즉, 반환이 없음을 의미
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}
	
	// 매개변수는 있고, 반환이 없는 메소드
	// void - 보이는 것이 없다, 공허하다 즉, 반환이 없음을 의미
	public static void test2(int age, int year) {
		System.out.println("나이 : " + age);
		System.out.println("출생년도 : " + year);
	}
	
	//매개변수가 없고 반환이 있는 메소드
	//void 대신 반환 자료형(클래스 포함)을 입력할 경우 해당 자료형 값을 반환 
	public static String test3() {
		return "김준일";
	}
	
	public static int test4() {
		return 10000;
	}
	
	// 매개변수도 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;		
	}
	
	// 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				// return은 어느 위치에서든 호출 가능하며, 메소드를 탈출, 고로 뒤에 문장은 실행 안 됨.
				return;
				// break는 해당 조건 or 반복문을 종료하는 것.
//				break;
			}
		}
		System.out.println("test6가 정상 종료되었습니다.");
	}
	
	public static void main(String[] args) {
		//메인 함수가 프로그램 시작되는 부분.
		System.out.println("메인함수 시작");
		test1();	//호출
		test2(30, 1993);
		String name = test3();
		System.out.println(name);
		System.out.println(test5("김준일", 1));
		test6();
		System.out.println("메인함수 끝");
		
	}

}
