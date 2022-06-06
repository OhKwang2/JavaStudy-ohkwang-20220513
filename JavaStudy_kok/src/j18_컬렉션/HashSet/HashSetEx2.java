package j18_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j18_컬렉션.entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, "김준일", "부산대학교"
		 * 20220001, "김준이", "부경대학교"
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 
		 * 20220001의 코드를 가진 학생을 삭제
		 */
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(20220001, "김준일", "부산대학교"));
		studentSet.add(new Student(20220002, "김준이", "부경대학교"));
		
		Iterator<Student> iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudntCode() == 20220002) {
				System.out.println(student);
			}
		}
		
		//Iterator는 한 번 줄 세우고 나면 끝
		//다시 줄 세우려면 초기화 해야 함.
		iterator = studentSet.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getStudntCode() == 20220001) {
				studentSet.remove(student);
			}
		}
		
		System.out.println(studentSet);
		
	}
}
