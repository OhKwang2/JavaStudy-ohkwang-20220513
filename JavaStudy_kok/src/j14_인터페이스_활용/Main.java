package j14_인터페이스_활용;

import j14_인터페이스_활용.controller.ApiController;
import j14_인터페이스_활용.service.AuthUserService;
import j14_인터페이스_활용.service.OAuthUserService;

public class Main {
	
	public static void main(String[] args) {
//		AuthUserService authUserService = new AuthUserService();
		//주소를 생성하여 변수에 넣고, 해당 변수를 매개변수로 활용하나 바로 주소를 생성하나 같음.
		ApiController companyA = new ApiController(new AuthUserService());
		companyA.addUser();
		companyA.getUser();
		companyA.modifiUser();
		companyA.removeUser();
	}
}
