package j19_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	
	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		
		//값 추가 (Map은 Key값이 중복될 수 없음. 단, key값이 다르면 value는 중복되서 들어갈 수 있음.)
		//리스트와의 차이점은 "순서가 없음".
		studentMap.put(20220001, "김준일");
		studentMap.put(20220002, "김준이");
		studentMap.put(20220003, "김준삼");
		studentMap.put(20220004, "김준사");
		studentMap.put(20220005, "김준오");
		
		System.out.println(studentMap);
		
		//key로 value 가져오기.
		//값을 가져올때는, get()메소드 사용. 여기서는 인덱스가 아닌 key값을 사용
		System.out.println(studentMap.get(20220005));
		
		//값 수정.
		//put은 값을 추가할 때 쓰기 때문에 원하는 키 값이 없으면 추가가 됨.
		//replace는 수정만 원할 때 사용. 키값이 없으면 수정도 안 됨.
		studentMap.put(10, "김준육");		// key 값이 없을 경우 추가가 됨.
		studentMap.replace(10, "김준칠");
		
		studentMap.remove(10);
		
		//keySet() <- key값을 불러와서 HashSet형태로 바꿔줌.
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
			if(value.equals("김준오")) {
				System.out.println(studentMap.get(key));
			}
			System.out.println(value);
		}
		
		
		//람다식(함수형 프로그래밍)
		//익명함수(함수명이 없고, 리턴이 없음)
		//() -> {} 화살표 함수
		studentMap.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
			}
		);
		
		System.out.println(studentMap.containsKey(20220005));
		System.out.println(studentMap.containsValue("김준구"));
		
	}
}
