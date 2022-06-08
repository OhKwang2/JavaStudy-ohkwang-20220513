package j20_예외처리;

public class Throws01 {
	
	//해당 메소드를 호출하는 쪽에 예외를 미룸
	//계속 미루면 나중에 출력된 오류에 가장 위에 있는 부분이 가장 처음 미뤄진 예외
	public void printArray(int[] arrays) throws Exception {
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + " : " + arrays[i]);
		}
	}
}
