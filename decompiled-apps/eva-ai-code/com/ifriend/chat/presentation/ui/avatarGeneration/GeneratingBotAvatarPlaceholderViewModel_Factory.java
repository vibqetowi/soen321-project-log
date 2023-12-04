package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GeneratingBotAvatarPlaceholderViewModel_Factory implements Factory<GeneratingBotAvatarPlaceholderViewModel> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;

    public GeneratingBotAvatarPlaceholderViewModel_Factory(Provider<BotRepository> provider, Provider<AppEventsEmitter> provider2, Provider<CoroutineDispatchers> provider3) {
        this.botRepositoryProvider = provider;
        this.appEventsEmitterProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public GeneratingBotAvatarPlaceholderViewModel get() {
        return newInstance(this.botRepositoryProvider.get(), this.appEventsEmitterProvider.get(), this.dispatchersProvider.get());
    }

    public static GeneratingBotAvatarPlaceholderViewModel_Factory create(Provider<BotRepository> provider, Provider<AppEventsEmitter> provider2, Provider<CoroutineDispatchers> provider3) {
        return new GeneratingBotAvatarPlaceholderViewModel_Factory(provider, provider2, provider3);
    }

    public static GeneratingBotAvatarPlaceholderViewModel newInstance(BotRepository botRepository, AppEventsEmitter appEventsEmitter, CoroutineDispatchers coroutineDispatchers) {
        return new GeneratingBotAvatarPlaceholderViewModel(botRepository, appEventsEmitter, coroutineDispatchers);
    }
}
