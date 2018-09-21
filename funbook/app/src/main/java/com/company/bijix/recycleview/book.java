package com.company.bijix.recycleview;

/**
 * Created by BIJIX on 9/14/2018.
 */

public class book {

    private String title;
    private String category;
    private String deskripsi;
    private int icon;

    public book(){

    }

    //construction (alt + insert)
    public book(String title, String category, String deskripsi, int icon) {
        this.title = title;
        this.category = category;
        this.deskripsi = deskripsi;
        this.icon = icon;
    }

    //getter (alt + insert)
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getIcon() {
        return icon;
    }


    //setter (alt + insert)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
