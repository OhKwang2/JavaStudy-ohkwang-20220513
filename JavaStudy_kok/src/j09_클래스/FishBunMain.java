package j09_클래스;

public class FishBunMain {
	
	public static void main(String[] args) {
		// (객체가 생성되면 Instance)
		// 생성자를 호출할 때 new가 붙으면 객체 생성을 의미
		// return하는 값은 "메모리 주소"
		// 메모리 주소를 다 외울 수 없어 변수에 넣음.
		FishBun fishBun = new FishBun();
		
		//해당 변수에.을 찍으면 해당 주소에 있는 인스턴스를 호출 (참조라고 함)
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("==========================");
		
		FishBun fishBun2 = new FishBun();
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();
		
		//생성자 호출시 무조건 메모리 주소 호출
		System.out.println(fishBun);
		System.out.println(fishBun2);
	}

}
