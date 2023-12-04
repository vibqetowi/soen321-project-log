package com.ifriend.presentation.features.chat.panel.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPremiumTopicMapperUi_Factory implements Factory<ChatPremiumTopicMapperUi> {
    private final Provider<TopicIconMapperUi> topicIconMapperUiProvider;

    public ChatPremiumTopicMapperUi_Factory(Provider<TopicIconMapperUi> provider) {
        this.topicIconMapperUiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatPremiumTopicMapperUi get() {
        return newInstance(this.topicIconMapperUiProvider.get());
    }

    public static ChatPremiumTopicMapperUi_Factory create(Provider<TopicIconMapperUi> provider) {
        return new ChatPremiumTopicMapperUi_Factory(provider);
    }

    public static ChatPremiumTopicMapperUi newInstance(TopicIconMapperUi topicIconMapperUi) {
        return new ChatPremiumTopicMapperUi(topicIconMapperUi);
    }
}
