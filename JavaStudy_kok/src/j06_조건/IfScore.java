package j06_조건;

import java.util.Scanner;

public class IfScore {
	public static void main(String[] args) {
		/*
		 * 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
		 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 출력 : 시험 성적을 출력한다.
		 * 단, 0보다 작거나 100보다 크면 계산할 수 없는 점수입니다. 출력
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("시험 점수를 입력하세요.\n입력 : ");
		score = scanner.nextInt();
		
		if (score > 100 || score <0) {
			System.out.println("계산할 수 없는 점수입니다.");
		} else if (score > 89) {
			System.out.println("당신이 입력한 점수는 : " + score + "이며,\n" + "당신의 시험 성적은 : \"A\"입니다.");
		} else if (score >79) {
			System.out.println("당신이 입력한 점수는 : " + score + "이며,\n" + "당신의 시험 성적은 : \"B\"입니다." );
		} else if (score >69) {
			System.out.println("당신이 입력한 점수는 : " + score + "이며,\n" + "당신의 시험 성적은 : \"C\"입니다." );
		} else if (score >59) {
			System.out.println("당신이 입력한 점수는 : " + score + "이며,\n" + "당신의 시험 성적은 : \"D\"입니다." );
		} else if (score <59) {
			System.out.println("당신이 입력한 점수는 : " + score + "이며,\n" + "당신의 시험 성적은 : \"F\"입니다." );
		}
		
	}

}
