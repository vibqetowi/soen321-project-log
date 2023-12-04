package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.data.storages.config.AppConfigStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAppConfigStorageFactory implements Factory<AppConfigStorage> {
    private final Provider<Context> contextProvider;

    public DataModule_Companion_ProvideAppConfigStorageFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppConfigStorage get() {
        return provideAppConfigStorage(this.contextProvider.get());
    }

    public static DataModule_Companion_ProvideAppConfigStorageFactory create(Provider<Context> provider) {
        return new DataModule_Companion_ProvideAppConfigStorageFactory(provider);
    }

    public static AppConfigStorage provideAppConfigStorage(Context context) {
        return (AppConfigStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAppConfigStorage(context));
    }
}
