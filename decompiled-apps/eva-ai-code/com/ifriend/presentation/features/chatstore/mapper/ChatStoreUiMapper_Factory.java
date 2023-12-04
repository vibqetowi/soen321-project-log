package com.ifriend.presentation.features.chatstore.mapper;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatStoreUiMapper_Factory implements Factory<ChatStoreUiMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public ChatStoreUiMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatStoreUiMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static ChatStoreUiMapper_Factory create(Provider<ResourceProvider> provider) {
        return new ChatStoreUiMapper_Factory(provider);
    }

    public static ChatStoreUiMapper newInstance(ResourceProvider resourceProvider) {
        return new ChatStoreUiMapper(resourceProvider);
    }
}
