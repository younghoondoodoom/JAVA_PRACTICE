
package cooperation;

public class Student {
	String studenetName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studenetName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1000);
		money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studenetName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
