package j13_상속.동물;

public class AnimalMain {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		//각각의 클래스에서 move() 를 Override 했어도 부모에 같은 메소드를 사용하는 이유는 "다형성 때문"
		animal.move();
		human.move();
		tiger.move();
		
		human.readBooks();
		tiger.hunting();
	}

}
