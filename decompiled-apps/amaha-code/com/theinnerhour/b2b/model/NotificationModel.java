package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class NotificationModel {
    private int day;
    private String heading;
    private String link;
    private String message;
    private String time;

    public NotificationModel(String str, String str2, String str3, int i6, String str4) {
        this.link = str;
        this.heading = str2;
        this.message = str3;
        this.day = i6;
        this.time = str4;
    }

    public int getDay() {
        return this.day;
    }

    public String getHeading() {
        return this.heading;
    }

    public String getLink() {
        return this.link;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTime() {
        return this.time;
    }

    public void setDay(int i6) {
        this.day = i6;
    }

    public void setHeading(String str) {
        this.heading = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
