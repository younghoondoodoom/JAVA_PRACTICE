package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(1001, "Lee");
		Student Choi = new Student(1000, "Choi");
		
		Lee.setKorean(60);
		Choi.setKorean(100);
		
		Lee.setMath(80);
		Choi.setMath(100);
		
		Lee.showStudentInfo();
		Choi.showStudentInfo();
	}

}
