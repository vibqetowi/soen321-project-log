package com.ifriend.analytics;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppsFlyerAnalyticsSender.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J&\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J/\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/analytics/AppsFlyerAnalyticsSender;", "Lcom/ifriend/analytics/AnalyticsSender;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "internalSendEvent", "", NotificationCompat.CATEGORY_EVENT, "", FirebaseAnalytics.Param.CONTENT, "", "", "sendEvent", "sendEventWithResult", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserId", "userId", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerAnalyticsSender implements AnalyticsSender {
    private final Context context;

    public AppsFlyerAnalyticsSender(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public void sendEvent(String event, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("AppsFlyer event", event + ": " + map);
        internalSendEvent(event, map);
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public Object sendEventWithResult(String str, Map<String, ? extends Object> map, Continuation<? super Boolean> continuation) {
        internalSendEvent(str, map);
        return Boxing.boxBoolean(true);
    }

    private final void internalSendEvent(String str, Map<String, ? extends Object> map) {
        Log.d("AppsFlyer event", str + ": " + map);
        AppsFlyerLib.getInstance().logEvent(this.context.getApplicationContext(), str, map);
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        AppsFlyerLib.getInstance().setCustomerUserId(userId);
    }
}
