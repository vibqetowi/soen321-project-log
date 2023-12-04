package com.ifriend.data.mappers.featuretoggles;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class FeatureToggleBotIdsMapper_Factory implements Factory<FeatureToggleBotIdsMapper> {
    @Override // javax.inject.Provider
    public FeatureToggleBotIdsMapper get() {
        return newInstance();
    }

    public static FeatureToggleBotIdsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FeatureToggleBotIdsMapper newInstance() {
        return new FeatureToggleBotIdsMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final FeatureToggleBotIdsMapper_Factory INSTANCE = new FeatureToggleBotIdsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
