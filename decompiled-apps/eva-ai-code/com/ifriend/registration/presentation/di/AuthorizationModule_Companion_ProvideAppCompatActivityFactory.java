package com.ifriend.registration.presentation.di;

import androidx.appcompat.app.AppCompatActivity;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideAppCompatActivityFactory implements Factory<AppCompatActivity> {
    private final Provider<BaseActivity> baseActivityProvider;

    public AuthorizationModule_Companion_ProvideAppCompatActivityFactory(Provider<BaseActivity> provider) {
        this.baseActivityProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppCompatActivity get() {
        return provideAppCompatActivity(this.baseActivityProvider.get());
    }

    public static AuthorizationModule_Companion_ProvideAppCompatActivityFactory create(Provider<BaseActivity> provider) {
        return new AuthorizationModule_Companion_ProvideAppCompatActivityFactory(provider);
    }

    public static AppCompatActivity provideAppCompatActivity(BaseActivity baseActivity) {
        return (AppCompatActivity) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideAppCompatActivity(baseActivity));
    }
}
