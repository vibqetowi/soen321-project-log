package com.ifriend.registration.presentation.ui.email;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import com.ifriend.registration.domain.useCase.email.SignUpEmailUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class EmailRegistrationViewModel_Factory implements Factory<EmailRegistrationViewModel> {
    private final Provider<Logger> loggerProvider;
    private final Provider<SignUpEmailUseCase> signUpEmailUseCaseProvider;
    private final Provider<ValidateCredentialsUseCase> validateCredentialsUseCaseProvider;

    public EmailRegistrationViewModel_Factory(Provider<ValidateCredentialsUseCase> provider, Provider<SignUpEmailUseCase> provider2, Provider<Logger> provider3) {
        this.validateCredentialsUseCaseProvider = provider;
        this.signUpEmailUseCaseProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public EmailRegistrationViewModel get() {
        return newInstance(this.validateCredentialsUseCaseProvider.get(), this.signUpEmailUseCaseProvider.get(), this.loggerProvider.get());
    }

    public static EmailRegistrationViewModel_Factory create(Provider<ValidateCredentialsUseCase> provider, Provider<SignUpEmailUseCase> provider2, Provider<Logger> provider3) {
        return new EmailRegistrationViewModel_Factory(provider, provider2, provider3);
    }

    public static EmailRegistrationViewModel newInstance(ValidateCredentialsUseCase validateCredentialsUseCase, SignUpEmailUseCase signUpEmailUseCase, Logger logger) {
        return new EmailRegistrationViewModel(validateCredentialsUseCase, signUpEmailUseCase, logger);
    }
}
