package com.ifriend.core.tools.impl;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class AppIdentityConverterImpl_Factory implements Factory<AppIdentityConverterImpl> {
    @Override // javax.inject.Provider
    public AppIdentityConverterImpl get() {
        return newInstance();
    }

    public static AppIdentityConverterImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppIdentityConverterImpl newInstance() {
        return new AppIdentityConverterImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final AppIdentityConverterImpl_Factory INSTANCE = new AppIdentityConverterImpl_Factory();

        private InstanceHolder() {
        }
    }
}
