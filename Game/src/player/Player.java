package player;

import level.BeginnerLevel;
import level.PlayerLevel;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
		this.level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void play(int count) {
		this.level.go(count);
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
}
