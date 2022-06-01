package j16_최상위클래스;

public class Main {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("김준일", "웹개발");
		Teacher t2 = new Teacher("김준일", "웹개발");
	
	/*
		//t1이 Object를 상속받아 업캐스팅 된 것.
		//Object는 생략되어 있지만, 모든 클래스에 상속된 것으로 봄.
		Object obj = t1;	//업캐스팅 가능(상속 또는 구현이 되었다.)
	}
	
	public void test(Object obj) {
		System.out.println(obj.toString());
		if(obj instanceof Teacher) {
			Teacher teacher = (Teacher) obj;                                                                                                                                                                                                                                                                                                                          
		}
	
	*/
		
	System.out.println(t1.toString());	//toString은 생략이 가능하다.
	System.out.println(t2);
	// == 는 주소값이 같은지 확인하기위한 기호.
	System.out.println(t1 == t2);
	//String의 equals는 자체적으로 Object를 Overriding 하고 있지만, 일반적인 클래스의 경우 Object의 equals를 상속받아 주소가 같은지 확인
	System.out.println(t1.equals(t2));
	//hashCode()가 override 되어 있어야 비교 가능
	System.out.println(t1.hashCode() == t2.hashCode());
	}

}
