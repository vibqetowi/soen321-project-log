package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryModule_ProvideOnDiaryShownUseCaseFactory implements Factory<OnDiaryShownUseCase> {
    private final DiaryModule module;
    private final Provider<DiaryRepository> repositoryProvider;

    public DiaryModule_ProvideOnDiaryShownUseCaseFactory(DiaryModule diaryModule, Provider<DiaryRepository> provider) {
        this.module = diaryModule;
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnDiaryShownUseCase get() {
        return provideOnDiaryShownUseCase(this.module, this.repositoryProvider.get());
    }

    public static DiaryModule_ProvideOnDiaryShownUseCaseFactory create(DiaryModule diaryModule, Provider<DiaryRepository> provider) {
        return new DiaryModule_ProvideOnDiaryShownUseCaseFactory(diaryModule, provider);
    }

    public static OnDiaryShownUseCase provideOnDiaryShownUseCase(DiaryModule diaryModule, DiaryRepository diaryRepository) {
        return (OnDiaryShownUseCase) Preconditions.checkNotNullFromProvides(diaryModule.provideOnDiaryShownUseCase(diaryRepository));
    }
}
