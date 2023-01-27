package referee;

import java.util.ArrayList;
import java.util.List;

import player.Player;
import player.RealPlayer;
import player.VitualPlayer;

public class Referee {
	private List<Player> players = new ArrayList<Player>();
	
	public Referee(List<Player> players) {
		this.players = players;
	}
	
	public void letPlayerPlay(Player pl) {
		pl.playDice();
		if (pl.getScore() == 21) {
			pl.setWinFlag(1);
		} else if (pl.getScore() > 21) {
			pl.setScore(0);
		}
		System.out.println(pl.getName() + " has got " + pl.getScore() + " points");
	}
	
	public void resultDisplay() {
		for (Player player : players) {
			if (player.getWinFlag() == 1) {
				if (player instanceof RealPlayer) {
					RealPlayer rp = (RealPlayer) player;
					rp.winDisplay();
				} else if (player instanceof VitualPlayer) {
					VitualPlayer vp = (VitualPlayer) player;
					vp.winDisplay();
				}
			} else {
				if (player instanceof RealPlayer) {
					RealPlayer rp = (RealPlayer) player;
					rp.loseDisplay();
				} else if (player instanceof VitualPlayer) {
					VitualPlayer vp = (VitualPlayer) player;
					vp.loseDisplay();
				}
			}
		}
	}
}
