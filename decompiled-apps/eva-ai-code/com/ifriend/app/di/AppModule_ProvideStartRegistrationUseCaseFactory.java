package com.ifriend.app.di;

import com.ifriend.registration.StartRegistrationUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class AppModule_ProvideStartRegistrationUseCaseFactory implements Factory<StartRegistrationUseCase> {
    private final AppModule module;

    public AppModule_ProvideStartRegistrationUseCaseFactory(AppModule appModule) {
        this.module = appModule;
    }

    @Override // javax.inject.Provider
    public StartRegistrationUseCase get() {
        return provideStartRegistrationUseCase(this.module);
    }

    public static AppModule_ProvideStartRegistrationUseCaseFactory create(AppModule appModule) {
        return new AppModule_ProvideStartRegistrationUseCaseFactory(appModule);
    }

    public static StartRegistrationUseCase provideStartRegistrationUseCase(AppModule appModule) {
        return (StartRegistrationUseCase) Preconditions.checkNotNullFromProvides(appModule.provideStartRegistrationUseCase());
    }
}
