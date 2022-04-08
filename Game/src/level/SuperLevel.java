package level;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("좀나 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("이단 점프!");
	}

	@Override
	public void turn() {
		System.out.println("트리플 악셀!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("슈퍼 레벨 입니다!");
	}

}
