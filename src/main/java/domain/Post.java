package domain;

public class Post {
    private int id;
    private int ownerId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private CommentsInfo commentsInfo;
    private CopyrightsInfo copyrightsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSourcesInfo postSourcesInfo;

    // + get/set на все поля
}
