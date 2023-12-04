package com.ifriend.app.di.modules.data;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class DataToolsModule_Companion_ProvideGsonFactory implements Factory<Gson> {
    @Override // javax.inject.Provider
    public Gson get() {
        return provideGson();
    }

    public static DataToolsModule_Companion_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Gson provideGson() {
        return (Gson) Preconditions.checkNotNullFromProvides(DataToolsModule.Companion.provideGson());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DataToolsModule_Companion_ProvideGsonFactory INSTANCE = new DataToolsModule_Companion_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }
}
