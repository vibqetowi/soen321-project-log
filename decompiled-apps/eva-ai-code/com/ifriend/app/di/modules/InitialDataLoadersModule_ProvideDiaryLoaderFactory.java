package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.DiaryLoader;
import com.ifriend.data.toggle.DiaryFeatureToggle;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideDiaryLoaderFactory implements Factory<DiaryLoader> {
    private final Provider<DiaryFeatureToggle> diaryFeatureToggleProvider;
    private final Provider<DiaryRepository> diaryRepositoryProvider;
    private final InitialDataLoadersModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public InitialDataLoadersModule_ProvideDiaryLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<DiaryFeatureToggle> provider, Provider<DiaryRepository> provider2, Provider<UserRepository> provider3) {
        this.module = initialDataLoadersModule;
        this.diaryFeatureToggleProvider = provider;
        this.diaryRepositoryProvider = provider2;
        this.userRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public DiaryLoader get() {
        return provideDiaryLoader(this.module, this.diaryFeatureToggleProvider.get(), this.diaryRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static InitialDataLoadersModule_ProvideDiaryLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<DiaryFeatureToggle> provider, Provider<DiaryRepository> provider2, Provider<UserRepository> provider3) {
        return new InitialDataLoadersModule_ProvideDiaryLoaderFactory(initialDataLoadersModule, provider, provider2, provider3);
    }

    public static DiaryLoader provideDiaryLoader(InitialDataLoadersModule initialDataLoadersModule, DiaryFeatureToggle diaryFeatureToggle, DiaryRepository diaryRepository, UserRepository userRepository) {
        return (DiaryLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideDiaryLoader(diaryFeatureToggle, diaryRepository, userRepository));
    }
}
