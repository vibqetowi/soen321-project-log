package com.ifriend.ui.calendar;

import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes4.dex */
public class DateModel {
    private Calendar date;
    private int day;
    private int month;
    private int year;

    public DateModel(Calendar calendar) {
        setDate(calendar);
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar calendar) {
        this.date = calendar;
        this.day = calendar.get(5);
        this.month = calendar.get(2);
        this.year = calendar.get(1);
    }

    public void updateModel() {
        Calendar currentTime = DateUtils.INSTANCE.getCurrentTime();
        currentTime.set(1, this.year);
        currentTime.set(2, this.month);
        currentTime.set(5, 1);
        currentTime.set(5, Math.min(this.day, currentTime.getActualMaximum(5)));
        setDate(currentTime);
    }

    public String toString() {
        return "DateModel{year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", date=" + this.date + AbstractJsonLexerKt.END_OBJ;
    }
}
