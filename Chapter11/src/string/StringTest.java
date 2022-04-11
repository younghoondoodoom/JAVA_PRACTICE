package string;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		Class pclass3 = Class.forName("string.Person");
	
		System.out.println(pclass3.getName());
	}

}
