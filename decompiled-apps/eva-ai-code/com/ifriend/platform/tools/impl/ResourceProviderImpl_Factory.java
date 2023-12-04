package com.ifriend.platform.tools.impl;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ResourceProviderImpl_Factory implements Factory<ResourceProviderImpl> {
    private final Provider<Context> contextProvider;

    public ResourceProviderImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ResourceProviderImpl get() {
        return newInstance(this.contextProvider.get());
    }

    public static ResourceProviderImpl_Factory create(Provider<Context> provider) {
        return new ResourceProviderImpl_Factory(provider);
    }

    public static ResourceProviderImpl newInstance(Context context) {
        return new ResourceProviderImpl(context);
    }
}
