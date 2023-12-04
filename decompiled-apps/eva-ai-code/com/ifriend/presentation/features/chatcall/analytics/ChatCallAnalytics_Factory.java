package com.ifriend.presentation.features.chatcall.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatCallAnalytics_Factory implements Factory<ChatCallAnalytics> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;

    public ChatCallAnalytics_Factory(Provider<AnalyticsInteractor> provider) {
        this.analyticsInteractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatCallAnalytics get() {
        return newInstance(this.analyticsInteractorProvider.get());
    }

    public static ChatCallAnalytics_Factory create(Provider<AnalyticsInteractor> provider) {
        return new ChatCallAnalytics_Factory(provider);
    }

    public static ChatCallAnalytics newInstance(AnalyticsInteractor analyticsInteractor) {
        return new ChatCallAnalytics(analyticsInteractor);
    }
}
