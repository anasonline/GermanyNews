package com.example.android.germanynews;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by anas on 28.04.17.
 */

public class NewsItemLoader extends AsyncTaskLoader<List<NewsItem>> {

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link NewsItemLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public NewsItemLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<NewsItem> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of books.
        List<NewsItem> newsItems = QueryUtils.fetchBookData(mUrl);
        return newsItems;
    }

}
