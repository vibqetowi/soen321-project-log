package com.ifriend.presentation.analytics;

import com.ifriend.analytics.AnalyticsEngine;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPhotoAnalytics_Factory implements Factory<ChatPhotoAnalytics> {
    private final Provider<AnalyticsEngine> analyticsProvider;

    public ChatPhotoAnalytics_Factory(Provider<AnalyticsEngine> provider) {
        this.analyticsProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatPhotoAnalytics get() {
        return newInstance(this.analyticsProvider.get());
    }

    public static ChatPhotoAnalytics_Factory create(Provider<AnalyticsEngine> provider) {
        return new ChatPhotoAnalytics_Factory(provider);
    }

    public static ChatPhotoAnalytics newInstance(AnalyticsEngine analyticsEngine) {
        return new ChatPhotoAnalytics(analyticsEngine);
    }
}
