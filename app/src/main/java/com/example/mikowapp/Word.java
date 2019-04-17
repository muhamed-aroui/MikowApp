package com.example.mikowapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId =HAS_NO_IMAGE ;
    private static final int HAS_NO_IMAGE=-1;
    private int mAudioResourceId;

    public Word(String DefaultTranslation,String MiwokTranslation,int AudioResourceId){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mAudioResourceId = AudioResourceId;

    }

    public Word(String DefaultTranslation,String MiwokTranslation,int ImageResourceId,int AudioResourceId){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId = AudioResourceId;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}
    public  boolean isImage(){return mImageResourceId != HAS_NO_IMAGE;}

    public int getmAudioResourceId(){return mAudioResourceId;}
}
