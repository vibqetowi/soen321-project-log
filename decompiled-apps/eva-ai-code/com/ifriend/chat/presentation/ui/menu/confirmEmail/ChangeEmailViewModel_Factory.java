package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import com.ifriend.analytics.usecase.confirmEmail.AnalyticsEmailChangedUseCase;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChangeEmailViewModel_Factory implements Factory<ChangeEmailViewModel> {
    private final Provider<AnalyticsEmailChangedUseCase> analyticsEmailChangedUseCaseProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<SendConfirmationEmailUseCase> sendConfirmationEmailUseCaseProvider;

    public ChangeEmailViewModel_Factory(Provider<SendConfirmationEmailUseCase> provider, Provider<CoroutineScope> provider2, Provider<AnalyticsEmailChangedUseCase> provider3, Provider<CoroutineDispatchers> provider4) {
        this.sendConfirmationEmailUseCaseProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.analyticsEmailChangedUseCaseProvider = provider3;
        this.coroutineDispatchersProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChangeEmailViewModel get() {
        return newInstance(this.sendConfirmationEmailUseCaseProvider.get(), this.coroutineScopeProvider.get(), this.analyticsEmailChangedUseCaseProvider.get(), this.coroutineDispatchersProvider.get());
    }

    public static ChangeEmailViewModel_Factory create(Provider<SendConfirmationEmailUseCase> provider, Provider<CoroutineScope> provider2, Provider<AnalyticsEmailChangedUseCase> provider3, Provider<CoroutineDispatchers> provider4) {
        return new ChangeEmailViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static ChangeEmailViewModel newInstance(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, CoroutineScope coroutineScope, AnalyticsEmailChangedUseCase analyticsEmailChangedUseCase, CoroutineDispatchers coroutineDispatchers) {
        return new ChangeEmailViewModel(sendConfirmationEmailUseCase, coroutineScope, analyticsEmailChangedUseCase, coroutineDispatchers);
    }
}
