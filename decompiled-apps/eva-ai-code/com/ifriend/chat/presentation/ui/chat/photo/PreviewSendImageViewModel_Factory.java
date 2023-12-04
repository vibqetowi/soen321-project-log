package com.ifriend.chat.presentation.ui.chat.photo;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class PreviewSendImageViewModel_Factory implements Factory<PreviewSendImageViewModel> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<Logger> loggerProvider;

    public PreviewSendImageViewModel_Factory(Provider<InternalNotificationHandler> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<Logger> provider4, Provider<ChatClientInteractor> provider5) {
        this.internalNotificationHandlerProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.dispatchersProvider = provider3;
        this.loggerProvider = provider4;
        this.chatClientInteractorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public PreviewSendImageViewModel get() {
        return newInstance(this.internalNotificationHandlerProvider.get(), this.coroutineScopeProvider.get(), this.dispatchersProvider.get(), this.loggerProvider.get(), this.chatClientInteractorProvider.get());
    }

    public static PreviewSendImageViewModel_Factory create(Provider<InternalNotificationHandler> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<Logger> provider4, Provider<ChatClientInteractor> provider5) {
        return new PreviewSendImageViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PreviewSendImageViewModel newInstance(InternalNotificationHandler internalNotificationHandler, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger, ChatClientInteractor chatClientInteractor) {
        return new PreviewSendImageViewModel(internalNotificationHandler, coroutineScope, coroutineDispatchers, logger, chatClientInteractor);
    }
}
