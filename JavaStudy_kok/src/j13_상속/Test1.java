package j13_상속;

//클래스 이름 뒤에 extends 상속받을 클래스 이름
public class Test1 extends Test{
	
	public Test1() {
		super();	// Test1 생성자 생성시 super();가 생략되어 있음.
		//super(); <- 부모 클래스 생성 - 부모의 주소를 나타내는 것 (자신의 주소를 나타내는 것은 this)
		//부모가 태어나지 않고 자식이 태어날 수 없으므로 자식 뒤에 super()를 넣을 경우 오류가 나타남.
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인 : " + super.toString());
		
	}
}
