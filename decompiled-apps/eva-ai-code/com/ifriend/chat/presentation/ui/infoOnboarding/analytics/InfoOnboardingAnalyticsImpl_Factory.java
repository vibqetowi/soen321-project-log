package com.ifriend.chat.presentation.ui.infoOnboarding.analytics;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class InfoOnboardingAnalyticsImpl_Factory implements Factory<InfoOnboardingAnalyticsImpl> {
    @Override // javax.inject.Provider
    public InfoOnboardingAnalyticsImpl get() {
        return newInstance();
    }

    public static InfoOnboardingAnalyticsImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InfoOnboardingAnalyticsImpl newInstance() {
        return new InfoOnboardingAnalyticsImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final InfoOnboardingAnalyticsImpl_Factory INSTANCE = new InfoOnboardingAnalyticsImpl_Factory();

        private InstanceHolder() {
        }
    }
}
