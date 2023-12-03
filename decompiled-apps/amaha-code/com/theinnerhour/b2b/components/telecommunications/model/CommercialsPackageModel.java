package com.theinnerhour.b2b.components.telecommunications.model;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class CommercialsPackageModel implements Serializable {
    private int couple_hourly_fee;
    private int hourly_fee;
    private ArrayList<String> medium = new ArrayList<>();
    private int minimum_fee;

    public int getCouple_hourly_fee() {
        return this.couple_hourly_fee;
    }

    public int getHourly_fee() {
        return this.hourly_fee;
    }

    public ArrayList<String> getMedium() {
        return this.medium;
    }

    public int getMinimum_fee() {
        return this.minimum_fee;
    }

    public void setCouple_hourly_fee(int i6) {
        this.couple_hourly_fee = i6;
    }

    public void setHourly_fee(int i6) {
        this.hourly_fee = i6;
    }

    public void setMedium(ArrayList<String> arrayList) {
        this.medium = arrayList;
    }
}
