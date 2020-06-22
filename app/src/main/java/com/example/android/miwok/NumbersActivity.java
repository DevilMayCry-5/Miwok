package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // create an ArrayList of String type
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

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
        itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}