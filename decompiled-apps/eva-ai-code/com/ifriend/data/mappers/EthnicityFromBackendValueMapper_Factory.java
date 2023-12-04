package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class EthnicityFromBackendValueMapper_Factory implements Factory<EthnicityFromBackendValueMapper> {
    @Override // javax.inject.Provider
    public EthnicityFromBackendValueMapper get() {
        return newInstance();
    }

    public static EthnicityFromBackendValueMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EthnicityFromBackendValueMapper newInstance() {
        return new EthnicityFromBackendValueMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final EthnicityFromBackendValueMapper_Factory INSTANCE = new EthnicityFromBackendValueMapper_Factory();

        private InstanceHolder() {
        }
    }
}
