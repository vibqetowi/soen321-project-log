package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.data.storages.sharedPreferences.SecurePreferencesService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PreferencesModule_ProvideSecurePreferencesFactory implements Factory<SecurePreferencesService> {
    private final Provider<Context> contextProvider;
    private final PreferencesModule module;

    public PreferencesModule_ProvideSecurePreferencesFactory(PreferencesModule preferencesModule, Provider<Context> provider) {
        this.module = preferencesModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public SecurePreferencesService get() {
        return provideSecurePreferences(this.module, this.contextProvider.get());
    }

    public static PreferencesModule_ProvideSecurePreferencesFactory create(PreferencesModule preferencesModule, Provider<Context> provider) {
        return new PreferencesModule_ProvideSecurePreferencesFactory(preferencesModule, provider);
    }

    public static SecurePreferencesService provideSecurePreferences(PreferencesModule preferencesModule, Context context) {
        return (SecurePreferencesService) Preconditions.checkNotNullFromProvides(preferencesModule.provideSecurePreferences(context));
    }
}
