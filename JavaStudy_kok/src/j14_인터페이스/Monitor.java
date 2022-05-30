package j14_인터페이스;

/*
 * 인터페이스는 상속을 위해 implements를 사용해야 함.
 */

public class Monitor implements Hdmi, VGA{
	
	 @Override
	public void connect() {
		 System.out.println("모니터에 연결");		
	}
	 
	 @Override
	public void disconnect() {
		 System.out.println("모니터 연결 해제");
	}
	 
	 @Override
	public void vgaConnect() {
		System.out.println("vga로 모니터 연결");
	}
	 
	 @Override
	public void vgaDisconnect() {
		System.out.println("vga로 모니터 연결 해제");
	}
}
