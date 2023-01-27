package player;

public class VitualPlayer extends Player{

	public VitualPlayer(String name) {
		super(name);
	}
	
	@Override
	public void winDisplay() {
		System.out.println("Vitual Player - " + getName() + " has won the game");
	}

	@Override
	public void loseDisplay() {
		System.out.println("Vitual Player - " + getName() + " has losed the game with " + getScore() + " points");
	}

}
