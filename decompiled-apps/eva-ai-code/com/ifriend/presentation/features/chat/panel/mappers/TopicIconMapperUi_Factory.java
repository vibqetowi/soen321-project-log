package com.ifriend.presentation.features.chat.panel.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class TopicIconMapperUi_Factory implements Factory<TopicIconMapperUi> {
    @Override // javax.inject.Provider
    public TopicIconMapperUi get() {
        return newInstance();
    }

    public static TopicIconMapperUi_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TopicIconMapperUi newInstance() {
        return new TopicIconMapperUi();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final TopicIconMapperUi_Factory INSTANCE = new TopicIconMapperUi_Factory();

        private InstanceHolder() {
        }
    }
}
