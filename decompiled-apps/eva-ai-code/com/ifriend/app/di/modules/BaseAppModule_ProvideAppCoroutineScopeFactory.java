package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class BaseAppModule_ProvideAppCoroutineScopeFactory implements Factory<CoroutineScope> {
    private final Provider<Logger> loggerProvider;
    private final BaseAppModule module;

    public BaseAppModule_ProvideAppCoroutineScopeFactory(BaseAppModule baseAppModule, Provider<Logger> provider) {
        this.module = baseAppModule;
        this.loggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return provideAppCoroutineScope(this.module, this.loggerProvider.get());
    }

    public static BaseAppModule_ProvideAppCoroutineScopeFactory create(BaseAppModule baseAppModule, Provider<Logger> provider) {
        return new BaseAppModule_ProvideAppCoroutineScopeFactory(baseAppModule, provider);
    }

    public static CoroutineScope provideAppCoroutineScope(BaseAppModule baseAppModule, Logger logger) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(baseAppModule.provideAppCoroutineScope(logger));
    }
}
