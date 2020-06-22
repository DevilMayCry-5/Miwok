package com.example.android.miwok;

public class Word {

    private int mImage;
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private static final int NO_IMAGE = -1;

    public Word(String DefaultTranslation, String MiwokTranslation, int Image){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImage = Image;
    }

    public Word(String DefaultTranslation, String MiwokTranlation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlation;

    }

    public int getImage(){
        return mImage;
    }


    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }

    public boolean hasImage(){
        return mImage != NO_IMAGE;
    }
}
