package com.ifriend.chat.presentation.di;

import androidx.appcompat.app.AppCompatActivity;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ActivityModule_ProvideAppCompatActivityFactory implements Factory<AppCompatActivity> {
    private final Provider<BaseActivity> baseActivityProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideAppCompatActivityFactory(ActivityModule activityModule, Provider<BaseActivity> provider) {
        this.module = activityModule;
        this.baseActivityProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppCompatActivity get() {
        return provideAppCompatActivity(this.module, this.baseActivityProvider.get());
    }

    public static ActivityModule_ProvideAppCompatActivityFactory create(ActivityModule activityModule, Provider<BaseActivity> provider) {
        return new ActivityModule_ProvideAppCompatActivityFactory(activityModule, provider);
    }

    public static AppCompatActivity provideAppCompatActivity(ActivityModule activityModule, BaseActivity baseActivity) {
        return (AppCompatActivity) Preconditions.checkNotNullFromProvides(activityModule.provideAppCompatActivity(baseActivity));
    }
}
