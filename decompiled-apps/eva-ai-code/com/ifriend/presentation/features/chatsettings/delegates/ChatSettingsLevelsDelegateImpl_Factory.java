package com.ifriend.presentation.features.chatsettings.delegates;

import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSettingsLevelsDelegateImpl_Factory implements Factory<ChatSettingsLevelsDelegateImpl> {
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<GetLevelInfoUseCase> getLevelInfoUseCaseProvider;

    public ChatSettingsLevelsDelegateImpl_Factory(Provider<GetLevelInfoUseCase> provider, Provider<FlowObserverEmitter<Throwable>> provider2) {
        this.getLevelInfoUseCaseProvider = provider;
        this.exceptionsEmitterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatSettingsLevelsDelegateImpl get() {
        return newInstance(this.getLevelInfoUseCaseProvider.get(), this.exceptionsEmitterProvider.get());
    }

    public static ChatSettingsLevelsDelegateImpl_Factory create(Provider<GetLevelInfoUseCase> provider, Provider<FlowObserverEmitter<Throwable>> provider2) {
        return new ChatSettingsLevelsDelegateImpl_Factory(provider, provider2);
    }

    public static ChatSettingsLevelsDelegateImpl newInstance(GetLevelInfoUseCase getLevelInfoUseCase, FlowObserverEmitter<Throwable> flowObserverEmitter) {
        return new ChatSettingsLevelsDelegateImpl(getLevelInfoUseCase, flowObserverEmitter);
    }
}
