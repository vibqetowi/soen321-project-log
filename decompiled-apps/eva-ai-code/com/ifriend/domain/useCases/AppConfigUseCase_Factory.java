package com.ifriend.domain.useCases;

import com.ifriend.domain.data.config.AppConfigRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppConfigUseCase_Factory implements Factory<AppConfigUseCase> {
    private final Provider<AppConfigRepository> appConfigRepositoryProvider;

    public AppConfigUseCase_Factory(Provider<AppConfigRepository> provider) {
        this.appConfigRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppConfigUseCase get() {
        return newInstance(this.appConfigRepositoryProvider.get());
    }

    public static AppConfigUseCase_Factory create(Provider<AppConfigRepository> provider) {
        return new AppConfigUseCase_Factory(provider);
    }

    public static AppConfigUseCase newInstance(AppConfigRepository appConfigRepository) {
        return new AppConfigUseCase(appConfigRepository);
    }
}
