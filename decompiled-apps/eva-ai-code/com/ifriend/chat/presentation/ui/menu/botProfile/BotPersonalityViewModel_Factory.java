package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotPersonalityViewModel_Factory implements Factory<BotPersonalityViewModel> {
    private final Provider<AnalyticsEditBotUseCase> analyticsEditBotUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChangeBotPersonalityUseCase> changeBotPersonalityUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public BotPersonalityViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotPersonalityUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<RouterProvider> provider4, Provider<AppEventsEmitter> provider5) {
        this.getBotUseCaseProvider = provider;
        this.changeBotPersonalityUseCaseProvider = provider2;
        this.analyticsEditBotUseCaseProvider = provider3;
        this.routerProvider = provider4;
        this.appEventsEmitterProvider = provider5;
    }

    @Override // javax.inject.Provider
    public BotPersonalityViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotPersonalityUseCaseProvider.get(), this.analyticsEditBotUseCaseProvider.get(), this.routerProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static BotPersonalityViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotPersonalityUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<RouterProvider> provider4, Provider<AppEventsEmitter> provider5) {
        return new BotPersonalityViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BotPersonalityViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotPersonalityUseCase changeBotPersonalityUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter) {
        return new BotPersonalityViewModel(getBotUseCase, changeBotPersonalityUseCase, analyticsEditBotUseCase, routerProvider, appEventsEmitter);
    }
}
