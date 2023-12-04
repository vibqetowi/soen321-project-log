package com.ifriend.app.di.modules;

import com.ifriend.domain.CoroutineDispatchers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class BaseAppModule_ProvideCoroutineDispatchersFactory implements Factory<CoroutineDispatchers> {
    private final BaseAppModule module;

    public BaseAppModule_ProvideCoroutineDispatchersFactory(BaseAppModule baseAppModule) {
        this.module = baseAppModule;
    }

    @Override // javax.inject.Provider
    public CoroutineDispatchers get() {
        return provideCoroutineDispatchers(this.module);
    }

    public static BaseAppModule_ProvideCoroutineDispatchersFactory create(BaseAppModule baseAppModule) {
        return new BaseAppModule_ProvideCoroutineDispatchersFactory(baseAppModule);
    }

    public static CoroutineDispatchers provideCoroutineDispatchers(BaseAppModule baseAppModule) {
        return (CoroutineDispatchers) Preconditions.checkNotNullFromProvides(baseAppModule.provideCoroutineDispatchers());
    }
}
