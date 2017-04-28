package com.example.android.germanynews;

/**
 * Created by anas on 28.04.17.
 */

public class NewsItem {

    private String mTitle;
    private String mSection;
    private String mDate;

    public NewsItem(String title, String section, String date) {
        mTitle = title;
        mSection = section;
        mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }
}
