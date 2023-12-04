package com.ifriend.presentation.features.chat.sextingmessage;

import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SextingMessagePaywallShowingDelegateImpl_Factory implements Factory<SextingMessagePaywallShowingDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatMessageAccessInteractor> chatMessageAccessInteractorProvider;

    public SextingMessagePaywallShowingDelegateImpl_Factory(Provider<ChatClientInteractor> provider, Provider<AppEventsEmitter> provider2, Provider<ChatMessageAccessInteractor> provider3) {
        this.chatClientInteractorProvider = provider;
        this.appEventsEmitterProvider = provider2;
        this.chatMessageAccessInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SextingMessagePaywallShowingDelegateImpl get() {
        return newInstance(this.chatClientInteractorProvider.get(), this.appEventsEmitterProvider.get(), this.chatMessageAccessInteractorProvider.get());
    }

    public static SextingMessagePaywallShowingDelegateImpl_Factory create(Provider<ChatClientInteractor> provider, Provider<AppEventsEmitter> provider2, Provider<ChatMessageAccessInteractor> provider3) {
        return new SextingMessagePaywallShowingDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static SextingMessagePaywallShowingDelegateImpl newInstance(ChatClientInteractor chatClientInteractor, AppEventsEmitter appEventsEmitter, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new SextingMessagePaywallShowingDelegateImpl(chatClientInteractor, appEventsEmitter, chatMessageAccessInteractor);
    }
}
