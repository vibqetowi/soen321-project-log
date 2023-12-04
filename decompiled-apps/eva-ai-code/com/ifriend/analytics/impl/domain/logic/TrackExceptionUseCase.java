package com.ifriend.analytics.impl.domain.logic;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import com.ifriend.analytics.impl.ext.ProcessedmessageKt;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TrackExceptionUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u001a\b\u0007\u0012\u0011\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eR\u0019\u0010\u0002\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/analytics/impl/domain/logic/TrackExceptionUseCase;", "", "analytics", "", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Set;)V", "trackException", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "throwable", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackExceptionUseCase {
    private final Set<AnalyticsRepository> analytics;

    @Inject
    public TrackExceptionUseCase(Set<AnalyticsRepository> analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
    }

    public final void trackException(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        trackException(message, throwable, MapsKt.emptyMap());
    }

    public final void trackException(String message, Throwable throwable, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(params, "params");
        for (AnalyticsRepository analyticsRepository : this.analytics) {
            analyticsRepository.trackException(new Throwable(ProcessedmessageKt.processedErrorMessage(message), throwable), params);
        }
    }
}
