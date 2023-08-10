package day12.encapsulation.app;

public class Netflix {
	private String accountName;
	private String email;
	private String subscriptionPlan;
	private String paymentMethod;
	private String watchHistory;
	private String watchlist;
	private String recommendations;
	private int profilesCount;
	private int totalWatchedTime;
	private int continueWatchingCount;
	private int downloadsCount;
	private boolean isPremium;
	private boolean isSubscribed;
	private String lastLogin;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}

	public void setSubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getWatchHistory() {
		return watchHistory;
	}

	public void setWatchHistory(String watchHistory) {
		this.watchHistory = watchHistory;
	}

	public String getWatchlist() {
		return watchlist;
	}

	public void setWatchlist(String watchlist) {
		this.watchlist = watchlist;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

	public int getProfilesCount() {
		return profilesCount;
	}

	public void setProfilesCount(int profilesCount) {
		this.profilesCount = profilesCount;
	}

	public int getTotalWatchedTime() {
		return totalWatchedTime;
	}

	public void setTotalWatchedTime(int totalWatchedTime) {
		this.totalWatchedTime = totalWatchedTime;
	}

	public int getContinueWatchingCount() {
		return continueWatchingCount;
	}

	public void setContinueWatchingCount(int continueWatchingCount) {
		this.continueWatchingCount = continueWatchingCount;
	}

	public int getDownloadsCount() {
		return downloadsCount;
	}

	public void setDownloadsCount(int downloadsCount) {
		this.downloadsCount = downloadsCount;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean premium) {
		isPremium = premium;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean subscribed) {
		isSubscribed = subscribed;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

}
