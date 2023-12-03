package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class AngerCourse extends Course {
    private ArrayList<String> angerSymptoms;

    public AngerCourse() {
        this.angerSymptoms = new ArrayList<>();
        set_id("782730c9-04c0-4fb5-81e8-6f2739e1d8d9");
    }

    public ArrayList<String> getAngerSymptoms() {
        return this.angerSymptoms;
    }

    public void setAngerSymptoms(ArrayList<String> arrayList) {
        this.angerSymptoms = arrayList;
    }

    public AngerCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.angerSymptoms = new ArrayList<>();
    }
}
