package j16_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 모든 클래스 위에는 Object 클래스가 있음.
 * 어떤 클래스든 제약없이 Object로 받을 수 있음.
 * 
 * 
 */

public class Teacher extends Object{
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}

	/*
	@Override
	//예시이고, hashcode and equals를 통해 생성 가능.
	public boolean equals(Object obj) {
		//Object 클래스는 해당 클래스의 값을 가지고 있지 않기때문에 downCasting 필요.
		if(obj instanceof Teacher) {
			Teacher teacher = (Teacher) obj;
			//원래 가지고 있던 변수와 값이 들어온 변수가 같은지 비교
			//equals는 주소가 같은지 1차적으로 비교하고, String 클래스면 UTF도 비교
			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject) && this.age == teacher.age) {
				return true;
			}
		}
		return false;
	}
	*/
	
	@Override
	//hashCode()는 실제 메모리 주소 (int 자료형)
	//ToString에서는 hashCode()를 16진수로 변환
	public int hashCode() {
		//해당 변수들을 조합하여 hashCode를 생성하는 것을 의미.
		return Objects.hash(age, name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		//주소가 같은지 확인
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//여기서 getClass()는 Teacher 클래스.
		if (getClass() != obj.getClass())
			return false;
		//클래스가 같으면 down casting 하라
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		//두개 같음.
		System.out.println(Teacher.class.getSimpleName());
		System.out.println(this.getClass().getSimpleName());
	}
	
	
}
