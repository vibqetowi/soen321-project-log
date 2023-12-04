package com.ifriend.chat.new_chat.list.player;

import com.ifriend.common_utils.Logger;
import com.ifriend.ui.recyclerView.audio.ChatAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AudioMessageChatAnalytics_Factory implements Factory<AudioMessageChatAnalytics> {
    private final Provider<ChatAnalytics> analyticsProvider;
    private final Provider<Logger> loggerProvider;

    public AudioMessageChatAnalytics_Factory(Provider<ChatAnalytics> provider, Provider<Logger> provider2) {
        this.analyticsProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AudioMessageChatAnalytics get() {
        return newInstance(this.analyticsProvider.get(), this.loggerProvider.get());
    }

    public static AudioMessageChatAnalytics_Factory create(Provider<ChatAnalytics> provider, Provider<Logger> provider2) {
        return new AudioMessageChatAnalytics_Factory(provider, provider2);
    }

    public static AudioMessageChatAnalytics newInstance(ChatAnalytics chatAnalytics, Logger logger) {
        return new AudioMessageChatAnalytics(chatAnalytics, logger);
    }
}
