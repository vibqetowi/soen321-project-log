package com.ifriend.platform.tools.impl;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppInfoProviderImpl_Factory implements Factory<AppInfoProviderImpl> {
    private final Provider<Context> contextProvider;

    public AppInfoProviderImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppInfoProviderImpl get() {
        return newInstance(this.contextProvider.get());
    }

    public static AppInfoProviderImpl_Factory create(Provider<Context> provider) {
        return new AppInfoProviderImpl_Factory(provider);
    }

    public static AppInfoProviderImpl newInstance(Context context) {
        return new AppInfoProviderImpl(context);
    }
}
