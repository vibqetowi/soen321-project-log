package com.ifriend.presentation.analytics;

import com.ifriend.analytics.AnalyticsEngine;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatTopicsAnalytics_Factory implements Factory<ChatTopicsAnalytics> {
    private final Provider<AnalyticsEngine> analyticsProvider;

    public ChatTopicsAnalytics_Factory(Provider<AnalyticsEngine> provider) {
        this.analyticsProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatTopicsAnalytics get() {
        return newInstance(this.analyticsProvider.get());
    }

    public static ChatTopicsAnalytics_Factory create(Provider<AnalyticsEngine> provider) {
        return new ChatTopicsAnalytics_Factory(provider);
    }

    public static ChatTopicsAnalytics newInstance(AnalyticsEngine analyticsEngine) {
        return new ChatTopicsAnalytics(analyticsEngine);
    }
}
