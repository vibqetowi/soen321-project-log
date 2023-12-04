package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory implements Factory<ChatScreenAnalyticsUseCase> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final AnalyticUseCasesModule module;
    private final Provider<AnalyticsSender> trackerProvider;

    public AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2) {
        this.module = analyticUseCasesModule;
        this.appIdentityConverterProvider = provider;
        this.trackerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatScreenAnalyticsUseCase get() {
        return provideChatScreenAnalyticsUseCase(this.module, this.appIdentityConverterProvider.get(), this.trackerProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2) {
        return new AnalyticUseCasesModule_ProvideChatScreenAnalyticsUseCaseFactory(analyticUseCasesModule, provider, provider2);
    }

    public static ChatScreenAnalyticsUseCase provideChatScreenAnalyticsUseCase(AnalyticUseCasesModule analyticUseCasesModule, AppIdentityConverter appIdentityConverter, AnalyticsSender analyticsSender) {
        return (ChatScreenAnalyticsUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideChatScreenAnalyticsUseCase(appIdentityConverter, analyticsSender));
    }
}
