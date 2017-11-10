package com.example.fariahuq.pocketaid;

import java.util.Map;

/**
 * Created by Faria huq on 09-Nov-17.
 */

public class SelfTest
{

    int id;
    int favourite;
    String image;
    String title;
    public Map<String,Sti> items;

    // constructors
    public SelfTest() {
    }

    public SelfTest(String image, String title) {
        this.title = title;
        this.image = image;
    }

    public SelfTest(int id, int favourite, String image, String title) {
        this.id = id;
        this.favourite = favourite;
        this.image = image;
        this.title = title;
    }

    // setters
    public void setId(int id) {
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

    static public class Sti
    {

        int id;
        int fid;
        String image;
        String title;
        String desc;

        // constructors
        public Sti() {
        }

        public Sti(String image, String title, String desc) {
            this.title = title;
            this.image = image;
            this.desc=desc;
        }

        public Sti(int id, int fid, String image, String title, String desc) {
            this.id = id;
            this.fid = fid;
            this.image = image;
            this.title = title;
            this.desc=desc;
        }

        // setters
        public void setId(int id) {
            this.id = id;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setFid(int fid){
            this.fid = fid;
        }

        public void setDesc(String desc){this.desc = desc;}

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

        public int getFid(){
            return this.fid;
        }

        public String getDesc() {return this.desc;}
    }

}
