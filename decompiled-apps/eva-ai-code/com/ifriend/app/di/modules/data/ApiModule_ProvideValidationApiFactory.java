package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.ValidationApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideValidationApiFactory implements Factory<ValidationApi> {
    private final Provider<Context> contextProvider;
    private final Provider<Logger> loggerProvider;
    private final ApiModule module;
    private final Provider<String> urlProvider;

    public ApiModule_ProvideValidationApiFactory(ApiModule apiModule, Provider<String> provider, Provider<Context> provider2, Provider<Logger> provider3) {
        this.module = apiModule;
        this.urlProvider = provider;
        this.contextProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ValidationApi get() {
        return provideValidationApi(this.module, this.urlProvider.get(), this.contextProvider.get(), this.loggerProvider.get());
    }

    public static ApiModule_ProvideValidationApiFactory create(ApiModule apiModule, Provider<String> provider, Provider<Context> provider2, Provider<Logger> provider3) {
        return new ApiModule_ProvideValidationApiFactory(apiModule, provider, provider2, provider3);
    }

    public static ValidationApi provideValidationApi(ApiModule apiModule, String str, Context context, Logger logger) {
        return (ValidationApi) Preconditions.checkNotNullFromProvides(apiModule.provideValidationApi(str, context, logger));
    }
}
