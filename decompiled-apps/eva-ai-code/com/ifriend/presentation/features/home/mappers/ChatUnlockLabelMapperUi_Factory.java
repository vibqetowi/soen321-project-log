package com.ifriend.presentation.features.home.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatUnlockLabelMapperUi_Factory implements Factory<ChatUnlockLabelMapperUi> {
    private final Provider<ResourceProvider> resourceProvider;

    public ChatUnlockLabelMapperUi_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatUnlockLabelMapperUi get() {
        return newInstance(this.resourceProvider.get());
    }

    public static ChatUnlockLabelMapperUi_Factory create(Provider<ResourceProvider> provider) {
        return new ChatUnlockLabelMapperUi_Factory(provider);
    }

    public static ChatUnlockLabelMapperUi newInstance(ResourceProvider resourceProvider) {
        return new ChatUnlockLabelMapperUi(resourceProvider);
    }
}
