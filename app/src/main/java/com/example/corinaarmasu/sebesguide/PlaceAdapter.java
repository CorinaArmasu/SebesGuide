package com.example.corinaarmasu.sebesguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by corina.armasu on 3/27/2018.
 */

public class PlaceAdapter extends ArrayAdapter <Place> {

    /**
     * Resource ID for the background color for the place_list of places
     */
    private int mColorResourceId;

    /**
     * Create a new PlaceAdapter object
     *
     * @param context is the current context(Activity)
     * @param places  is the place_list of places to display
     */


    public PlaceAdapter(Activity context, ArrayList <Place> places, int colorResourceId) {

        /** Initialize the ArrayAdapter's internal storage for the context and the place_list.*/
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**Check if the existing view is being reused, otherwise inflate the view*/
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /**Get the Place object located at this position in the place_list*/
        Place currentPlace = getItem(position);

        /**Find the TextView in the list_item.xml layout with the ID */
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        /**Get the place name from the currentPlace object and set this text on
         *the Name TextView.
         * */
        nameTextView.setText(currentPlace.getNameId());

        /**Find the TextView in the list_item.xml layout with the ID */
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        /**Get the place name from the currentPlace object and set this text on
         *the Description TextView.
         **/
        descriptionTextView.setText(currentPlace.getDescriptionId());

        /**Set the theme color for the place_list item*/
        View textContainer = listItemView.findViewById(R.id.text_container);

        /**Find the color that the resource ID maps to*/
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        /**Set the background color of the text container View*/
        textContainer.setBackgroundColor(color);

        /** Find the ImageView in the list_item.xml layout with the ID image.*/
        ImageView imageView = listItemView.findViewById(R.id.image);

        /**Check if an image is provided for this word or not*/
        if (currentPlace.hasImage()) {
            /**If an image is available, display the provided image based on the resource ID*/
            imageView.setImageResource(currentPlace.getImageResourceId());
            /**Make sure the view is visible*/
            imageView.setVisibility(View.VISIBLE);
        } else {
            /**Otherwise hide the ImageView (set visibility to GONE)*/
            imageView.setVisibility(View.GONE);
        }

        /**Return the whole place_list item layout so that it can be shown in the ListView*/
        return listItemView;
    }
}
