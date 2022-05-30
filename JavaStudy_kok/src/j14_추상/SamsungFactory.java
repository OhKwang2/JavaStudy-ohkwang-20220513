package j14_추상;

//abstract를 하나라도 가지고 있으면 추상 클래스
//추상클래스를 상속 받으면 상속받는 클래스도 추상 클래스로 만들거나
//상속받는 클래스의 추상 메소드를 override 해야 한다.
public class SamsungFactory extends Factory {
	
	@Override
		public void start() {
			System.out.println("삼성 팩토리 가동");
		}
	
	@Override
	public void stop() {
		System.out.println("삼성 공장을 멈춥니다.");
	}

}
