
package com.example.android.miwok;

        import android.media.MediaPlayer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//      create an Arraylist of MediaPlayer type
        final ArrayList<MediaPlayer> sounds = new ArrayList<>();

        sounds.add(MediaPlayer.create(this, R.raw.phrase_where_are_you_going));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_what_is_your_name));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_my_name_is));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_how_are_you_feeling));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_im_feeling_good));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_are_you_coming));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_yes_im_coming));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_im_coming));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_lets_go));
        sounds.add(MediaPlayer.create(this, R.raw.phrase_come_here));


        // create an ArrayList of Custom Word type
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs"));
        words.add(new Word("I'm feeling good", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa"));
        words.add(new Word("Yes, I'm coming", "hәә’ әәnәm"));
        words.add(new Word("I'm coming", "әәnәm"));
        words.add(new Word("Let's go", "yoowutis"));
        words.add(new Word("Come here", "әnni'nem"));

        WordAdapter itemsAdapter;
        itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                sounds.get(position).start();
            }
        });


    }
}