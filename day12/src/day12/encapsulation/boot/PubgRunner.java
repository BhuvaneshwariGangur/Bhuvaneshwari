package day12.encapsulation.boot;

import day12.encapsulation.app.Pubg;

public class PubgRunner {

	public static void main(String[] args) {
		Pubg myPubgProfile = new Pubg();

		myPubgProfile.setPlayerName("nayana");
		myPubgProfile.setPlayerId("654832");
		myPubgProfile.setLevel(50);
		myPubgProfile.setMatchesPlayed(1000);
		myPubgProfile.setKills(500);
		myPubgProfile.setWins(50);
		myPubgProfile.setTop10s(150);
		myPubgProfile.setKdRatio(2.5);
		myPubgProfile.setWinRatio(0.05);
		myPubgProfile.setFavoriteWeapon("M416");
		myPubgProfile.setSquadMate1("nayana");
		myPubgProfile.setSquadMate2("divya");
		myPubgProfile.setPremiumPassSubscriber(true);
		myPubgProfile.setRankedMatchPlayed(true);

		System.out.println("Player Name: " + myPubgProfile.getPlayerName());
		System.out.println("Player ID: " + myPubgProfile.getPlayerId());
		System.out.println("Level: " + myPubgProfile.getLevel());
		System.out.println("Matches Played: " + myPubgProfile.getMatchesPlayed());
		System.out.println("Kills: " + myPubgProfile.getKills());
		System.out.println("Wins: " + myPubgProfile.getWins());
		System.out.println("Top 10s: " + myPubgProfile.getTop10s());
		System.out.println("K/D Ratio: " + myPubgProfile.getKdRatio());
		System.out.println("Win Ratio: " + myPubgProfile.getWinRatio());
		System.out.println("Favorite Weapon: " + myPubgProfile.getFavoriteWeapon());
		System.out.println("Squad Mate 1: " + myPubgProfile.getSquadMate1());
		System.out.println("Squad Mate 2: " + myPubgProfile.getSquadMate2());
		System.out.println("Premium Pass Subscriber: " + myPubgProfile.isPremiumPassSubscriber());
		System.out.println("Ranked Match Played: " + myPubgProfile.isRankedMatchPlayed());

	}

}
