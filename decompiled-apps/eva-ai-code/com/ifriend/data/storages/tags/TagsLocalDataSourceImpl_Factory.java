package com.ifriend.data.storages.tags;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class TagsLocalDataSourceImpl_Factory implements Factory<TagsLocalDataSourceImpl> {
    @Override // javax.inject.Provider
    public TagsLocalDataSourceImpl get() {
        return newInstance();
    }

    public static TagsLocalDataSourceImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TagsLocalDataSourceImpl newInstance() {
        return new TagsLocalDataSourceImpl();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final TagsLocalDataSourceImpl_Factory INSTANCE = new TagsLocalDataSourceImpl_Factory();

        private InstanceHolder() {
        }
    }
}
