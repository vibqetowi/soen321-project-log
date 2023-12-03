package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CourseDayModelV1.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR*\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00040+j\b\u0012\u0004\u0012\u00020\u0004`,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "Ljava/io/Serializable;", "()V", "content_id", "", "getContent_id", "()Ljava/lang/String;", "setContent_id", "(Ljava/lang/String;)V", "content_label", "getContent_label", "setContent_label", "isAssessment", "", "()Ljava/lang/Boolean;", "setAssessment", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isCompleted", "()Z", "setCompleted", "(Z)V", "isFavorite", "setFavorite", "last_accessed_date", "", "getLast_accessed_date", "()J", "setLast_accessed_date", "(J)V", Constants.DAYMODEL_POSITION, "", "getPosition", "()I", "setPosition", "(I)V", "start_date", "getStart_date", "setStart_date", "symptom", "getSymptom", "setSymptom", "tags", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "setTags", "(Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CourseDayModelV1 implements Serializable {
    private String content_id;
    private String content_label;
    private Boolean isAssessment;
    private boolean isCompleted;
    private boolean isFavorite;
    private long last_accessed_date;
    private int position;
    private long start_date;
    private String symptom;
    private ArrayList<String> tags = new ArrayList<>();

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getContent_label() {
        return this.content_label;
    }

    public final long getLast_accessed_date() {
        return this.last_accessed_date;
    }

    public final int getPosition() {
        return this.position;
    }

    public final long getStart_date() {
        return this.start_date;
    }

    public final String getSymptom() {
        return this.symptom;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public final Boolean isAssessment() {
        return this.isAssessment;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setAssessment(Boolean bool) {
        this.isAssessment = bool;
    }

    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    public final void setContent_id(String str) {
        this.content_id = str;
    }

    public final void setContent_label(String str) {
        this.content_label = str;
    }

    public final void setFavorite(boolean z10) {
        this.isFavorite = z10;
    }

    public final void setLast_accessed_date(long j10) {
        this.last_accessed_date = j10;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final void setStart_date(long j10) {
        this.start_date = j10;
    }

    public final void setSymptom(String str) {
        this.symptom = str;
    }

    public final void setTags(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.tags = arrayList;
    }
}
