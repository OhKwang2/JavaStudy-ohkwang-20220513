package j15_스태틱.싱글톤;

/*
 * 싱글톤 정리
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는
 * 		getInstance() static 메소드가 존재해야 한다.
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야 한다.
 */

public class Singleton {
	
	//해당 클래스 내부에서 인스턴스 생성 후 해당 주소값을 instance에 저장.
	private static Singleton instance = new Singleton();
	private int count;
	
	//외부에서 여러개 생성하는 것을 막기 위해 Singleton의 생성자는 무조건 "private"
	private Singleton() {
		
	}
	
	//getInstance메소드를 통해 타 클래스에서 생성된 인스턴스를 가져옴.
	public static Singleton getInstance() {
		//메모리가 없어서 객체가 생성이 안 된 경우를 대비하여, null체크를 넣음.
		if(instance == null) {
			instance = new Singleton();
		}
		//★★static 메소드 내에서는 일반 변수 or 메소드(생성이 필요한 변수 or 메소드)를 사용할 수 없음.
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
	}

}
