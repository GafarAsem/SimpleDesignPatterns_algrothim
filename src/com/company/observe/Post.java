package com.company.observe;

public class Post  {

    protected int postID;
    protected String title,note;
    protected User user;

    public Post(int postID, User user, String title, String note) {
        this.postID = postID;
        this.user = user;
        this.title = title;
        this.note = note;
        user.notifyUsers(this);
    }


}
