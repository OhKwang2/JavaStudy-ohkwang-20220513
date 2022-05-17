package j05_입력;

import java.util.Scanner;

public class Input03 {
	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름 : 김준일				문자열	name
		 * 나이 : 29					정수	age
		 * 연락처 : 010-9988-1961		문자열	phone
		 * 주소 : 부산 동래구 사직동	문자열	address
		 * 성별 : 남					문자	gender
		 * 
		 * [개인정보 출력]
		 * 이름 => 김준일				문자열
		 * 나이 => 29					정수
		 * 연락처 => 010-9988-1961		문자열
		 * 주소 => 부산 동래구 사직동	문자열
		 * 성별 => 남					문자
		 * 
		 * */
		
		/*
		 * next() <- space or enter를 기준으로 값이 나뉨
		 * next는 space, enter 무시, 단, 마지막 enter는 buffer에 남아있음.
		 * nextLine은 space, enter 포함.*/
		
		/* buffer <- 스트리밍 음악 들을 때, 끊기지 않게끔 공간에 미리 담아두는 것과 같음.
		 * buffer가 없으면 입력과 동시에 바로 출력. ex) ㄱㅣㅁ ㅈㅜㄴ
		 * 
		 * */
		

		/*
		Scanner scanner = new Scanner(System.in);
		String address1 = null;
		String address2 = null;
		String address3 = null;
		String phone = null;
		
		System.out.print("주소 : ");
		address1 = scanner.nextLine();
		address2 = scanner.nextLine();
		address3 = scanner.nextLine();
		System.out.print("연락처 : ");
		phone = scanner.nextLine();
		

		System.out.println("주소 => " + address1 + address2 + address3);
		System.out.println("연락처 => " + phone);
		*/
		
		/*Scanner에는 buffer 기능이 내장되어 있음.*/
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름 : ");	//김준일\n29\n010-9988-1916\n
		name = scanner.next();			//김준일\n
		System.out.print("나이 : ");	
		age = scanner.nextInt();		//29\n
		System.out.print("연락처 : ");
		phone = scanner.next();			//010-9988-1916\n
		scanner.nextLine();				//nextLine()를 통해 \n을 입력받아 \n을 날려줘야 함.
		System.out.print("주소 : ");
		address = scanner.nextLine();	//위에 nextLine()를 안 해줄 경우 \n이 버퍼에 남아있어 바로 다음줄로 실행됨.
		System.out.print("성별 : ");
		gender = scanner.next().charAt(0);
		
		System.out.println("------------------");
		System.out.println("[개인정보 출력]");		//김준일\n29\n010-9988-1916\n
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
		
	}

}
