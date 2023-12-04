package com.ifriend.chat.data.chat.sending.queue;

import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessageToSendToQueuedMessageMapper_Factory implements Factory<MessageToSendToQueuedMessageMapper> {
    private final Provider<AuthDataProvider> authProvider;

    public MessageToSendToQueuedMessageMapper_Factory(Provider<AuthDataProvider> provider) {
        this.authProvider = provider;
    }

    @Override // javax.inject.Provider
    public MessageToSendToQueuedMessageMapper get() {
        return newInstance(this.authProvider.get());
    }

    public static MessageToSendToQueuedMessageMapper_Factory create(Provider<AuthDataProvider> provider) {
        return new MessageToSendToQueuedMessageMapper_Factory(provider);
    }

    public static MessageToSendToQueuedMessageMapper newInstance(AuthDataProvider authDataProvider) {
        return new MessageToSendToQueuedMessageMapper(authDataProvider);
    }
}
