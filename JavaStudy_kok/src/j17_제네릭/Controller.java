package j17_제네릭;

import j11_클래스기본정리.repository.User;
import j13_상속.동물.Animal;
import j13_상속.동물.Human;
import j13_상속.동물.Tiger;

public class Controller {
	
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234");
	}
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이) 수정 성공", 29);
	}
	
	//<>에 같은 자료형이어야지만 return 가능
	//단 제네릭의 와일드카드 (<?>) 사용시 다른 자료형도 return 가능
	public CMRespDto<?> getUser() {
		User user = new User();
		user.setUsercode("2");
		user.setUsername("junil");
		user.setPassword("1234");
		user.setName("김준일");
		user.setEmail("qwceqwc@naver.com");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	//와일드카드로 사용할 수 있는 것을 제한하기 위해 <? extends 상속받는 클래스>
	//와일드카드로 상속을 제한
	public CMRespDto<? extends Animal> getAnimal(){
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);			
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다.", (Tiger) animal);
		}else {
			//상속받는 클래스에 없는 경우 <> 비우고 반환 data에 null
			//<>를 비워둘 경우 data에 속하는 클래스로 반환
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);
		}
	}
}
