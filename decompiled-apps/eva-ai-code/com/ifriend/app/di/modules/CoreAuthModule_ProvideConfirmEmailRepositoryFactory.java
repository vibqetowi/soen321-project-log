package com.ifriend.app.di.modules;

import com.ifriend.data.authorization.confirmEmail.ConfirmEmailApi;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideConfirmEmailRepositoryFactory implements Factory<ConfirmEmailRepository> {
    private final Provider<AuthDataStorage> authDataStorageProvider;
    private final Provider<ConfirmEmailApi> confirmEmailApiProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final CoreAuthModule module;

    public CoreAuthModule_ProvideConfirmEmailRepositoryFactory(CoreAuthModule coreAuthModule, Provider<ConfirmEmailApi> provider, Provider<AuthDataStorage> provider2, Provider<InternalNotificationHandler> provider3) {
        this.module = coreAuthModule;
        this.confirmEmailApiProvider = provider;
        this.authDataStorageProvider = provider2;
        this.internalNotificationHandlerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ConfirmEmailRepository get() {
        return provideConfirmEmailRepository(this.module, this.confirmEmailApiProvider.get(), this.authDataStorageProvider.get(), this.internalNotificationHandlerProvider.get());
    }

    public static CoreAuthModule_ProvideConfirmEmailRepositoryFactory create(CoreAuthModule coreAuthModule, Provider<ConfirmEmailApi> provider, Provider<AuthDataStorage> provider2, Provider<InternalNotificationHandler> provider3) {
        return new CoreAuthModule_ProvideConfirmEmailRepositoryFactory(coreAuthModule, provider, provider2, provider3);
    }

    public static ConfirmEmailRepository provideConfirmEmailRepository(CoreAuthModule coreAuthModule, ConfirmEmailApi confirmEmailApi, AuthDataStorage authDataStorage, InternalNotificationHandler internalNotificationHandler) {
        return (ConfirmEmailRepository) Preconditions.checkNotNullFromProvides(coreAuthModule.provideConfirmEmailRepository(confirmEmailApi, authDataStorage, internalNotificationHandler));
    }
}
