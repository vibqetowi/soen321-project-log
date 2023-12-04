package com.ifriend.app.di.modules;

import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ValidationModule_ProvideValidateAgeUseCaseFactory implements Factory<ValidateAgeUseCase> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final ValidationModule module;

    public ValidationModule_ProvideValidateAgeUseCaseFactory(ValidationModule validationModule, Provider<AppConfigUseCase> provider) {
        this.module = validationModule;
        this.appConfigUseCaseProvider = provider;
    }

    @Override // javax.inject.Provider
    public ValidateAgeUseCase get() {
        return provideValidateAgeUseCase(this.module, this.appConfigUseCaseProvider.get());
    }

    public static ValidationModule_ProvideValidateAgeUseCaseFactory create(ValidationModule validationModule, Provider<AppConfigUseCase> provider) {
        return new ValidationModule_ProvideValidateAgeUseCaseFactory(validationModule, provider);
    }

    public static ValidateAgeUseCase provideValidateAgeUseCase(ValidationModule validationModule, AppConfigUseCase appConfigUseCase) {
        return (ValidateAgeUseCase) Preconditions.checkNotNullFromProvides(validationModule.provideValidateAgeUseCase(appConfigUseCase));
    }
}
