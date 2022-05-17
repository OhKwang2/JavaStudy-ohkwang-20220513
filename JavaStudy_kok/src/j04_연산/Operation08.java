package j04_연산;

import java.util.Scanner;

public class Operation08 {
	public static void main(String[] args) {
		/*
		 * num = 10
		 * 
		 * num이 짝수이면 짝수, 홀수이면 홀수를 출력하는 프로그램을 작성하세요.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요.");
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "짝수입니다." : "홀수입니다.";
			
		System.out.println("당신이 입력한 값은 " + result);
	}

}
