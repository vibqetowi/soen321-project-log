package com.ifriend.chat.presentation.di.chat;

import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory implements Factory<QueuedMessageToEntityMapper> {
    private final Provider<AuthDataProvider> authDataProvider;

    public SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory(Provider<AuthDataProvider> provider) {
        this.authDataProvider = provider;
    }

    @Override // javax.inject.Provider
    public QueuedMessageToEntityMapper get() {
        return provideQueuedMessageToEntityMapper(this.authDataProvider.get());
    }

    public static SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory create(Provider<AuthDataProvider> provider) {
        return new SendingMessagesModule_Companion_ProvideQueuedMessageToEntityMapperFactory(provider);
    }

    public static QueuedMessageToEntityMapper provideQueuedMessageToEntityMapper(AuthDataProvider authDataProvider) {
        return (QueuedMessageToEntityMapper) Preconditions.checkNotNullFromProvides(SendingMessagesModule.Companion.provideQueuedMessageToEntityMapper(authDataProvider));
    }
}
