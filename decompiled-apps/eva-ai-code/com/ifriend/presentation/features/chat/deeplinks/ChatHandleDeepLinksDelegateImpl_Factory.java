package com.ifriend.presentation.features.chat.deeplinks;

import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatHandleDeepLinksDelegateImpl_Factory implements Factory<ChatHandleDeepLinksDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DeepLinksRepository> deepLinksRepositoryProvider;

    public ChatHandleDeepLinksDelegateImpl_Factory(Provider<DeepLinksRepository> provider, Provider<AppEventsEmitter> provider2, Provider<ChatsInfoInteractor> provider3) {
        this.deepLinksRepositoryProvider = provider;
        this.appEventsEmitterProvider = provider2;
        this.chatsInfoInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatHandleDeepLinksDelegateImpl get() {
        return newInstance(this.deepLinksRepositoryProvider.get(), this.appEventsEmitterProvider.get(), this.chatsInfoInteractorProvider.get());
    }

    public static ChatHandleDeepLinksDelegateImpl_Factory create(Provider<DeepLinksRepository> provider, Provider<AppEventsEmitter> provider2, Provider<ChatsInfoInteractor> provider3) {
        return new ChatHandleDeepLinksDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static ChatHandleDeepLinksDelegateImpl newInstance(DeepLinksRepository deepLinksRepository, AppEventsEmitter appEventsEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        return new ChatHandleDeepLinksDelegateImpl(deepLinksRepository, appEventsEmitter, chatsInfoInteractor);
    }
}
