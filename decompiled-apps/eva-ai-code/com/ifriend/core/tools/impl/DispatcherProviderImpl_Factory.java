package com.ifriend.core.tools.impl;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class DispatcherProviderImpl_Factory implements Factory<DispatcherProviderImpl> {
    @Override // javax.inject.Provider
    public DispatcherProviderImpl get() {
        return newInstance();
    }

    public static DispatcherProviderImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DispatcherProviderImpl newInstance() {
        return new DispatcherProviderImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DispatcherProviderImpl_Factory INSTANCE = new DispatcherProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
