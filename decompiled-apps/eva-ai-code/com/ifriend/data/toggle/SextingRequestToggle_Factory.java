package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SextingRequestToggle_Factory implements Factory<SextingRequestToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public SextingRequestToggle_Factory(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SextingRequestToggle get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SextingRequestToggle_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new SextingRequestToggle_Factory(provider, provider2);
    }

    public static SextingRequestToggle newInstance(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return new SextingRequestToggle(appConfigLocalDataSource, coroutineScope);
    }
}
