package com.theinnerhour.b2b.components.assessments.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: AssessmentQuestion.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/model/AssessmentQuestion;", "Ljava/io/Serializable;", "questionId", "", "optionsId", "symptom", "", "imageId", "subtitleId", "(IILjava/lang/String;ILjava/lang/Integer;)V", "getImageId", "()I", "setImageId", "(I)V", "getOptionsId", "setOptionsId", "getQuestionId", "setQuestionId", "getSubtitleId", "()Ljava/lang/Integer;", "setSubtitleId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSymptom", "()Ljava/lang/String;", "setSymptom", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public class AssessmentQuestion implements Serializable {
    private int imageId;
    private int optionsId;
    private int questionId;
    private Integer subtitleId;
    private String symptom;

    public AssessmentQuestion(int i6, int i10, String symptom, int i11, Integer num) {
        i.g(symptom, "symptom");
        this.questionId = i6;
        this.optionsId = i10;
        this.symptom = symptom;
        this.imageId = i11;
        this.subtitleId = num;
    }

    public final int getImageId() {
        return this.imageId;
    }

    public final int getOptionsId() {
        return this.optionsId;
    }

    public final int getQuestionId() {
        return this.questionId;
    }

    public final Integer getSubtitleId() {
        return this.subtitleId;
    }

    public final String getSymptom() {
        return this.symptom;
    }

    public final void setImageId(int i6) {
        this.imageId = i6;
    }

    public final void setOptionsId(int i6) {
        this.optionsId = i6;
    }

    public final void setQuestionId(int i6) {
        this.questionId = i6;
    }

    public final void setSubtitleId(Integer num) {
        this.subtitleId = num;
    }

    public final void setSymptom(String str) {
        i.g(str, "<set-?>");
        this.symptom = str;
    }

    public /* synthetic */ AssessmentQuestion(int i6, int i10, String str, int i11, Integer num, int i12, d dVar) {
        this(i6, i10, str, i11, (i12 & 16) != 0 ? null : num);
    }
}
