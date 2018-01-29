package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by markhan on 11/12/17.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Context context, ArrayList words) {
        super(context,0, words);
    }



    // Purpose of getView method is to return listitem view and return it to the listView
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the name default_text_view TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok translation from the current Word object and
        // set this text on the miwok_text_view TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the ImageView in the list_item.xml layout
        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.iconImage);

        if (currentWord.hasImage()) {
            // Get the appropriate image from the current object and
            // set this resource id on the imageView
            iconImage.setImageResource(currentWord.getImageResourceId());

            // If view was previously hidden, we need to make it visible again
            iconImage.setVisibility(View.VISIBLE);
        } else {
            // Hide the imageview {set visibility to GONE}
            iconImage.setVisibility(View.GONE);
        }

        return listItemView;


    }
}
