package com.ifriend.presentation.features.profile.confirmemail;

import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.domain.storage.EventDelayStorage;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ConfirmEmailViewModel_Factory implements Factory<ConfirmEmailViewModel> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<EventDelayStorage> eventDelayStorageProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<SendConfirmationEmailUseCase> sendConfirmationEmailUseCaseProvider;

    public ConfirmEmailViewModel_Factory(Provider<SendConfirmationEmailUseCase> provider, Provider<AuthDataProvider> provider2, Provider<AppConfigUseCase> provider3, Provider<EventDelayStorage> provider4, Provider<ResourceProvider> provider5) {
        this.sendConfirmationEmailUseCaseProvider = provider;
        this.authDataProvider = provider2;
        this.appConfigUseCaseProvider = provider3;
        this.eventDelayStorageProvider = provider4;
        this.resourceProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ConfirmEmailViewModel get() {
        return newInstance(this.sendConfirmationEmailUseCaseProvider.get(), this.authDataProvider.get(), this.appConfigUseCaseProvider.get(), this.eventDelayStorageProvider.get(), this.resourceProvider.get());
    }

    public static ConfirmEmailViewModel_Factory create(Provider<SendConfirmationEmailUseCase> provider, Provider<AuthDataProvider> provider2, Provider<AppConfigUseCase> provider3, Provider<EventDelayStorage> provider4, Provider<ResourceProvider> provider5) {
        return new ConfirmEmailViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ConfirmEmailViewModel newInstance(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, AuthDataProvider authDataProvider, AppConfigUseCase appConfigUseCase, EventDelayStorage eventDelayStorage, ResourceProvider resourceProvider) {
        return new ConfirmEmailViewModel(sendConfirmationEmailUseCase, authDataProvider, appConfigUseCase, eventDelayStorage, resourceProvider);
    }
}
