package com.ifriend.app.di.modules.data.core;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LocalDataSourceModule_Companion_ProviderUserPreferencesFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public LocalDataSourceModule_Companion_ProviderUserPreferencesFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return providerUserPreferences(this.contextProvider.get());
    }

    public static LocalDataSourceModule_Companion_ProviderUserPreferencesFactory create(Provider<Context> provider) {
        return new LocalDataSourceModule_Companion_ProviderUserPreferencesFactory(provider);
    }

    public static SharedPreferences providerUserPreferences(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(LocalDataSourceModule.Companion.providerUserPreferences(context));
    }
}
