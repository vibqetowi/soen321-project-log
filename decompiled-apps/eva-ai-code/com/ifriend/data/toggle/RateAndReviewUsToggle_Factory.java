package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class RateAndReviewUsToggle_Factory implements Factory<RateAndReviewUsToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public RateAndReviewUsToggle_Factory(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RateAndReviewUsToggle get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static RateAndReviewUsToggle_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new RateAndReviewUsToggle_Factory(provider, provider2);
    }

    public static RateAndReviewUsToggle newInstance(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return new RateAndReviewUsToggle(appConfigLocalDataSource, coroutineScope);
    }
}
