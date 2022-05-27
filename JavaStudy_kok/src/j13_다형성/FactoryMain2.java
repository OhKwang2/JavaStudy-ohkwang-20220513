package j13_다형성;

public class FactoryMain2 {
	
	public static void main(String[] args) {
		
		// 업캐스팅 후 일괄 혹은 단위 실행하기 위한 배열.
		// 중앙제어 방식과 같음.
		Factory[] factories = new Factory[100];
		
//		factories[0] = new SmartPhoneFactory();
//		factories[1] = new ComputerFactory();
		
		for(int i = 0; i < factories.length; i++) {
			//삼항연산자, 조건연산자
			factories[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		//자식클래스와 부모클래스가 1개 묶음으로 생성되는 100개의 클래스가 메모리에 할당
		
//		for(Factory factory : factories) {
//			factory.start();
//		}
		
		//업캐스팅 후 다시 다운캐스팅 할 경우 자료형 명시 필요
		int i = 10;
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		// 업캐스팅 후 다운캐스팅 할 경우 해당 클래스만 생성 가능.
		// 같은 부모형태를 상속하고 있지만, 자식 클래스가 다른 것으로 다운 캐스팅 불가.
		for(Factory factory : factories) {
			//instanceof : 업캐스팅 후 다운캐스팅을 위해 원래 클래스를 확인하는 명령
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cpf = (ComputerFactory) factory;
			}else {
				System.out.println("다운 캐스팅을 할 수 없습니다.");
			}
		}
		
		System.out.println("----------------");
		
	}
}
