package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 
		 * */
//		
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//		}


		/*
		 * 1. 문제
		 * 변수명 - name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 콘솔창 결과
		 * 이름 : ooo
		 * 나이 : 00
		 * 연락처 : 000-0000-0000
		 * 주소 : 부산 00구 00동
		 * 
		 * */
		
		char name1 = '김';
		char name2 = '철';
		char name3 = '수';
		
		int age1 = 20;
		
		String phone1 = "010-0000-0000";
		
		String address1 = "부산 남구 대연동";
		
//		System.out.print("이름 : ");
//		System.out.print(name1);
//		System.out.print(name2);
//		System.out.println(name3);
		System.out.println(name1+name2+name3);
		//문자형은 유니코드(16진수)로 되어 있어 문자형을 더하면 숫자로 나옴.
		//16진수 AC01 -> 10진수
		System.out.println("" + name1+name2+name3);
		//유니코드를 문자열로 변환하고 싶을 경우 - 문자열과 유니코드를 더하면 문자열이 됨.
		
		System.out.println("이름 : " + name1+name2+name3);
		System.out.println("나이 : " + age1);
		System.out.println("연락처 : " + phone1);
		System.out.println("주소 : " + address1);
		
		System.out.println("세 수의 합 : " + 10 + 20 + 30);
		System.out.println("세 수의 합 : " + (10 + 20 + 30));
		
	}

}
