package com.ifriend.analytics.impl.data.repository;

import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.api.providers.AnalyticsProvider;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;
/* compiled from: AnnalsAnalyticsRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ifriend/analytics/impl/data/repository/AnnalsAnalyticsRepository;", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "annalsApi", "Lcom/ifriend/core/remote/services/AnnalsApiService;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "isDebuggable", "", "(Lcom/ifriend/core/tools/api/DispatcherProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/core/remote/services/AnnalsApiService;Lcom/ifriend/core/local/api/AuthLocalDataSource;Z)V", "isSupportProvider", "provider", "Lcom/ifriend/analytics/api/providers/AnalyticsProvider;", "logLocalEvent", "", "eventName", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "setUserId", "userId", "setUserProperty", "trackEvent", "keyEvent", "trackException", "throwable", "", "values", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnalsAnalyticsRepository implements AnalyticsRepository {
    private final AnnalsApiService annalsApi;
    private final AuthLocalDataSource authLocalDataSource;
    private final CoroutineScope coroutineScope;
    private final DispatcherProvider dispatcherProvider;
    private final boolean isDebuggable;

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void setUserProperty(Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackException(Throwable throwable, Map<String, String> values) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(values, "values");
    }

    @Inject
    public AnnalsAnalyticsRepository(DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, AnnalsApiService annalsApi, AuthLocalDataSource authLocalDataSource, boolean z) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(annalsApi, "annalsApi");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.dispatcherProvider = dispatcherProvider;
        this.coroutineScope = coroutineScope;
        this.annalsApi = annalsApi;
        this.authLocalDataSource = authLocalDataSource;
        this.isDebuggable = z;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public boolean isSupportProvider(AnalyticsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider == AnalyticsProvider.ANALYTICS_ANNALS;
    }

    @Override // com.ifriend.analytics.impl.domain.repository.AnalyticsRepository
    public void trackEvent(String keyEvent, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(params, "params");
        CoroutinesKt.safeLaunch$default(this.coroutineScope, new AnnalsAnalyticsRepository$trackEvent$1(null), null, new AnnalsAnalyticsRepository$trackEvent$2(this, keyEvent, params, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logLocalEvent(String str, Map<String, String> map) {
        Timber.Tree tag = Timber.Forest.tag("AnnalsAnalytics");
        String joinToString$default = CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, AnnalsAnalyticsRepository$logLocalEvent$1.INSTANCE, 31, null);
        tag.d("event=" + str + ", params={ " + joinToString$default + " }", new Object[0]);
    }
}
