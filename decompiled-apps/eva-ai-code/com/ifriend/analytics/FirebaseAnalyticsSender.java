package com.ifriend.analytics;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FirebaseAnalyticsSender.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J/\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/analytics/FirebaseAnalyticsSender;", "Lcom/ifriend/analytics/AnalyticsSender;", "()V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "internalSendEvent", "", NotificationCompat.CATEGORY_EVENT, "", FirebaseAnalytics.Param.CONTENT, "", "", "sendEvent", "sendEventWithResult", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserId", "id", "setUserProperty", "key", "value", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseAnalyticsSender implements AnalyticsSender {
    private final FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getAnalytics(Firebase.INSTANCE);

    @Override // com.ifriend.analytics.AnalyticsSender
    public void sendEvent(String event, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        internalSendEvent(event, map);
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public Object sendEventWithResult(String str, Map<String, ? extends Object> map, Continuation<? super Boolean> continuation) {
        internalSendEvent(str, map);
        return Boxing.boxBoolean(true);
    }

    private final void internalSendEvent(String str, Map<String, ? extends Object> map) {
        Log.d("Firebase event", str + ": " + map);
        this.firebaseAnalytics.logEvent(str, map != null ? AnalyticsSenderKt.toBundle(map) : null);
    }

    public final void setUserProperty(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Log.d("Firebase property", key + ": " + value);
        this.firebaseAnalytics.setUserProperty(key, value);
    }

    @Override // com.ifriend.analytics.AnalyticsSender
    public void setUserId(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Log.d("Firebase userId", id);
        this.firebaseAnalytics.setUserId(id);
    }
}
