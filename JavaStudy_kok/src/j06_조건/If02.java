package j06_조건;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.println("당신의 점수를 입력하세요.");
		score = scanner.nextInt();
		
		if(score == 100) {
			System.out.println("만점입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else {
			System.out.println("80점 미만입니다.");
		}
	}
}
