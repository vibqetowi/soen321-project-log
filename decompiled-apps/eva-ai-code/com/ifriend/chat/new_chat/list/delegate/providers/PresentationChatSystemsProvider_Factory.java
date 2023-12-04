package com.ifriend.chat.new_chat.list.delegate.providers;

import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class PresentationChatSystemsProvider_Factory implements Factory<PresentationChatSystemsProvider> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<MessagesSource> messagesSourceProvider;

    public PresentationChatSystemsProvider_Factory(Provider<MessagesSource> provider, Provider<CoroutineScope> provider2, Provider<AppIdentityConverter> provider3) {
        this.messagesSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.appIdentityConverterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PresentationChatSystemsProvider get() {
        return newInstance(this.messagesSourceProvider.get(), this.coroutineScopeProvider.get(), this.appIdentityConverterProvider.get());
    }

    public static PresentationChatSystemsProvider_Factory create(Provider<MessagesSource> provider, Provider<CoroutineScope> provider2, Provider<AppIdentityConverter> provider3) {
        return new PresentationChatSystemsProvider_Factory(provider, provider2, provider3);
    }

    public static PresentationChatSystemsProvider newInstance(MessagesSource messagesSource, CoroutineScope coroutineScope, AppIdentityConverter appIdentityConverter) {
        return new PresentationChatSystemsProvider(messagesSource, coroutineScope, appIdentityConverter);
    }
}
