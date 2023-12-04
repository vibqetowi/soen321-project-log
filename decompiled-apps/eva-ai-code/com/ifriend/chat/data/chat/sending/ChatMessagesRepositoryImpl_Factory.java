package com.ifriend.chat.data.chat.sending;

import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl_Factory implements Factory<ChatMessagesRepositoryImpl> {
    private final Provider<AuthDataProvider> authProvider;
    private final Provider<ChatMessageMapper> chatMessageMapperProvider;
    private final Provider<ChatMessagesRemoteDataSource> chatMessagesRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<GlobalSendingMessageResultPublisher> errorPublisherProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<SendingMessagesQueue> queueProvider;
    private final Provider<CoroutineScope> scopeProvider;

    public ChatMessagesRepositoryImpl_Factory(Provider<ChatMessagesRemoteDataSource> provider, Provider<Logger> provider2, Provider<AuthDataProvider> provider3, Provider<ChatMessageMapper> provider4, Provider<SendingMessagesQueue> provider5, Provider<GlobalSendingMessageResultPublisher> provider6, Provider<MessagesSource> provider7, Provider<CoroutineScope> provider8, Provider<DispatcherProvider> provider9, Provider<CoreExecuteCatching> provider10) {
        this.chatMessagesRemoteDataSourceProvider = provider;
        this.loggerProvider = provider2;
        this.authProvider = provider3;
        this.chatMessageMapperProvider = provider4;
        this.queueProvider = provider5;
        this.errorPublisherProvider = provider6;
        this.messagesSourceProvider = provider7;
        this.scopeProvider = provider8;
        this.dispatcherProvider = provider9;
        this.coreExecuteCatchingProvider = provider10;
    }

    @Override // javax.inject.Provider
    public ChatMessagesRepositoryImpl get() {
        return newInstance(this.chatMessagesRemoteDataSourceProvider.get(), this.loggerProvider.get(), this.authProvider.get(), this.chatMessageMapperProvider.get(), this.queueProvider.get(), this.errorPublisherProvider.get(), this.messagesSourceProvider.get(), this.scopeProvider.get(), this.dispatcherProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static ChatMessagesRepositoryImpl_Factory create(Provider<ChatMessagesRemoteDataSource> provider, Provider<Logger> provider2, Provider<AuthDataProvider> provider3, Provider<ChatMessageMapper> provider4, Provider<SendingMessagesQueue> provider5, Provider<GlobalSendingMessageResultPublisher> provider6, Provider<MessagesSource> provider7, Provider<CoroutineScope> provider8, Provider<DispatcherProvider> provider9, Provider<CoreExecuteCatching> provider10) {
        return new ChatMessagesRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static ChatMessagesRepositoryImpl newInstance(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, Logger logger, AuthDataProvider authDataProvider, ChatMessageMapper chatMessageMapper, SendingMessagesQueue sendingMessagesQueue, GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher, MessagesSource messagesSource, CoroutineScope coroutineScope, DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching) {
        return new ChatMessagesRepositoryImpl(chatMessagesRemoteDataSource, logger, authDataProvider, chatMessageMapper, sendingMessagesQueue, globalSendingMessageResultPublisher, messagesSource, coroutineScope, dispatcherProvider, coreExecuteCatching);
    }
}
