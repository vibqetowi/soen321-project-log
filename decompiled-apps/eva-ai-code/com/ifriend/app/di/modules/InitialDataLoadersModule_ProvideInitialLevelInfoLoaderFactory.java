package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialLevelInfoLoader;
import com.ifriend.domain.data.levels.LevelsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory implements Factory<InitialLevelInfoLoader> {
    private final Provider<LevelsRepository> levelsRepositoryProvider;
    private final InitialDataLoadersModule module;

    public InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<LevelsRepository> provider) {
        this.module = initialDataLoadersModule;
        this.levelsRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public InitialLevelInfoLoader get() {
        return provideInitialLevelInfoLoader(this.module, this.levelsRepositoryProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<LevelsRepository> provider) {
        return new InitialDataLoadersModule_ProvideInitialLevelInfoLoaderFactory(initialDataLoadersModule, provider);
    }

    public static InitialLevelInfoLoader provideInitialLevelInfoLoader(InitialDataLoadersModule initialDataLoadersModule, LevelsRepository levelsRepository) {
        return (InitialLevelInfoLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialLevelInfoLoader(levelsRepository));
    }
}
