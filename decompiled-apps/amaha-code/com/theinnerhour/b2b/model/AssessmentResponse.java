package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AssessmentResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/AssessmentResponse;", "Ljava/io/Serializable;", "symptom", "", "value", "", "(Ljava/lang/String;I)V", "()V", "getSymptom", "()Ljava/lang/String;", "setSymptom", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AssessmentResponse implements Serializable {
    private String symptom;
    private Integer value;

    public AssessmentResponse() {
        this.value = 0;
    }

    public final String getSymptom() {
        return this.symptom;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final void setSymptom(String str) {
        this.symptom = str;
    }

    public final void setValue(Integer num) {
        this.value = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssessmentResponse(String symptom, int i6) {
        this();
        i.g(symptom, "symptom");
        this.symptom = symptom;
        this.value = Integer.valueOf(i6);
    }
}
