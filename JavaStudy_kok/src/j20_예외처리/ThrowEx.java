package j20_예외처리;

public class ThrowEx {
	
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 실행중...");
			int i = 0;
			
			if(i == 0) {
				//강제로 예외 생성
				throw new ValidationCustomException("예외 발생");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	//예외가 발생하던 안 하던 강제로 실행
			System.out.println("무조건 실행");
		}
	}
}
