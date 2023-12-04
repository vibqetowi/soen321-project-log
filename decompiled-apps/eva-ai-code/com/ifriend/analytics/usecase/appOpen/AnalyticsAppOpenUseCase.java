package com.ifriend.analytics.usecase.appOpen;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.AppsFlyerAnalyticsSender;
import com.ifriend.analytics.FirebaseAnalyticsSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsAppOpenUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsAppOpenUseCase {
    private final AnalyticsSender[] analyticsSenders;

    public AnalyticsAppOpenUseCase(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle() {
        FirebaseAnalyticsSender firebaseAnalyticsSender;
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender;
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                firebaseAnalyticsSender = null;
                break;
            }
            firebaseAnalyticsSender = analyticsSenderArr[i2];
            if (firebaseAnalyticsSender instanceof FirebaseAnalyticsSender) {
                break;
            }
            i2++;
        }
        FirebaseAnalyticsSender firebaseAnalyticsSender2 = firebaseAnalyticsSender;
        if (firebaseAnalyticsSender2 != null) {
            AnalyticsSender.DefaultImpls.sendEvent$default(firebaseAnalyticsSender2, FirebaseAnalytics.Event.APP_OPEN, null, 2, null);
        }
        int length2 = analyticsSenderArr.length;
        while (true) {
            if (i >= length2) {
                appsFlyerAnalyticsSender = null;
                break;
            }
            appsFlyerAnalyticsSender = analyticsSenderArr[i];
            if (appsFlyerAnalyticsSender instanceof AppsFlyerAnalyticsSender) {
                break;
            }
            i++;
        }
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender2 = appsFlyerAnalyticsSender;
        if (appsFlyerAnalyticsSender2 != null) {
            AnalyticsSender.DefaultImpls.sendEvent$default(appsFlyerAnalyticsSender2, "app_open_remarketing", null, 2, null);
        }
    }
}
