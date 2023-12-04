package com.ifriend.app.di.modules.data.core;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.interceptors.AuthorizationInterceptor;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
/* compiled from: InterceptorsModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/app/di/modules/data/core/InterceptorsModule;", "", "()V", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesAuthorizationInterceptor", "Lcom/ifriend/core/remote/interceptors/AuthorizationInterceptor;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class InterceptorsModule {
    @Provides
    @Singleton
    public final AuthorizationInterceptor providesAuthorizationInterceptor(AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        return new AuthorizationInterceptor(authLocalDataSource);
    }

    @Provides
    @Singleton
    public final HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }
}
