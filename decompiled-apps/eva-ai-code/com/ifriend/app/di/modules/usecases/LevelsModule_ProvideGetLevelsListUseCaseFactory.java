package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LevelsModule_ProvideGetLevelsListUseCaseFactory implements Factory<GetLevelInfoUseCase> {
    private final LevelsModule module;
    private final Provider<LevelsRepository> repositoryProvider;

    public LevelsModule_ProvideGetLevelsListUseCaseFactory(LevelsModule levelsModule, Provider<LevelsRepository> provider) {
        this.module = levelsModule;
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetLevelInfoUseCase get() {
        return provideGetLevelsListUseCase(this.module, this.repositoryProvider.get());
    }

    public static LevelsModule_ProvideGetLevelsListUseCaseFactory create(LevelsModule levelsModule, Provider<LevelsRepository> provider) {
        return new LevelsModule_ProvideGetLevelsListUseCaseFactory(levelsModule, provider);
    }

    public static GetLevelInfoUseCase provideGetLevelsListUseCase(LevelsModule levelsModule, LevelsRepository levelsRepository) {
        return (GetLevelInfoUseCase) Preconditions.checkNotNullFromProvides(levelsModule.provideGetLevelsListUseCase(levelsRepository));
    }
}
