package com.ifriend.app.di.modules.data.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;
/* loaded from: classes6.dex */
public final class InterceptorsModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
    private final InterceptorsModule module;

    public InterceptorsModule_ProvideHttpLoggingInterceptorFactory(InterceptorsModule interceptorsModule) {
        this.module = interceptorsModule;
    }

    @Override // javax.inject.Provider
    public HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor(this.module);
    }

    public static InterceptorsModule_ProvideHttpLoggingInterceptorFactory create(InterceptorsModule interceptorsModule) {
        return new InterceptorsModule_ProvideHttpLoggingInterceptorFactory(interceptorsModule);
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor(InterceptorsModule interceptorsModule) {
        return (HttpLoggingInterceptor) Preconditions.checkNotNullFromProvides(interceptorsModule.provideHttpLoggingInterceptor());
    }
}
