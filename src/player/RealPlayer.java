package player;

public class RealPlayer extends Player{

	public RealPlayer(String name) {
		super(name);
	}
	
	@Override
	public void winDisplay() {
		System.out.println("Real Player - " + getName() + " has won the game");
	}
	
	@Override
	public void loseDisplay() {
		System.out.println("Real Player - " + getName() + " has losed the game with " + getScore() + " points");
	}
}
