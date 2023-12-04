package com.ifriend.data.repository.guide;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserGuideRepositoryImpl_Factory implements Factory<UserGuideRepositoryImpl> {
    private final Provider<DataStore<Preferences>> dataStoreProvider;

    public UserGuideRepositoryImpl_Factory(Provider<DataStore<Preferences>> provider) {
        this.dataStoreProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserGuideRepositoryImpl get() {
        return newInstance(this.dataStoreProvider.get());
    }

    public static UserGuideRepositoryImpl_Factory create(Provider<DataStore<Preferences>> provider) {
        return new UserGuideRepositoryImpl_Factory(provider);
    }

    public static UserGuideRepositoryImpl newInstance(DataStore<Preferences> dataStore) {
        return new UserGuideRepositoryImpl(dataStore);
    }
}
