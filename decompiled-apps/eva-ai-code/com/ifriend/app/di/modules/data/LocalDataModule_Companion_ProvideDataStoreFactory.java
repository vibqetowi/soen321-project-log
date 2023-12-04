package com.ifriend.app.di.modules.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LocalDataModule_Companion_ProvideDataStoreFactory implements Factory<DataStore<Preferences>> {
    private final Provider<Context> contextProvider;

    public LocalDataModule_Companion_ProvideDataStoreFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DataStore<Preferences> get() {
        return provideDataStore(this.contextProvider.get());
    }

    public static LocalDataModule_Companion_ProvideDataStoreFactory create(Provider<Context> provider) {
        return new LocalDataModule_Companion_ProvideDataStoreFactory(provider);
    }

    public static DataStore<Preferences> provideDataStore(Context context) {
        return (DataStore) Preconditions.checkNotNullFromProvides(LocalDataModule.Companion.provideDataStore(context));
    }
}
