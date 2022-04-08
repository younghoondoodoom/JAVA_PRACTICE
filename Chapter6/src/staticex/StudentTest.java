package staticex;

public class StudentTest {

	public static void main(String[] args) {
		
		Student james = new Student();
		System.out.println(james.studentID);
		
		Student tomas = new Student();
		System.out.println(tomas.studentID);
		
		System.out.println(Student.getSerialNum());
		
		}

}
