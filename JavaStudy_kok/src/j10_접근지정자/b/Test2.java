package j10_접근지정자.b;

import j10_접근지정자.a.Test1;

public class Test2 {
	public String ccc;
	String ddd;
	
	
	//생성자는 기본적으로 생략되어 있으며, 접근 지정자가 public으로 되어 있음.
	//기본 생성자 생성시 타 패키지 내에서 생성자 호출할 경우 오류가 나타남.
//	Test2(){
//		
//	}
	
	public Test2() {
		//다른 패키지에 있는 Test1을 생성하기 위해서는 Test1 클래스를 public으로 설정해주어야 함.
		Test1 t1 = new Test1();
	}

}
