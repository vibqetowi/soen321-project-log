package com.ifriend.platform.tools.impl.permissions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PermissionProviderImpl_Factory implements Factory<PermissionProviderImpl> {
    private final Provider<Context> contextProvider;

    public PermissionProviderImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PermissionProviderImpl get() {
        return newInstance(this.contextProvider.get());
    }

    public static PermissionProviderImpl_Factory create(Provider<Context> provider) {
        return new PermissionProviderImpl_Factory(provider);
    }

    public static PermissionProviderImpl newInstance(Context context) {
        return new PermissionProviderImpl(context);
    }
}
