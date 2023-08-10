package day12.encapsulation.app;

public class Pubg {
	private String playerName;
	private String playerId;
	private int level;
	private int matchesPlayed;
	private int kills;
	private int wins;
	private int top10s;
	private double kdRatio;
	private double winRatio;
	private String favoriteWeapon;
	private String squadMate1;
	private String squadMate2;
	private boolean isPremiumPassSubscriber;
	private boolean isRankedMatchPlayed;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getTop10s() {
		return top10s;
	}

	public void setTop10s(int top10s) {
		this.top10s = top10s;
	}

	public double getKdRatio() {
		return kdRatio;
	}

	public void setKdRatio(double kdRatio) {
		this.kdRatio = kdRatio;
	}

	public double getWinRatio() {
		return winRatio;
	}

	public void setWinRatio(double winRatio) {
		this.winRatio = winRatio;
	}

	public String getFavoriteWeapon() {
		return favoriteWeapon;
	}

	public void setFavoriteWeapon(String favoriteWeapon) {
		this.favoriteWeapon = favoriteWeapon;
	}

	public String getSquadMate1() {
		return squadMate1;
	}

	public void setSquadMate1(String squadMate1) {
		this.squadMate1 = squadMate1;
	}

	public String getSquadMate2() {
		return squadMate2;
	}

	public void setSquadMate2(String squadMate2) {
		this.squadMate2 = squadMate2;
	}

	public boolean isPremiumPassSubscriber() {
		return isPremiumPassSubscriber;
	}

	public void setPremiumPassSubscriber(boolean premiumPassSubscriber) {
		isPremiumPassSubscriber = premiumPassSubscriber;
	}

	public boolean isRankedMatchPlayed() {
		return isRankedMatchPlayed;
	}

	public void setRankedMatchPlayed(boolean rankedMatchPlayed) {
		isRankedMatchPlayed = rankedMatchPlayed;
	}

}
