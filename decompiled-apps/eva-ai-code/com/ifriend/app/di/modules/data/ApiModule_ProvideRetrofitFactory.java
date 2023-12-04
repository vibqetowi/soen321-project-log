package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final ApiModule module;
    private final Provider<String> urlProvider;

    public ApiModule_ProvideRetrofitFactory(ApiModule apiModule, Provider<String> provider, Provider<Context> provider2, Provider<Logger> provider3) {
        this.module = apiModule;
        this.urlProvider = provider;
        this.contextProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideRetrofit(this.module, this.urlProvider.get(), this.contextProvider.get(), this.loggerProvider.get());
    }

    public static ApiModule_ProvideRetrofitFactory create(ApiModule apiModule, Provider<String> provider, Provider<Context> provider2, Provider<Logger> provider3) {
        return new ApiModule_ProvideRetrofitFactory(apiModule, provider, provider2, provider3);
    }

    public static Retrofit provideRetrofit(ApiModule apiModule, String str, Context context, Logger logger) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(apiModule.provideRetrofit(str, context, logger));
    }
}
