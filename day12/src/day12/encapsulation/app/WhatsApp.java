package day12.encapsulation.app;

public class WhatsApp {
	private String userName;
	private String phoneNumber;
	private String profilePicture;
	private String status;
	private String lastSeen;
	private boolean messageNotifications;
	private boolean groupNotifications;
	private boolean darkMode;
	private int mediaShared;
	private int totalContacts;
	private int blockedContacts;
	private int favoriteContacts;
	private String chatHistory;
	private int unreadMessages;

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

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public boolean isMessageNotifications() {
		return messageNotifications;
	}

	public void setMessageNotifications(boolean messageNotifications) {
		this.messageNotifications = messageNotifications;
	}

	public boolean isGroupNotifications() {
		return groupNotifications;
	}

	public void setGroupNotifications(boolean groupNotifications) {
		this.groupNotifications = groupNotifications;
	}

	public boolean isDarkMode() {
		return darkMode;
	}

	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}

	public int getMediaShared() {
		return mediaShared;
	}

	public void setMediaShared(int mediaShared) {
		this.mediaShared = mediaShared;
	}

	public int getTotalContacts() {
		return totalContacts;
	}

	public void setTotalContacts(int totalContacts) {
		this.totalContacts = totalContacts;
	}

	public int getBlockedContacts() {
		return blockedContacts;
	}

	public void setBlockedContacts(int blockedContacts) {
		this.blockedContacts = blockedContacts;
	}

	public int getFavoriteContacts() {
		return favoriteContacts;
	}

	public void setFavoriteContacts(int favoriteContacts) {
		this.favoriteContacts = favoriteContacts;
	}

	public String getChatHistory() {
		return chatHistory;
	}

	public void setChatHistory(String chatHistory) {
		this.chatHistory = chatHistory;
	}

	public int getUnreadMessages() {
		return unreadMessages;
	}

	public void setUnreadMessages(int unreadMessages) {
		this.unreadMessages = unreadMessages;
	}

}
