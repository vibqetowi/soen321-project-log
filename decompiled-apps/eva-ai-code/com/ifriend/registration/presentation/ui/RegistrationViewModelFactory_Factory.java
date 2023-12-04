package com.ifriend.registration.presentation.ui;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RegistrationViewModelFactory_Factory implements Factory<RegistrationViewModelFactory> {
    private final Provider<AppConfigRepository> appConfigRepositoryProvider;
    private final Provider<InAppUpdateDelegateImpl> appUpdatesDelegateProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;

    public RegistrationViewModelFactory_Factory(Provider<InAppUpdateDelegateImpl> provider, Provider<AppConfigRepository> provider2, Provider<DispatcherProvider> provider3) {
        this.appUpdatesDelegateProvider = provider;
        this.appConfigRepositoryProvider = provider2;
        this.dispatcherProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RegistrationViewModelFactory get() {
        return newInstance(this.appUpdatesDelegateProvider.get(), this.appConfigRepositoryProvider.get(), this.dispatcherProvider.get());
    }

    public static RegistrationViewModelFactory_Factory create(Provider<InAppUpdateDelegateImpl> provider, Provider<AppConfigRepository> provider2, Provider<DispatcherProvider> provider3) {
        return new RegistrationViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static RegistrationViewModelFactory newInstance(InAppUpdateDelegateImpl inAppUpdateDelegateImpl, AppConfigRepository appConfigRepository, DispatcherProvider dispatcherProvider) {
        return new RegistrationViewModelFactory(inAppUpdateDelegateImpl, appConfigRepository, dispatcherProvider);
    }
}
