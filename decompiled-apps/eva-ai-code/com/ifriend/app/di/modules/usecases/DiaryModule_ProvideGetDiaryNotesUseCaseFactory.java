package com.ifriend.app.di.modules.usecases;

import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.useCases.diary.DiaryNotesService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryModule_ProvideGetDiaryNotesUseCaseFactory implements Factory<DiaryNotesService> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<DiaryFeatureToggle> diaryFeatureToggleProvider;
    private final DiaryModule module;
    private final Provider<DiaryRepository> repositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public DiaryModule_ProvideGetDiaryNotesUseCaseFactory(DiaryModule diaryModule, Provider<DiaryRepository> provider, Provider<UserRepository> provider2, Provider<BotRepository> provider3, Provider<DiaryFeatureToggle> provider4) {
        this.module = diaryModule;
        this.repositoryProvider = provider;
        this.userRepositoryProvider = provider2;
        this.botRepositoryProvider = provider3;
        this.diaryFeatureToggleProvider = provider4;
    }

    @Override // javax.inject.Provider
    public DiaryNotesService get() {
        return provideGetDiaryNotesUseCase(this.module, this.repositoryProvider.get(), this.userRepositoryProvider.get(), this.botRepositoryProvider.get(), this.diaryFeatureToggleProvider.get());
    }

    public static DiaryModule_ProvideGetDiaryNotesUseCaseFactory create(DiaryModule diaryModule, Provider<DiaryRepository> provider, Provider<UserRepository> provider2, Provider<BotRepository> provider3, Provider<DiaryFeatureToggle> provider4) {
        return new DiaryModule_ProvideGetDiaryNotesUseCaseFactory(diaryModule, provider, provider2, provider3, provider4);
    }

    public static DiaryNotesService provideGetDiaryNotesUseCase(DiaryModule diaryModule, DiaryRepository diaryRepository, UserRepository userRepository, BotRepository botRepository, DiaryFeatureToggle diaryFeatureToggle) {
        return (DiaryNotesService) Preconditions.checkNotNullFromProvides(diaryModule.provideGetDiaryNotesUseCase(diaryRepository, userRepository, botRepository, diaryFeatureToggle));
    }
}
