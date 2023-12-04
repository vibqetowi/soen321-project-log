package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
/* compiled from: SextingRequestAnalytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestAnalytics;", "", "()V", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "clickNotReady", "", "clickSure", "sendEvent", "eventName", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingRequestAnalytics {
    public static final int $stable = 0;
    public static final SextingRequestAnalytics INSTANCE = new SextingRequestAnalytics();

    private SextingRequestAnalytics() {
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        AnalyticsSender[] analyticsSenders = AnalyticsEngine.Companion.getInstance().getAnalyticsSenders();
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
        return annalsTrackerAnalyticsSender;
    }

    public final void clickSure() {
        sendEvent("click-sure-btn-intimate-screen-ai");
    }

    public final void clickNotReady() {
        sendEvent("click-not-ready-btn-intimate-screen-ai");
    }

    private final void sendEvent(String str) {
        AnnalsTrackerAnalyticsSender tracker = getTracker();
        if (tracker != null) {
            tracker.sendEvent(str, MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()))));
        }
    }
}
