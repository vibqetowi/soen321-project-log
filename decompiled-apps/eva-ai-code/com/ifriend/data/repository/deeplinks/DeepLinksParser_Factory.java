package com.ifriend.data.repository.deeplinks;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class DeepLinksParser_Factory implements Factory<DeepLinksParser> {
    @Override // javax.inject.Provider
    public DeepLinksParser get() {
        return newInstance();
    }

    public static DeepLinksParser_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeepLinksParser newInstance() {
        return new DeepLinksParser();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final DeepLinksParser_Factory INSTANCE = new DeepLinksParser_Factory();

        private InstanceHolder() {
        }
    }
}
