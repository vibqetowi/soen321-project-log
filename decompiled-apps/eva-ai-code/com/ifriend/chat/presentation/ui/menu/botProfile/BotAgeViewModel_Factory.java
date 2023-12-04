package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotAgeViewModel_Factory implements Factory<BotAgeViewModel> {
    private final Provider<AnalyticsEditBotUseCase> analyticsEditBotUseCaseProvider;
    private final Provider<ChangeBotAgeUseCase> changeBotAgeUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ValidateAgeUseCase> validateAgeUseCaseProvider;

    public BotAgeViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotAgeUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<ValidateAgeUseCase> provider4, Provider<RouterProvider> provider5) {
        this.getBotUseCaseProvider = provider;
        this.changeBotAgeUseCaseProvider = provider2;
        this.analyticsEditBotUseCaseProvider = provider3;
        this.validateAgeUseCaseProvider = provider4;
        this.routerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public BotAgeViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotAgeUseCaseProvider.get(), this.analyticsEditBotUseCaseProvider.get(), this.validateAgeUseCaseProvider.get(), this.routerProvider.get());
    }

    public static BotAgeViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotAgeUseCase> provider2, Provider<AnalyticsEditBotUseCase> provider3, Provider<ValidateAgeUseCase> provider4, Provider<RouterProvider> provider5) {
        return new BotAgeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BotAgeViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotAgeUseCase changeBotAgeUseCase, AnalyticsEditBotUseCase analyticsEditBotUseCase, ValidateAgeUseCase validateAgeUseCase, RouterProvider routerProvider) {
        return new BotAgeViewModel(getBotUseCase, changeBotAgeUseCase, analyticsEditBotUseCase, validateAgeUseCase, routerProvider);
    }
}
