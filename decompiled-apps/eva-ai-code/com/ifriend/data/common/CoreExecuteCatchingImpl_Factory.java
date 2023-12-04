package com.ifriend.data.common;

import com.ifriend.data.exception.mappers.CoreExceptionMapper;
import com.ifriend.domain.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreExecuteCatchingImpl_Factory implements Factory<CoreExecuteCatchingImpl> {
    private final Provider<CoreExceptionMapper> coreExceptionMapperProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;

    public CoreExecuteCatchingImpl_Factory(Provider<CoroutineDispatchers> provider, Provider<CoreExceptionMapper> provider2) {
        this.coroutineDispatchersProvider = provider;
        this.coreExceptionMapperProvider = provider2;
    }

    @Override // javax.inject.Provider
    public CoreExecuteCatchingImpl get() {
        return newInstance(this.coroutineDispatchersProvider.get(), this.coreExceptionMapperProvider.get());
    }

    public static CoreExecuteCatchingImpl_Factory create(Provider<CoroutineDispatchers> provider, Provider<CoreExceptionMapper> provider2) {
        return new CoreExecuteCatchingImpl_Factory(provider, provider2);
    }

    public static CoreExecuteCatchingImpl newInstance(CoroutineDispatchers coroutineDispatchers, CoreExceptionMapper coreExceptionMapper) {
        return new CoreExecuteCatchingImpl(coroutineDispatchers, coreExceptionMapper);
    }
}
