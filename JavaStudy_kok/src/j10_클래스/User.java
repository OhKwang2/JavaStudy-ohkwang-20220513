package j10_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	//생성자의 특징
	//1. 클래스명과 같음
	//2. 자료형이 없다
	//3. 메소드 정의와 같은 형태
	
	User(){	//기본 생성자
		System.out.println("생성");
	}
	
	//생성자 오버로딩 가능 (매개변수만 다르면 됨)
	User(String name){
		System.out.println(name);
	}
	
	User(String name, String age, String phone, String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void SetName(String name) {
		//this. <- 자기 자신의 주소 참조
		System.out.println("setName 메소드 안에서 호출 : " + this);
		this.name = name;
	}
}

