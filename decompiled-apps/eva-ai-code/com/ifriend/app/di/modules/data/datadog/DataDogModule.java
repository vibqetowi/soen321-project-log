package com.ifriend.app.di.modules.data.datadog;

import com.ifriend.app.di.modules.data.qualifier.DataDogHttpClientQualifier;
import com.ifriend.app.di.modules.data.qualifier.DataDogRetrofitClientQualifier;
import com.ifriend.core.remote.interceptors.DataDogAuthInterceptor;
import com.ifriend.core.remote.services.DataDogApiService;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: DataDogModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ifriend/app/di/modules/data/datadog/DataDogModule;", "", "()V", "provideDataDogApiService", "Lcom/ifriend/core/remote/services/DataDogApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideDataDogHttpClient", "Lokhttp3/OkHttpClient;", "dataDogAuthInterceptor", "Lcom/ifriend/core/remote/interceptors/DataDogAuthInterceptor;", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideDataDogRetrofit", "httpClient", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class DataDogModule {
    public static final Companion Companion = new Companion(null);
    private static final String DATADOG_HOST = "https://http-intake.logs.datadoghq.com";

    /* compiled from: DataDogModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/app/di/modules/data/datadog/DataDogModule$Companion;", "", "()V", "DATADOG_HOST", "", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Provides
    @Singleton
    @DataDogHttpClientQualifier
    public final OkHttpClient provideDataDogHttpClient(DataDogAuthInterceptor dataDogAuthInterceptor, HttpLoggingInterceptor httpLoggingInterceptor) {
        Intrinsics.checkNotNullParameter(dataDogAuthInterceptor, "dataDogAuthInterceptor");
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
        return new OkHttpClient.Builder().writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).retryOnConnectionFailure(true).addInterceptor(dataDogAuthInterceptor).addInterceptor(httpLoggingInterceptor).build();
    }

    @Provides
    @Singleton
    @DataDogRetrofitClientQualifier
    public final Retrofit provideDataDogRetrofit(@DataDogHttpClientQualifier OkHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Retrofit build = new Retrofit.Builder().baseUrl(DATADOG_HOST).client(httpClient).addConverterFactory(GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Provides
    @Singleton
    public final DataDogApiService provideDataDogApiService(@DataDogRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(DataDogApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (DataDogApiService) create;
    }
}
