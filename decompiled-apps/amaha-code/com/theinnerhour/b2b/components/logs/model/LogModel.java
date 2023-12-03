package com.theinnerhour.b2b.components.logs.model;

import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: LogModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/components/logs/model/LogModel;", "", "goalName", "", "goalId", "resultKey", "title", "isV3Log", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getGoalId", "()Ljava/lang/String;", "getGoalName", "()Z", "getResultKey", "getTitle", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LogModel {
    private final String goalId;
    private final String goalName;
    private final boolean isV3Log;
    private final String resultKey;
    private final String title;

    public LogModel(String str, String str2, String str3, String str4, boolean z10) {
        e.u(str2, "goalId", str3, "resultKey", str4, "title");
        this.goalName = str;
        this.goalId = str2;
        this.resultKey = str3;
        this.title = str4;
        this.isV3Log = z10;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final String getResultKey() {
        return this.resultKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isV3Log() {
        return this.isV3Log;
    }
}
