package com.ifriend.presentation.features.chat.offers;

import com.ifriend.domain.logic.offers.ChatSubscriptionOfferInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferDelegateImpl_Factory implements Factory<ChatSubscriptionOfferDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatSubscriptionOfferInteractor> chatSubscriptionOfferInteractorProvider;

    public ChatSubscriptionOfferDelegateImpl_Factory(Provider<ChatSubscriptionOfferInteractor> provider, Provider<AppEventsEmitter> provider2) {
        this.chatSubscriptionOfferInteractorProvider = provider;
        this.appEventsEmitterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatSubscriptionOfferDelegateImpl get() {
        return newInstance(this.chatSubscriptionOfferInteractorProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static ChatSubscriptionOfferDelegateImpl_Factory create(Provider<ChatSubscriptionOfferInteractor> provider, Provider<AppEventsEmitter> provider2) {
        return new ChatSubscriptionOfferDelegateImpl_Factory(provider, provider2);
    }

    public static ChatSubscriptionOfferDelegateImpl newInstance(ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor, AppEventsEmitter appEventsEmitter) {
        return new ChatSubscriptionOfferDelegateImpl(chatSubscriptionOfferInteractor, appEventsEmitter);
    }
}
