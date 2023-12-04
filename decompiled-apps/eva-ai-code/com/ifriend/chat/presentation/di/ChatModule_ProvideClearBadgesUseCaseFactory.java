package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.firebase.ClearBadgesUseCase;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideClearBadgesUseCaseFactory implements Factory<ClearBadgesUseCase> {
    private final Provider<FirebaseApiRepository> firebaseApiRepositoryProvider;
    private final ChatModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatModule_ProvideClearBadgesUseCaseFactory(ChatModule chatModule, Provider<FirebaseApiRepository> provider, Provider<UserRepository> provider2) {
        this.module = chatModule;
        this.firebaseApiRepositoryProvider = provider;
        this.userRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ClearBadgesUseCase get() {
        return provideClearBadgesUseCase(this.module, this.firebaseApiRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static ChatModule_ProvideClearBadgesUseCaseFactory create(ChatModule chatModule, Provider<FirebaseApiRepository> provider, Provider<UserRepository> provider2) {
        return new ChatModule_ProvideClearBadgesUseCaseFactory(chatModule, provider, provider2);
    }

    public static ClearBadgesUseCase provideClearBadgesUseCase(ChatModule chatModule, FirebaseApiRepository firebaseApiRepository, UserRepository userRepository) {
        return (ClearBadgesUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideClearBadgesUseCase(firebaseApiRepository, userRepository));
    }
}
