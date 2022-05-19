package j07_반복;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i <10; i++) {
			if(i%2 == 0) {
				continue;
				//System.out.println("테스트문");
				//continue뒤의 실행문은 넘어가기 때문에 문법적 오류로 에러가 나타남.
			}
			System.out.println(i);
			//실행시 if조건에 해당하는 값 생략됨.
			//continue의 의미는 다음 반복으로 넘어가라는 의미
		}
	}
}