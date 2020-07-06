package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Arraylist of sound files
//        final ArrayList<MediaPlayer> sounds = new ArrayList<>();
//
//        sounds.add(MediaPlayer.create(this, R.raw.family_father));
//        sounds.add(MediaPlayer.create(this, R.raw.family_mother));
//        sounds.add(MediaPlayer.create(this, R.raw.family_son));
//        sounds.add(MediaPlayer.create(this, R.raw.family_daughter));
//        sounds.add(MediaPlayer.create(this, R.raw.family_older_brother));
//        sounds.add(MediaPlayer.create(this, R.raw.family_younger_brother));
//        sounds.add(MediaPlayer.create(this, R.raw.family_older_sister));
//        sounds.add(MediaPlayer.create(this, R.raw.family_younger_sister));
//        sounds.add(MediaPlayer.create(this, R.raw.family_grandmother));
//        sounds.add(MediaPlayer.create(this, R.raw.family_grandfather));


        // create an ArrayList of String type
        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));


        WordAdapter itemsAdapter;
        itemsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Word word = words.get(position);

                    releaseMediaPlayer();

                    mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                    mediaPlayer.start();

                    mediaPlayer.setOnCompletionListener(onCompletionListener);


            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}