package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AssessmentResponseAll.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB\u0005¢\u0006\u0002\u0010\nR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/model/AssessmentResponseAll;", "Ljava/io/Serializable;", "health", "Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;", "symptom", "global", "score", "", "day", "(Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;II)V", "()V", "getDay", "()Ljava/lang/Integer;", "setDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGlobal", "()Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;", "setGlobal", "(Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;)V", "getHealth", "setHealth", "getScore", "setScore", "getSymptom", "setSymptom", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AssessmentResponseAll implements Serializable {
    private Integer day;
    private AssessmentResponseCategory global;
    private AssessmentResponseCategory health;
    private Integer score;
    private AssessmentResponseCategory symptom;

    public AssessmentResponseAll() {
        this.health = new AssessmentResponseCategory();
        this.symptom = new AssessmentResponseCategory();
        this.global = new AssessmentResponseCategory();
        this.score = 0;
        this.day = 0;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final AssessmentResponseCategory getGlobal() {
        return this.global;
    }

    public final AssessmentResponseCategory getHealth() {
        return this.health;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final AssessmentResponseCategory getSymptom() {
        return this.symptom;
    }

    public final void setDay(Integer num) {
        this.day = num;
    }

    public final void setGlobal(AssessmentResponseCategory assessmentResponseCategory) {
        i.g(assessmentResponseCategory, "<set-?>");
        this.global = assessmentResponseCategory;
    }

    public final void setHealth(AssessmentResponseCategory assessmentResponseCategory) {
        i.g(assessmentResponseCategory, "<set-?>");
        this.health = assessmentResponseCategory;
    }

    public final void setScore(Integer num) {
        this.score = num;
    }

    public final void setSymptom(AssessmentResponseCategory assessmentResponseCategory) {
        i.g(assessmentResponseCategory, "<set-?>");
        this.symptom = assessmentResponseCategory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssessmentResponseAll(AssessmentResponseCategory health, AssessmentResponseCategory symptom, AssessmentResponseCategory global, int i6, int i10) {
        this();
        i.g(health, "health");
        i.g(symptom, "symptom");
        i.g(global, "global");
        this.health = health;
        this.symptom = symptom;
        this.global = global;
        this.day = Integer.valueOf(i10);
        this.score = Integer.valueOf(i6);
    }
}
