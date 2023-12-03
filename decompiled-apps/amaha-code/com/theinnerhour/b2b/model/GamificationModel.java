package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import fe.i;
import java.util.Calendar;
import java.util.Date;
/* loaded from: classes2.dex */
public class GamificationModel {
    private String courseName;
    private CustomDate date = new CustomDate();
    private String goalName;
    @Exclude
    @i
    private Date mDate;
    private int points;
    private String task;

    public GamificationModel() {
    }

    public String getCourseName() {
        return this.courseName;
    }

    public CustomDate getDate() {
        return this.date;
    }

    public String getGoalName() {
        return this.goalName;
    }

    public int getPoints() {
        return this.points;
    }

    public String getTask() {
        return this.task;
    }

    @Exclude
    @i
    public Date getmDate() {
        if (this.mDate == null) {
            this.mDate = new Date(getDate().getTime() * 1000);
        }
        return this.mDate;
    }

    public void setCourseName(String str) {
        this.courseName = str;
    }

    public void setDate(CustomDate customDate) {
        this.date = customDate;
    }

    public void setGoalName(String str) {
        this.goalName = str;
    }

    public void setPoints(int i6) {
        this.points = i6;
    }

    public void setTask(String str) {
        this.task = str;
    }

    @Exclude
    @i
    public void setmDate(Date date) {
        this.mDate = date;
        getDate().setTime(date.getTime());
    }

    public GamificationModel(int i6, String str) {
        this.points = i6;
        this.task = str;
        setmDate(Calendar.getInstance().getTime());
    }

    public GamificationModel(int i6, String str, String str2) {
        this.points = i6;
        this.task = str;
        this.courseName = str2;
        setmDate(Calendar.getInstance().getTime());
    }

    public GamificationModel(int i6, String str, String str2, String str3) {
        this.points = i6;
        this.task = str;
        this.courseName = str2;
        this.goalName = str3;
        setmDate(Calendar.getInstance().getTime());
    }
}
