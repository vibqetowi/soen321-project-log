package com.ifriend.analytics.usecase.screenshot;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsScreenshot.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenshot;", "", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "trackScreenshot", "", "screenName", "Lcom/ifriend/analytics/usecase/screenshot/AnalyticsScreenName;", "platformName", "", "botUserId", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsScreenshot {
    public static final AnalyticsScreenshot INSTANCE = new AnalyticsScreenshot();
    private static final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();

    private AnalyticsScreenshot() {
    }

    public final void trackScreenshot(AnalyticsScreenName screenName, String platformName, String botUserId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(platformName, "platformName");
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        annalsTrackerAnalyticsSender2.sendEvent("user-took-screenshot", MapsKt.mapOf(TuplesKt.to("screen-name", screenName.getValue()), AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to("platform-screen-name", platformName), TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }
}
