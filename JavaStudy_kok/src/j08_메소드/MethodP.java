package j08_메소드;

import java.util.Scanner;

public class MethodP {
	
	/*Menu를 메소드화 하여 프로그램 만들기*/
	
	public static void java(char select) {
		while(true) {
			if(select == '1') {
				System.out.println("[ JAVA 메뉴]");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			
			char select = 0;
			
			System.out.println("[ 메뉴 선택 ]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			
			System.out.println("명령을 입력하세요.");
			select = scanner.next().charAt(0);	//문자열을 입력했을 경우 ()안의 숫자자에 해당하는 인덱스값이 입력됨.
			//띄워쓰기를 포함해서 입력했을 경우 buffer를 없애주기 위해 scanner.nextLine()실행 필요
			scanner.nextLine();
			System.out.println(select);
			
			scanner.next().charAt(0);
			
			if(select == '1') {
				
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

	
	
}
