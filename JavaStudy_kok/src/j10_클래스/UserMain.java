package j10_클래스;

public class UserMain {
	public static void main(String[] args) {
//		User user1 = new User(); //생성 < - 메모리 주소 할당
		
//		user1.name = "김준일";
		
//		User user2 = new User();
//		user2.age = "29";
		
//		System.out.println(user1.name);
//		System.out.println(user1.age);
//		System.out.println(user2.name);
//		System.out.println(user2.age);
		
//		new User();	//생성자를 호출
//		System.out.println(new User());
		
		User user1 = new User();
		System.out.println("첫번째 : " + user1.name);
		System.out.println("메인 메소드에서 호출 : " +  user1);
//		user1.name = "김준일";
		user1.SetName("바보");
		System.out.println("두번째 : " + user1.name);
		
		//객체 생성 후에 값을 넣을지, 객체를 생성할 때 값을 넣을지 선택
		//생성자 오버로딩으로 가능
		User user2 = new User("김준일", "29", "000000000", "부산");
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);
		
	}
}
