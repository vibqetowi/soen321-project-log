package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CoachModelTracker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/CoachModelTracker;", "", "()V", "course", "", "getCourse", "()Ljava/lang/String;", "setCourse", "(Ljava/lang/String;)V", "endDate", "Lcom/theinnerhour/b2b/model/CustomDate;", "getEndDate", "()Lcom/theinnerhour/b2b/model/CustomDate;", "setEndDate", "(Lcom/theinnerhour/b2b/model/CustomDate;)V", "startDate", "getStartDate", "setStartDate", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CoachModelTracker {
    private String course = "";
    private CustomDate startDate = new CustomDate();
    private CustomDate endDate = new CustomDate();

    public final String getCourse() {
        return this.course;
    }

    public final CustomDate getEndDate() {
        return this.endDate;
    }

    public final CustomDate getStartDate() {
        return this.startDate;
    }

    public final void setCourse(String str) {
        i.g(str, "<set-?>");
        this.course = str;
    }

    public final void setEndDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.endDate = customDate;
    }

    public final void setStartDate(CustomDate customDate) {
        i.g(customDate, "<set-?>");
        this.startDate = customDate;
    }
}
