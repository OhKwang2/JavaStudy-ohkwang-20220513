package j13_배열;

public class Foreach {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		/*
		 * 1, 2, 3, 4, 5, 6, 7, 8 출력
		 */
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print(", ");	
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? ", " : ""));
		}
		
		System.out.println();
		
		
		for(int num : numbers) {	//제일 처음부터 끝까지 배열안에 넣으며 생성
			System.out.print(num + (numbers.length != numbers[num-1] ? ", " : ""));
		}
		
		System.out.println();
		
		int i = 0;
		for(int num : numbers) {
			System.out.print(num + (numbers.length-1 != i ? ", " : ""));
			i++;
		}
		
	}

}
