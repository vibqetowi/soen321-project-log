package com.ifiend.billing.impl.manager;

import android.content.Context;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class BillingManagerImpl_Factory implements Factory<BillingManagerImpl> {
    private final Provider<AppLoggerInteractor> appLoggerInteractorProvider;
    private final Provider<BillingResponseCodeMapper> billingResponseCodeMapperProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public BillingManagerImpl_Factory(Provider<Context> provider, Provider<AppLoggerInteractor> provider2, Provider<CoroutineScope> provider3, Provider<BillingResponseCodeMapper> provider4) {
        this.contextProvider = provider;
        this.appLoggerInteractorProvider = provider2;
        this.coroutineScopeProvider = provider3;
        this.billingResponseCodeMapperProvider = provider4;
    }

    @Override // javax.inject.Provider
    public BillingManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.appLoggerInteractorProvider.get(), this.coroutineScopeProvider.get(), this.billingResponseCodeMapperProvider.get());
    }

    public static BillingManagerImpl_Factory create(Provider<Context> provider, Provider<AppLoggerInteractor> provider2, Provider<CoroutineScope> provider3, Provider<BillingResponseCodeMapper> provider4) {
        return new BillingManagerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static BillingManagerImpl newInstance(Context context, AppLoggerInteractor appLoggerInteractor, CoroutineScope coroutineScope, BillingResponseCodeMapper billingResponseCodeMapper) {
        return new BillingManagerImpl(context, appLoggerInteractor, coroutineScope, billingResponseCodeMapper);
    }
}
