package com.ifriend.chat.new_chat.list.viewModel.factory;

import com.ifriend.chat.new_chat.list.delegate.OnAudioMessageClickDelegate;
import com.ifriend.chat.new_chat.list.delegate.PresentationChatSystemsDelegate;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToUiModelMapper;
import com.ifriend.chat.new_chat.list.viewModel.analytics.ChatListAnalytics;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatViewModelFactory_Factory implements Factory<ChatViewModelFactory> {
    private final Provider<OnAudioMessageClickDelegate> audioMessagesDelegateProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<FlowObserverEmitter<ChatEvents>> chatEventsEmitterProvider;
    private final Provider<ChatListAnalytics> chatListAnalyticsProvider;
    private final Provider<PresentationChatSystemsDelegate> chatSystemsDelegateProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<ChatEntityToUiModelMapper> mapperProvider;
    private final Provider<MessageRegenerationDelegateImpl> messageRegenerationDelegateProvider;

    public ChatViewModelFactory_Factory(Provider<OnAudioMessageClickDelegate> provider, Provider<PresentationChatSystemsDelegate> provider2, Provider<ChatEntityToUiModelMapper> provider3, Provider<ChatClientInteractor> provider4, Provider<GetBotUseCase> provider5, Provider<FlowObserverEmitter<ChatEvents>> provider6, Provider<ChatsInfoInteractor> provider7, Provider<FeatureToggleRepository> provider8, Provider<MessageRegenerationDelegateImpl> provider9, Provider<DispatcherProvider> provider10, Provider<GetUserUseCase> provider11, Provider<ChatListAnalytics> provider12) {
        this.audioMessagesDelegateProvider = provider;
        this.chatSystemsDelegateProvider = provider2;
        this.mapperProvider = provider3;
        this.chatClientInteractorProvider = provider4;
        this.getBotUseCaseProvider = provider5;
        this.chatEventsEmitterProvider = provider6;
        this.chatsInfoInteractorProvider = provider7;
        this.featureToggleRepositoryProvider = provider8;
        this.messageRegenerationDelegateProvider = provider9;
        this.dispatcherProvider = provider10;
        this.getUserUseCaseProvider = provider11;
        this.chatListAnalyticsProvider = provider12;
    }

    @Override // javax.inject.Provider
    public ChatViewModelFactory get() {
        return newInstance(this.audioMessagesDelegateProvider.get(), this.chatSystemsDelegateProvider.get(), this.mapperProvider.get(), this.chatClientInteractorProvider.get(), this.getBotUseCaseProvider.get(), this.chatEventsEmitterProvider.get(), this.chatsInfoInteractorProvider.get(), this.featureToggleRepositoryProvider.get(), this.messageRegenerationDelegateProvider.get(), this.dispatcherProvider.get(), this.getUserUseCaseProvider.get(), this.chatListAnalyticsProvider.get());
    }

    public static ChatViewModelFactory_Factory create(Provider<OnAudioMessageClickDelegate> provider, Provider<PresentationChatSystemsDelegate> provider2, Provider<ChatEntityToUiModelMapper> provider3, Provider<ChatClientInteractor> provider4, Provider<GetBotUseCase> provider5, Provider<FlowObserverEmitter<ChatEvents>> provider6, Provider<ChatsInfoInteractor> provider7, Provider<FeatureToggleRepository> provider8, Provider<MessageRegenerationDelegateImpl> provider9, Provider<DispatcherProvider> provider10, Provider<GetUserUseCase> provider11, Provider<ChatListAnalytics> provider12) {
        return new ChatViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static ChatViewModelFactory newInstance(OnAudioMessageClickDelegate onAudioMessageClickDelegate, PresentationChatSystemsDelegate presentationChatSystemsDelegate, ChatEntityToUiModelMapper chatEntityToUiModelMapper, ChatClientInteractor chatClientInteractor, GetBotUseCase getBotUseCase, FlowObserverEmitter<ChatEvents> flowObserverEmitter, ChatsInfoInteractor chatsInfoInteractor, FeatureToggleRepository featureToggleRepository, MessageRegenerationDelegateImpl messageRegenerationDelegateImpl, DispatcherProvider dispatcherProvider, GetUserUseCase getUserUseCase, ChatListAnalytics chatListAnalytics) {
        return new ChatViewModelFactory(onAudioMessageClickDelegate, presentationChatSystemsDelegate, chatEntityToUiModelMapper, chatClientInteractor, getBotUseCase, flowObserverEmitter, chatsInfoInteractor, featureToggleRepository, messageRegenerationDelegateImpl, dispatcherProvider, getUserUseCase, chatListAnalytics);
    }
}
