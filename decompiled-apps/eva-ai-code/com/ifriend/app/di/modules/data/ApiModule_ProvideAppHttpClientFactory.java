package com.ifriend.app.di.modules.data;

import com.ifriend.core.remote.interceptors.AuthorizationInterceptor;
import com.ifriend.core.remote.interceptors.TimeoutInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideAppHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<AuthorizationInterceptor> authorizationInterceptorProvider;
    private final ApiModule module;
    private final Provider<TimeoutInterceptor> timeoutInterceptorProvider;

    public ApiModule_ProvideAppHttpClientFactory(ApiModule apiModule, Provider<AuthorizationInterceptor> provider, Provider<TimeoutInterceptor> provider2) {
        this.module = apiModule;
        this.authorizationInterceptorProvider = provider;
        this.timeoutInterceptorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideAppHttpClient(this.module, this.authorizationInterceptorProvider.get(), this.timeoutInterceptorProvider.get());
    }

    public static ApiModule_ProvideAppHttpClientFactory create(ApiModule apiModule, Provider<AuthorizationInterceptor> provider, Provider<TimeoutInterceptor> provider2) {
        return new ApiModule_ProvideAppHttpClientFactory(apiModule, provider, provider2);
    }

    public static OkHttpClient provideAppHttpClient(ApiModule apiModule, AuthorizationInterceptor authorizationInterceptor, TimeoutInterceptor timeoutInterceptor) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(apiModule.provideAppHttpClient(authorizationInterceptor, timeoutInterceptor));
    }
}
