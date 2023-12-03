package com.theinnerhour.b2b.model;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public class HappinessCourse extends Course {
    private ArrayList<GratitudeJournalAnswerModel> answers;
    private ArrayList<String> gratitudeQuestionId;

    public HappinessCourse() {
        this.gratitudeQuestionId = new ArrayList<>();
        this.answers = new ArrayList<>();
        set_id("07cd8acb-c988-49fe-9bad-9b3683ff26f0");
    }

    public ArrayList<GratitudeJournalAnswerModel> getAnswers() {
        return this.answers;
    }

    public ArrayList<String> getGratitudeQuestionId() {
        return this.gratitudeQuestionId;
    }

    public void setAnswers(ArrayList<GratitudeJournalAnswerModel> arrayList) {
        this.answers = arrayList;
    }

    public void setGratitudeQuestionId(ArrayList<String> arrayList) {
        this.gratitudeQuestionId = arrayList;
    }

    public HappinessCourse(String str, ArrayList<Integer> arrayList, String str2, int i6) {
        super(str, arrayList, str2, i6);
        this.gratitudeQuestionId = new ArrayList<>();
        this.answers = new ArrayList<>();
    }
}
