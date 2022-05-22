package j08_메소드;

//메소드 오버로딩 - 호출할 때 사용되는 매개변수가 중요함. return 되는 자료형은 중요하지 않음.

public class Method03 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num1, int num2) {
		System.out.println("int 자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double a) {
		System.out.println("double 자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num1, double num2) {
		System.out.println("int 자료형 다음에 double 자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void test1(double num1, int num2) {
		System.out.println("double 자료형 다음에 int 자료형 매개변수가 둘인 test1 호출");
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10,20);
		test1(3.14);
		test1(10, 3.14);
		test1(3.14, 10);
	}

}
