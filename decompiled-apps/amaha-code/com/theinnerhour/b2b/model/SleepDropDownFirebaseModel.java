package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class SleepDropDownFirebaseModel {
    private String activity;
    private String slot;

    public SleepDropDownFirebaseModel() {
    }

    public SleepDropDownFirebaseModel(String str, String str2) {
        this.slot = str;
        this.activity = str2;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getSlot() {
        return this.slot;
    }

    public void setActivity(String str) {
        this.activity = str;
    }

    public void setSlot(String str) {
        this.slot = str;
    }
}
