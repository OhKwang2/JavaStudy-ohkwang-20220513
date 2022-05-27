package j13_상속;

public class TestMain {
	
	public static void main(String[] args) {
		Test t1 = new Test1();
		// Test1의 생성자를 호출했으나 T부터 생성자 호출.
		// 생성의 순서는 부모 클래스 먼저 생성 후 자식 클래스가 생성 됨.
	}
}
