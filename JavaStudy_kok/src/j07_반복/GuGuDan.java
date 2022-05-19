package j07_반복;

public class GuGuDan {
	public static void main(String[] args) {
		
		/*구구단 2단~9단*/
		
		for(int i = 2; i<10; i++) {
			System.out.println(i + "단");
			for(int j =0; j<9; j++) {
				System.out.println(i + " x " + (j+1) + " = " + i*(j+1));
			}
			System.out.println();
		}
		
	}

}
