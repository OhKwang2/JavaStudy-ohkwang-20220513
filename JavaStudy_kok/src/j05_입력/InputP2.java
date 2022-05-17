package j05_입력;

import java.util.Scanner;

public class InputP2 {
	public static void main(String[] args) {
		/*
		 * 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		 * 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
		 *        A가 B보다 큰 경우에는 '>'를 출력한다.
		 *        A가 B보다 작은 경우에는 '<'를 출력한다.
		 *        A와 B가 같은 경우에는 '=='를 출력한다.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.println("두 수를 입력하세요.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		/*항상 줄바꿈은 연산자 앞에서 줄바꿈을 하게 됨.*/
		String result = a > b ? ">" 
				: a < b ? "<" : "==";
		System.out.println(result);
	}

}
