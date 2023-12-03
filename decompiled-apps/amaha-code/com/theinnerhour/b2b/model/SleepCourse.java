package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class SleepCourse extends Course {
    private String age;
    private ArrayList<String> sleepCauses;
    private ArrayList<SleepDropDownFirebaseModel> sleepDropDown;
    private ArrayList<String> sleepSymptoms;
    private String sleepTime;
    private String sleepTimeTable;
    private String wakeUpTime;

    public SleepCourse() {
        this.sleepCauses = new ArrayList<>();
        this.sleepDropDown = new ArrayList<>();
        this.sleepSymptoms = new ArrayList<>();
        set_id("84982153-2f9c-4982-9bd1-f5a614d96456");
    }

    public String getAge() {
        return this.age;
    }

    public ArrayList<String> getSleepCauses() {
        return this.sleepCauses;
    }

    public ArrayList<SleepDropDownFirebaseModel> getSleepDropDown() {
        return this.sleepDropDown;
    }

    public ArrayList<String> getSleepSymptoms() {
        return this.sleepSymptoms;
    }

    public String getSleepTime() {
        return this.sleepTime;
    }

    public String getSleepTimeTable() {
        return this.sleepTimeTable;
    }

    public String getWakeUpTime() {
        return this.wakeUpTime;
    }

    public void setAge(String str) {
        this.age = str;
    }

    public void setSleepCauses(ArrayList<String> arrayList) {
        this.sleepCauses = arrayList;
    }

    public void setSleepDropDown(ArrayList<SleepDropDownFirebaseModel> arrayList) {
        this.sleepDropDown = arrayList;
    }

    public void setSleepSymptoms(ArrayList<String> arrayList) {
        this.sleepSymptoms = arrayList;
    }

    public void setSleepTime(String str) {
        this.sleepTime = str;
    }

    public void setSleepTimeTable(String str) {
        this.sleepTimeTable = str;
    }

    public void setWakeUpTime(String str) {
        this.wakeUpTime = str;
    }

    public SleepCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.sleepCauses = new ArrayList<>();
        this.sleepDropDown = new ArrayList<>();
        this.sleepSymptoms = new ArrayList<>();
    }
}
