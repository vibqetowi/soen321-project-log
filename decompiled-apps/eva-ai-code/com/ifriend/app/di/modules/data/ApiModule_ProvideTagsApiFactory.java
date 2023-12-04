package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.TagsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideTagsApiFactory implements Factory<TagsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideTagsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public TagsApi get() {
        return provideTagsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideTagsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideTagsApiFactory(apiModule, provider);
    }

    public static TagsApi provideTagsApi(ApiModule apiModule, Retrofit retrofit) {
        return (TagsApi) Preconditions.checkNotNullFromProvides(apiModule.provideTagsApi(retrofit));
    }
}
