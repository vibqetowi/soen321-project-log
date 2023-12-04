package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class GenderToBackendString_Factory implements Factory<GenderToBackendString> {
    @Override // javax.inject.Provider
    public GenderToBackendString get() {
        return newInstance();
    }

    public static GenderToBackendString_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GenderToBackendString newInstance() {
        return new GenderToBackendString();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final GenderToBackendString_Factory INSTANCE = new GenderToBackendString_Factory();

        private InstanceHolder() {
        }
    }
}
