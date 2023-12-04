package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.authorization.RegistrationApiDelegate;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideAuthorizerFactory implements Factory<Authorizer> {
    private final Provider<AppInstallStorage> appInstallStorageProvider;
    private final Provider<AuthDataStorage> authDataStorageProvider;
    private final Provider<Logger> loggerProvider;
    private final CoreAuthModule module;
    private final Provider<RegistrationApiDelegate> registrationProcessProvider;

    public CoreAuthModule_ProvideAuthorizerFactory(CoreAuthModule coreAuthModule, Provider<RegistrationApiDelegate> provider, Provider<AuthDataStorage> provider2, Provider<AppInstallStorage> provider3, Provider<Logger> provider4) {
        this.module = coreAuthModule;
        this.registrationProcessProvider = provider;
        this.authDataStorageProvider = provider2;
        this.appInstallStorageProvider = provider3;
        this.loggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public Authorizer get() {
        return provideAuthorizer(this.module, this.registrationProcessProvider.get(), this.authDataStorageProvider.get(), this.appInstallStorageProvider.get(), this.loggerProvider.get());
    }

    public static CoreAuthModule_ProvideAuthorizerFactory create(CoreAuthModule coreAuthModule, Provider<RegistrationApiDelegate> provider, Provider<AuthDataStorage> provider2, Provider<AppInstallStorage> provider3, Provider<Logger> provider4) {
        return new CoreAuthModule_ProvideAuthorizerFactory(coreAuthModule, provider, provider2, provider3, provider4);
    }

    public static Authorizer provideAuthorizer(CoreAuthModule coreAuthModule, RegistrationApiDelegate registrationApiDelegate, AuthDataStorage authDataStorage, AppInstallStorage appInstallStorage, Logger logger) {
        return (Authorizer) Preconditions.checkNotNullFromProvides(coreAuthModule.provideAuthorizer(registrationApiDelegate, authDataStorage, appInstallStorage, logger));
    }
}
