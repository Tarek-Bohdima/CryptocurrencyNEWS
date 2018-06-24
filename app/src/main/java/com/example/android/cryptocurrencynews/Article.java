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

/**
 * Created by Tarek on 21-Jun-18.
 */
@SuppressWarnings("SpellCheckingInspection")
public class Article {
    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title   is the title of the article.
     * @param section is the name of the section that the article belongs to.
     * @param author  is the writer of the article.
     * @param date    is the date of the publishing of the article.
     * @param url     is the url of the article.
     */
    public Article(String title, String section, String author, String date, String url) {

        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    @Override
    public String toString() {
        return "Article{" +
                "mTitle='" + mTitle + '\'' +
                ", mSection='" + mSection + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
