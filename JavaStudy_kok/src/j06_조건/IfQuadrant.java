package j06_조건;

import java.util.Scanner;

public class IfQuadrant {
	public static void main(String[] args) {
		/*
		 * 문제 : 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		 * 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다. 
		 * 
		 * 입력 : 첫 줄에는 정수 x가 주어진다.
		 * (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		 * 
		 * 출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		 * 단, 입력값이 x = 0 or y = 0 이면 "출력할 수 없습니다"를 출력
		 *     입력값이 x = 0 and y = 0이면 "원점입니다를 출력"
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("x값을 입력하세요.\nx = ");
		x = scanner.nextInt();
		if (x <= -1000 || x>= 1000) {
			System.out.println("입력 범위를 초과하였습니다. 다시 입력하세요.");
			x = scanner.nextInt();
		}
		System.out.print("y값을 입력하세요.\ny = ");
		y = scanner.nextInt();
		if (y <= -1000 || y>= 1000) {
			System.out.println("입력 범위를 초과하였습니다. 다시 입력하세요.");
			y = scanner.nextInt();
		}
	
		
		/*
		if(x == 0 && y == 0) {
			System.out.println("원점입니다.");
		} else if(x == 0 || y ==0) {
			System.out.println("출력할 수 없습니다.");
		} else if(x> 0 && y > 0) {
			System.out.println("1사분면 입니다.");
		} else if(x> 0 && y < 0) {
			System.out.println("4사분면 입니다.");
		} else if(x< 0 && y > 0) {
			System.out.println("2사분면 입니다.");
		} else if(x< 0 && y < 0) {
			System.out.println("3사분면 입니다.");
		}
		*/
		
		/*
		if(x == 0 && y == 0) {
			System.out.println("원점입니다.");
		} else if(x == 0 || y ==0) {
			System.out.println("출력할 수 없습니다.");
		} else if(x> 0) {
			if (y>0) {
				System.out.println("1사분면 입니다.");
			} else {
				System.out.println("4사분면 입니다.");
			}
		} else if(x< 0) {
			if (y>0) {
				System.out.println("2사분면 입니다.");
			} else {
				System.out.println("3사분면 입니다.");
			}
		}
		*/
		
		/*선생님 답*/
		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) && (x != 0 || y !=0)) {
			System.out.println("출력할 수 없습니다.");
		}else if(x > 0 && y > 0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if(x > 0 && y < 0) {
			System.out.println("4사분면");
		}else {
			System.out.println("원점");
		}
		
		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0)
				&& (x != 0 || y !=0) ?"출력할 수 없습니다."
					: x > 0 && y > 0 ? "1사분면"
							: x < 0 && y > 0 ? "2사분면"
									: x < 0 && y < 0 ? "3사분면"
											: x > 0 && y < 0 ? "4사분면" : "원점";
		System.out.println(result);
	}

}
