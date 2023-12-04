package com.ifriend.registration.presentation.bridges.facebook;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FacebookAuthorizationBridgeImpl_Factory implements Factory<FacebookAuthorizationBridgeImpl> {
    private final Provider<FacebookAuthorizationResponseParser> parserProvider;

    public FacebookAuthorizationBridgeImpl_Factory(Provider<FacebookAuthorizationResponseParser> provider) {
        this.parserProvider = provider;
    }

    @Override // javax.inject.Provider
    public FacebookAuthorizationBridgeImpl get() {
        return newInstance(this.parserProvider.get());
    }

    public static FacebookAuthorizationBridgeImpl_Factory create(Provider<FacebookAuthorizationResponseParser> provider) {
        return new FacebookAuthorizationBridgeImpl_Factory(provider);
    }

    public static FacebookAuthorizationBridgeImpl newInstance(FacebookAuthorizationResponseParser facebookAuthorizationResponseParser) {
        return new FacebookAuthorizationBridgeImpl(facebookAuthorizationResponseParser);
    }
}
