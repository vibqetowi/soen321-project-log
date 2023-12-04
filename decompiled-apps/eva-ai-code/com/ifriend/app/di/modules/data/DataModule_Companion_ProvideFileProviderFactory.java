package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.files.FileProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideFileProviderFactory implements Factory<FileProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public DataModule_Companion_ProvideFileProviderFactory(Provider<Context> provider, Provider<OkHttpClient> provider2, Provider<Logger> provider3, Provider<CoroutineDispatchers> provider4) {
        this.contextProvider = provider;
        this.okHttpClientProvider = provider2;
        this.loggerProvider = provider3;
        this.dispatchersProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FileProvider get() {
        return provideFileProvider(this.contextProvider.get(), this.okHttpClientProvider.get(), this.loggerProvider.get(), this.dispatchersProvider.get());
    }

    public static DataModule_Companion_ProvideFileProviderFactory create(Provider<Context> provider, Provider<OkHttpClient> provider2, Provider<Logger> provider3, Provider<CoroutineDispatchers> provider4) {
        return new DataModule_Companion_ProvideFileProviderFactory(provider, provider2, provider3, provider4);
    }

    public static FileProvider provideFileProvider(Context context, OkHttpClient okHttpClient, Logger logger, CoroutineDispatchers coroutineDispatchers) {
        return (FileProvider) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideFileProvider(context, okHttpClient, logger, coroutineDispatchers));
    }
}
