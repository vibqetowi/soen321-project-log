package com.theinnerhour.b2b.model;

import java.util.Calendar;
import java.util.Date;
/* loaded from: classes2.dex */
public class GratitudeJournalAnswerModel {
    private String answer;
    private Date date;
    private String questionId;
    private boolean visible;

    public GratitudeJournalAnswerModel() {
    }

    public GratitudeJournalAnswerModel(String str, String str2) {
        this.questionId = str;
        this.answer = str2;
        this.date = Calendar.getInstance().getTime();
        this.visible = true;
    }

    public String getAnswer() {
        return this.answer;
    }

    public Date getDate() {
        return this.date;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setAnswer(String str) {
        this.answer = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setQuestionId(String str) {
        this.questionId = str;
    }

    public void setVisible(boolean z10) {
        this.visible = z10;
    }
}
