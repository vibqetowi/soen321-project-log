package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class WorryCourse extends Course {
    private ArrayList<String> worrySymptoms;

    public WorryCourse() {
        this.worrySymptoms = new ArrayList<>();
        set_id("db992ff7-a994-499c-a05b-3c3cb44fdfb5");
    }

    public ArrayList<String> getWorrySymptoms() {
        return this.worrySymptoms;
    }

    public void setWorrySymptoms(ArrayList<String> arrayList) {
        this.worrySymptoms = arrayList;
    }

    public WorryCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.worrySymptoms = new ArrayList<>();
    }
}
