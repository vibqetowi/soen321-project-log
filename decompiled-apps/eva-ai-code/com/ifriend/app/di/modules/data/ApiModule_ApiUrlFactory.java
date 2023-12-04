package com.ifriend.app.di.modules.data;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ApiModule_ApiUrlFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final ApiModule module;

    public ApiModule_ApiUrlFactory(ApiModule apiModule, Provider<Context> provider) {
        this.module = apiModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public String get() {
        return apiUrl(this.module, this.contextProvider.get());
    }

    public static ApiModule_ApiUrlFactory create(ApiModule apiModule, Provider<Context> provider) {
        return new ApiModule_ApiUrlFactory(apiModule, provider);
    }

    public static String apiUrl(ApiModule apiModule, Context context) {
        return (String) Preconditions.checkNotNullFromProvides(apiModule.apiUrl(context));
    }
}
