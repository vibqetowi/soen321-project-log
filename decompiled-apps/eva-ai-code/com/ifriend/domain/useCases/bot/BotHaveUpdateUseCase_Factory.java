package com.ifriend.domain.useCases.bot;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotHaveUpdateUseCase_Factory implements Factory<BotHaveUpdateUseCase> {
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<LongTermNotificationManager> notificationManagerProvider;

    public BotHaveUpdateUseCase_Factory(Provider<LongTermNotificationManager> provider, Provider<CoroutineDispatchers> provider2) {
        this.notificationManagerProvider = provider;
        this.dispatchersProvider = provider2;
    }

    @Override // javax.inject.Provider
    public BotHaveUpdateUseCase get() {
        return newInstance(this.notificationManagerProvider.get(), this.dispatchersProvider.get());
    }

    public static BotHaveUpdateUseCase_Factory create(Provider<LongTermNotificationManager> provider, Provider<CoroutineDispatchers> provider2) {
        return new BotHaveUpdateUseCase_Factory(provider, provider2);
    }

    public static BotHaveUpdateUseCase newInstance(LongTermNotificationManager longTermNotificationManager, CoroutineDispatchers coroutineDispatchers) {
        return new BotHaveUpdateUseCase(longTermNotificationManager, coroutineDispatchers);
    }
}
