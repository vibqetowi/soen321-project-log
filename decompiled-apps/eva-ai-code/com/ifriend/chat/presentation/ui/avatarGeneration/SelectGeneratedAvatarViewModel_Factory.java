package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.analytics.usecase.avatarAi.AnalyticsAvatarAiApplyUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarViewModel_Factory implements Factory<SelectGeneratedAvatarViewModel> {
    private final Provider<AnalyticsAvatarAiApplyUseCase> analyticsAvatarAiApplyUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GenerateBotAvatarRepository> generateBotAvatarRepositoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<LongTermNotificationManager> longTermNotificationManagerProvider;
    private final Provider<NeuronsCostsStorage> neuronsCostsStorageProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<RouterProvider> routerProvider;

    public SelectGeneratedAvatarViewModel_Factory(Provider<GenerateBotAvatarRepository> provider, Provider<NeuronsCostsStorage> provider2, Provider<CoroutineScope> provider3, Provider<RouterProvider> provider4, Provider<Logger> provider5, Provider<GenerateBotAvatarScreenFactory> provider6, Provider<AnalyticsAvatarAiApplyUseCase> provider7, Provider<LongTermNotificationManager> provider8, Provider<AppEventsEmitter> provider9, Provider<PaymentResultFlow> provider10, Provider<CoroutineDispatchers> provider11) {
        this.generateBotAvatarRepositoryProvider = provider;
        this.neuronsCostsStorageProvider = provider2;
        this.coroutineScopeProvider = provider3;
        this.routerProvider = provider4;
        this.loggerProvider = provider5;
        this.generateBotAvatarScreenFactoryProvider = provider6;
        this.analyticsAvatarAiApplyUseCaseProvider = provider7;
        this.longTermNotificationManagerProvider = provider8;
        this.appEventsEmitterProvider = provider9;
        this.paymentResultFlowProvider = provider10;
        this.dispatchersProvider = provider11;
    }

    @Override // javax.inject.Provider
    public SelectGeneratedAvatarViewModel get() {
        return newInstance(this.generateBotAvatarRepositoryProvider.get(), this.neuronsCostsStorageProvider.get(), this.coroutineScopeProvider.get(), this.routerProvider.get(), this.loggerProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.analyticsAvatarAiApplyUseCaseProvider.get(), this.longTermNotificationManagerProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.dispatchersProvider.get());
    }

    public static SelectGeneratedAvatarViewModel_Factory create(Provider<GenerateBotAvatarRepository> provider, Provider<NeuronsCostsStorage> provider2, Provider<CoroutineScope> provider3, Provider<RouterProvider> provider4, Provider<Logger> provider5, Provider<GenerateBotAvatarScreenFactory> provider6, Provider<AnalyticsAvatarAiApplyUseCase> provider7, Provider<LongTermNotificationManager> provider8, Provider<AppEventsEmitter> provider9, Provider<PaymentResultFlow> provider10, Provider<CoroutineDispatchers> provider11) {
        return new SelectGeneratedAvatarViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static SelectGeneratedAvatarViewModel newInstance(GenerateBotAvatarRepository generateBotAvatarRepository, NeuronsCostsStorage neuronsCostsStorage, CoroutineScope coroutineScope, RouterProvider routerProvider, Logger logger, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, AnalyticsAvatarAiApplyUseCase analyticsAvatarAiApplyUseCase, LongTermNotificationManager longTermNotificationManager, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, CoroutineDispatchers coroutineDispatchers) {
        return new SelectGeneratedAvatarViewModel(generateBotAvatarRepository, neuronsCostsStorage, coroutineScope, routerProvider, logger, generateBotAvatarScreenFactory, analyticsAvatarAiApplyUseCase, longTermNotificationManager, appEventsEmitter, paymentResultFlow, coroutineDispatchers);
    }
}
