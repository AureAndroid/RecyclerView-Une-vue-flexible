package com.condinginflow.recyclerviewjsonsexample;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String ImageUrl, String Creator, int Likes) {
        this.mImageUrl = ImageUrl;
        this.mCreator = Creator;
        this.mLikes = Likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
}
