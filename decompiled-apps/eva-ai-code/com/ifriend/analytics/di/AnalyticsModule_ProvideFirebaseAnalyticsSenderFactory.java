package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory implements Factory<AnalyticsSender> {
    private final AnalyticsModule module;

    public AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory(AnalyticsModule analyticsModule) {
        this.module = analyticsModule;
    }

    @Override // javax.inject.Provider
    public AnalyticsSender get() {
        return provideFirebaseAnalyticsSender(this.module);
    }

    public static AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory create(AnalyticsModule analyticsModule) {
        return new AnalyticsModule_ProvideFirebaseAnalyticsSenderFactory(analyticsModule);
    }

    public static AnalyticsSender provideFirebaseAnalyticsSender(AnalyticsModule analyticsModule) {
        return (AnalyticsSender) Preconditions.checkNotNullFromProvides(analyticsModule.provideFirebaseAnalyticsSender());
    }
}
