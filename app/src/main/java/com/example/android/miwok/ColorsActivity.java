package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Arraylist of sound files
        final ArrayList<MediaPlayer> sounds = new ArrayList<>();

        sounds.add(MediaPlayer.create(this, R.raw.color_red));
        sounds.add(MediaPlayer.create(this, R.raw.color_green));
        sounds.add(MediaPlayer.create(this, R.raw.color_brown));
        sounds.add(MediaPlayer.create(this, R.raw.color_gray));
        sounds.add(MediaPlayer.create(this, R.raw.color_black));
        sounds.add(MediaPlayer.create(this, R.raw.color_white));
        sounds.add(MediaPlayer.create(this, R.raw.color_dusty_yellow));
        sounds.add(MediaPlayer.create(this, R.raw.color_mustard_yellow));


        // create an ArrayList of String type
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));


        WordAdapter itemsAdapter;
        itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                sounds.get(i).start();
            }
        });


    }
}