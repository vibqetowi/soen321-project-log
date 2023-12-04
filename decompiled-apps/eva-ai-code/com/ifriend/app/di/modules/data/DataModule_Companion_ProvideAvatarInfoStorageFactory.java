package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.generateAvatar.AvatarInfoStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAvatarInfoStorageFactory implements Factory<AvatarInfoStorage> {
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_ProvideAvatarInfoStorageFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public AvatarInfoStorage get() {
        return provideAvatarInfoStorage(this.preferencesProvider.get());
    }

    public static DataModule_Companion_ProvideAvatarInfoStorageFactory create(Provider<Preferences> provider) {
        return new DataModule_Companion_ProvideAvatarInfoStorageFactory(provider);
    }

    public static AvatarInfoStorage provideAvatarInfoStorage(Preferences preferences) {
        return (AvatarInfoStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAvatarInfoStorage(preferences));
    }
}
