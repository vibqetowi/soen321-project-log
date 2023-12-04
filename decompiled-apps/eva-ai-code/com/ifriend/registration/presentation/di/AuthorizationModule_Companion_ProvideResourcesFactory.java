package com.ifriend.registration.presentation.di;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideResourcesFactory implements Factory<Resources> {
    private final Provider<AppCompatActivity> activityProvider;

    public AuthorizationModule_Companion_ProvideResourcesFactory(Provider<AppCompatActivity> provider) {
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.activityProvider.get());
    }

    public static AuthorizationModule_Companion_ProvideResourcesFactory create(Provider<AppCompatActivity> provider) {
        return new AuthorizationModule_Companion_ProvideResourcesFactory(provider);
    }

    public static Resources provideResources(AppCompatActivity appCompatActivity) {
        return (Resources) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideResources(appCompatActivity));
    }
}
