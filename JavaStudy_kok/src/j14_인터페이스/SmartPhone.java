package j14_인터페이스;

public class SmartPhone {
	
	//상수는 선언 후 초기화를 안할 수 없음(무조건 값이 하나 들어가 있어야 함).
	//"생성되는 시점"에 초기화 되어야 함.
	//final은 상수이므로 setter는 존재하지 않고, getter만 사용 가능하지만, 가져올 일이 거의 없음.
	private final Hdmi hdmi;
	
	public SmartPhone(Hdmi hdmi) {
		this.hdmi = hdmi;		
	}
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다.");
		hdmi.connect();
	}
	
	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다.");
		hdmi.disconnect();
	}

}
