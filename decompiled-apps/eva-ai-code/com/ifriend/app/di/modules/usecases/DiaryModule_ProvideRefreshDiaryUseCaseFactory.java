package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryModule_ProvideRefreshDiaryUseCaseFactory implements Factory<RefreshDiaryUseCase> {
    private final DiaryModule module;
    private final Provider<DiaryRepository> repositoryProvider;

    public DiaryModule_ProvideRefreshDiaryUseCaseFactory(DiaryModule diaryModule, Provider<DiaryRepository> provider) {
        this.module = diaryModule;
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public RefreshDiaryUseCase get() {
        return provideRefreshDiaryUseCase(this.module, this.repositoryProvider.get());
    }

    public static DiaryModule_ProvideRefreshDiaryUseCaseFactory create(DiaryModule diaryModule, Provider<DiaryRepository> provider) {
        return new DiaryModule_ProvideRefreshDiaryUseCaseFactory(diaryModule, provider);
    }

    public static RefreshDiaryUseCase provideRefreshDiaryUseCase(DiaryModule diaryModule, DiaryRepository diaryRepository) {
        return (RefreshDiaryUseCase) Preconditions.checkNotNullFromProvides(diaryModule.provideRefreshDiaryUseCase(diaryRepository));
    }
}
