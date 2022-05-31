package j15_스태틱.싱글톤;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야 한다.
		 * (외부에서 여러개 생성할 수 없게끔 만들어야 한다)
		 */
		
		Singleton.getInstance();
		
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(10);
		singleton2.printInfo();
	}

}
