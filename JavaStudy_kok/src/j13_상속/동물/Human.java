package j13_상속.동물;

/*
 * @ 어노테이션
 * 
 * @Override(재정의)
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다라는 의미.
 */


public class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
