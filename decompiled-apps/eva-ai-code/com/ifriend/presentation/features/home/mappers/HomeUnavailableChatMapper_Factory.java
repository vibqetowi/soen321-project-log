package com.ifriend.presentation.features.home.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeUnavailableChatMapper_Factory implements Factory<HomeUnavailableChatMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public HomeUnavailableChatMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public HomeUnavailableChatMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static HomeUnavailableChatMapper_Factory create(Provider<ResourceProvider> provider) {
        return new HomeUnavailableChatMapper_Factory(provider);
    }

    public static HomeUnavailableChatMapper newInstance(ResourceProvider resourceProvider) {
        return new HomeUnavailableChatMapper(resourceProvider);
    }
}
