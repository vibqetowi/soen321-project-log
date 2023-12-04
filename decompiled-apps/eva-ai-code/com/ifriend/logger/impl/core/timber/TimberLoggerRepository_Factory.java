package com.ifriend.logger.impl.core.timber;

import com.google.gson.Gson;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class TimberLoggerRepository_Factory implements Factory<TimberLoggerRepository> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Gson> gsonProvider;

    public TimberLoggerRepository_Factory(Provider<Gson> provider, Provider<DispatcherProvider> provider2) {
        this.gsonProvider = provider;
        this.dispatcherProvider = provider2;
    }

    @Override // javax.inject.Provider
    public TimberLoggerRepository get() {
        return newInstance(this.gsonProvider.get(), this.dispatcherProvider.get());
    }

    public static TimberLoggerRepository_Factory create(Provider<Gson> provider, Provider<DispatcherProvider> provider2) {
        return new TimberLoggerRepository_Factory(provider, provider2);
    }

    public static TimberLoggerRepository newInstance(Gson gson, DispatcherProvider dispatcherProvider) {
        return new TimberLoggerRepository(gson, dispatcherProvider);
    }
}
