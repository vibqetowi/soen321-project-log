package com.ifriend.presentation.features.purchases.premium.model;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyPremiumPlanUiMapper_Factory implements Factory<BuyPremiumPlanUiMapper> {
    private final Provider<ResourceProvider> resourcesProvider;

    public BuyPremiumPlanUiMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourcesProvider = provider;
    }

    @Override // javax.inject.Provider
    public BuyPremiumPlanUiMapper get() {
        return newInstance(this.resourcesProvider.get());
    }

    public static BuyPremiumPlanUiMapper_Factory create(Provider<ResourceProvider> provider) {
        return new BuyPremiumPlanUiMapper_Factory(provider);
    }

    public static BuyPremiumPlanUiMapper newInstance(ResourceProvider resourceProvider) {
        return new BuyPremiumPlanUiMapper(resourceProvider);
    }
}
