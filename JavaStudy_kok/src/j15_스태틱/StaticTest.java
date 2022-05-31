package j15_스태틱;

public class StaticTest {
	//static 변수는 누워있음.
	//static은 매번 생성해서 사용하기 불편할 경우 사용.
	//ex)
//	System system = new System();
//	system.out.print();
	public static int count;
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드 [ " + count + " ]");
	}

}
