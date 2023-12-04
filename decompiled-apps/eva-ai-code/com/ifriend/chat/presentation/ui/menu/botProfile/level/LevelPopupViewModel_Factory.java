package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LevelPopupViewModel_Factory implements Factory<LevelPopupViewModel> {
    private final Provider<AvatarsStorage> avatarsStorageProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;

    public LevelPopupViewModel_Factory(Provider<CoroutineDispatchers> provider, Provider<AvatarsStorage> provider2, Provider<GetBotUseCase> provider3) {
        this.dispatchersProvider = provider;
        this.avatarsStorageProvider = provider2;
        this.getBotUseCaseProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LevelPopupViewModel get() {
        return newInstance(this.dispatchersProvider.get(), this.avatarsStorageProvider.get(), this.getBotUseCaseProvider.get());
    }

    public static LevelPopupViewModel_Factory create(Provider<CoroutineDispatchers> provider, Provider<AvatarsStorage> provider2, Provider<GetBotUseCase> provider3) {
        return new LevelPopupViewModel_Factory(provider, provider2, provider3);
    }

    public static LevelPopupViewModel newInstance(CoroutineDispatchers coroutineDispatchers, AvatarsStorage avatarsStorage, GetBotUseCase getBotUseCase) {
        return new LevelPopupViewModel(coroutineDispatchers, avatarsStorage, getBotUseCase);
    }
}
