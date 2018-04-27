package com.example.admin.androidsqlite.model;

/**
 * Created by admin on 19-04-2018.
 */

public class Memo {

    private int id;
    private String date;
    private String event;

    public Memo() {

    }

    public Memo(int id,String date, String event) {
        this.id=id;
        this.date = date;
        this.event = event;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}
