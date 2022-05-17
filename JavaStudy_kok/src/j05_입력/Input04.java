package j05_입력;

import java.util.Scanner;

public class Input04 {
	public static void main(String[] args) {
		/*
		 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 출력 : 첫째 줄에 A+B를 출력한다.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("두 수의 합은 : " + (a + b));
		
	}

}
