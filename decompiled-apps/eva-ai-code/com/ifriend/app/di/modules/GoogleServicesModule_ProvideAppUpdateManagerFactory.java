package com.ifriend.app.di.modules;

import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GoogleServicesModule_ProvideAppUpdateManagerFactory implements Factory<AppUpdateManager> {
    private final Provider<Context> contextProvider;
    private final GoogleServicesModule module;

    public GoogleServicesModule_ProvideAppUpdateManagerFactory(GoogleServicesModule googleServicesModule, Provider<Context> provider) {
        this.module = googleServicesModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppUpdateManager get() {
        return provideAppUpdateManager(this.module, this.contextProvider.get());
    }

    public static GoogleServicesModule_ProvideAppUpdateManagerFactory create(GoogleServicesModule googleServicesModule, Provider<Context> provider) {
        return new GoogleServicesModule_ProvideAppUpdateManagerFactory(googleServicesModule, provider);
    }

    public static AppUpdateManager provideAppUpdateManager(GoogleServicesModule googleServicesModule, Context context) {
        return (AppUpdateManager) Preconditions.checkNotNullFromProvides(googleServicesModule.provideAppUpdateManager(context));
    }
}
