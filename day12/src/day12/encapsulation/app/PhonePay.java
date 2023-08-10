package day12.encapsulation.app;

public class PhonePay {
	private String userName;
	private String phoneNumber;
	private String email;
	private String profilePicture;
	private String linkedBankAccount;
	private String address;
	private double walletBalance;
	private int transactionsCount;
	private int rewardsPoints;
	private boolean isKYCVerified;
	private boolean isUPIEnabled;
	private String lastLogin;
	private String preferredLanguage;
	private String appVersion;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getLinkedBankAccount() {
		return linkedBankAccount;
	}

	public void setLinkedBankAccount(String linkedBankAccount) {
		this.linkedBankAccount = linkedBankAccount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public int getTransactionsCount() {
		return transactionsCount;
	}

	public void setTransactionsCount(int transactionsCount) {
		this.transactionsCount = transactionsCount;
	}

	public int getRewardsPoints() {
		return rewardsPoints;
	}

	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}

	public boolean isKYCVerified() {
		return isKYCVerified;
	}

	public void setKYCVerified(boolean KYCVerified) {
		isKYCVerified = KYCVerified;
	}

	public boolean isUPIEnabled() {
		return isUPIEnabled;
	}

	public void setUPIEnabled(boolean UPIEnabled) {
		isUPIEnabled = UPIEnabled;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
