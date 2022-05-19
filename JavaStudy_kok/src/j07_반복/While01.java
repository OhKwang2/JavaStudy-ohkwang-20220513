package j07_반복;

public class While01 {
	public static void main(String[] args) {
		/*1~100까지 더하세요.*/
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
//			i = i + 1;
//			i += 1;		//복합대입연산(내가 원하는 만큼 증가)
//			i++;		//1씩 증가
//			++i;
			
//			i++;
			result = result + (i + 1);
			i++;	//조건 변화 수식
		}
		System.out.println(result);
		
	}

}
