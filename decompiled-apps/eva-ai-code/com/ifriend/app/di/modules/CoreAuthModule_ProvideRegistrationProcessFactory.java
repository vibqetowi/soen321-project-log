package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.authorization.RegistrationApiDelegate;
import com.ifriend.data.networking.api.RegistrationApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideRegistrationProcessFactory implements Factory<RegistrationApiDelegate> {
    private final Provider<RegistrationApi> apiProvider;
    private final Provider<Logger> loggerProvider;
    private final CoreAuthModule module;

    public CoreAuthModule_ProvideRegistrationProcessFactory(CoreAuthModule coreAuthModule, Provider<RegistrationApi> provider, Provider<Logger> provider2) {
        this.module = coreAuthModule;
        this.apiProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RegistrationApiDelegate get() {
        return provideRegistrationProcess(this.module, this.apiProvider.get(), this.loggerProvider.get());
    }

    public static CoreAuthModule_ProvideRegistrationProcessFactory create(CoreAuthModule coreAuthModule, Provider<RegistrationApi> provider, Provider<Logger> provider2) {
        return new CoreAuthModule_ProvideRegistrationProcessFactory(coreAuthModule, provider, provider2);
    }

    public static RegistrationApiDelegate provideRegistrationProcess(CoreAuthModule coreAuthModule, RegistrationApi registrationApi, Logger logger) {
        return (RegistrationApiDelegate) Preconditions.checkNotNullFromProvides(coreAuthModule.provideRegistrationProcess(registrationApi, logger));
    }
}
