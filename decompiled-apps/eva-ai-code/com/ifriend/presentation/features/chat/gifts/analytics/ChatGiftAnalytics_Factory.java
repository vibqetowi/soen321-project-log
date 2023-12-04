package com.ifriend.presentation.features.chat.gifts.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatGiftAnalytics_Factory implements Factory<ChatGiftAnalytics> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;

    public ChatGiftAnalytics_Factory(Provider<AnalyticsInteractor> provider) {
        this.analyticsInteractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatGiftAnalytics get() {
        return newInstance(this.analyticsInteractorProvider.get());
    }

    public static ChatGiftAnalytics_Factory create(Provider<AnalyticsInteractor> provider) {
        return new ChatGiftAnalytics_Factory(provider);
    }

    public static ChatGiftAnalytics newInstance(AnalyticsInteractor analyticsInteractor) {
        return new ChatGiftAnalytics(analyticsInteractor);
    }
}
