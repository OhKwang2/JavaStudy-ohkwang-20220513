package j16_연습.repository;

public class User {
	
	private static int userCode;
	private static String userId;
	private static String userPassword;
	private static String userNmae;
	private static int year;
	
	public User() {
		
	}
	
	public User(int userCode, String userId, String userPassword, String userNmae, int year, int age) {
		this.userCode = userCode;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userNmae = userNmae;
		this.year = year;
	}

	public static int getUserCode() {
		return userCode;
	}

	public static void setUserCode(int userCode) {
		User.userCode = userCode;
	}

	public static String getUserId() {
		return userId;
	}

	public static void setUserId(String userId) {
		User.userId = userId;
	}

	public static String getUserPassword() {
		return userPassword;
	}

	public static void setUserPassword(String userPassword) {
		User.userPassword = userPassword;
	}

	public static String getUserNmae() {
		return userNmae;
	}

	public static void setUserNmae(String userNmae) {
		User.userNmae = userNmae;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		User.year = year;
	}


	@Override
	public String toString() {
		return "User [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
