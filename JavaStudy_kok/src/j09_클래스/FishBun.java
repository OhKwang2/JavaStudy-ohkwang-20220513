package j09_클래스;

public class FishBun {
	String material;	//재료
	String dough;
	
	
	//class의 특징
	//0. 메소드 형태가 생략
	//1. 반환 자료형이 없음(생략되어 있음).
	//2. 대문자로 시작
	// 메소드는 반환하는 값이 없으면 변수에 담지 못함.
	// 생성자 호출시 주소값을 반환한다.
	FishBun(){	//생성자
		System.out.println("생성자 호출");
	}
	
	
	void showInfo() {
		System.out.println("재료 : " + material);
		System.out.println("반죽 : " + dough);
	}
}
