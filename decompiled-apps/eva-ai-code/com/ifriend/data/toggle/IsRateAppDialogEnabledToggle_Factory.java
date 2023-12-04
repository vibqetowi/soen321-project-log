package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class IsRateAppDialogEnabledToggle_Factory implements Factory<IsRateAppDialogEnabledToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public IsRateAppDialogEnabledToggle_Factory(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public IsRateAppDialogEnabledToggle get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static IsRateAppDialogEnabledToggle_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new IsRateAppDialogEnabledToggle_Factory(provider, provider2);
    }

    public static IsRateAppDialogEnabledToggle newInstance(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return new IsRateAppDialogEnabledToggle(appConfigLocalDataSource, coroutineScope);
    }
}
