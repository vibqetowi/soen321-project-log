package com.ifriend.chat.presentation.di;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ActivityModule_ProvideResourcesFactory implements Factory<Resources> {
    private final Provider<AppCompatActivity> activityProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideResourcesFactory(ActivityModule activityModule, Provider<AppCompatActivity> provider) {
        this.module = activityModule;
        this.activityProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.module, this.activityProvider.get());
    }

    public static ActivityModule_ProvideResourcesFactory create(ActivityModule activityModule, Provider<AppCompatActivity> provider) {
        return new ActivityModule_ProvideResourcesFactory(activityModule, provider);
    }

    public static Resources provideResources(ActivityModule activityModule, AppCompatActivity appCompatActivity) {
        return (Resources) Preconditions.checkNotNullFromProvides(activityModule.provideResources(appCompatActivity));
    }
}
