package day12.encapsulation.boot;

import day12.encapsulation.app.LinkedIn;

public class LinkedInRunner {

	public static void main(String[] args) {
		LinkedIn myLinkedInProfile = new LinkedIn();

		myLinkedInProfile.setUserName("manaojbasaragi");
		myLinkedInProfile.setFullName("Manoj Basaragi");
		myLinkedInProfile.setHeadline("Software Engineer | Open to Opportunities");
		myLinkedInProfile.setEmail("manu@gmail.com");
		myLinkedInProfile.setLocation("Rajajinagar Bengalore");
		myLinkedInProfile.setProfilePicture("profile.jpg");
		myLinkedInProfile.setConnectionsCount(500);
		myLinkedInProfile.setPostsCount(50);
		myLinkedInProfile.setFollowersCount(1000);
		myLinkedInProfile.setEndorsementsCount(50);
		myLinkedInProfile.setPremium(true);
		myLinkedInProfile.setVerified(true);
		myLinkedInProfile.setCurrentJob("Software Engineer at TechCompany");
		myLinkedInProfile.setLastActivity("2023-08-10 15:30");

		System.out.println("User Name: " + myLinkedInProfile.getUserName());
		System.out.println("Full Name: " + myLinkedInProfile.getFullName());
		System.out.println("Headline: " + myLinkedInProfile.getHeadline());
		System.out.println("Email: " + myLinkedInProfile.getEmail());
		System.out.println("Location: " + myLinkedInProfile.getLocation());
		System.out.println("Profile Picture: " + myLinkedInProfile.getProfilePicture());
		System.out.println("Connections Count: " + myLinkedInProfile.getConnectionsCount());
		System.out.println("Posts Count: " + myLinkedInProfile.getPostsCount());
		System.out.println("Followers Count: " + myLinkedInProfile.getFollowersCount());
		System.out.println("Endorsements Count: " + myLinkedInProfile.getEndorsementsCount());
		System.out.println("Premium: " + myLinkedInProfile.isPremium());
		System.out.println("Verified: " + myLinkedInProfile.isVerified());
		System.out.println("Current Job: " + myLinkedInProfile.getCurrentJob());
		System.out.println("Last Activity: " + myLinkedInProfile.getLastActivity());
	}

	}


