package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: NotificationModels.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/model/GoalNotificationContent;", "", "()V", "body", "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "experiment", "getExperiment", "setExperiment", "key", "getKey", "setKey", "title", "getTitle", "setTitle", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class GoalNotificationContent {
    private String title = "";
    private String body = "";
    private String experiment = "";
    private String key = "";

    public final String getBody() {
        return this.body;
    }

    public final String getExperiment() {
        return this.experiment;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        i.g(str, "<set-?>");
        this.body = str;
    }

    public final void setExperiment(String str) {
        i.g(str, "<set-?>");
        this.experiment = str;
    }

    public final void setKey(String str) {
        i.g(str, "<set-?>");
        this.key = str;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }
}
