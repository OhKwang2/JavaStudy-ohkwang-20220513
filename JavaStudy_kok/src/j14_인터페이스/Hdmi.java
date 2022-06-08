package j14_인터페이스;

/*
 * 인터페이스(interface)
 * 
 * 약속
 *클래스와 클래스를 연결할 때는 인터페이스가 같아야 함.
 *
 * 1. 인터페이스의 모든 메소드는 기본적으로 추상 메소드이다.
 * 2. 일반 메소드를 사용하고 싶다면 return type 앞에 default 키워드를 사용하여야 한다.
 * 3. 인터페이스는 일반적으로 추상 메소드를 사용.
 * 4. 보통 인터페이스에 추상명사 생성시 throws 달아줌.
 * 
 */


public interface Hdmi {
	public void connect();
	public void disconnect();
	//상속 받아서 재정의를 해야하기 때문에 private은 사용할 수 없음.
}
