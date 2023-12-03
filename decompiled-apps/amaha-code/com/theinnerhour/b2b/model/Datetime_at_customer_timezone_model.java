package com.theinnerhour.b2b.model;

import java.io.Serializable;
import tf.b;
/* loaded from: classes2.dex */
public class Datetime_at_customer_timezone_model implements Serializable {
    @b("date")
    String date;
    @b("datetime")
    String datetime;
    @b("day")
    String day;
    @b("diff_from_utc_hours")
    String diff_from_utc_hours;
    @b("slot")
    String slot;

    public String getDate() {
        return this.date;
    }

    public String getDatetime() {
        return this.datetime;
    }

    public String getDay() {
        return this.day;
    }

    public String getDiff_from_utc_hours() {
        return this.diff_from_utc_hours;
    }

    public String getSlot() {
        return this.slot;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDatetime(String str) {
        this.datetime = str;
    }

    public void setDay(String str) {
        this.day = str;
    }

    public void setDiff_from_utc_hours(String str) {
        this.diff_from_utc_hours = str;
    }

    public void setSlot(String str) {
        this.slot = str;
    }
}
