package j04_연산;

import java.util.Scanner;

public class Operation04 {
	public static void main(String[] args) {
		/*
		 * num1, num2, num3
		 * 
		 * num1의 값이 3의 배수이면서
		 * num2의 값이 짝수이어야 하고
		 * num3의 값이 5의 배수이면서
		 * num3의 값에 num1을 나눈 나머지가 1이면 또는
		 * num3의 값에 num2의 값을 나눈 나머지가 0이면
		 * 
		 *  true를 출력하라.
		 *  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3의 배수를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("짝수를 입력하세요.");
		int num3 = scan.nextInt();
		System.out.println("5의 배수를 입력하세요.");
		int num1 = scan.nextInt();

		
//		int num1 = 30;
//		int num2 = 2;
//		int num3 = 10;
		
		boolean result1 = num1%3 == 0;
		boolean result2 = num2%2 == 0;
		boolean result3 = num3%5 == 0;
		
		boolean result4 = (num3%num1 == 1) || (num3%num2 == 0);
		boolean f_result = result1 && result2 & result3 & result4;
		
		boolean a_result = num1 % 3 == 0
				&& num2 % 2 == 0
				&& num3 % 5 == 0
				&& num3%num1 == 1
				|| num3%num2 == 0;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("결과값은? " + f_result);
		System.out.println("결과값은? " + a_result);
		
	}

}
