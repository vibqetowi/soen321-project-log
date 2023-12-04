package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final ApiModule module;

    public ApiModule_ProvideHttpClientFactory(ApiModule apiModule, Provider<Context> provider, Provider<Logger> provider2) {
        this.module = apiModule;
        this.contextProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideHttpClient(this.module, this.contextProvider.get(), this.loggerProvider.get());
    }

    public static ApiModule_ProvideHttpClientFactory create(ApiModule apiModule, Provider<Context> provider, Provider<Logger> provider2) {
        return new ApiModule_ProvideHttpClientFactory(apiModule, provider, provider2);
    }

    public static OkHttpClient provideHttpClient(ApiModule apiModule, Context context, Logger logger) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(apiModule.provideHttpClient(context, logger));
    }
}
