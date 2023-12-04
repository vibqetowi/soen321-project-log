package com.ifriend.logger.impl.logic;

import com.ifriend.logger.impl.core.datadog.DataDogRepository;
import com.ifriend.logger.impl.core.timber.TimberLoggerRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppLoggerInteractorImpl_Factory implements Factory<AppLoggerInteractorImpl> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DataDogRepository> dataDogRepositoryProvider;
    private final Provider<TimberLoggerRepository> timberLoggerRepositoryProvider;

    public AppLoggerInteractorImpl_Factory(Provider<CoroutineScope> provider, Provider<DataDogRepository> provider2, Provider<TimberLoggerRepository> provider3) {
        this.coroutineScopeProvider = provider;
        this.dataDogRepositoryProvider = provider2;
        this.timberLoggerRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AppLoggerInteractorImpl get() {
        return newInstance(this.coroutineScopeProvider.get(), this.dataDogRepositoryProvider.get(), this.timberLoggerRepositoryProvider.get());
    }

    public static AppLoggerInteractorImpl_Factory create(Provider<CoroutineScope> provider, Provider<DataDogRepository> provider2, Provider<TimberLoggerRepository> provider3) {
        return new AppLoggerInteractorImpl_Factory(provider, provider2, provider3);
    }

    public static AppLoggerInteractorImpl newInstance(CoroutineScope coroutineScope, DataDogRepository dataDogRepository, TimberLoggerRepository timberLoggerRepository) {
        return new AppLoggerInteractorImpl(coroutineScope, dataDogRepository, timberLoggerRepository);
    }
}
