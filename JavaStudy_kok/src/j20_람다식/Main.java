package j20_람다식;

public class Main {
	
	public static void main(String[] args) {
		Math2 m2_1 = new Math2Impl();
		
		//1번만 사용할거면 클래스 만들지 않고 바로 사용하는게 나을 수 있음.
		Math2 m2_2 = new Math2() {
			
			@Override
			public double calc(double value1, double value2) {
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}
		};
		
		//결과가 return 밖에 없을 때 중괄호 ({}) 생략
		//매개변수가 1개일 때는 매개변수에 ()생략 가능.
		//return이 void일 때 {}생략 가능.
		//Math2 m2_3 = (v1, v2) -> {return v1 / v2};
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;
			return v1 % v2;
			};
		
		double t = m2_3.calc(10, 3);
		System.out.println(t);
	}
}
