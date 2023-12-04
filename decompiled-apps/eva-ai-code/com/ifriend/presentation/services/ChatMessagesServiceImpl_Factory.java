package com.ifriend.presentation.services;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.notifications.ChatNotificationsRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatMessagesServiceImpl_Factory implements Factory<ChatMessagesServiceImpl> {
    private final Provider<ActivateNewChatUseCase> activateNewChatUseCaseProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<ChatNotificationsRepository> notificationsRepoProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatMessagesServiceImpl_Factory(Provider<MessagesSource> provider, Provider<UserRepository> provider2, Provider<UserProfileRepository> provider3, Provider<DispatcherProvider> provider4, Provider<CoroutineScope> provider5, Provider<ChatClientInteractor> provider6, Provider<ChatNotificationsRepository> provider7, Provider<ActivateNewChatUseCase> provider8, Provider<ChatsInfoInteractor> provider9, Provider<ChatEventsInteractor> provider10) {
        this.messagesSourceProvider = provider;
        this.userRepositoryProvider = provider2;
        this.userProfileRepositoryProvider = provider3;
        this.dispatcherProvider = provider4;
        this.coroutineScopeProvider = provider5;
        this.chatClientInteractorProvider = provider6;
        this.notificationsRepoProvider = provider7;
        this.activateNewChatUseCaseProvider = provider8;
        this.chatsInfoInteractorProvider = provider9;
        this.chatEventsInteractorProvider = provider10;
    }

    @Override // javax.inject.Provider
    public ChatMessagesServiceImpl get() {
        return newInstance(this.messagesSourceProvider.get(), this.userRepositoryProvider.get(), this.userProfileRepositoryProvider.get(), this.dispatcherProvider.get(), this.coroutineScopeProvider.get(), this.chatClientInteractorProvider.get(), this.notificationsRepoProvider.get(), this.activateNewChatUseCaseProvider.get(), this.chatsInfoInteractorProvider.get(), this.chatEventsInteractorProvider.get());
    }

    public static ChatMessagesServiceImpl_Factory create(Provider<MessagesSource> provider, Provider<UserRepository> provider2, Provider<UserProfileRepository> provider3, Provider<DispatcherProvider> provider4, Provider<CoroutineScope> provider5, Provider<ChatClientInteractor> provider6, Provider<ChatNotificationsRepository> provider7, Provider<ActivateNewChatUseCase> provider8, Provider<ChatsInfoInteractor> provider9, Provider<ChatEventsInteractor> provider10) {
        return new ChatMessagesServiceImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static ChatMessagesServiceImpl newInstance(MessagesSource messagesSource, UserRepository userRepository, UserProfileRepository userProfileRepository, DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, ChatClientInteractor chatClientInteractor, ChatNotificationsRepository chatNotificationsRepository, ActivateNewChatUseCase activateNewChatUseCase, ChatsInfoInteractor chatsInfoInteractor, ChatEventsInteractor chatEventsInteractor) {
        return new ChatMessagesServiceImpl(messagesSource, userRepository, userProfileRepository, dispatcherProvider, coroutineScope, chatClientInteractor, chatNotificationsRepository, activateNewChatUseCase, chatsInfoInteractor, chatEventsInteractor);
    }
}
