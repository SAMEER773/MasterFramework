package AsssertPractice;

import org.assertj.core.api.Assertions;

public class AssertJDemo {
	
	public static void main(String[]args) {
		
		String s="hello";
		Assertions.assertThat(s)
		.isNotBlank()
		.isNotEmpty()
		.isNotEqualTo("abcd");
		
		
		
		
		
	}
	

}
