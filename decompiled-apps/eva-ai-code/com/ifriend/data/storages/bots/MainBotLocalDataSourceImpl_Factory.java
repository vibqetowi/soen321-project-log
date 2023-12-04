package com.ifriend.data.storages.bots;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class MainBotLocalDataSourceImpl_Factory implements Factory<MainBotLocalDataSourceImpl> {
    @Override // javax.inject.Provider
    public MainBotLocalDataSourceImpl get() {
        return newInstance();
    }

    public static MainBotLocalDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainBotLocalDataSourceImpl newInstance() {
        return new MainBotLocalDataSourceImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MainBotLocalDataSourceImpl_Factory INSTANCE = new MainBotLocalDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }
}
