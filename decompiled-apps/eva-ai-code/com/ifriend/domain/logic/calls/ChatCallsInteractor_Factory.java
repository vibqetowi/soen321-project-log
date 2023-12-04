package com.ifriend.domain.logic.calls;

import com.ifriend.domain.data.calls.ChatCallsRepository;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatCallsInteractor_Factory implements Factory<ChatCallsInteractor> {
    private final Provider<ChatCallsRepository> callsRepositoryProvider;
    private final Provider<IsChatFeatureAvailableUseCase> isChatFeatureAvailableUseCaseProvider;

    public ChatCallsInteractor_Factory(Provider<ChatCallsRepository> provider, Provider<IsChatFeatureAvailableUseCase> provider2) {
        this.callsRepositoryProvider = provider;
        this.isChatFeatureAvailableUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatCallsInteractor get() {
        return newInstance(this.callsRepositoryProvider.get(), this.isChatFeatureAvailableUseCaseProvider.get());
    }

    public static ChatCallsInteractor_Factory create(Provider<ChatCallsRepository> provider, Provider<IsChatFeatureAvailableUseCase> provider2) {
        return new ChatCallsInteractor_Factory(provider, provider2);
    }

    public static ChatCallsInteractor newInstance(ChatCallsRepository chatCallsRepository, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase) {
        return new ChatCallsInteractor(chatCallsRepository, isChatFeatureAvailableUseCase);
    }
}
