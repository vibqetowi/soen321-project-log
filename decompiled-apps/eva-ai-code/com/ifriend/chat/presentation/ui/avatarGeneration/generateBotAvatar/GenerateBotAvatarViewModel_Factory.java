package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GenerateBotAvatarViewModel_Factory implements Factory<GenerateBotAvatarViewModel> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<NeuronsCostsStorage> neuronsCostsStorageProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<RouterProvider> routerProvider;

    public GenerateBotAvatarViewModel_Factory(Provider<GenerateBotAvatarRepository> provider, Provider<BotRepository> provider2, Provider<AppConfigUseCase> provider3, Provider<NeuronsCostsStorage> provider4, Provider<GenerateBotAvatarScreenFactory> provider5, Provider<RouterProvider> provider6, Provider<Logger> provider7, Provider<AppEventsEmitter> provider8, Provider<PaymentResultFlow> provider9, Provider<CoroutineDispatchers> provider10) {
        this.generateBotAvatarRepositoryProvider = provider;
        this.botRepositoryProvider = provider2;
        this.appConfigUseCaseProvider = provider3;
        this.neuronsCostsStorageProvider = provider4;
        this.generateBotAvatarScreenFactoryProvider = provider5;
        this.routerProvider = provider6;
        this.loggerProvider = provider7;
        this.appEventsEmitterProvider = provider8;
        this.paymentResultFlowProvider = provider9;
        this.dispatchersProvider = provider10;
    }

    @Override // javax.inject.Provider
    public GenerateBotAvatarViewModel get() {
        return newInstance(this.generateBotAvatarRepositoryProvider.get(), this.botRepositoryProvider.get(), this.appConfigUseCaseProvider.get(), this.neuronsCostsStorageProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.routerProvider.get(), this.loggerProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.dispatchersProvider.get());
    }

    public static GenerateBotAvatarViewModel_Factory create(Provider<GenerateBotAvatarRepository> provider, Provider<BotRepository> provider2, Provider<AppConfigUseCase> provider3, Provider<NeuronsCostsStorage> provider4, Provider<GenerateBotAvatarScreenFactory> provider5, Provider<RouterProvider> provider6, Provider<Logger> provider7, Provider<AppEventsEmitter> provider8, Provider<PaymentResultFlow> provider9, Provider<CoroutineDispatchers> provider10) {
        return new GenerateBotAvatarViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static GenerateBotAvatarViewModel newInstance(GenerateBotAvatarRepository generateBotAvatarRepository, BotRepository botRepository, AppConfigUseCase appConfigUseCase, NeuronsCostsStorage neuronsCostsStorage, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, RouterProvider routerProvider, Logger logger, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, CoroutineDispatchers coroutineDispatchers) {
        return new GenerateBotAvatarViewModel(generateBotAvatarRepository, botRepository, appConfigUseCase, neuronsCostsStorage, generateBotAvatarScreenFactory, routerProvider, logger, appEventsEmitter, paymentResultFlow, coroutineDispatchers);
    }
}
