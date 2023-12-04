package com.ifriend.presentation.features.chat.panel.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class TopicImageMapperUi_Factory implements Factory<TopicImageMapperUi> {
    @Override // javax.inject.Provider
    public TopicImageMapperUi get() {
        return newInstance();
    }

    public static TopicImageMapperUi_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TopicImageMapperUi newInstance() {
        return new TopicImageMapperUi();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final TopicImageMapperUi_Factory INSTANCE = new TopicImageMapperUi_Factory();

        private InstanceHolder() {
        }
    }
}
