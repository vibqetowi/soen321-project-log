package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AssessmentResponseCategory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/model/AssessmentResponseCategory;", "Ljava/io/Serializable;", "()V", "score", "", "getScore", "()I", "setScore", "(I)V", "values", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/AssessmentResponse;", "Lkotlin/collections/ArrayList;", "getValues", "()Ljava/util/ArrayList;", "setValues", "(Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AssessmentResponseCategory implements Serializable {
    private int score;
    private ArrayList<AssessmentResponse> values = new ArrayList<>();

    public final int getScore() {
        return this.score;
    }

    public final ArrayList<AssessmentResponse> getValues() {
        return this.values;
    }

    public final void setScore(int i6) {
        this.score = i6;
    }

    public final void setValues(ArrayList<AssessmentResponse> arrayList) {
        i.g(arrayList, "<set-?>");
        this.values = arrayList;
    }
}
