package com.ifriend.analytics.di;

import android.content.Context;
import com.ifriend.analytics.AnalyticsSender;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory implements Factory<AnalyticsSender> {
    private final Provider<Context> contextProvider;
    private final AnalyticsModule module;

    public AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory(AnalyticsModule analyticsModule, Provider<Context> provider) {
        this.module = analyticsModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsSender get() {
        return provideAppsFlyerAnalyticsSender(this.module, this.contextProvider.get());
    }

    public static AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory create(AnalyticsModule analyticsModule, Provider<Context> provider) {
        return new AnalyticsModule_ProvideAppsFlyerAnalyticsSenderFactory(analyticsModule, provider);
    }

    public static AnalyticsSender provideAppsFlyerAnalyticsSender(AnalyticsModule analyticsModule, Context context) {
        return (AnalyticsSender) Preconditions.checkNotNullFromProvides(analyticsModule.provideAppsFlyerAnalyticsSender(context));
    }
}
