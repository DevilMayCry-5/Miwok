package com.example.android.miwok;

public class Word {

    private int mImage;
    private String mDefaultTranslation;
    private String mMiwokTranslation;

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
}
