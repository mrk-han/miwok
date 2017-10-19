/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View by ID so we can use it later.
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView familyMembers = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);


        if (numbers != null) {
            //Set a click listener on that View
            numbers.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

        if (familyMembers != null) {
            //Set a click listener on that View
            familyMembers.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the familyMembers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent familyMembersIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                    startActivity(familyMembersIntent);
                }
            });
        }

        if (colors != null) {
            //Set a click listener on that View
            colors.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the colors View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }
            });
        }

        if (phrases != null) {
            //Set a click listener on that View
            phrases.setOnClickListener(new OnClickListener() {
                // The code in this method will be executed when the phrases View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });
        }
    }




}
