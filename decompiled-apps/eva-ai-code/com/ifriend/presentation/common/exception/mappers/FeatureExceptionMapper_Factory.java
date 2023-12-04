package com.ifriend.presentation.common.exception.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FeatureExceptionMapper_Factory implements Factory<FeatureExceptionMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public FeatureExceptionMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public FeatureExceptionMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static FeatureExceptionMapper_Factory create(Provider<ResourceProvider> provider) {
        return new FeatureExceptionMapper_Factory(provider);
    }

    public static FeatureExceptionMapper newInstance(ResourceProvider resourceProvider) {
        return new FeatureExceptionMapper(resourceProvider);
    }
}
