package com.ifriend.analytics.impl.domain.repository;

import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsRepository.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH&J$\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH&J$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "", "isSupportProvider", "", "provider", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "setUserId", "", "userId", "", "setUserProperty", NativeProtocol.WEB_DIALOG_PARAMS, "", "trackEvent", "keyEvent", "trackException", "throwable", "", "values", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnalyticsRepository {

    /* compiled from: AnalyticsRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void trackException(AnalyticsRepository analyticsRepository, Throwable throwable, Map<String, String> values) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(values, "values");
        }
    }

    boolean isSupportProvider(AnalyticsProvider analyticsProvider);

    void setUserId(String str);

    void setUserProperty(Map<String, String> map);

    void trackEvent(String str, Map<String, String> map);

    void trackException(Throwable th, Map<String, String> map);
}
