package com.theinnerhour.b2b.components.analytics.otherAnalytics.model;

import android.os.Bundle;
import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AnalyticsAsyncModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/components/analytics/otherAnalytics/model/AnalyticsAsyncModel;", "", "event", "", "bundle", "Landroid/os/Bundle;", "onCustomAnalytics", "", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getOnCustomAnalytics", "()Z", "setOnCustomAnalytics", "(Z)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AnalyticsAsyncModel {
    private Bundle bundle;
    private String event;
    private boolean onCustomAnalytics;

    public AnalyticsAsyncModel(String event, Bundle bundle, boolean z10) {
        i.g(event, "event");
        this.event = event;
        this.bundle = bundle;
        this.onCustomAnalytics = z10;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getEvent() {
        return this.event;
    }

    public final boolean getOnCustomAnalytics() {
        return this.onCustomAnalytics;
    }

    public final void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public final void setEvent(String str) {
        i.g(str, "<set-?>");
        this.event = str;
    }

    public final void setOnCustomAnalytics(boolean z10) {
        this.onCustomAnalytics = z10;
    }
}
