package com.ifriend.app.di.modules;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory implements Factory<DefaultLifecycleObserver> {
    private final Provider<InternetConnection> connectionProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<CoroutineScope> scopeProvider;

    public MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory(Provider<InternetConnection> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<MessagesSource> provider4, Provider<Logger> provider5) {
        this.connectionProvider = provider;
        this.scopeProvider = provider2;
        this.coroutineDispatchersProvider = provider3;
        this.messagesSourceProvider = provider4;
        this.loggerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DefaultLifecycleObserver get() {
        return provideMessagesSourceLifecycleController(this.connectionProvider.get(), this.scopeProvider.get(), this.coroutineDispatchersProvider.get(), this.messagesSourceProvider.get(), this.loggerProvider.get());
    }

    public static MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory create(Provider<InternetConnection> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<MessagesSource> provider4, Provider<Logger> provider5) {
        return new MessagesModule_Companion_ProvideMessagesSourceLifecycleControllerFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultLifecycleObserver provideMessagesSourceLifecycleController(InternetConnection internetConnection, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, MessagesSource messagesSource, Logger logger) {
        return (DefaultLifecycleObserver) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideMessagesSourceLifecycleController(internetConnection, coroutineScope, coroutineDispatchers, messagesSource, logger));
    }
}
