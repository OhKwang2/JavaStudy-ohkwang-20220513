package j10_접근지정자.b;

public class Teacher {
	//캡슐화의 기본, 정보은닉 - 값은 메소드(getter, setter)를 통해서 주고받을 수 있도록 함.
	private String name;
	private String address;
	private String phone;
	
	//getter, setter 생성 - alt + shift + S -> generate getter and setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		String _address = createMessage(name, address);
		String _phone = createMessage(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	
	//캡슐화 <- 해당 클래스 내에서만 해당 메소드를 사용할 수 있도록 private처리
	//외부에서 어떤 메소드가 사용되는지 알 수 없도록 정보은닉, 캡슐화 하는 것
	private String createMessage(String name, String value) {
		return name + "님: " + value;		
	}
}
