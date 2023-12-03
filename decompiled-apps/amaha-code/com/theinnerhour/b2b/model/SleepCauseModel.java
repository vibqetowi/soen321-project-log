package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class SleepCauseModel {
    private boolean isExpand;
    private String titleText;

    public SleepCauseModel(String str) {
        this.titleText = str;
    }

    public Boolean getExpand() {
        return Boolean.valueOf(this.isExpand);
    }

    public String getTitleText() {
        return this.titleText;
    }

    public void setExpand(Boolean bool) {
        this.isExpand = bool.booleanValue();
    }

    public void setTitleText(String str) {
        this.titleText = str;
    }
}
