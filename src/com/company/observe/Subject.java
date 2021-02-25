package com.company.observe;

public interface Subject {


    public void addFollow(User user);
    public void removeFollow(User user);

    public void addFollowing(User user);
    public void removeFollowing(User user);

    public void notifyUsers(Post post);

}
