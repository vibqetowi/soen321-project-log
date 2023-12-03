package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class GratitudeJournalQuestionModel {
    private int image;
    private String question;
    private String questionId;

    public GratitudeJournalQuestionModel() {
    }

    public GratitudeJournalQuestionModel(String str, String str2, int i6) {
        this.questionId = str;
        this.question = str2;
        this.image = i6;
    }

    public int getImage() {
        return this.image;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public void setImage(int i6) {
        this.image = i6;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setQuestionId(String str) {
        this.questionId = str;
    }
}
