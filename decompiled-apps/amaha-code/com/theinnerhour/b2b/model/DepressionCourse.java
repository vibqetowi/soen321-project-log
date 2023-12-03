package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class DepressionCourse extends Course {
    private ArrayList<String> depressionSymptoms;

    public DepressionCourse() {
        this.depressionSymptoms = new ArrayList<>();
        set_id("33b80e0a-267a-49b4-9a80-2d87dce7f99a");
    }

    public ArrayList<String> getDepressionSymptoms() {
        return this.depressionSymptoms;
    }

    public void setDepressionSymptoms(ArrayList<String> arrayList) {
        this.depressionSymptoms = arrayList;
    }

    public DepressionCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.depressionSymptoms = new ArrayList<>();
    }
}
