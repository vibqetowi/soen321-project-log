package com.ifriend.data.storages.config;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class AppConfigLocalDataSourceImpl_Factory implements Factory<AppConfigLocalDataSourceImpl> {
    @Override // javax.inject.Provider
    public AppConfigLocalDataSourceImpl get() {
        return newInstance();
    }

    public static AppConfigLocalDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppConfigLocalDataSourceImpl newInstance() {
        return new AppConfigLocalDataSourceImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final AppConfigLocalDataSourceImpl_Factory INSTANCE = new AppConfigLocalDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }
}
