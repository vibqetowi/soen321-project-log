package com.ifriend.presentation.features.update.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InAppUpdateAnalytics_Factory implements Factory<InAppUpdateAnalytics> {
    private final Provider<AnalyticsInteractor> interactorProvider;

    public InAppUpdateAnalytics_Factory(Provider<AnalyticsInteractor> provider) {
        this.interactorProvider = provider;
    }

    @Override // javax.inject.Provider
    public InAppUpdateAnalytics get() {
        return newInstance(this.interactorProvider.get());
    }

    public static InAppUpdateAnalytics_Factory create(Provider<AnalyticsInteractor> provider) {
        return new InAppUpdateAnalytics_Factory(provider);
    }

    public static InAppUpdateAnalytics newInstance(AnalyticsInteractor analyticsInteractor) {
        return new InAppUpdateAnalytics(analyticsInteractor);
    }
}
