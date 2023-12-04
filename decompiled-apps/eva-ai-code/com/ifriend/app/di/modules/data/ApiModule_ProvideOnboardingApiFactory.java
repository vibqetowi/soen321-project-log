package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideOnboardingApiFactory implements Factory<OnboardingApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideOnboardingApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnboardingApi get() {
        return provideOnboardingApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideOnboardingApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideOnboardingApiFactory(apiModule, provider);
    }

    public static OnboardingApi provideOnboardingApi(ApiModule apiModule, Retrofit retrofit) {
        return (OnboardingApi) Preconditions.checkNotNullFromProvides(apiModule.provideOnboardingApi(retrofit));
    }
}
