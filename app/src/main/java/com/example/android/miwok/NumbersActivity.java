package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        Log.v("NumbersActivity", "Word at Index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at Index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at Index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at Index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at Index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at Index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at Index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at Index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at Index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at Index 9: " + words.get(9));

    }
}
