package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		//상수는 대문자로 변수명 작성
		final int MAX_NUMBER = 100;	//상수명은 _바로 구분
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		// 일반적으로 경로, %, MAX, MIN 등 고유값을 사용하는 경우 상수로 선언
		
		//변수와 메소드는 첫 문자는 무조건 소문자로 시작, 단어 구분은 대문자 (camel)
		//대문자로 시작하는 것은 클래스
		//전체 대문자는 상수
		
		int MAX = 1000;
		int MIN = 100;
		
		System.out.println("최대값: " + MAX);
		System.out.println("최소값: " + MIN);
		
		final String PATH = "C:\\junil\\KOK_backend\\workspace";
		
		final double PI = 3.14;
		

	}

}
