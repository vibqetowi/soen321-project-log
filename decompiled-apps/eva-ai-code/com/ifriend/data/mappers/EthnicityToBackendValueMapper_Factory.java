package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class EthnicityToBackendValueMapper_Factory implements Factory<EthnicityToBackendValueMapper> {
    @Override // javax.inject.Provider
    public EthnicityToBackendValueMapper get() {
        return newInstance();
    }

    public static EthnicityToBackendValueMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EthnicityToBackendValueMapper newInstance() {
        return new EthnicityToBackendValueMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final EthnicityToBackendValueMapper_Factory INSTANCE = new EthnicityToBackendValueMapper_Factory();

        private InstanceHolder() {
        }
    }
}
