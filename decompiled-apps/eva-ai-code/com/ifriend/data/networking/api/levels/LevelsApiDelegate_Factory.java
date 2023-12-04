package com.ifriend.data.networking.api.levels;

import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LevelsApiDelegate_Factory implements Factory<LevelsApiDelegate> {
    private final Provider<LevelsApi> apiProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public LevelsApiDelegate_Factory(Provider<LevelsApi> provider, Provider<UserRepository> provider2) {
        this.apiProvider = provider;
        this.userRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LevelsApiDelegate get() {
        return newInstance(this.apiProvider.get(), this.userRepositoryProvider.get());
    }

    public static LevelsApiDelegate_Factory create(Provider<LevelsApi> provider, Provider<UserRepository> provider2) {
        return new LevelsApiDelegate_Factory(provider, provider2);
    }

    public static LevelsApiDelegate newInstance(LevelsApi levelsApi, UserRepository userRepository) {
        return new LevelsApiDelegate(levelsApi, userRepository);
    }
}
