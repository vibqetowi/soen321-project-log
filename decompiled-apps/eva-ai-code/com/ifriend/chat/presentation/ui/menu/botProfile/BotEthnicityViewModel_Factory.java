package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.bot.ChangeBotEthnicityUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotEthnicityViewModel_Factory implements Factory<BotEthnicityViewModel> {
    private final Provider<AnalyticsEditBotUseCase> analyticsEditBotUseCaseProvider;
    private final Provider<ChangeBotEthnicityUseCase> changeBotEthnicityUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public BotEthnicityViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotEthnicityUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<RouterProvider> provider4) {
        this.getBotUseCaseProvider = provider;
        this.changeBotEthnicityUseCaseProvider = provider2;
        this.analyticsEditBotUseCaseProvider = provider3;
        this.routerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public BotEthnicityViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotEthnicityUseCaseProvider.get(), this.analyticsEditBotUseCaseProvider.get(), this.routerProvider.get());
    }

    public static BotEthnicityViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotEthnicityUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<RouterProvider> provider4) {
        return new BotEthnicityViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static BotEthnicityViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotEthnicityUseCase changeBotEthnicityUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, RouterProvider routerProvider) {
        return new BotEthnicityViewModel(getBotUseCase, changeBotEthnicityUseCase, analyticsEditBotUseCase, routerProvider);
    }
}
