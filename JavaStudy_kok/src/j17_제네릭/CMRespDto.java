package j17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
//Data = Getter, Setter, EqualsAndHashCode, ToString을 하나로 합쳐놓은 것
@Data

//생성할 때 넣어준 자료형으로 데이터를 바꿔줌.
//<클래스는 변수처럼 사용 가능.>
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
	
}
