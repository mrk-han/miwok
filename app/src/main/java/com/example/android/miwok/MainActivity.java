package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        //
        setContentView(R.layout.activity_category);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        // Create an adapter that knows which fragment should be shown on each page
        MiwokViewPagerAdapter adapter = new MiwokViewPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        if (viewPager != null) {
            viewPager.setAdapter(adapter);
        }

        // Find the View that shows the numbers category
        //
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Find the View that shows the family category
        //
        TextView family = (TextView) findViewById(R.id.family);

        // Find the View that shows the colors category
        //
        TextView colors = (TextView) findViewById(R.id.colors);

        // Find the View that shows the phrases category
        //
        TextView phrases = (TextView) findViewById(R.id.phrases);


        if (numbers != null) {
            // Set a click listener on that View
            //
            numbers.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the numbers category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link NumbersActivity}
                    //
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                    // Start the new activity
                    //
                    startActivity(numbersIntent);
                }
            });
        }


        if (family != null) {
            // Set a click listener on that View
            //
            family.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the family category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link FamilyActivity}
                    //
                    Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);

                    // Start the new activity
                    //
                    startActivity(familyIntent);
                }
            });
        }


        if (colors != null) {
            // Set a click listener on that View
            //
            colors.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the colors category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link ColorsActivity}
                    //
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                    // Start the new activity
                    //
                    startActivity(colorsIntent);
                }
            });
        }


        if (phrases != null) {
            // Set a click listener on that View
            //
            phrases.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the phrases category is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link PhrasesActivity}
                    //
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                    // Start the new activity
                    //
                    startActivity(phrasesIntent);
                }
            });
        }
    }
}