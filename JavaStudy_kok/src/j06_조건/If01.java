package j06_조건;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		
		System.out.println("프로그램 시작");
		System.out.print("값을 입력하세요.");

		num = scanner.nextInt();
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else if(num < 5) {
			System.out.println("5보다 작습니다.");
		}else {
			System.out.println("5입니다.");
			
		}
		
		System.out.println("프로그램 종료");
	}
}
