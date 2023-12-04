package com.ifriend.analytics.impl.domain.logic;

import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticsInteractorImpl_Factory implements Factory<AnalyticsInteractorImpl> {
    private final Provider<Set<AnalyticsRepository>> analyticRepositoriesProvider;
    private final Provider<TrackExceptionUseCase> trackExceptionUseCaseProvider;

    public AnalyticsInteractorImpl_Factory(Provider<TrackExceptionUseCase> provider, Provider<Set<AnalyticsRepository>> provider2) {
        this.trackExceptionUseCaseProvider = provider;
        this.analyticRepositoriesProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnalyticsInteractorImpl get() {
        return newInstance(this.trackExceptionUseCaseProvider.get(), this.analyticRepositoriesProvider.get());
    }

    public static AnalyticsInteractorImpl_Factory create(Provider<TrackExceptionUseCase> provider, Provider<Set<AnalyticsRepository>> provider2) {
        return new AnalyticsInteractorImpl_Factory(provider, provider2);
    }

    public static AnalyticsInteractorImpl newInstance(TrackExceptionUseCase trackExceptionUseCase, Set<AnalyticsRepository> set) {
        return new AnalyticsInteractorImpl(trackExceptionUseCase, set);
    }
}
