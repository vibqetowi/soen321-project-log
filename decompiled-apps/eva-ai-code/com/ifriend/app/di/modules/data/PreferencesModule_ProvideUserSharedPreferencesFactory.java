package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PreferencesModule_ProvideUserSharedPreferencesFactory implements Factory<Preferences> {
    private final Provider<Context> contextProvider;
    private final PreferencesModule module;

    public PreferencesModule_ProvideUserSharedPreferencesFactory(PreferencesModule preferencesModule, Provider<Context> provider) {
        this.module = preferencesModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Preferences get() {
        return provideUserSharedPreferences(this.module, this.contextProvider.get());
    }

    public static PreferencesModule_ProvideUserSharedPreferencesFactory create(PreferencesModule preferencesModule, Provider<Context> provider) {
        return new PreferencesModule_ProvideUserSharedPreferencesFactory(preferencesModule, provider);
    }

    public static Preferences provideUserSharedPreferences(PreferencesModule preferencesModule, Context context) {
        return (Preferences) Preconditions.checkNotNullFromProvides(preferencesModule.provideUserSharedPreferences(context));
    }
}
