package com.example.corinaarmasu.sebesguide;

/**
 * Created by corina.armasu on 3/27/2018.
 */

public class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Variable declaration
     */

    private String mName;
    private String mDescription;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String Name, String Description) {

        mName = Name;
        mDescription = Description;
    }

    /**
     * Create a new Place object
     *
     * @param Name            of the place
     * @param Description     of the place
     * @param imageResourceId is the drawable  resource ID for the image of the place
     */
    public Place(String Name, String Description, int imageResourceId) {

        mName = Name;
        mDescription = Description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the place name
     */
    public String getNameId() {
        return mName;
    }

    /**
     * Get the place description
     */
    public String getDescriptionId() {
        return mDescription;
    }

    /**
     * Get the image resource Id for the place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
