package j17_제네릭;

import j11_클래스기본정리.repository.User;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
		//down casting범위 확인 필요.
		//object에 참조를 하면 내가 원하는 클래스 내 메소드들을 사용할 수 없음.
		//제네릭 와일드카드 사용하여 객체 그대로 가지고 와일드카드에 내가 원하는 자료형을 넣었기 때문에 해당 자료형에 대한 참조 사용 가능.
		System.out.println(controller.getUser().getData());
		controller.getAnimal().getData().move();
	}
}
