package level;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("적당히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프!");
	}

	@Override
	public void turn() {
		System.out.println("뒤로 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("어드벤스 레벨 입니다!");
	}

}
