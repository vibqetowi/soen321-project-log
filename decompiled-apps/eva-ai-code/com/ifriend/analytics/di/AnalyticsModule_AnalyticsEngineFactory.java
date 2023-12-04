package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticsModule_AnalyticsEngineFactory implements Factory<AnalyticsEngine> {
    private final Provider<AnalyticsSender> annalsTrackerProvider;
    private final Provider<AnalyticsSender> appsFlyerProvider;
    private final Provider<AnalyticsSender> firebaseProvider;
    private final AnalyticsModule module;
    private final Provider<AnalyticsSender> pushNotificationOpenedAnalyticsSenderProvider;

    public AnalyticsModule_AnalyticsEngineFactory(AnalyticsModule analyticsModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3, Provider<AnalyticsSender> provider4) {
        this.module = analyticsModule;
        this.firebaseProvider = provider;
        this.appsFlyerProvider = provider2;
        this.annalsTrackerProvider = provider3;
        this.pushNotificationOpenedAnalyticsSenderProvider = provider4;
    }

    @Override // javax.inject.Provider
    public AnalyticsEngine get() {
        return analyticsEngine(this.module, this.firebaseProvider.get(), this.appsFlyerProvider.get(), this.annalsTrackerProvider.get(), this.pushNotificationOpenedAnalyticsSenderProvider.get());
    }

    public static AnalyticsModule_AnalyticsEngineFactory create(AnalyticsModule analyticsModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3, Provider<AnalyticsSender> provider4) {
        return new AnalyticsModule_AnalyticsEngineFactory(analyticsModule, provider, provider2, provider3, provider4);
    }

    public static AnalyticsEngine analyticsEngine(AnalyticsModule analyticsModule, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2, AnalyticsSender analyticsSender3, AnalyticsSender analyticsSender4) {
        return (AnalyticsEngine) Preconditions.checkNotNullFromProvides(analyticsModule.analyticsEngine(analyticsSender, analyticsSender2, analyticsSender3, analyticsSender4));
    }
}
