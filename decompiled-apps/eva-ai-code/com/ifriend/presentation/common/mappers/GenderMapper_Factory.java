package com.ifriend.presentation.common.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GenderMapper_Factory implements Factory<GenderMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public GenderMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public GenderMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static GenderMapper_Factory create(Provider<ResourceProvider> provider) {
        return new GenderMapper_Factory(provider);
    }

    public static GenderMapper newInstance(ResourceProvider resourceProvider) {
        return new GenderMapper(resourceProvider);
    }
}
