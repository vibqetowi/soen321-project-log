package com.ifriend.analytics.api.logic;

import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.analytics.api.events.AnalyticsEvent;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J6\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J.\u0010\u0010\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\u0014"}, d2 = {"Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "", "setUserId", "", "userId", "", "setUserProperty", NativeProtocol.WEB_DIALOG_PARAMS, "", "trackEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/analytics/api/events/AnalyticsEvent;", "eventName", "providers", "", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "trackException", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "throwable", "", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsInteractor {
    void setUserId(String str);

    void setUserProperty(Map<String, String> map);

    void trackEvent(AnalyticsEvent analyticsEvent);

    void trackEvent(String str, Map<String, String> map, List<? extends AnalyticsProvider> list);

    void trackException(String str, Throwable th);

    void trackException(String str, Throwable th, Map<String, String> map);

    /* compiled from: AnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void trackEvent$default(AnalyticsInteractor analyticsInteractor, String str, Map map, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEvent");
            }
            if ((i & 4) != 0) {
                list = AnalyticsProvider.getEntries();
            }
            analyticsInteractor.trackEvent(str, map, list);
        }
    }
}
