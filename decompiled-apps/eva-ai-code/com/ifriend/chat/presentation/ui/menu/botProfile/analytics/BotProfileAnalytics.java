package com.ifriend.chat.presentation.ui.menu.botProfile.analytics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
/* compiled from: BotProfileAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/analytics/BotProfileAnalytics;", "", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "trackClickAvatarPic", "", "trackClickAvatarPlayPause", "isPlay", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProfileAnalytics {
    public static final BotProfileAnalytics INSTANCE = new BotProfileAnalytics();
    private static final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();
    private static final Lazy tracker$delegate = LazyKt.lazy(BotProfileAnalytics$tracker$2.INSTANCE);
    public static final int $stable = 8;

    private BotProfileAnalytics() {
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) tracker$delegate.getValue();
    }

    public final void trackClickAvatarPic() {
        getTracker().sendEvent("click-avatar-profile-pic-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    public final void trackClickAvatarPlayPause(boolean z) {
        AnnalsTrackerAnalyticsSender tracker = getTracker();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = AnalyticsConstants.INSTANCE.getTimestamp();
        pairArr[1] = TuplesKt.to("state", z ? "play" : "pause");
        tracker.sendEvent("click-avatar-animation-btn-ai", MapsKt.mapOf(pairArr));
    }
}
