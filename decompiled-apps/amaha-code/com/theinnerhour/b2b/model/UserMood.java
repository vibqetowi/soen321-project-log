package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes2.dex */
public class UserMood implements Serializable {
    private String course;
    private String level;
    @Exclude
    private Date mDate;
    CustomDate date = new CustomDate();
    private ArrayList<String> options = new ArrayList<>();

    public UserMood() {
    }

    public String getCourse() {
        return this.course;
    }

    public CustomDate getDate() {
        return this.date;
    }

    public String getLevel() {
        return this.level;
    }

    public ArrayList<String> getOptions() {
        return this.options;
    }

    @Exclude
    public Date getmDate() {
        if (this.mDate == null) {
            this.mDate = new Date(getDate().getTime() * 1000);
        }
        return this.mDate;
    }

    public void setCourse(String str) {
        this.course = str;
    }

    public void setDate(CustomDate customDate) {
        this.date = customDate;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setOptions(ArrayList<String> arrayList) {
        this.options = arrayList;
    }

    @Exclude
    public void setmDate(Date date) {
        this.mDate = date;
        getDate().setTime(date.getTime());
    }

    public UserMood(String str, String str2) {
        this.level = str;
        this.course = str2;
        setmDate(Calendar.getInstance().getTime());
    }

    public UserMood(String str) {
        this.level = str;
        setmDate(Calendar.getInstance().getTime());
    }
}
