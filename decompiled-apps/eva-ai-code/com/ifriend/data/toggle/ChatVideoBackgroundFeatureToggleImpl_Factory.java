package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatVideoBackgroundFeatureToggleImpl_Factory implements Factory<ChatVideoBackgroundFeatureToggleImpl> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public ChatVideoBackgroundFeatureToggleImpl_Factory(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatVideoBackgroundFeatureToggleImpl get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static ChatVideoBackgroundFeatureToggleImpl_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new ChatVideoBackgroundFeatureToggleImpl_Factory(provider, provider2);
    }

    public static ChatVideoBackgroundFeatureToggleImpl newInstance(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return new ChatVideoBackgroundFeatureToggleImpl(appConfigLocalDataSource, coroutineScope);
    }
}
