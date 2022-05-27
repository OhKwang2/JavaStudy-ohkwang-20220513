package j13_상속.동물;

public class Tiger extends Animal{
	
	@Override
	//Override는 상위 클래스의 메소드를 재정의했다고 표시하는 용도
	public void move() {
//		super.move();	//상위 클래스의 move()(메소드)를 호출
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
