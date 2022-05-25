package j11_클래스기본정리.repository;

/*
 * Entity(독립체) Class
 * 정보를 담는 객체를 Entity 객체라고 한다.
 * 
 * 
 *  */

public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	// 기본 생성자 만들기
	// 빈공백에서 ctrl + space
	// 기본생성자는 생략되어 있음에도 왜 직접 생성했을까?
	// => 전체 생성자가 생성될 경우 기본 생성자는 비활성화 됨.
	// => 전체 생성자 생성한 경우에 기본 생성자를 사용하고 싶을 경우 기본 생성자를 직접 생성해야 함.
	// => 고로 전체 생성자 생성시 기본 생성자도 함께 생성하기 바람.
	public User() {
		
	}

	// 전체 생성자 만들기 (오버로딩)
	// Alt + Shift + s -> Generate Constructor using field
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	// getter, setter 만들기
	// Alt + Shift + s -> Generate getters and setters
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString 만들기
	// Alt + Shift + s -> Generate to String
	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
}
