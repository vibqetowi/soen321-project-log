package com.ifriend.data.exception.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class CoreExceptionMapper_Factory implements Factory<CoreExceptionMapper> {
    @Override // javax.inject.Provider
    public CoreExceptionMapper get() {
        return newInstance();
    }

    public static CoreExceptionMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoreExceptionMapper newInstance() {
        return new CoreExceptionMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final CoreExceptionMapper_Factory INSTANCE = new CoreExceptionMapper_Factory();

        private InstanceHolder() {
        }
    }
}
