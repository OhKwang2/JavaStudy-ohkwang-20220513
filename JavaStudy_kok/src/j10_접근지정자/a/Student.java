package j10_접근지정자.a;

public class Student {
	private String name;
	private String schoolName;
	
	
	//setter - 해당 값을 변수에 넣어야 하기 때문에 해당 매개변수가 필요함.
	public void setName(String name) {
		this.name = name;
	}
	
	//getter - 해당 값을 가져오기만 하면 되기 때문에 매개변수가 없음.
	public String getName() {
		return name;
	}
	
}
