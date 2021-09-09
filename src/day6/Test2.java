package day6;

import java.util.Optional;

public class Test2 {
public static void main(String[] args) {
	String[] s=new String[2];
	s[0]="Vivek";
	s[1]="Anurag";
	Optional<String> s1=Optional.ofNullable(s[0]);
	if(s1.isPresent()) {
		System.out.println(s1.filter(s2->s2.startsWith("A")).orElse("nahi hai bhaiva jo a se start hai"));	
	}
	
	
	
	
}
}
