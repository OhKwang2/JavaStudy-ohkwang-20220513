package j18_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");
		
		System.out.println(name);
		
		//set형태에서는 get이 없음. 값을 가져오려면 아래와 같이 해야 함.
		//Iterator -> 셋 형태를 한줄로 줄을 세워 주소를 넣는 인터페이스 (Stream(?)을 알아야 전체를 이해할 수 있음)
		Iterator<String> iterator = name.iterator();
		while(iterator.hasNext()) {
			String name2 = iterator.next();
			if(name2.equals("김준이")) {
				System.out.println(name2);
			}
		}
		
		name.remove("김준사");
		
		System.out.println(name);
		
		//set은 수정할 수 없음.
		//그 이유는 ? 해당 값 자체로 고유한 값이기 때문에 순서도 없고 중복도 허용하지 않아 기준 값이 없음.
		//수정하고 싶으면 삭제하고 추가하는 것이 수정. (remove and add)
	}

}
