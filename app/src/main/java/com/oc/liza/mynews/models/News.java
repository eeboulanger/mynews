package com.oc.liza.mynews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import retrofit2.http.Url;

public class News {

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("subsection")
    @Expose
    private String subsection;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("published_date")
    @Expose
    private Date published_date;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("multimedia")
    @Expose
    private ArrayList<NewsImage> multimedia;


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublished_date() {
        return DateFormat.getDateInstance(DateFormat.SHORT).format(published_date);
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setMultimedia(ArrayList<NewsImage> multimedia) {
        this.multimedia = multimedia;
    }

    public ArrayList<NewsImage> getMultimedia() {
        return multimedia;
        ///url to image [0]
    }

}