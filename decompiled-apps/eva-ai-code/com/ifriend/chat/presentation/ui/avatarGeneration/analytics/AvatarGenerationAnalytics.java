package com.ifriend.chat.presentation.ui.avatarGeneration.analytics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
/* compiled from: AvatarGenerationAnalytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/analytics/AvatarGenerationAnalytics;", "", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "trackGenerateAvatarAgain", "", "trackGenerateAvatarBtn", "trackGenerateAvatarStartOver", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationAnalytics {
    public static final AvatarGenerationAnalytics INSTANCE = new AvatarGenerationAnalytics();
    private static final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();
    private static final Lazy tracker$delegate = LazyKt.lazy(AvatarGenerationAnalytics$tracker$2.INSTANCE);
    public static final int $stable = 8;

    private AvatarGenerationAnalytics() {
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) tracker$delegate.getValue();
    }

    public final void trackGenerateAvatarBtn() {
        getTracker().sendEvent("click-generate-avatar-btn-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    public final void trackGenerateAvatarStartOver() {
        getTracker().sendEvent("generate-avatar-ai", MapsKt.mapOf(TuplesKt.to("reason", "START_OVER"), AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    public final void trackGenerateAvatarAgain() {
        getTracker().sendEvent("generate-avatar-ai", MapsKt.mapOf(TuplesKt.to("reason", "GENERATE_AGAIN"), AnalyticsConstants.INSTANCE.getTimestamp()));
    }
}
