package com.ifriend.app.di.modules;

import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.domain.validation.EmailValidator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ValidationModule_ProvideEmailValidatorFactory implements Factory<EmailValidator> {
    private final ValidationModule module;
    private final Provider<ValidationApi> validationApiProvider;

    public ValidationModule_ProvideEmailValidatorFactory(ValidationModule validationModule, Provider<ValidationApi> provider) {
        this.module = validationModule;
        this.validationApiProvider = provider;
    }

    @Override // javax.inject.Provider
    public EmailValidator get() {
        return provideEmailValidator(this.module, this.validationApiProvider.get());
    }

    public static ValidationModule_ProvideEmailValidatorFactory create(ValidationModule validationModule, Provider<ValidationApi> provider) {
        return new ValidationModule_ProvideEmailValidatorFactory(validationModule, provider);
    }

    public static EmailValidator provideEmailValidator(ValidationModule validationModule, ValidationApi validationApi) {
        return (EmailValidator) Preconditions.checkNotNullFromProvides(validationModule.provideEmailValidator(validationApi));
    }
}
