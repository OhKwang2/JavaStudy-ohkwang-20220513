package j05_입력;

import java.util.Scanner;

public class Input01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 값 : ");
		int num2 = scanner.nextInt();
		
		System.out.println("두 수의 합 : " + (num1 + num2));
		
		scanner.next();				//문자열(String)
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);	//문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)
		
	}

}
