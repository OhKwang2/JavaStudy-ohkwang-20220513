package j05_입력;

import java.util.Scanner;

public class InputP {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		String summary = null;
		String director = null;
		String grade = null;
		String pop = null;
		String span1 = null;
		String span2 = null;
		
		System.out.print("개요 : ");
		summary = scanner.nextLine();
		System.out.print("감독 : ");
		director = scanner.next();
		System.out.print("등급 : ");
		grade = scanner.next();
		System.out.print("흥행 : ");
		pop = scanner.next();
		System.out.print("줄거리 내용 : ");
		scanner.nextLine();
		span1 = scanner.nextLine();
		span2 = scanner.nextLine();
		
		System.out.println("-----------------");
		System.out.println("개요 " + summary);
		System.out.println("감독 " + director);
		System.out.println("등급 " + grade);
		System.out.println("흥행 " + pop);
		System.out.println("줄거리");
		System.out.println(span1);
		System.out.println(span2);
	}

}
