
package com.example.android.miwok;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;

        import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // create an ArrayList of String type
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

        // variable to get size of array
        // int index = words.size();
        // variable to keep track of current index position


        // get id of rootView where new TextViews will be added
        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // for loop to add new child TextViews to rootView
        // and sets their text based on arrayList data

  /*      for(int i = 0; i < index; i++ ){
            TextView wordView = new TextView(this);
            String one = words.get(i);
            wordView.setText(one);
            assert rootView != null;
            rootView.addView(wordView);
        } */

        WordAdapter itemsAdapter;
        itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}