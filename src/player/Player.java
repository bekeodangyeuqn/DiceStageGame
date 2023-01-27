package player;

import dice.Dice;

public abstract class Player {
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.winFlag = 0;
	}
	private String name;
	private int score;
	private int winFlag;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getWinFlag() {
		return winFlag;
	}
	public void setWinFlag(int winFlag) {
		this.winFlag = winFlag;
	}
	
	public void playDice() {
		Dice d = new Dice();
		System.out.println(this.name + " recive the dice with " + d.getRandomMostNum() + " has 20% probability");
		d.setPoint();
		System.out.println(this.name + " get more " + d.getPoint());
		setScore(getScore() + d.getPoint());
	}
	
	public abstract void winDisplay();
	public abstract void loseDisplay();
}
