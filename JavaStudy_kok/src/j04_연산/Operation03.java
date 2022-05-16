package j04_연산;

import java.util.Scanner;

public class Operation03 {
	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * result = False
		 * 
		 * 윤년이면 true 아니면 false
		 * 윤년은 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수 일때
		 * 
		 * */
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
		
		int year = 1999;
		boolean result1 = year%4 == 0;
		boolean result2 = ((year%4 == 0) && !(year%100 == 0)) || (year%400 == 0);
		
		System.out.println("입력년도 = " + year);
		System.out.println("4의 배수인가? " + result1);
		System.out.println("윤년인가?" + result2);
	}

}
