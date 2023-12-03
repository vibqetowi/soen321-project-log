package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class SleepCauseSummaryModel {
    private Integer popupImage;
    private String popupInfoText;
    private String popupTitleText;
    private String titleText;

    public SleepCauseSummaryModel(String str, String str2, String str3, Integer num) {
        this.titleText = str;
        this.popupInfoText = str2;
        this.popupTitleText = str3;
        this.popupImage = num;
    }

    public Integer getPopupImage() {
        return this.popupImage;
    }

    public String getPopupInfoText() {
        return this.popupInfoText;
    }

    public String getPopupTitleText() {
        return this.popupTitleText;
    }

    public String getTitleText() {
        return this.titleText;
    }

    public void setPopupImage(Integer num) {
        this.popupImage = num;
    }

    public void setPopupInfoText(String str) {
        this.popupInfoText = str;
    }

    public void setPopupTitleText(String str) {
        this.popupTitleText = str;
    }

    public void setTitleText(String str) {
        this.titleText = str;
    }
}
