package com.ifriend.analytics;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: AnalyticsSender.kt */
@Deprecated(message = "user AnalyticsInteractor")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H&J1\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/analytics/AnalyticsSender;", "", "sendEvent", "", NotificationCompat.CATEGORY_EVENT, "", FirebaseAnalytics.Param.CONTENT, "", "sendEventWithResult", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserId", "userId", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsSender {
    void sendEvent(String str, Map<String, ? extends Object> map);

    Object sendEventWithResult(String str, Map<String, ? extends Object> map, Continuation<? super Boolean> continuation);

    void setUserId(String str);

    /* compiled from: AnalyticsSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(AnalyticsSender analyticsSender, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            analyticsSender.sendEvent(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object sendEventWithResult$default(AnalyticsSender analyticsSender, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = null;
                }
                return analyticsSender.sendEventWithResult(str, map, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEventWithResult");
        }
    }
}
