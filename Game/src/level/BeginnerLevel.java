package level;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump가 뭐에요?");
	}

	@Override
	public void turn() {
		System.out.println("turn이 뭐에요?");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자 입니다.");
	}
	
}
