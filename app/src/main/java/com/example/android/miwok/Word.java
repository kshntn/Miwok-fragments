package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = No_image;
    private static final int No_image = -1;
    private int mAudioId;

    public Word(String DefaultTranslation, String MiwokTranslation,int AudioId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioId=AudioId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId,int AudioId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioId=AudioId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioId() {
        return mAudioId;
    }
    
    public boolean hasImage() {
        return mImageResourceId != No_image;
    }
}
