package com.example.android.germanynews;

/**
 * Created by anas on 28.04.17.
 */

public class NewsItem {

    private String mTitle;
    private String mSection;
    private String mDate;
    private String mWebUrl;

    public NewsItem(String title, String section, String date, String webUrl) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mWebUrl = webUrl;
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

    public String getWebUrl() {
        return mWebUrl;
    }
}
