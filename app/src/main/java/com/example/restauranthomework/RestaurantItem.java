package com.example.restauranthomework;

public class RestaurantItem {
    //int for images as it is saved as an integer, Strings for the textview
    private int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;
    private String mText4;
    private String mText5;

    //constructor, have to pass the variables
    public RestaurantItem(int imageResource, String text1, String text2, String text3, String text4, String text5) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        mText4 = text4;
        mText5 = text5;
    }
    //getter methods to get values back
    //get image back
    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
    public String getmText3() {
        return mText3;
    }
    public String getmText4() {
        return mText4;
    }
    public String getmText5() {
        return mText5;
    }
}
