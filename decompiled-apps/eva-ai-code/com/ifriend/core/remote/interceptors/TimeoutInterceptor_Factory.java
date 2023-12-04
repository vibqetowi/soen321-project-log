package com.ifriend.core.remote.interceptors;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class TimeoutInterceptor_Factory implements Factory<TimeoutInterceptor> {
    @Override // javax.inject.Provider
    public TimeoutInterceptor get() {
        return newInstance();
    }

    public static TimeoutInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TimeoutInterceptor newInstance() {
        return new TimeoutInterceptor();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final TimeoutInterceptor_Factory INSTANCE = new TimeoutInterceptor_Factory();

        private InstanceHolder() {
        }
    }
}
