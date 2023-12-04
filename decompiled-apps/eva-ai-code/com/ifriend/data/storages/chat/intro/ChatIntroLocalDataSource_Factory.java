package com.ifriend.data.storages.chat.intro;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatIntroLocalDataSource_Factory implements Factory<ChatIntroLocalDataSource> {
    private final Provider<DataStore<Preferences>> dataStoreProvider;

    public ChatIntroLocalDataSource_Factory(Provider<DataStore<Preferences>> provider) {
        this.dataStoreProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatIntroLocalDataSource get() {
        return newInstance(this.dataStoreProvider.get());
    }

    public static ChatIntroLocalDataSource_Factory create(Provider<DataStore<Preferences>> provider) {
        return new ChatIntroLocalDataSource_Factory(provider);
    }

    public static ChatIntroLocalDataSource newInstance(DataStore<Preferences> dataStore) {
        return new ChatIntroLocalDataSource(dataStore);
    }
}
