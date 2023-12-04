package com.ifriend.analytics.impl.domain.logic;

import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.analytics.api.events.AnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\"\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J2\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000fH\u0016R\u0019\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/analytics/impl/domain/logic/AnalyticsInteractorImpl;", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "trackExceptionUseCase", "Lcom/ifriend/analytics/impl/domain/logic/TrackExceptionUseCase;", "analyticRepositories", "", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/ifriend/analytics/impl/domain/logic/TrackExceptionUseCase;Ljava/util/Set;)V", "setUserId", "", "userId", "", "setUserProperty", NativeProtocol.WEB_DIALOG_PARAMS, "", "trackEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/analytics/api/events/AnalyticsEvent;", "eventName", "providers", "", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "trackException", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "throwable", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsInteractorImpl implements AnalyticsInteractor {
    private final Set<AnalyticsRepository> analyticRepositories;
    private final TrackExceptionUseCase trackExceptionUseCase;

    @Inject
    public AnalyticsInteractorImpl(TrackExceptionUseCase trackExceptionUseCase, Set<AnalyticsRepository> analyticRepositories) {
        Intrinsics.checkNotNullParameter(trackExceptionUseCase, "trackExceptionUseCase");
        Intrinsics.checkNotNullParameter(analyticRepositories, "analyticRepositories");
        this.trackExceptionUseCase = trackExceptionUseCase;
        this.analyticRepositories = analyticRepositories;
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        for (AnalyticsRepository analyticsRepository : this.analyticRepositories) {
            analyticsRepository.setUserId(userId);
        }
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void setUserProperty(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        for (AnalyticsRepository analyticsRepository : this.analyticRepositories) {
            analyticsRepository.setUserProperty(params);
        }
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void trackEvent(AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        trackEvent(event.getEventName(), event.getParams(), event.getProviders());
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void trackEvent(String eventName, Map<String, String> params, List<? extends AnalyticsProvider> providers) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(providers, "providers");
        for (AnalyticsProvider analyticsProvider : providers) {
            for (AnalyticsRepository analyticsRepository : this.analyticRepositories) {
                if (analyticsRepository.isSupportProvider(analyticsProvider)) {
                    analyticsRepository.trackEvent(eventName, params);
                }
            }
        }
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void trackException(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.trackExceptionUseCase.trackException(message, throwable);
    }

    @Override // com.ifriend.analytics.api.logic.AnalyticsInteractor
    public void trackException(String message, Throwable throwable, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(params, "params");
        this.trackExceptionUseCase.trackException(message, throwable, params);
    }
}
