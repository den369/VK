package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private String text;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    // + get/set на все поля
}
