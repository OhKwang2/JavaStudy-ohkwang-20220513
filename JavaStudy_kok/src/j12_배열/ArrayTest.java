package j12_배열;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			if(i != 0 && i%8 == 0) {
				int size = i/8;
				
				int[] num = new int[size];
				System.out.print(size + "배열 값 : ");
				for(int j = 0, z = 0; j < size; j++) {
					num[j] = (z+1)*8;
					z++;
					System.out.print(num[j]+" ");
				}
				System.out.println();
				
			}
		}
	}

}
