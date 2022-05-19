package j07_반복;

public class ForHome {
	public static void main(String[] args) {
		/*
		 * 숙제 : 아래 별을 1~4번 조건에 맞게 출력하기
		 * 1번
		 **
		 ***
		 ****
		 *****
		 ******
		 *
		 * 2번
		 *    *
		 *   **
		 *  ***
		 * ****
		 ******
		 *
		 * 3번
		 ******
		 * ****
		 *  ***
		 *   **
		 *    *
		 *
		 * 4번
		 *    *
		 *   ***
		 *  *****
		 * *******
		 **********
		 *
		 *
		 */
		
		
		/*1번*/
		for(int i =0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*2번*/
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");				
			}
			for(int z=0; z<i+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*3번*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int z = 0; z < 5-i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*4번*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println();
			}
		}
	}

}
