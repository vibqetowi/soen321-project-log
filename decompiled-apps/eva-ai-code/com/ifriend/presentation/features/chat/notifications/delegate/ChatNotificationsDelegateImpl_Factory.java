package com.ifriend.presentation.features.chat.notifications.delegate;

import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationsUiMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatNotificationsDelegateImpl_Factory implements Factory<ChatNotificationsDelegateImpl> {
    private final Provider<ChatScreenAnalyticsUseCase> chatScreenAnalyticsUseCaseProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<GeneratedChatAvatarInteractor> generatedChatAvatarInteractorProvider;
    private final Provider<ChatNotificationsUiMapper> mapperProvider;
    private final Provider<ChatNotificationsRepository> repoProvider;

    public ChatNotificationsDelegateImpl_Factory(Provider<ChatNotificationsRepository> provider, Provider<ChatNotificationsUiMapper> provider2, Provider<ChatScreenAnalyticsUseCase> provider3, Provider<DispatcherProvider> provider4, Provider<GeneratedChatAvatarInteractor> provider5) {
        this.repoProvider = provider;
        this.mapperProvider = provider2;
        this.chatScreenAnalyticsUseCaseProvider = provider3;
        this.dispatcherProvider = provider4;
        this.generatedChatAvatarInteractorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatNotificationsDelegateImpl get() {
        return newInstance(this.repoProvider.get(), this.mapperProvider.get(), this.chatScreenAnalyticsUseCaseProvider.get(), this.dispatcherProvider.get(), this.generatedChatAvatarInteractorProvider.get());
    }

    public static ChatNotificationsDelegateImpl_Factory create(Provider<ChatNotificationsRepository> provider, Provider<ChatNotificationsUiMapper> provider2, Provider<ChatScreenAnalyticsUseCase> provider3, Provider<DispatcherProvider> provider4, Provider<GeneratedChatAvatarInteractor> provider5) {
        return new ChatNotificationsDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatNotificationsDelegateImpl newInstance(ChatNotificationsRepository chatNotificationsRepository, ChatNotificationsUiMapper chatNotificationsUiMapper, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase, DispatcherProvider dispatcherProvider, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        return new ChatNotificationsDelegateImpl(chatNotificationsRepository, chatNotificationsUiMapper, chatScreenAnalyticsUseCase, dispatcherProvider, generatedChatAvatarInteractor);
    }
}
