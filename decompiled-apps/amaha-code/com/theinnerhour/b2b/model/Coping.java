package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class Coping extends UserMood {
    private String feelings;
    private String levelSecond;

    public Coping() {
    }

    public String getFeelings() {
        return this.feelings;
    }

    public String getLevelSecond() {
        return this.levelSecond;
    }

    public void setFeelings(String str) {
        this.feelings = str;
    }

    public void setLevelSecond(String str) {
        this.levelSecond = str;
    }

    public Coping(String str) {
        super(str);
    }
}
