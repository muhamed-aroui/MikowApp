package com.example.mikowapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId =HAS_NO_IMAGE ;
    private static final int HAS_NO_IMAGE=-1;
    public Word(String DefaultTranslation,String MiwokTranslation){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;

    }

    public Word(String DefaultTranslation,String MiwokTranslation,int ImageResourceId){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}
    public  boolean isImage(){return mImageResourceId != HAS_NO_IMAGE;}
}
