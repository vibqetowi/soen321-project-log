package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import com.ifriend.chat.domain.chat.reset.ResetAiUseCase;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ResetViewModel_Factory implements Factory<ResetViewModel> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<ResetAiUseCase> resetAiUseCaseProvider;

    public ResetViewModel_Factory(Provider<GetBotUseCase> provider, Provider<ResetAiUseCase> provider2, Provider<Logger> provider3, Provider<AppEventsEmitter> provider4, Provider<CoroutineDispatchers> provider5) {
        this.getBotUseCaseProvider = provider;
        this.resetAiUseCaseProvider = provider2;
        this.loggerProvider = provider3;
        this.appEventsEmitterProvider = provider4;
        this.dispatchersProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ResetViewModel get() {
        return newInstance(this.getBotUseCaseProvider.get(), this.resetAiUseCaseProvider.get(), this.loggerProvider.get(), this.appEventsEmitterProvider.get(), this.dispatchersProvider.get());
    }

    public static ResetViewModel_Factory create(Provider<GetBotUseCase> provider, Provider<ResetAiUseCase> provider2, Provider<Logger> provider3, Provider<AppEventsEmitter> provider4, Provider<CoroutineDispatchers> provider5) {
        return new ResetViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ResetViewModel newInstance(GetBotUseCase getBotUseCase, ResetAiUseCase resetAiUseCase, Logger logger, AppEventsEmitter appEventsEmitter, CoroutineDispatchers coroutineDispatchers) {
        return new ResetViewModel(getBotUseCase, resetAiUseCase, logger, appEventsEmitter, coroutineDispatchers);
    }
}
