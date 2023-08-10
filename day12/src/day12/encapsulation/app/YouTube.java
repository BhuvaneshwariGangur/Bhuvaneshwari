package day12.encapsulation.app;

public class YouTube {

	private String channelName;
	private String ownerName;
	private String description;
	private String email;
	private String country;
	private String profilePicture;
	private int subscribersCount;
	private int videosCount;
	private int viewsCount;
	private int likesCount;
	private boolean isVerified;
	private boolean isMonetized;
	private String joinDate;
	private String lastActivity;

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public int getSubscribersCount() {
		return subscribersCount;
	}

	public void setSubscribersCount(int subscribersCount) {
		this.subscribersCount = subscribersCount;
	}

	public int getVideosCount() {
		return videosCount;
	}

	public void setVideosCount(int videosCount) {
		this.videosCount = videosCount;
	}

	public int getViewsCount() {
		return viewsCount;
	}

	public void setViewsCount(int viewsCount) {
		this.viewsCount = viewsCount;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public boolean isMonetized() {
		return isMonetized;
	}

	public void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}
}
