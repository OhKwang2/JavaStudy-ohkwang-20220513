package j08_반복;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		System.out.println();
		
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
			
			if(select == 'q') {
				break;
			}else if(select == '1') {
				System.out.println("java를 선택하셨습니다.");
//				System.out.println("계속하시려면 엔터를 눌러주세요.");
				//입력하는 동안에 반복을 잠깐 멈추고 싶을 때 scanner.nextLine(); 활용
//				scanner.nextLine();
				while(true) {
					System.out.println("[ java 메뉴 ]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println();
					
					System.out.println("명령을 입력하세요.");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("자바란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요...");
						scanner.nextLine();
					}else if(select == 'q'){
						//위쪽으로 올라가서 루프를 닫기 위해 상태를 바꿔주기 위한 변수
						loopFlag = false;
						break;
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
				}
				
			}else if(select == '2') {
				System.out.println("python을 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ python 메뉴 ]");
					System.out.println("1. python란?");
					System.out.println("b. 뒤로가기");
					System.out.println();
					
					System.out.println("명령을 입력하세요.");
					//select = scanner.next().charAt(0);
					//scanner.nextLine();
					//위 처럼 안 할경우 엔터만 치면 오류가 나타남.
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("파이썬이란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
				}
				
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
				
				while(true) {
					System.out.println("[ javascript 메뉴 ]");
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");
					System.out.println();
					
					System.out.println("명령을 입력하세요.");
					select = scanner.nextLine().charAt(0);
					
					if(select == 'b') {
						break;
					}else if(select == '1') {
						System.out.println("자바스크립트란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다.");
						System.out.println("다시 입력하세요.");
					}
				}
				
			}else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.println("다시 입력해주세요.");
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
