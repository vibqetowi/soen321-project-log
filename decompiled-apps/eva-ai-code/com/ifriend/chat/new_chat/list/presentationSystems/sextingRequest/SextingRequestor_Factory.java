package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SextingRequestor_Factory implements Factory<SextingRequestor> {
    private final Provider<SextingRequestApi> apiProvider;
    private final Provider<AuthDataProvider> authProvider;
    private final Provider<Logger> loggerProvider;

    public SextingRequestor_Factory(Provider<SextingRequestApi> provider, Provider<AuthDataProvider> provider2, Provider<Logger> provider3) {
        this.apiProvider = provider;
        this.authProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public SextingRequestor get() {
        return newInstance(this.apiProvider.get(), this.authProvider.get(), this.loggerProvider.get());
    }

    public static SextingRequestor_Factory create(Provider<SextingRequestApi> provider, Provider<AuthDataProvider> provider2, Provider<Logger> provider3) {
        return new SextingRequestor_Factory(provider, provider2, provider3);
    }

    public static SextingRequestor newInstance(SextingRequestApi sextingRequestApi, AuthDataProvider authDataProvider, Logger logger) {
        return new SextingRequestor(sextingRequestApi, authDataProvider, logger);
    }
}
