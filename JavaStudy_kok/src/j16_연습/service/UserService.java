package j16_연습.service;

import java.util.Scanner;

import j16_연습.repository.User;

public class UserService {
	
	private Scanner scanner;
	private int autoUserCode = 20220000;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
//	public User userInsert() {
//		showInsertUser();
//		int userCode;
//		String userId;
//		String userPassword;
//		String userName;
//		int year;
//		
//		userCode = ++autoUserCode;
//		System.out.println("사용할 아이디를 입력하세요.");
//		userId = scanner.nextLine();
//		System.out.println("사용할 패스워드를 입력하세요.");
//		userPassword = scanner.nextLine();
//		System.out.println("사용자의 이름을 입력하세요.");
//		userName = scanner.nextLine();
//		System.out.println("사용자의 생년월일을 입력하세요.");
//		
//		User user = new User(userCode, userId, userPassword, userName, year);
//		return user;
//		
//	}
	
	private void showInsertUser() {
		System.out.println("[사용자를 입력하세요.]");
	}

}
