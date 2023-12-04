package com.ifriend.chat.new_chat.list.delegate;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnAudioMessageClickDelegate_Factory implements Factory<OnAudioMessageClickDelegate> {
    private final Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> audioClickConvertToTextMessageProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ChangeVoiceScreenFactory> screenFactoryProvider;

    public OnAudioMessageClickDelegate_Factory(Provider<CoroutineDispatchers> provider, Provider<ChangeVoiceScreenFactory> provider2, Provider<RouterProvider> provider3, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider4, Provider<ChatClientInteractor> provider5) {
        this.dispatchersProvider = provider;
        this.screenFactoryProvider = provider2;
        this.routerProvider = provider3;
        this.audioClickConvertToTextMessageProvider = provider4;
        this.chatClientInteractorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public OnAudioMessageClickDelegate get() {
        return newInstance(this.dispatchersProvider.get(), this.screenFactoryProvider.get(), this.routerProvider.get(), this.audioClickConvertToTextMessageProvider.get(), this.chatClientInteractorProvider.get());
    }

    public static OnAudioMessageClickDelegate_Factory create(Provider<CoroutineDispatchers> provider, Provider<ChangeVoiceScreenFactory> provider2, Provider<RouterProvider> provider3, Provider<AnalyticsAudioAiClickConvertToTextMessageUseCase> provider4, Provider<ChatClientInteractor> provider5) {
        return new OnAudioMessageClickDelegate_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnAudioMessageClickDelegate newInstance(CoroutineDispatchers coroutineDispatchers, ChangeVoiceScreenFactory changeVoiceScreenFactory, RouterProvider routerProvider, AnalyticsAudioAiClickConvertToTextMessageUseCase analyticsAudioAiClickConvertToTextMessageUseCase, ChatClientInteractor chatClientInteractor) {
        return new OnAudioMessageClickDelegate(coroutineDispatchers, changeVoiceScreenFactory, routerProvider, analyticsAudioAiClickConvertToTextMessageUseCase, chatClientInteractor);
    }
}
