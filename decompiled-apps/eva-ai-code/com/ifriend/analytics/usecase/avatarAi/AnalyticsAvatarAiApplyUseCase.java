package com.ifriend.analytics.usecase.avatarAi;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsAvatarAiApplyUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/analytics/usecase/avatarAi/AnalyticsAvatarAiApplyUseCase;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsAvatarAiApplyUseCase {
    private final AnalyticsSender[] analyticsSenders;

    public AnalyticsAvatarAiApplyUseCase(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle() {
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
        if (annalsTrackerAnalyticsSender2 != null) {
            annalsTrackerAnalyticsSender2.sendEvent("click-apply-avatar-ai", MapsKt.mapOf(TuplesKt.to(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()))));
        }
    }
}
