package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class StressCourse extends Course {
    private ArrayList<String> stressSymptoms;

    public StressCourse() {
        this.stressSymptoms = new ArrayList<>();
        set_id("99577353-fd79-4470-943d-1bd65e2a1a2f");
    }

    public ArrayList<String> getStressSymptoms() {
        return this.stressSymptoms;
    }

    public void setStressSymptoms(ArrayList<String> arrayList) {
        this.stressSymptoms = arrayList;
    }

    public StressCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.stressSymptoms = new ArrayList<>();
    }
}
