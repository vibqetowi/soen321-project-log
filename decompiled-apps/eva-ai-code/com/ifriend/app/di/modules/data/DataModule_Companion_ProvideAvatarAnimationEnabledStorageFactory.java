package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.storage.AvatarAnimationEnabledStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory implements Factory<AvatarAnimationEnabledStorage> {
    private final Provider<Preferences> preferencesProvider;

    public DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public AvatarAnimationEnabledStorage get() {
        return provideAvatarAnimationEnabledStorage(this.preferencesProvider.get());
    }

    public static DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory create(Provider<Preferences> provider) {
        return new DataModule_Companion_ProvideAvatarAnimationEnabledStorageFactory(provider);
    }

    public static AvatarAnimationEnabledStorage provideAvatarAnimationEnabledStorage(Preferences preferences) {
        return (AvatarAnimationEnabledStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAvatarAnimationEnabledStorage(preferences));
    }
}
