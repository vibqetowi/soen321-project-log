package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.notifications.AppNotifier;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class InternalNotificationsModule_Companion_ProvideAppNotifierFactory implements Factory<AppNotifier> {
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<CoroutineScope> scopeProvider;

    public InternalNotificationsModule_Companion_ProvideAppNotifierFactory(Provider<MessagesSource> provider, Provider<InternalNotificationHandler> provider2, Provider<CoroutineScope> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        this.messagesSourceProvider = provider;
        this.internalNotificationHandlerProvider = provider2;
        this.scopeProvider = provider3;
        this.dispatchersProvider = provider4;
        this.loggerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AppNotifier get() {
        return provideAppNotifier(this.messagesSourceProvider.get(), this.internalNotificationHandlerProvider.get(), this.scopeProvider.get(), this.dispatchersProvider.get(), this.loggerProvider.get());
    }

    public static InternalNotificationsModule_Companion_ProvideAppNotifierFactory create(Provider<MessagesSource> provider, Provider<InternalNotificationHandler> provider2, Provider<CoroutineScope> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        return new InternalNotificationsModule_Companion_ProvideAppNotifierFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static AppNotifier provideAppNotifier(MessagesSource messagesSource, InternalNotificationHandler internalNotificationHandler, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        return (AppNotifier) Preconditions.checkNotNullFromProvides(InternalNotificationsModule.Companion.provideAppNotifier(messagesSource, internalNotificationHandler, coroutineScope, coroutineDispatchers, logger));
    }
}
