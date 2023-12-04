package com.ifriend.analytics.usecase.auth;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.install.AppInstallStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthScreenOpenedAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics;", "", "preferences", "Lcom/ifriend/domain/data/Preferences;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/domain/data/Preferences;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/data/install/AppInstallStorage;[Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "send", "", "Companion", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthScreenOpenedAnalytics {
    public static final Companion Companion = new Companion(null);
    private static final String IS_SENT_AUTH_OPENED = "is_sent_auth_opened";
    private static final String SENT_AUTH_FINISHED_EXP_PARAMS = "sent_auth_finished_exp_params";
    private final AnalyticsSender[] analyticsSenders;
    private final AppInstallStorage appInstallStorage;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatchers dispatchers;
    private final Preferences preferences;

    public AuthScreenOpenedAnalytics(Preferences preferences, CoroutineScope coroutineScope, CoroutineDispatchers dispatchers, AppInstallStorage appInstallStorage, AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.preferences = preferences;
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatchers;
        this.appInstallStorage = appInstallStorage;
        this.analyticsSenders = analyticsSenders;
    }

    public final void send() {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenderArr[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        List listOf = CollectionsKt.listOf(TuplesKt.to(AnalyticsConstants.REGISTRATION_VERSION, "version_2"));
        Set<String> stringSetWithKey = this.preferences.getStringSetWithKey(SENT_AUTH_FINISHED_EXP_PARAMS);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (!stringSetWithKey.contains(((Pair) obj).getFirst())) {
                arrayList.add(obj);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        if (map.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.getIO(), null, new AuthScreenOpenedAnalytics$send$1(annalsTrackerAnalyticsSender2, this, map, null), 2, null);
    }

    /* compiled from: AuthScreenOpenedAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics$Companion;", "", "()V", "IS_SENT_AUTH_OPENED", "", "SENT_AUTH_FINISHED_EXP_PARAMS", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
