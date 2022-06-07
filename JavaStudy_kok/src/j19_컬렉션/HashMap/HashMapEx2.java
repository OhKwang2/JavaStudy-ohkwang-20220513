package j19_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = null;
		
		System.out.print("찾으실 값을 입력하세요: ");
		value = scanner.nextLine();
		
		/*
		 * 자동차 -> car
		 * 자전거 -> bicycle
		 * 기차 -> train
		 * 비행기 -> airplane
		 * 
		 * 지원하지 않는 단어입니다.
		 */
		
		//일반적인 방법
		if(value.equals("자동차")) {
			System.out.println("car");
		}else if(value.equals("자전거")) {
			System.out.println("bicycle");
		}else if(value.equals("기차")) {
			System.out.println("train");
		}else if(value.equals("비행기")) {
			System.out.println("airplane");
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}
		
		//HashMap을 사용한 방법
		HashMap<String, String> vehicle = new HashMap<String, String>();
		
		vehicle.put("자동차", "car");
		vehicle.put("자전거", "bicycle");
		vehicle.put("기차", "train");
		vehicle.put("버스", "bus");
		vehicle.put("비행기", "airplane");
		vehicle.put("오토바이", "motorcycle");
		
		if(vehicle.containsKey(value)) {
			System.out.println(vehicle.get(value));
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}
		
		
		
	}

}
