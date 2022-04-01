package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorean(int score) {
		korean.setScore(score);
	}
	public void setMath(int score) {
		math.setScore(score);
	}
	public void showStudentInfo() {
		int total = korean.score + math.score;
		System.out.println(studentName + " 학생의 총 점수는 " + total + "점 입니다.");
	}
	
}
