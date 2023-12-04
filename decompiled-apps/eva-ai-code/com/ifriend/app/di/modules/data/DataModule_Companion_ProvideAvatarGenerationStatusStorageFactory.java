package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatusStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory implements Factory<AvatarGenerationStatusStorage> {
    @Override // javax.inject.Provider
    public AvatarGenerationStatusStorage get() {
        return provideAvatarGenerationStatusStorage();
    }

    public static DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AvatarGenerationStatusStorage provideAvatarGenerationStatusStorage() {
        return (AvatarGenerationStatusStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAvatarGenerationStatusStorage());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory INSTANCE = new DataModule_Companion_ProvideAvatarGenerationStatusStorageFactory();

        private InstanceHolder() {
        }
    }
}
