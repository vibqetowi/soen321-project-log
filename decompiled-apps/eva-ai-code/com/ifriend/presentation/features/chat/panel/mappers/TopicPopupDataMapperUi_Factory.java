package com.ifriend.presentation.features.chat.panel.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class TopicPopupDataMapperUi_Factory implements Factory<TopicPopupDataMapperUi> {
    private final Provider<TopicImageMapperUi> topicImageMapperUiProvider;

    public TopicPopupDataMapperUi_Factory(Provider<TopicImageMapperUi> provider) {
        this.topicImageMapperUiProvider = provider;
    }

    @Override // javax.inject.Provider
    public TopicPopupDataMapperUi get() {
        return newInstance(this.topicImageMapperUiProvider.get());
    }

    public static TopicPopupDataMapperUi_Factory create(Provider<TopicImageMapperUi> provider) {
        return new TopicPopupDataMapperUi_Factory(provider);
    }

    public static TopicPopupDataMapperUi newInstance(TopicImageMapperUi topicImageMapperUi) {
        return new TopicPopupDataMapperUi(topicImageMapperUi);
    }
}
