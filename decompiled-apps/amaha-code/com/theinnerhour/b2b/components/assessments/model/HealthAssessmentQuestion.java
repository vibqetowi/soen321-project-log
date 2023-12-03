package com.theinnerhour.b2b.components.assessments.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: HealthAssessmentQuestion.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/model/HealthAssessmentQuestion;", "Lcom/theinnerhour/b2b/components/assessments/model/AssessmentQuestion;", "Ljava/io/Serializable;", "questionId", "", "optionsId", "symptom", "", "imageId", "subtitleId", "subQuestionId", "subOptionsId", "(IILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSubOptionsId", "()Ljava/lang/Integer;", "setSubOptionsId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSubQuestionId", "setSubQuestionId", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class HealthAssessmentQuestion extends AssessmentQuestion {
    private Integer subOptionsId;
    private Integer subQuestionId;

    public /* synthetic */ HealthAssessmentQuestion(int i6, int i10, String str, int i11, Integer num, Integer num2, Integer num3, int i12, d dVar) {
        this(i6, i10, str, i11, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? null : num3);
    }

    public final Integer getSubOptionsId() {
        return this.subOptionsId;
    }

    public final Integer getSubQuestionId() {
        return this.subQuestionId;
    }

    public final void setSubOptionsId(Integer num) {
        this.subOptionsId = num;
    }

    public final void setSubQuestionId(Integer num) {
        this.subQuestionId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthAssessmentQuestion(int i6, int i10, String symptom, int i11, Integer num, Integer num2, Integer num3) {
        super(i6, i10, symptom, i11, num);
        i.g(symptom, "symptom");
        this.subQuestionId = num2;
        this.subOptionsId = num3;
    }
}
