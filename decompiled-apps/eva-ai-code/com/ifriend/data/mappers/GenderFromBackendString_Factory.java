package com.ifriend.data.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class GenderFromBackendString_Factory implements Factory<GenderFromBackendString> {
    @Override // javax.inject.Provider
    public GenderFromBackendString get() {
        return newInstance();
    }

    public static GenderFromBackendString_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GenderFromBackendString newInstance() {
        return new GenderFromBackendString();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final GenderFromBackendString_Factory INSTANCE = new GenderFromBackendString_Factory();

        private InstanceHolder() {
        }
    }
}
