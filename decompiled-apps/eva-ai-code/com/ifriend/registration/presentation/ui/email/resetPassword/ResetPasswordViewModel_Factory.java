package com.ifriend.registration.presentation.ui.email.resetPassword;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ResetPasswordViewModel_Factory implements Factory<ResetPasswordViewModel> {
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<ResetPasswordRepository> resetPasswordRepositoryProvider;

    public ResetPasswordViewModel_Factory(Provider<ResetPasswordRepository> provider, Provider<InternalNotificationHandler> provider2, Provider<CoroutineDispatchers> provider3) {
        this.resetPasswordRepositoryProvider = provider;
        this.internalNotificationHandlerProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ResetPasswordViewModel get() {
        return newInstance(this.resetPasswordRepositoryProvider.get(), this.internalNotificationHandlerProvider.get(), this.dispatchersProvider.get());
    }

    public static ResetPasswordViewModel_Factory create(Provider<ResetPasswordRepository> provider, Provider<InternalNotificationHandler> provider2, Provider<CoroutineDispatchers> provider3) {
        return new ResetPasswordViewModel_Factory(provider, provider2, provider3);
    }

    public static ResetPasswordViewModel newInstance(ResetPasswordRepository resetPasswordRepository, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers coroutineDispatchers) {
        return new ResetPasswordViewModel(resetPasswordRepository, internalNotificationHandler, coroutineDispatchers);
    }
}
