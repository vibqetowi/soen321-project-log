package com.ifriend.registration.presentation.di;

import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideFacebookAuthorizationBridgeFactory implements Factory<FacebookAuthorizationBridge> {
    @Override // javax.inject.Provider
    public FacebookAuthorizationBridge get() {
        return provideFacebookAuthorizationBridge();
    }

    public static AuthorizationModule_Companion_ProvideFacebookAuthorizationBridgeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FacebookAuthorizationBridge provideFacebookAuthorizationBridge() {
        return (FacebookAuthorizationBridge) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideFacebookAuthorizationBridge());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final AuthorizationModule_Companion_ProvideFacebookAuthorizationBridgeFactory INSTANCE = new AuthorizationModule_Companion_ProvideFacebookAuthorizationBridgeFactory();

        private InstanceHolder() {
        }
    }
}
