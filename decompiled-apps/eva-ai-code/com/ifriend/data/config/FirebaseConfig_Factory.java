package com.ifriend.data.config;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParser;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FirebaseConfig_Factory implements Factory<FirebaseConfig> {
    private final Provider<Logger> loggerProvider;
    private final Provider<FirebaseRemoteConfigParser> parserProvider;

    public FirebaseConfig_Factory(Provider<FirebaseRemoteConfigParser> provider, Provider<Logger> provider2) {
        this.parserProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FirebaseConfig get() {
        return newInstance(this.parserProvider.get(), this.loggerProvider.get());
    }

    public static FirebaseConfig_Factory create(Provider<FirebaseRemoteConfigParser> provider, Provider<Logger> provider2) {
        return new FirebaseConfig_Factory(provider, provider2);
    }

    public static FirebaseConfig newInstance(FirebaseRemoteConfigParser firebaseRemoteConfigParser, Logger logger) {
        return new FirebaseConfig(firebaseRemoteConfigParser, logger);
    }
}
