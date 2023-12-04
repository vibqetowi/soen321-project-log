package com.ifriend.chat.presentation.ui.onboarding.analytics;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class OnboardingAnalyticsImpl_Factory implements Factory<OnboardingAnalyticsImpl> {
    @Override // javax.inject.Provider
    public OnboardingAnalyticsImpl get() {
        return newInstance();
    }

    public static OnboardingAnalyticsImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnboardingAnalyticsImpl newInstance() {
        return new OnboardingAnalyticsImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final OnboardingAnalyticsImpl_Factory INSTANCE = new OnboardingAnalyticsImpl_Factory();

        private InstanceHolder() {
        }
    }
}
