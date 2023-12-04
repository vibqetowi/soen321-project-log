package com.ifriend.presentation.features.home.delegates;

import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeHandleDeepLinksDelegateImpl_Factory implements Factory<HomeHandleDeepLinksDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DeepLinksRepository> deepLinksRepositoryProvider;

    public HomeHandleDeepLinksDelegateImpl_Factory(Provider<DeepLinksRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<AppEventsEmitter> provider3) {
        this.deepLinksRepositoryProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
        this.appEventsEmitterProvider = provider3;
    }

    @Override // javax.inject.Provider
    public HomeHandleDeepLinksDelegateImpl get() {
        return newInstance(this.deepLinksRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static HomeHandleDeepLinksDelegateImpl_Factory create(Provider<DeepLinksRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<AppEventsEmitter> provider3) {
        return new HomeHandleDeepLinksDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static HomeHandleDeepLinksDelegateImpl newInstance(DeepLinksRepository deepLinksRepository, ChatsInfoInteractor chatsInfoInteractor, AppEventsEmitter appEventsEmitter) {
        return new HomeHandleDeepLinksDelegateImpl(deepLinksRepository, chatsInfoInteractor, appEventsEmitter);
    }
}
