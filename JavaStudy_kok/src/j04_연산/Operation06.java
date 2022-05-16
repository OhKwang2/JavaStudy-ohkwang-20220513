package j04_연산;

import java.util.Scanner;

public class Operation06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조건에 해당하는 수를 입력하세요.");
		int num = sc.nextInt();
		
		String result = num%4 == 0 ? "4의 배수" : "4의 배수가 아닙니다.";
		boolean result2 = num%4 ==0 ? true : false;
		int result3 = num%4 == 0 ? 1 : 0;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
}
