package day12.encapsulation.app;

public class SnapChat {
	private String userName;
	private String displayName;
	private String email;
	private String phoneNumber;
	private String bitmojiAvatar;
	private String status;
	private int snapScore;
	private int friendsCount;
	private int followersCount;
	private int streakCount;
	private boolean isPrivateAccount;
	private boolean isVerified;
	private String lastActive;
	private int receivedSnaps;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBitmojiAvatar() {
		return bitmojiAvatar;
	}

	public void setBitmojiAvatar(String bitmojiAvatar) {
		this.bitmojiAvatar = bitmojiAvatar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSnapScore() {
		return snapScore;
	}

	public void setSnapScore(int snapScore) {
		this.snapScore = snapScore;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public int getStreakCount() {
		return streakCount;
	}

	public void setStreakCount(int streakCount) {
		this.streakCount = streakCount;
	}

	public boolean isPrivateAccount() {
		return isPrivateAccount;
	}

	public void setPrivateAccount(boolean privateAccount) {
		isPrivateAccount = privateAccount;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean verified) {
		isVerified = verified;
	}

	public String getLastActive() {
		return lastActive;
	}

	public void setLastActive(String lastActive) {
		this.lastActive = lastActive;
	}

	public int getReceivedSnaps() {
		return receivedSnaps;
	}

	public void setReceivedSnaps(int receivedSnaps) {
		this.receivedSnaps = receivedSnaps;
	}

}
