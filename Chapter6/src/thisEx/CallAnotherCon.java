package thisEx;

class Person {
	String name;
	int age;
	
	public Person () {
//		다른 생성자를 호출하는 this를 쓸 때 앞에 어던 statemt도 울 수 없다.
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherCon {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
