package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotNameViewModel_Factory implements Factory<BotNameViewModel> {
    private final Provider<ChangeBotNameUseCase> changeBotNameUseCaseProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ValidateNameUseCase> validateNameUseCaseProvider;

    public BotNameViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ChangeBotNameUseCase> provider2, Provider<ValidateNameUseCase> provider3, Provider<RouterProvider> provider4) {
        this.getBotUseCaseProvider = provider;
        this.changeBotNameUseCaseProvider = provider2;
        this.validateNameUseCaseProvider = provider3;
        this.routerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public BotNameViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.changeBotNameUseCaseProvider.get(), this.validateNameUseCaseProvider.get(), this.routerProvider.get());
    }

    public static BotNameViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ChangeBotNameUseCase> provider2, Provider<ValidateNameUseCase> provider3, Provider<RouterProvider> provider4) {
        return new BotNameViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static BotNameViewModel newInstance(GetBotUseCase getBotUseCase, ChangeBotNameUseCase changeBotNameUseCase, ValidateNameUseCase validateNameUseCase, RouterProvider routerProvider) {
        return new BotNameViewModel(getBotUseCase, changeBotNameUseCase, validateNameUseCase, routerProvider);
    }
}
