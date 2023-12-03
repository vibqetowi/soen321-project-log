package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class AppFeedback {
    private String activitiesFeedback;
    private String bookSessionFeedback;
    private String companyFeedback;
    private String copingFeelingFeedback;
    private String enduringFeedback;
    private String moodSelectionFeedback;
    private String thoughtsFeedback;
    private String topMenuFeedback;
    private CustomDate lastFeedbackDate = new CustomDate();
    private CustomDate companyFeedbackDate = new CustomDate();

    public String getActivitiesFeedback() {
        return this.activitiesFeedback;
    }

    public String getBookSessionFeedback() {
        return this.bookSessionFeedback;
    }

    public String getCompanyFeedback() {
        return this.companyFeedback;
    }

    public CustomDate getCompanyFeedbackDate() {
        return this.companyFeedbackDate;
    }

    public String getCopingFeelingFeedback() {
        return this.copingFeelingFeedback;
    }

    public String getEnduringFeedback() {
        return this.enduringFeedback;
    }

    public CustomDate getLastFeedbackDate() {
        return this.lastFeedbackDate;
    }

    public String getMoodSelectionFeedback() {
        return this.moodSelectionFeedback;
    }

    public String getThoughtsFeedback() {
        return this.thoughtsFeedback;
    }

    public String getTopMenuFeedback() {
        return this.topMenuFeedback;
    }

    public void setActivitiesFeedback(String str) {
        this.activitiesFeedback = str;
    }

    public void setBookSessionFeedback(String str) {
        this.bookSessionFeedback = str;
    }

    public void setCompanyFeedback(String str) {
        this.companyFeedback = str;
    }

    public void setCompanyFeedbackDate(CustomDate customDate) {
        this.companyFeedbackDate = customDate;
    }

    public void setCopingFeelingFeedback(String str) {
        this.copingFeelingFeedback = str;
    }

    public void setEnduringFeedback(String str) {
        this.enduringFeedback = str;
    }

    public void setLastFeedbackDate(CustomDate customDate) {
        this.lastFeedbackDate = customDate;
    }

    public void setMoodSelectionFeedback(String str) {
        this.moodSelectionFeedback = str;
    }

    public void setThoughtsFeedback(String str) {
        this.thoughtsFeedback = str;
    }

    public void setTopMenuFeedback(String str) {
        this.topMenuFeedback = str;
    }
}
