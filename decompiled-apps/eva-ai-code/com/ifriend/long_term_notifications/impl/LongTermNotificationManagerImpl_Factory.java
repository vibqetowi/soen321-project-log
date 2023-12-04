package com.ifriend.long_term_notifications.impl;

import android.content.Context;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class LongTermNotificationManagerImpl_Factory implements Factory<LongTermNotificationManagerImpl> {
    private final Provider<CoroutineScope> appScopeProvider;
    private final Provider<Context> contextProvider;
    private final Provider<MessagesSource> messagesSourceProvider;

    public LongTermNotificationManagerImpl_Factory(Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<MessagesSource> provider3) {
        this.contextProvider = provider;
        this.appScopeProvider = provider2;
        this.messagesSourceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LongTermNotificationManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.appScopeProvider.get(), this.messagesSourceProvider.get());
    }

    public static LongTermNotificationManagerImpl_Factory create(Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<MessagesSource> provider3) {
        return new LongTermNotificationManagerImpl_Factory(provider, provider2, provider3);
    }

    public static LongTermNotificationManagerImpl newInstance(Context context, CoroutineScope coroutineScope, MessagesSource messagesSource) {
        return new LongTermNotificationManagerImpl(context, coroutineScope, messagesSource);
    }
}
