package j20_람다식;

//람다식을 사용하기 위해서는 추상 메소드에 대해 @FunctionalInterface를 달아야 하며,
//람다식에 사용할 수 있는 인터페이스는 1개밖에 안 됨.
@FunctionalInterface
public interface Math2 {
	
	public double calc(double value1, double value2);

}
