package com.example.recyclerviewjsontest;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private String mTypes;


    public ExampleItem(String imageUrl, String creator, int likes, String types) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
        mTypes = types;
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

    public String getTypes(){
        return mTypes;

    }
}