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
	
	public UserManagementController(UserService userService) {
		this.userService = userService;
	}
	
	public void createUser() {
		//user는 User 클래스로 생성된 객체의 주소 값
		User user = userService.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		//User의 toString 호출
		System.out.println(user.toString());
	}
	
	
	public void updateUser() {
		
	}
	

}
