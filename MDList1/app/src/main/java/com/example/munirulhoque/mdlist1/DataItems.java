package com.example.munirulhoque.mdlist1;

/**
 * Created by munirul.hoque on 3/11/2015.
 */
public class DataItems {
    private String title;
    private int imageUrl;
    public DataItems(String title, int imageUrl)
    {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
