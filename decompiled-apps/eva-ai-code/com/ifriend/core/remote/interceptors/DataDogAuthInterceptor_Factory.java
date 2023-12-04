package com.ifriend.core.remote.interceptors;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class DataDogAuthInterceptor_Factory implements Factory<DataDogAuthInterceptor> {
    @Override // javax.inject.Provider
    public DataDogAuthInterceptor get() {
        return newInstance();
    }

    public static DataDogAuthInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DataDogAuthInterceptor newInstance() {
        return new DataDogAuthInterceptor();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DataDogAuthInterceptor_Factory INSTANCE = new DataDogAuthInterceptor_Factory();

        private InstanceHolder() {
        }
    }
}
