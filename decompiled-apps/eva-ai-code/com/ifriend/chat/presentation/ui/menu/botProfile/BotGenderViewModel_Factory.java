package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotGenderViewModel_Factory implements Factory<BotGenderViewModel> {
    private final Provider<AnalyticsEditBotUseCase> analyticsEditBotUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChangeBotGenderUseCase> changeBotGenderUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<RouterProvider> routerProvider;

    public BotGenderViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotGenderUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<InternalNotificationHandler> provider4, Provider<RouterProvider> provider5, Provider<AppEventsEmitter> provider6, Provider<BotRepository> provider7) {
        this.getBotUseCaseProvider = provider;
        this.changeBotGenderUseCaseProvider = provider2;
        this.analyticsEditBotUseCaseProvider = provider3;
        this.internalNotificationHandlerProvider = provider4;
        this.routerProvider = provider5;
        this.appEventsEmitterProvider = provider6;
        this.botRepositoryProvider = provider7;
    }

    @Override // javax.inject.Provider
    public BotGenderViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotGenderUseCaseProvider.get(), this.analyticsEditBotUseCaseProvider.get(), this.internalNotificationHandlerProvider.get(), this.routerProvider.get(), this.appEventsEmitterProvider.get(), this.botRepositoryProvider.get());
    }

    public static BotGenderViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotGenderUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<InternalNotificationHandler> provider4, Provider<RouterProvider> provider5, Provider<AppEventsEmitter> provider6, Provider<BotRepository> provider7) {
        return new BotGenderViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static BotGenderViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotGenderUseCase changeBotGenderUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, InternalNotificationHandler internalNotificationHandler, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter, BotRepository botRepository) {
        return new BotGenderViewModel(getBotUseCase, changeBotGenderUseCase, analyticsEditBotUseCase, internalNotificationHandler, routerProvider, appEventsEmitter, botRepository);
    }
}
