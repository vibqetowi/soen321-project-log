package com.ifriend.ui.calendar;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
/* loaded from: classes4.dex */
public class DatePickerFactory {
    public static final DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
    private DateFactoryListener listener;
    private DateModel maxDate;
    private DateModel minDate;
    private DateModel selectedDate;

    public DatePickerFactory(DateFactoryListener dateFactoryListener) {
        this.listener = dateFactoryListener;
        Calendar currentTime = DateUtils.INSTANCE.getCurrentTime();
        Calendar currentTime2 = DateUtils.INSTANCE.getCurrentTime();
        currentTime2.set(1, currentTime.get(1) - 99);
        this.minDate = new DateModel(currentTime2);
        this.maxDate = new DateModel(currentTime);
        this.selectedDate = checkSelectedDate(DateUtils.INSTANCE.getCurrentTime());
    }

    public void setSelectedYear(int i) {
        this.selectedDate.setYear(i);
        cutSelectedDate();
        this.listener.onYearChanged();
    }

    public void setSelectedMonth(int i) {
        this.selectedDate.setMonth(i);
        cutSelectedDate();
        this.listener.onMonthChanged();
    }

    public void setSelectedDay(int i) {
        this.selectedDate.setDay(i);
        cutSelectedDate();
        this.listener.onDayChanged();
    }

    private void cutSelectedDate() {
        if (this.selectedDate.getYear() <= this.minDate.getYear() && this.selectedDate.getMonth() <= this.minDate.getMonth()) {
            this.selectedDate.setMonth(this.minDate.getMonth());
            if (this.selectedDate.getDay() < this.minDate.getDay()) {
                this.selectedDate.setDay(this.minDate.getDay());
            }
        }
        if (this.selectedDate.getYear() >= this.maxDate.getYear() && this.selectedDate.getMonth() >= this.maxDate.getMonth()) {
            this.selectedDate.setMonth(this.maxDate.getMonth());
            if (this.selectedDate.getDay() > this.maxDate.getDay()) {
                this.selectedDate.setDay(this.maxDate.getDay());
            }
        }
        this.selectedDate.updateModel();
    }

    public DateModel getMaxDate() {
        return this.maxDate;
    }

    public void setMaxDate(Calendar calendar) {
        this.maxDate = new DateModel(calendar);
        this.selectedDate = checkSelectedDate(this.selectedDate.getDate());
        this.listener.onConfigsChanged();
    }

    public DateModel getMinDate() {
        return this.minDate;
    }

    public void setMinDate(Calendar calendar) {
        this.minDate = new DateModel(calendar);
        this.selectedDate = checkSelectedDate(this.selectedDate.getDate());
        this.listener.onConfigsChanged();
    }

    public void setDateLimit(Calendar calendar, Calendar calendar2) {
        this.maxDate = new DateModel(calendar2);
        this.minDate = new DateModel(calendar);
        this.selectedDate = checkSelectedDate(this.selectedDate.getDate());
        this.listener.onConfigsChanged();
    }

    public DateModel getSelectedDate() {
        return this.selectedDate;
    }

    public void setSelectedDate(Calendar calendar) {
        this.selectedDate = checkSelectedDate(calendar);
        this.listener.onConfigsChanged();
    }

    private DateModel checkSelectedDate(Calendar calendar) {
        long timeInMillis = calendar.getTimeInMillis();
        long timeInMillis2 = this.minDate.getDate().getTimeInMillis();
        long timeInMillis3 = this.maxDate.getDate().getTimeInMillis();
        if (timeInMillis >= timeInMillis2 && timeInMillis <= timeInMillis3) {
            return new DateModel(calendar);
        }
        return new DateModel(Math.abs(timeInMillis - timeInMillis2) < Math.abs(timeInMillis - timeInMillis3) ? DateUtils.INSTANCE.copyCalendar(this.minDate.getDate()) : DateUtils.INSTANCE.copyCalendar(this.maxDate.getDate()));
    }

    public List<Integer> getDayList() {
        int actualMaximum = this.selectedDate.getDate().getActualMaximum(5);
        if (this.selectedDate.getYear() == this.maxDate.getYear() && this.selectedDate.getMonth() == this.maxDate.getMonth()) {
            actualMaximum = this.maxDate.getDay();
        }
        int day = (this.selectedDate.getYear() == this.minDate.getYear() && this.selectedDate.getMonth() == this.minDate.getMonth()) ? this.minDate.getDay() - 1 : 0;
        ArrayList arrayList = new ArrayList();
        while (day < actualMaximum) {
            day++;
            arrayList.add(Integer.valueOf(day));
        }
        return arrayList;
    }

    public List<Integer> getMonthList() {
        int size = Arrays.asList(dfs.getMonths()).size();
        if (this.selectedDate.getYear() == this.maxDate.getYear()) {
            size = this.maxDate.getMonth() + 1;
        }
        ArrayList arrayList = new ArrayList();
        for (int month = this.selectedDate.getYear() == this.minDate.getYear() ? this.minDate.getMonth() : 0; month < size; month++) {
            arrayList.add(Integer.valueOf(month));
        }
        return arrayList;
    }

    public List<Integer> getYearList() {
        int abs = Math.abs(this.minDate.getYear() - this.maxDate.getYear()) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < abs; i++) {
            arrayList.add(Integer.valueOf(this.minDate.getYear() + i));
        }
        return arrayList;
    }
}
