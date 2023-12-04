package com.ifriend.icon_switcher.di;

import android.content.Context;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory implements Factory<PremiumAppIconManager> {
    private final Provider<Context> contextProvider;
    private final PremiumIconManagerModule module;

    public PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory(PremiumIconManagerModule premiumIconManagerModule, Provider<Context> provider) {
        this.module = premiumIconManagerModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public PremiumAppIconManager get() {
        return providePremiumAppIconManager(this.module, this.contextProvider.get());
    }

    public static PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory create(PremiumIconManagerModule premiumIconManagerModule, Provider<Context> provider) {
        return new PremiumIconManagerModule_ProvidePremiumAppIconManagerFactory(premiumIconManagerModule, provider);
    }

    public static PremiumAppIconManager providePremiumAppIconManager(PremiumIconManagerModule premiumIconManagerModule, Context context) {
        return (PremiumAppIconManager) Preconditions.checkNotNullFromProvides(premiumIconManagerModule.providePremiumAppIconManager(context));
    }
}
