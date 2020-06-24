package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mBgColorId;

    public WordAdapter(@NonNull Activity context, ArrayList<Word> words, int bgColorId) {
        super(context, 0, words);
        mBgColorId = bgColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImage());
        }
        else {
            image.setVisibility(View.GONE);
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        View textContainer = listItemView.findViewById(R.id.list);
        int color = ContextCompat.getColor(getContext(), mBgColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}