package j07_반복;

public class ForStart {
	public static void main(String[] args) {
		
		/*
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * */
		
		/*
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		*/
		
		for(int i = 0; i <5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
