package j11_클래스기본정리;

import j11_클래스기본정리.controller.UserManagementController;
import j11_클래스기본정리.service.UserService;

public class UseManagementApplication {
	
	public static void main(String[] args) {
		
		/*
		UserManagementController userManagementController= new UserManagementController();
		userManagementController.createUser();
		*/
		
		UserManagementController userManagementController
		=new UserManagementController(new UserService());
		userManagementController.createUser();
		userManagementController.createUser();
		userManagementController.createUser();
				
	}
}
