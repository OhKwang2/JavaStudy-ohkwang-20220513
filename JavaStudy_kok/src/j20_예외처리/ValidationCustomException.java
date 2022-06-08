package j20_예외처리;

public class ValidationCustomException extends RuntimeException{

	/**
	 * 
	 */
	//객체를 구분하기 위한 직렬화를 위해 사용
	//클래스에 해당 노란색밑줄 오류가 나타나면 add 하면 됨.
	private static final long serialVersionUID = 1L;
	
	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메세지 있음.");
	}
	
}
