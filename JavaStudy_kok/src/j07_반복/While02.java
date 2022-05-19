package j07_반복;

public class While02 {
	public static void main(String[] args) {
		//구구단 2단 출력
		/*
		 * 2x1 = 2
		 * 2x2 = 4
		 * 2x3 = 6
		 * ...
		 * 2x9 = 18 
		 * */
		
		int dan = 2;
		int num = 0;
		
		
		/*2단 출력하기*/
		/*
		while (num < 9) {
			System.out.println(dan + " X " +(num + 1) + " = " + dan * (num +1));
			num++;
		}
		*/
		
		
		while (dan<10) {
			System.out.println("구구단 " + dan + "단 출력하기");
			System.out.println();
			num = 0;
			
			while (num<9) {
				System.out.println(dan + " X " + (num+1) + " = " + dan * (num+1));
				num++;
			}
			dan++;
			System.out.println();
		}
		
	}

}
