package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory implements Factory<Preferences> {
    private final Provider<Context> contextProvider;
    private final PreferencesModule module;
    private final Provider<Preferences> userSessionSharedPreferencesProvider;

    public PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory(PreferencesModule preferencesModule, Provider<Context> provider, Provider<Preferences> provider2) {
        this.module = preferencesModule;
        this.contextProvider = provider;
        this.userSessionSharedPreferencesProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Preferences get() {
        return provideDeviceByUserSharedPreferences(this.module, this.contextProvider.get(), this.userSessionSharedPreferencesProvider.get());
    }

    public static PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory create(PreferencesModule preferencesModule, Provider<Context> provider, Provider<Preferences> provider2) {
        return new PreferencesModule_ProvideDeviceByUserSharedPreferencesFactory(preferencesModule, provider, provider2);
    }

    public static Preferences provideDeviceByUserSharedPreferences(PreferencesModule preferencesModule, Context context, Preferences preferences) {
        return (Preferences) Preconditions.checkNotNullFromProvides(preferencesModule.provideDeviceByUserSharedPreferences(context, preferences));
    }
}
