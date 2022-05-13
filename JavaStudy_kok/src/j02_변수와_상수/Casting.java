package j02_변수와_상수;

public class Casting {
	
	public static void main(String[] args) {
		//업캐스팅 - 문자 -> 정수 -> 실수
		//업캐스팅도 원래 (자료형) 사용해야 하지만, 묵시적 형 변환 (형 변환 타입 생략 가능)
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		double c = b;
		System.out.println(c);
		
		//다운캐스팅 - 실수 -> 정수 -> 문자
		// 손실이 일어날 것을 알고 캐스팅 하기 위해 (자료형) 사용
		int d = (int) c;
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);
}
	
}
