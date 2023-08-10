package day12.encapsulation.boot;

import day12.encapsulation.app.GitHub;

public class GitHubRunner {

	public static void main(String[] args) {
		
			GitHub myGitHub = new GitHub();

			myGitHub.setUserName("manojbasaragi");
			myGitHub.setFullName("Manoj");
			myGitHub.setBio("Software Developer | Open Source Enthusiast");
			myGitHub.setEmail("manu@gmail.com");
			myGitHub.setLocation("India");
			myGitHub.setProfilePicture("profile.jpg");
			myGitHub.setRepositoriesCount(50);
			myGitHub.setFollowersCount(1000);
			myGitHub.setFollowingCount(500);
			myGitHub.setStarsReceived(200);
			myGitHub.setPrivate(false);
			myGitHub.setVerified(true);
			myGitHub.setWebsite("https://www.bhuvi.com");
			myGitHub.setLastActive("2023-08-10 15:30");

			System.out.println("User Name: " + myGitHub.getUserName());
			System.out.println("Full Name: " + myGitHub.getFullName());
			System.out.println("Bio: " + myGitHub.getBio());
			System.out.println("Email: " + myGitHub.getEmail());
			System.out.println("Location: " + myGitHub.getLocation());
			System.out.println("Profile Picture: " + myGitHub.getProfilePicture());
			System.out.println("Repositories Count: " + myGitHub.getRepositoriesCount());
			System.out.println("Followers Count: " + myGitHub.getFollowersCount());
			System.out.println("Following Count: " + myGitHub.getFollowingCount());
			System.out.println("Stars Received: " + myGitHub.getStarsReceived());
			System.out.println("Private Account: " + myGitHub.isPrivate());
			System.out.println("Verified: " + myGitHub.isVerified());
			System.out.println("Website: " + myGitHub.getWebsite());
			System.out.println("Last Active: " + myGitHub.getLastActive());
		}

	}


