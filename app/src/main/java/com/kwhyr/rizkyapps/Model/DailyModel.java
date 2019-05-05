package com.kwhyr.rizkyapps.Model;

public class DailyModel {
    private String name, time;
    private int photo;

    public DailyModel(String name, String time, int photo) {
        this.name = name;
        this.time = time;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
