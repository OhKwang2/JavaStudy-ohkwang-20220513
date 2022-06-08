package j20_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외(RunTimeException) (프로그램이 실행 중 어떤 조건이 맞지 않는 경우)
 * 2. 컴파일 오류 -> ex) 드라이버 IOException
 * 3. 버그 (외부로부터 어떤 영향을 받아서 오류가 뜨는 경우)
 * 
 */


public class ArrayException01 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		//try{오류가 날 법 한 상황}
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ": " + numbers[i]);
			}
		//catch(){오류발생시 처리문}
		//상위 오류처리문을 사용(업캐스팅 개념)하면 많은 예외들을 수용 가능.
		//하지만, 정확히 어떤 오류가 나타났는지 알기 어려움
		//예외처리 마지막에는 항상 Exception e를 사용
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("ArrayIndexOutOfBoundsException 예외가 발생하였음.");
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("IndexOutOfBoundsException 예외가 발생하였음.");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}
}
