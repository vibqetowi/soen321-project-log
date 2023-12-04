package com.ifriend.app.di.modules;

import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class ValidationModule_ProvideValidateCredentialsUseCaseFactory implements Factory<ValidateCredentialsUseCase> {
    private final ValidationModule module;

    public ValidationModule_ProvideValidateCredentialsUseCaseFactory(ValidationModule validationModule) {
        this.module = validationModule;
    }

    @Override // javax.inject.Provider
    public ValidateCredentialsUseCase get() {
        return provideValidateCredentialsUseCase(this.module);
    }

    public static ValidationModule_ProvideValidateCredentialsUseCaseFactory create(ValidationModule validationModule) {
        return new ValidationModule_ProvideValidateCredentialsUseCaseFactory(validationModule);
    }

    public static ValidateCredentialsUseCase provideValidateCredentialsUseCase(ValidationModule validationModule) {
        return (ValidateCredentialsUseCase) Preconditions.checkNotNullFromProvides(validationModule.provideValidateCredentialsUseCase());
    }
}
