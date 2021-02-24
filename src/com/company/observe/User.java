package com.company.observe;

import java.util.ArrayList;

public class User implements Subject{

    private String UserID,UserName,email;
    ArrayList<User> followers;
    ArrayList<User> followings;

    public User(String userID, String userName, String email) {
        UserID = userID;
        UserName = userName;
        this.email = email;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowings() {
        return followings;
    }

    public void setFollowings(ArrayList<User> followings) {
        this.followings = followings;
    }


    @Override
    public void addFollow(User user) {
        followings.add(user);
        user.addFollowing(this);
    }

    @Override
    public void removeFollow(User user) {
        followings.remove(user);
        user.removeFollowing(this);
    }

    @Override
    public void addFollowing(User user) {
        followers.add(user);
    }

    @Override
    public void removeFollowing(User user) {
        followers.remove(user);
    }


}
