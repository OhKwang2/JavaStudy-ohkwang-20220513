package j15_스태틱.싱글톤.Factory;

public class Main {
	
	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance();
		KIA kiaFactory2 = KIA.getInstance();
		KIA kiaFactory3 = KIA.getInstance();
		
		Car k5_01 = kiaFactory1.createCar("K5");
		Car k5_02 = kiaFactory1.createCar("K5");
		
		kiaFactory1.carInfo(k5_01);
		kiaFactory1.carInfo(k5_02);
		
		Car k7_01 = kiaFactory2.createCar("K7");
		Car k7_02 = kiaFactory2.createCar("K7");
		
		kiaFactory1.carInfo(k7_01);
		kiaFactory1.carInfo(k7_02);
	}

}
