package com.ifriend.analytics.impl.data.repository;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;
/* compiled from: AppsFlyerRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J$\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/analytics/impl/data/repository/AppsFlyerRepository;", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "context", "Landroid/content/Context;", "appsFlyer", "Lcom/appsflyer/AppsFlyerLib;", "isDebuggable", "", "(Landroid/content/Context;Lcom/appsflyer/AppsFlyerLib;Z)V", "isSupportProvider", "provider", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "logLocalEvent", "", "eventName", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "setUserId", "userId", "setUserProperty", "trackEvent", "keyEvent", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerRepository implements AnalyticsRepository {
    private final AppsFlyerLib appsFlyer;
    private final Context context;
    private final boolean isDebuggable;

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserProperty(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Inject
    public AppsFlyerRepository(Context context, AppsFlyerLib appsFlyer, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        this.context = context;
        this.appsFlyer = appsFlyer;
        this.isDebuggable = z;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackException(Throwable th, Map<String, String> map) {
        AnalyticsRepository.DefaultImpls.trackException(this, th, map);
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public boolean isSupportProvider(AnalyticsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider == AnalyticsProvider.ANALYTICS_APPSFLYER;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.appsFlyer.setCustomerUserId(userId);
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackEvent(String keyEvent, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(params, "params");
        logLocalEvent(keyEvent, params);
        if (this.isDebuggable) {
            return;
        }
        this.appsFlyer.logEvent(this.context, keyEvent, params);
    }

    private final void logLocalEvent(String str, Map<String, String> map) {
        Timber.Tree tag = Timber.Forest.tag("AppsflyerAnalytics");
        String joinToString$default = CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, AppsFlyerRepository$logLocalEvent$1.INSTANCE, 31, null);
        tag.d("event=" + str + ", params={ " + joinToString$default + " }", new Object[0]);
    }
}
