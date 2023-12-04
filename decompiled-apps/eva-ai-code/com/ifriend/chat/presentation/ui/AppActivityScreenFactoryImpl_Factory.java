package com.ifriend.chat.presentation.ui;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class AppActivityScreenFactoryImpl_Factory implements Factory<AppActivityScreenFactoryImpl> {
    @Override // javax.inject.Provider
    public AppActivityScreenFactoryImpl get() {
        return newInstance();
    }

    public static AppActivityScreenFactoryImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppActivityScreenFactoryImpl newInstance() {
        return new AppActivityScreenFactoryImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final AppActivityScreenFactoryImpl_Factory INSTANCE = new AppActivityScreenFactoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
