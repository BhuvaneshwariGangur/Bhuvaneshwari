package day12.encapsulation.boot;

import day12.encapsulation.app.Instagram;

public class InstagramRunner {
	public static void main(String[] args) {
        Instagram myInstagram = new Instagram();

        myInstagram.setUserName("manu");
        myInstagram.setFullName("Manoj");
        myInstagram.setBio("Software Engineer | Travel Enthusiast");
        myInstagram.setEmail("manu@gmail.com");
        myInstagram.setPhoneNumber("+9275374974");
        myInstagram.setProfilePicture("profile.jpg");
        myInstagram.setPostsCount(150);
        myInstagram.setFollowersCount(1000);
        myInstagram.setFollowingCount(500);
        myInstagram.setPrivate(false);
        myInstagram.setVerified(true);
        myInstagram.setWebsite("https://www.manu.com");
        myInstagram.setLastActive("2023-08-10 15:30");
        myInstagram.setSavedPosts(30);

        System.out.println("User Name: " + myInstagram.getUserName());
        System.out.println("Full Name: " + myInstagram.getFullName());
        System.out.println("Bio: " + myInstagram.getBio());
        System.out.println("Email: " + myInstagram.getEmail());
        System.out.println("Phone Number: " + myInstagram.getPhoneNumber());
        System.out.println("Profile Picture: " + myInstagram.getProfilePicture());
        System.out.println("Posts Count: " + myInstagram.getPostsCount());
        System.out.println("Followers Count: " + myInstagram.getFollowersCount());
        System.out.println("Following Count: " + myInstagram.getFollowingCount());
        System.out.println("Private: " + myInstagram.isPrivate());
        System.out.println("Verified: " + myInstagram.isVerified());
        System.out.println("Website: " + myInstagram.getWebsite());
        System.out.println("Last Active: " + myInstagram.getLastActive());
        System.out.println("Saved Posts: " + myInstagram.getSavedPosts());
    }

}
