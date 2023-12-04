package com.ifriend.popup.impl;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class PopupModelFactoryImpl_Factory implements Factory<PopupModelFactoryImpl> {
    @Override // javax.inject.Provider
    public PopupModelFactoryImpl get() {
        return newInstance();
    }

    public static PopupModelFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopupModelFactoryImpl newInstance() {
        return new PopupModelFactoryImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PopupModelFactoryImpl_Factory INSTANCE = new PopupModelFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
