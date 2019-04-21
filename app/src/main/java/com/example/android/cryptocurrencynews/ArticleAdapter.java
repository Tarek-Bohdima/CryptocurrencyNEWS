/*

 PROJECT LICENSE

 This project was submitted by Tarek Bohdima as part of the Android Basics Nanodegree At Udacity.

 As part of Udacity Honor code, your submissions must be your own work, hence
 submitting this project as yours will cause you to break the Udacity Honor Code
 and the suspension of your account.

 Me, the author of the project, allow you to check the code as a reference, but if
 you submit it, it's your own responsibility if you get expelled.

 Copyright (c) 2018  Tarek Bohdima


 MIT License

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.

 */

package com.example.android.cryptocurrencynews;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Tarek on 22-Jun-18.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {


    public ArticleAdapter(@NonNull Context context, @NonNull ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolderItem viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.article_list_item, parent, false);

            viewHolder = new ViewHolderItem();
            viewHolder.articleTitleTextView = (TextView) convertView.findViewById(R.id.article_title);
            viewHolder.articleSectionTextView = (TextView) convertView.findViewById(R.id.article_section);
            viewHolder.articleAuthorTextView = (TextView) convertView.findViewById(R.id.article_author);
            viewHolder.articleDateTextView = (TextView) convertView.findViewById(R.id.article_date);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolderItem) convertView.getTag();
        }


        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        String articleTitle = currentArticle.getmTitle();
        String articleSection = currentArticle.getmSection();
        String articleAuthor = currentArticle.getmAuthor();

        // Define a SimpleDateFormat object to deconstruct original date.
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss'Z'");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        Date date = null;

        try {
            // Convert the date String into a Date object using the SimpleDateFormat.
            date = dateFormat.parse(currentArticle.getmDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Define a new SimpleDateFormat object to reconstruct the date into the desired format.
//        SimpleDateFormat newDateFormat = new SimpleDateFormat("LLL dd, yyyy");
        DateFormat newDateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // Convert the Date object into a String.
        String formattedDate = newDateFormat.format(date);

        viewHolder.articleTitleTextView.setText(articleTitle);
        viewHolder.articleSectionTextView.setText(articleSection);
        viewHolder.articleAuthorTextView.setText(articleAuthor);
        viewHolder.articleDateTextView.setText(formattedDate);


        return convertView;
    }

    // our ViewHolder.
    // caches our TextView
    static class ViewHolderItem {
        TextView articleTitleTextView;
        TextView articleSectionTextView;
        TextView articleAuthorTextView;
        TextView articleDateTextView;

    }

}
