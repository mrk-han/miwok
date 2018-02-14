package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by markhan on 11/12/17.
 * <p>
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;


    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param words           is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Context context, ArrayList words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    // Purpose of getView method is to return listitem view and return it to the listView
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
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
            // If an image is available,
            // Get the appropriate image from the current object and
            // set this resource id on the imageView
            iconImage.setImageResource(currentWord.getImageResourceId());

            // If view was previously hidden, we need to make it visible again
            iconImage.setVisibility(View.VISIBLE);
        } else {
            // Hide the ImageView {set visibility to GONE}
            iconImage.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        // Find the text container (parent view with the 2 text views within it)
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);


        // Returns the whole list item layout (containing 2 text views) so that it can be shown in
        // the ListView
        return listItemView;


    }
}
