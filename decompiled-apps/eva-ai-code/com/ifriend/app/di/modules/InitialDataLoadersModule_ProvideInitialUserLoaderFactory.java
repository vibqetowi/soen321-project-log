package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialUserLoader;
import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialUserLoaderFactory implements Factory<InitialUserLoader> {
    private final InitialDataLoadersModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public InitialDataLoadersModule_ProvideInitialUserLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<UserRepository> provider) {
        this.module = initialDataLoadersModule;
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public InitialUserLoader get() {
        return provideInitialUserLoader(this.module, this.userRepositoryProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialUserLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<UserRepository> provider) {
        return new InitialDataLoadersModule_ProvideInitialUserLoaderFactory(initialDataLoadersModule, provider);
    }

    public static InitialUserLoader provideInitialUserLoader(InitialDataLoadersModule initialDataLoadersModule, UserRepository userRepository) {
        return (InitialUserLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialUserLoader(userRepository));
    }
}
