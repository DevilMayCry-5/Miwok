package com.example.android.miwok;

public class Word {

    private int mImage = NO_IMAGE;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;

    private static final int NO_IMAGE = -1;

    public Word(String DefaultTranslation, String MiwokTranslation, int Image, int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImage = Image;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String DefaultTranslation, String MiwokTranlation, int AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranlation;
        mAudioResourceId = AudioResourceId;

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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mImage=" + mImage +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
