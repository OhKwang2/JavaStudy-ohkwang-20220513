package j11_클래스기본정리.controller;

import j11_클래스기본정리.repository.User;
import j11_클래스기본정리.service.UserService;

public class UserManagementController {
	
	/*
	private UserService userService;
	//변수는 private -> public으로 다른 클래스에서 getter, setter 없이 사용되면 고유값이 어디서 바뀌었는지 알 수 없기 때문?
	
	public UserManagementController() {
		userService = new UserService();
	}
	*/
	
	private UserService userService;
	private User[] users;
	
	public UserManagementController(UserService userService) {
		this.userService = userService;
		users = new User[2];
	}
	
	public void createUser() {
		//user는 User 클래스로 생성된 객체의 주소 값
//		User user = userService.insertUser();
		
		int indextResult = findEmptyInUsers();
		if(indextResult != -1) {
			users[indextResult] = userService.insertUser();
			
			
			System.out.println("[새로 추가된 사용자]");
			//User의 toString 호출
			System.out.println(users[indextResult].toString());
			System.out.println();
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
		
	}
	
	private int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public void updateUser() {
		
	}
	

}
