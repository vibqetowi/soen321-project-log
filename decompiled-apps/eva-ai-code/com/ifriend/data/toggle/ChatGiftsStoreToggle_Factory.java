package com.ifriend.data.toggle;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatGiftsStoreToggle_Factory implements Factory<ChatGiftsStoreToggle> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;

    public ChatGiftsStoreToggle_Factory(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        this.appConfigLocalDataSourceProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatGiftsStoreToggle get() {
        return newInstance(this.appConfigLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static ChatGiftsStoreToggle_Factory create(Provider<AppConfigLocalDataSource> provider, Provider<CoroutineScope> provider2) {
        return new ChatGiftsStoreToggle_Factory(provider, provider2);
    }

    public static ChatGiftsStoreToggle newInstance(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        return new ChatGiftsStoreToggle(appConfigLocalDataSource, coroutineScope);
    }
}
