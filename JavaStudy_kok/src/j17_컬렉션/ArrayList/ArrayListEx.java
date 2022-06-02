package j17_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		//기존 배열 삭제시 해당 인덱스값을 null로 만들고 뒤에 있는 값들을 땡겨온 후 마지막 리스트를 삭제하는 복잡한 과정을 거쳐야 함.
		strArray[2] = null;
		
		for(String str : strArray) {
			System.out.println(str);
		}
		
		//ArrayList의 경우 배열처럼 size를 지정하지 않고, 쓰는만큼 자동으로 공간이 생성.
		//add시 생성 순서에따라 자동으로 배열에 들어감.
		//값을 가져올 때는 get을 사용
		//값을 생성할 때는 add를 사용
		//값을 지울때는 remove를 사용 - 인덱스와 값이 동시에 삭제됨.
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		
		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		System.out.println(strArrayList.size());
		
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
		
		strArrayList.forEach(r -> {
			System.out.println(r);
		});
	}
}