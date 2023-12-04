package com.ifriend.popup.impl;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class PopupFragmentFactoryImpl_Factory implements Factory<PopupFragmentFactoryImpl> {
    @Override // javax.inject.Provider
    public PopupFragmentFactoryImpl get() {
        return newInstance();
    }

    public static PopupFragmentFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PopupFragmentFactoryImpl newInstance() {
        return new PopupFragmentFactoryImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final PopupFragmentFactoryImpl_Factory INSTANCE = new PopupFragmentFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
