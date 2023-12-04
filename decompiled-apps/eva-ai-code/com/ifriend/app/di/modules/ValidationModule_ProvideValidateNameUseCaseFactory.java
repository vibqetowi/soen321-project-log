package com.ifriend.app.di.modules;

import com.ifriend.domain.validation.ValidateNameUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class ValidationModule_ProvideValidateNameUseCaseFactory implements Factory<ValidateNameUseCase> {
    private final ValidationModule module;

    public ValidationModule_ProvideValidateNameUseCaseFactory(ValidationModule validationModule) {
        this.module = validationModule;
    }

    @Override // javax.inject.Provider
    public ValidateNameUseCase get() {
        return provideValidateNameUseCase(this.module);
    }

    public static ValidationModule_ProvideValidateNameUseCaseFactory create(ValidationModule validationModule) {
        return new ValidationModule_ProvideValidateNameUseCaseFactory(validationModule);
    }

    public static ValidateNameUseCase provideValidateNameUseCase(ValidationModule validationModule) {
        return (ValidateNameUseCase) Preconditions.checkNotNullFromProvides(validationModule.provideValidateNameUseCase());
    }
}
