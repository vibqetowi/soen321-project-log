package com.ifriend.analytics;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticsEngine_Factory implements Factory<AnalyticsEngine> {
    private final Provider<AnalyticsSender[]> analyticsSendersProvider;

    public AnalyticsEngine_Factory(Provider<AnalyticsSender[]> provider) {
        this.analyticsSendersProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsEngine get() {
        return newInstance(this.analyticsSendersProvider.get());
    }

    public static AnalyticsEngine_Factory create(Provider<AnalyticsSender[]> provider) {
        return new AnalyticsEngine_Factory(provider);
    }

    public static AnalyticsEngine newInstance(AnalyticsSender... analyticsSenderArr) {
        return new AnalyticsEngine(analyticsSenderArr);
    }
}
