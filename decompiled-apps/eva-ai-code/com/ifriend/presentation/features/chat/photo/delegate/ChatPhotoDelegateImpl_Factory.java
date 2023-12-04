package com.ifriend.presentation.features.chat.photo.delegate;

import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.presentation.analytics.ChatPhotoAnalytics;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPhotoDelegateImpl_Factory {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatMessageAccessDelegate.Factory> chatMessageAccessDelegateProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<ChatPhotoAnalytics> photoAnalyticsProvider;

    public ChatPhotoDelegateImpl_Factory(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatPhotoAnalytics> provider2, Provider<ChatClientInteractor> provider3, Provider<ChatMessageAccessDelegate.Factory> provider4) {
        this.exceptionsEmitterProvider = provider;
        this.photoAnalyticsProvider = provider2;
        this.chatClientInteractorProvider = provider3;
        this.chatMessageAccessDelegateProvider = provider4;
    }

    public ChatPhotoDelegateImpl get(String str) {
        return newInstance(str, this.exceptionsEmitterProvider.get(), this.photoAnalyticsProvider.get(), this.chatClientInteractorProvider.get(), this.chatMessageAccessDelegateProvider.get());
    }

    public static ChatPhotoDelegateImpl_Factory create(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatPhotoAnalytics> provider2, Provider<ChatClientInteractor> provider3, Provider<ChatMessageAccessDelegate.Factory> provider4) {
        return new ChatPhotoDelegateImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatPhotoDelegateImpl newInstance(String str, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatPhotoAnalytics chatPhotoAnalytics, ChatClientInteractor chatClientInteractor, ChatMessageAccessDelegate.Factory factory) {
        return new ChatPhotoDelegateImpl(str, flowObserverEmitter, chatPhotoAnalytics, chatClientInteractor, factory);
    }
}
