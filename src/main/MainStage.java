package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import player.Player;
import player.RealPlayer;
import player.VitualPlayer;
import referee.Referee;

public class MainStage {
	private static List<Player> players = new ArrayList<Player>();
	private static int realPlayerAmount;
	public static void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the amount of real players(0-4): ");
		realPlayerAmount = s.nextInt();
		for (int i = 1; i<= realPlayerAmount; i++) {
			s.nextLine();
			System.out.println("Name of Real Player " + i);
			String name = s.nextLine();
			RealPlayer rp = new RealPlayer(name);
			players.add(rp);
		}
		for (int i = 1; i <= 4 - realPlayerAmount; i++) {
			VitualPlayer vp = new VitualPlayer("Vitual " + i);
			players.add(vp);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		input();
		Referee rf = new Referee(players);
		int i = 0;
		int turn = 0;
		while(true) {
			if (i == 4) {
				i = 0;
				System.out.println("==== Turn " + ++turn + " has ended ====");
			}
			rf.letPlayerPlay(players.get(i));
			if (players.get(i).getWinFlag() == 1) {
				System.out.println("==== THE GAME HAS ENDED AFTER " + ++turn + " turns ====");
				rf.resultDisplay();
				break;
			}
			i++;
			System.out.println("---------");
			Thread.sleep(2000);
		}
	}
}
