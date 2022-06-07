package j19_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetails {
	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		//또 다시 재사용할 것 아니면 익멱클래스를 사용하는 것이 유리함.
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});
	}
}