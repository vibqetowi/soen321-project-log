package com.ifriend.chat.new_chat.list.viewModel.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatListAnalytics_Factory implements Factory<ChatListAnalytics> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;

    public ChatListAnalytics_Factory(Provider<AnalyticsInteractor> provider) {
        this.analyticsInteractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatListAnalytics get() {
        return newInstance(this.analyticsInteractorProvider.get());
    }

    public static ChatListAnalytics_Factory create(Provider<AnalyticsInteractor> provider) {
        return new ChatListAnalytics_Factory(provider);
    }

    public static ChatListAnalytics newInstance(AnalyticsInteractor analyticsInteractor) {
        return new ChatListAnalytics(analyticsInteractor);
    }
}
