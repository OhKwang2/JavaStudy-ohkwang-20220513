package j11_클래스기본정리.service;

import java.util.Scanner;

import j11_클래스기본정리.repository.User;

public class UserService {
	
	/*
	 * 전역변수 : class 내에 상위에 쓰는 변수 -> 클래스 내 전체 범위에서 사용. 동일 layer에 동일한 변수 사용 불가 
	 * 지역변수 : 클래스 내 메소드 내에 사용하는 변수 -> 타 메소드에서 사용 불가.
	 * */
	
	private Scanner scanner;
	
	// 생성자가 생성될 때, scanner를 생성하라는 의미
	// 왜? -> 생성 = 메모리 할당
	// 메모리의 효율적 관리를 위해 UserService가 생성될 때 scanner를 생성
	// 해당 클래스 안에만 있으면 scanner를 공유해서 사용하겠다는 의미.
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public User insertUser() {
		showInserView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		scanner.nextLine();
		System.out.print("사용자 번호 입력 : ");
		usercode = scanner.nextLine();
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("사용자이름 : ");
		username = scanner.nextLine();
		System.out.print("비밀번호 : ");
		password = scanner.nextLine();
		System.out.println("사용자 입력이 완료되었습니다.");
		System.out.println();
		
		User user = new User(usercode, email, name, username, password);
		return user;
	}
	
	private void showInserView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
		System.out.println("(시작하시려면 엔터키를 눌러주세요)");
	}

}
