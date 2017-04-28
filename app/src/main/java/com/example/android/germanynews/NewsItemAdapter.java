package com.example.android.germanynews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anas on 28.04.17.
 */

public class NewsItemAdapter extends ArrayAdapter<NewsItem> {

    /**
     * Constructs a new {@link NewsItemAdapter}
     *
     * @param context   of the app
     * @param newsItems is the list of news items, which is the data source of the adapter
     **/

    public NewsItemAdapter(Context context, List<NewsItem> newsItems) {
        super(context, 0, newsItems);
    }

    // Returns a list item view that displays a news item at the given position

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news item at the given position in the list of news
        NewsItem currentNewsItem = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNewsItem.getTitle());

        // Find the TextView with view ID section
        TextView authorView = (TextView) listItemView.findViewById(R.id.section);
        authorView.setText(currentNewsItem.getSection());

        // Find the TextView with the view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentNewsItem.getDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
