package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.storage.EventDelayStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideEventDelayStorageFactory implements Factory<EventDelayStorage> {
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_ProvideEventDelayStorageFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public EventDelayStorage get() {
        return provideEventDelayStorage(this.preferencesProvider.get());
    }

    public static DataModule_Companion_ProvideEventDelayStorageFactory create(Provider<Preferences> provider) {
        return new DataModule_Companion_ProvideEventDelayStorageFactory(provider);
    }

    public static EventDelayStorage provideEventDelayStorage(Preferences preferences) {
        return (EventDelayStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideEventDelayStorage(preferences));
    }
}
