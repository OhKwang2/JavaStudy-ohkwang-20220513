package j12_배열;

public class Array01 {
	
	public static void main(String[] args) {
		//literal 상수 = 이미 정해져 있는 값.
		
		System.out.println();
		
		//메모리에 인트데이터(4bytes) 10개짜리 공간을 만들고, 해당 공간의 주소를 변수에 저장
		//1. 배열의 공간(크기)을 정해서 생성
		int[] numbers = new int[10];
		
		//2. 배열에 들어갈 값을 미리 정해서 생성
		int[] number2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[][] number3 = {{1, 2, 3, 4},{1, 2, 3, 4}};
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		//String은 클래스. 즉, 클래스도 배열로 입력 가능.
		//모든 클래스의 기본값은 null 즉, 기본 주소값은 null
		String[] strArray = new String[5];
		
		//String은 문자들의 배열합
		String str = "test";
		
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("strArray의 길이 : " + strArray.length);
		
		numbers[0] = 10;
		numbers[1] = 20;
		
		//배열의 참조 = 변수[인덱스]
		System.out.println(numbers[0]);
		System.out.println(number2[1]);
		System.out.println(number3[1][1]);
		System.out.println("characters : " + characters[1]);
		System.out.println("booleans : " + booleans[1]);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("i : " + i);
			System.out.println("numbers : " + numbers[i]);
			System.out.println("nuber2 : " + number2[i]);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
	}

}
