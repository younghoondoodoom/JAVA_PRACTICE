package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer  = new StringBuilder(str1);
		
		System.out.println(System.identityHashCode(buffer));
		buffer.append("adfjklsf");
		System.out.println(System.identityHashCode(buffer));
		
		Integer i = 190;
		
		
	}

}
