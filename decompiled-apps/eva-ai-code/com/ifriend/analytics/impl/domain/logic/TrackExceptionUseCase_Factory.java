package com.ifriend.analytics.impl.domain.logic;

import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class TrackExceptionUseCase_Factory implements Factory<TrackExceptionUseCase> {
    private final Provider<Set<AnalyticsRepository>> analyticsProvider;

    public TrackExceptionUseCase_Factory(Provider<Set<AnalyticsRepository>> provider) {
        this.analyticsProvider = provider;
    }

    @Override // javax.inject.Provider
    public TrackExceptionUseCase get() {
        return newInstance(this.analyticsProvider.get());
    }

    public static TrackExceptionUseCase_Factory create(Provider<Set<AnalyticsRepository>> provider) {
        return new TrackExceptionUseCase_Factory(provider);
    }

    public static TrackExceptionUseCase newInstance(Set<AnalyticsRepository> set) {
        return new TrackExceptionUseCase(set);
    }
}
