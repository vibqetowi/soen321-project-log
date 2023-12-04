package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.useCases.AppConfigUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PurchaseInfoDelegateImpl_Factory implements Factory<PurchaseInfoDelegateImpl> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;

    public PurchaseInfoDelegateImpl_Factory(Provider<AppConfigUseCase> provider) {
        this.appConfigUseCaseProvider = provider;
    }

    @Override // javax.inject.Provider
    public PurchaseInfoDelegateImpl get() {
        return newInstance(this.appConfigUseCaseProvider.get());
    }

    public static PurchaseInfoDelegateImpl_Factory create(Provider<AppConfigUseCase> provider) {
        return new PurchaseInfoDelegateImpl_Factory(provider);
    }

    public static PurchaseInfoDelegateImpl newInstance(AppConfigUseCase appConfigUseCase) {
        return new PurchaseInfoDelegateImpl(appConfigUseCase);
    }
}
