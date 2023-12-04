package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.diary.DiaryApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideDiaryApiFactory implements Factory<DiaryApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideDiaryApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public DiaryApi get() {
        return provideDiaryApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideDiaryApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideDiaryApiFactory(apiModule, provider);
    }

    public static DiaryApi provideDiaryApi(ApiModule apiModule, Retrofit retrofit) {
        return (DiaryApi) Preconditions.checkNotNullFromProvides(apiModule.provideDiaryApi(retrofit));
    }
}
