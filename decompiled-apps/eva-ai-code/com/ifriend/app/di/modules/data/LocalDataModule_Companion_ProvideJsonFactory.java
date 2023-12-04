package com.ifriend.app.di.modules.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;
/* loaded from: classes6.dex */
public final class LocalDataModule_Companion_ProvideJsonFactory implements Factory<Json> {
    @Override // javax.inject.Provider
    public Json get() {
        return provideJson();
    }

    public static LocalDataModule_Companion_ProvideJsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Json provideJson() {
        return (Json) Preconditions.checkNotNullFromProvides(LocalDataModule.Companion.provideJson());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final LocalDataModule_Companion_ProvideJsonFactory INSTANCE = new LocalDataModule_Companion_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }
}
