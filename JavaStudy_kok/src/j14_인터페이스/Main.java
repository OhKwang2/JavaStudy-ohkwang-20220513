package j14_인터페이스;

public class Main {
	
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		//업캐스팅
//		SmartPhone smartPhone = new SmartPhone(monitor);
		SmartPhone smartPhone = new SmartPhone(beamProjector);
		smartPhone.powerOn();
		smartPhone.powerOff();
		
	}

}
