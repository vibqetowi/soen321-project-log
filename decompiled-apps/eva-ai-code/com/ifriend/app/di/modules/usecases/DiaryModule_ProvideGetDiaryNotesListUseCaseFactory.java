package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.useCases.diary.DiaryNotesService;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryModule_ProvideGetDiaryNotesListUseCaseFactory implements Factory<GetDiaryNotesListUseCase> {
    private final Provider<DiaryNotesService> diaryNotesServiceProvider;
    private final DiaryModule module;

    public DiaryModule_ProvideGetDiaryNotesListUseCaseFactory(DiaryModule diaryModule, Provider<DiaryNotesService> provider) {
        this.module = diaryModule;
        this.diaryNotesServiceProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetDiaryNotesListUseCase get() {
        return provideGetDiaryNotesListUseCase(this.module, this.diaryNotesServiceProvider.get());
    }

    public static DiaryModule_ProvideGetDiaryNotesListUseCaseFactory create(DiaryModule diaryModule, Provider<DiaryNotesService> provider) {
        return new DiaryModule_ProvideGetDiaryNotesListUseCaseFactory(diaryModule, provider);
    }

    public static GetDiaryNotesListUseCase provideGetDiaryNotesListUseCase(DiaryModule diaryModule, DiaryNotesService diaryNotesService) {
        return (GetDiaryNotesListUseCase) Preconditions.checkNotNullFromProvides(diaryModule.provideGetDiaryNotesListUseCase(diaryNotesService));
    }
}
