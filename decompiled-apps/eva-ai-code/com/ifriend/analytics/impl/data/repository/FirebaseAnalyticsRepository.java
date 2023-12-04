package com.ifriend.analytics.impl.data.repository;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;
/* compiled from: FirebaseAnalyticsRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J$\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J$\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/analytics/impl/data/repository/FirebaseAnalyticsRepository;", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "isDebuggable", "", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Z)V", "isSupportProvider", "provider", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "logLocalEvent", "", "eventName", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "setUserId", "userId", "setUserProperty", "trackEvent", "keyEvent", "trackException", "throwable", "", "values", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseAnalyticsRepository implements AnalyticsRepository {
    private final FirebaseAnalytics firebaseAnalytics;
    private final FirebaseCrashlytics firebaseCrashlytics;
    private final boolean isDebuggable;

    @Inject
    public FirebaseAnalyticsRepository(FirebaseAnalytics firebaseAnalytics, FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        this.firebaseAnalytics = firebaseAnalytics;
        this.firebaseCrashlytics = firebaseCrashlytics;
        this.isDebuggable = z;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public boolean isSupportProvider(AnalyticsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider == AnalyticsProvider.ANALYTICS_FIREBASE;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.firebaseAnalytics.setUserId(userId);
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackEvent(String keyEvent, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(params, "params");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        logLocalEvent(keyEvent, params);
        if (this.isDebuggable) {
            return;
        }
        this.firebaseAnalytics.logEvent(keyEvent, bundle);
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackException(Throwable throwable, Map<String, String> values) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(values, "values");
        if (this.isDebuggable) {
            logLocalEvent(throwable.toString(), values);
            return;
        }
        FirebaseCrashlytics firebaseCrashlytics = this.firebaseCrashlytics;
        for (Map.Entry<String, String> entry : values.entrySet()) {
            firebaseCrashlytics.setCustomKey(entry.getKey(), entry.getValue());
        }
        firebaseCrashlytics.recordException(throwable);
    }

    private final void logLocalEvent(String str, Map<String, String> map) {
        Timber.Tree tag = Timber.Forest.tag("FirebaseAnalytics");
        String joinToString$default = CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, FirebaseAnalyticsRepository$logLocalEvent$1.INSTANCE, 31, null);
        tag.d("event=" + str + ", params={ " + joinToString$default + " }", new Object[0]);
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserProperty(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            this.firebaseAnalytics.setUserProperty(entry.getKey(), entry.getValue());
        }
    }
}
