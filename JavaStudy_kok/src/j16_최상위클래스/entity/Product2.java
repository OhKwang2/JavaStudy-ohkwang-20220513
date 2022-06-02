package j16_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*lombok을 사용하는 결정적 이유는 변수의 자료형, 이름이 바뀌어도 따로 세팅할 것이 없음.*/
//매개변수가 없는 기본 생성자
//변수에 final이 있을 경우 변수를 무조건 초기화 해주어야 하기 때문에 NoArgsConstructor 사용 불가
@NoArgsConstructor
//매개변수가 다 있는 전체 생성자
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product2 {
	private int productCode;
	//NonNull 사용시 RequiredArgsConstructor 사용해야함.
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	
}
