package com.ifriend.presentation.features.chat.panel.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatTopicMapperUi_Factory implements Factory<ChatTopicMapperUi> {
    private final Provider<TopicIconMapperUi> topicIconMapperUiProvider;

    public ChatTopicMapperUi_Factory(Provider<TopicIconMapperUi> provider) {
        this.topicIconMapperUiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatTopicMapperUi get() {
        return newInstance(this.topicIconMapperUiProvider.get());
    }

    public static ChatTopicMapperUi_Factory create(Provider<TopicIconMapperUi> provider) {
        return new ChatTopicMapperUi_Factory(provider);
    }

    public static ChatTopicMapperUi newInstance(TopicIconMapperUi topicIconMapperUi) {
        return new ChatTopicMapperUi(topicIconMapperUi);
    }
}
