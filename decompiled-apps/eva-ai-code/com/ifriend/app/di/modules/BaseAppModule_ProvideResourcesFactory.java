package com.ifriend.app.di.modules;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BaseAppModule_ProvideResourcesFactory implements Factory<Resources> {
    private final Provider<Context> contextProvider;
    private final BaseAppModule module;

    public BaseAppModule_ProvideResourcesFactory(BaseAppModule baseAppModule, Provider<Context> provider) {
        this.module = baseAppModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.module, this.contextProvider.get());
    }

    public static BaseAppModule_ProvideResourcesFactory create(BaseAppModule baseAppModule, Provider<Context> provider) {
        return new BaseAppModule_ProvideResourcesFactory(baseAppModule, provider);
    }

    public static Resources provideResources(BaseAppModule baseAppModule, Context context) {
        return (Resources) Preconditions.checkNotNullFromProvides(baseAppModule.provideResources(context));
    }
}
