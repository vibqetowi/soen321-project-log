package com.ifriend.analytics.usecase.rateUs;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsRateUsModalUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ifriend/analytics/usecase/rateUs/AnalyticsRateUsModalUseCase;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "isSend", "", "starsAmount", "", "(ZLjava/lang/Integer;)V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsRateUsModalUseCase {
    private final AnalyticsSender[] analyticsSenders;

    public AnalyticsRateUsModalUseCase(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public static /* synthetic */ void handle$default(AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        analyticsRateUsModalUseCase.handle(z, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handle(boolean z, Integer num) {
        AnalyticsSender analyticsSender;
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                analyticsSender = null;
                break;
            }
            analyticsSender = analyticsSenderArr[i];
            if (analyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = (AnnalsTrackerAnalyticsSender) analyticsSender;
        if (annalsTrackerAnalyticsSender != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            pairArr[1] = TuplesKt.to("button", Integer.valueOf(z ? 1 : 0));
            pairArr[2] = TuplesKt.to("rating", (num == null || (r8 = num.toString()) == null) ? "NULL" : "NULL");
            annalsTrackerAnalyticsSender.sendEvent("rate-us-modal-ai", MapsKt.mapOf(pairArr));
        }
    }
}
