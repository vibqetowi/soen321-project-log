package com.ifriend.presentation.features.purchases.neurons.model;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyNeuronsProductUiMapper_Factory implements Factory<BuyNeuronsProductUiMapper> {
    private final Provider<ResourceProvider> resourcesProvider;

    public BuyNeuronsProductUiMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourcesProvider = provider;
    }

    @Override // javax.inject.Provider
    public BuyNeuronsProductUiMapper get() {
        return newInstance(this.resourcesProvider.get());
    }

    public static BuyNeuronsProductUiMapper_Factory create(Provider<ResourceProvider> provider) {
        return new BuyNeuronsProductUiMapper_Factory(provider);
    }

    public static BuyNeuronsProductUiMapper newInstance(ResourceProvider resourceProvider) {
        return new BuyNeuronsProductUiMapper(resourceProvider);
    }
}
