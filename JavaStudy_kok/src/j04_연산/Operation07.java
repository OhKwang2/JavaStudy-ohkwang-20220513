package j04_연산;

import java.util.Scanner;

public class Operation07 {
	public static void main(String[] args) {
		/*
		 * 윤년은 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수 일때
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 * */
		
//		int year = 1999;
//		
//		String result = null;
//		
//		result = year%4 == 0 && year%100 != 0 || year%400 == 0 ? "윤년" : "윤년아님"; 
//		
//		System.out.println("입력년도 : " + year);
//		System.out.println("결과 : " + result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		
		for (int year = sc.nextInt(); year <=2000; year++) {
			String result = year%4 == 0 && year%100 != 0 || year%400 == 0 ? "윤년" : "윤년아님";
			System.out.println("입력년도 : " + year + ", " + "결과 : " + result);
		}
		
	}

}
