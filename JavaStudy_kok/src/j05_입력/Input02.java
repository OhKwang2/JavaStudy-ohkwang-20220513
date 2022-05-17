package j05_입력;

import java.util.Scanner;

public class Input02 {
	public static void main(String[] args) {
		/*
		 *문자열1 입력 : nextLine()		Hi
		 *문자열2 입력 : next()			안녕
		 *문자 입력 : next().charAt(0)	A
		 * 정수 입력 : enxtInt()		10
		 * 실수 입력 : nextDouble()		3.14
		 * */
		
		Scanner scanner = new Scanner(System.in);
		/*변수의 선언은 작업 이전에 위에 선언하는 것이 일반적.*/
		
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.print("문자열1 입력 : ");
		a = scanner.nextLine();
		
		System.out.print("문자열2 입력 : ");
		b = scanner.next();
		
		System.out.print("문자 입력 : ");
		c = scanner.next().charAt(0);
		
		System.out.print("정수 입력 : ");
		d = scanner.nextInt();
		
		System.out.print("실수 입력 : ");
		e = scanner.nextDouble();
		
		System.out.println("");
		
		System.out.println("문자열1 입력 : " + a);
		System.out.println("문자열2 입력 : " + b);
		System.out.println("문자 입력 : " + c);
		System.out.println("정수 입력 : " + d);
		System.out.println("실수 입력 : " + e);
	}

}
