package j07_반복;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		/*
		 * num = 0;
		 * 
		 * 반복할 횟수를 입력하세요 : 5
		 * 출력
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반복할 횟수를 입력하세요 : ");
		num = scanner.nextInt();
		
		int i = 0;
		
		while(i < num) {
			System.out.println(i+1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {
			System.out.println(num-i);
			i++;
			
		}
		
		/*while(반복이 되도록 값 설정) <- --;는 지양*/
		/*
		while(num>0) {
			System.out.println(num);
			num--;
		}
		*/
		
	}

}
