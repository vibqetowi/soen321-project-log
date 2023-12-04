package com.ifriend.analytics.impl.data.repository;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class FirebaseAnalyticsRepository_Factory implements Factory<FirebaseAnalyticsRepository> {
    private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;
    private final Provider<FirebaseCrashlytics> firebaseCrashlyticsProvider;
    private final Provider<Boolean> isDebuggableProvider;

    public FirebaseAnalyticsRepository_Factory(Provider<FirebaseAnalytics> provider, Provider<FirebaseCrashlytics> provider2, Provider<Boolean> provider3) {
        this.firebaseAnalyticsProvider = provider;
        this.firebaseCrashlyticsProvider = provider2;
        this.isDebuggableProvider = provider3;
    }

    @Override // javax.inject.Provider
    public FirebaseAnalyticsRepository get() {
        return newInstance(this.firebaseAnalyticsProvider.get(), this.firebaseCrashlyticsProvider.get(), this.isDebuggableProvider.get().booleanValue());
    }

    public static FirebaseAnalyticsRepository_Factory create(Provider<FirebaseAnalytics> provider, Provider<FirebaseCrashlytics> provider2, Provider<Boolean> provider3) {
        return new FirebaseAnalyticsRepository_Factory(provider, provider2, provider3);
    }

    public static FirebaseAnalyticsRepository newInstance(FirebaseAnalytics firebaseAnalytics, FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        return new FirebaseAnalyticsRepository(firebaseAnalytics, firebaseCrashlytics, z);
    }
}
