package com.example.fariahuq.pocketaid;


/**
 * Created by Faria huq on 09-Nov-17.
 */

public class SelfTest
{

    long id;
    int favourite;
    String image;
    String title;

    // constructors
    public SelfTest() {
    }

    public SelfTest(String image, String title) {
        this.title = title;
        this.image = image;
    }

    public SelfTest(long id, int favourite, String image, String title) {
        this.id = id;
        this.favourite = favourite;
        this.image = image;
        this.title = title;
    }

    // setters
    public void setId(long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFavourite(int favourite){
        this.favourite = favourite;
    }

    // getters
    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getImage() {
        return this.image;
    }

    public int getFavourite(){
        return this.favourite;
    }

}
