package j15_스태틱;

public class Main {
	
	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		//Static 생성자의 경우 생성되고 복제가 되지만, 메모리 안은 텅 비어있음.
		
//		StaticTest st = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3 = new StaticTest();
//		
//		st.count = 10;
//		st2.count = 20;
//		st3.count = 30;
//		
//		st.staticMethod();
//		st2.staticMethod();
//		st3.staticMethod();
		
		//Static은 생성자 없이 바로 사용 가능.
		StaticTest.count = 100;
		
		StaticTest.staticMethod();
		
	}

}
