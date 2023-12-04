package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_AppInstallStorageFactory implements Factory<AppInstallStorage> {
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_AppInstallStorageFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppInstallStorage get() {
        return appInstallStorage(this.preferencesProvider.get());
    }

    public static DataModule_Companion_AppInstallStorageFactory create(Provider<Preferences> provider) {
        return new DataModule_Companion_AppInstallStorageFactory(provider);
    }

    public static AppInstallStorage appInstallStorage(Preferences preferences) {
        return (AppInstallStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.appInstallStorage(preferences));
    }
}
