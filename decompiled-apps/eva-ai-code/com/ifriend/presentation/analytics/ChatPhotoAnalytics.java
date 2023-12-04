package com.ifriend.presentation.analytics;

import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatPhotoAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/analytics/ChatPhotoAnalytics;", "", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "(Lcom/ifriend/analytics/AnalyticsEngine;)V", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "getTracker", "()Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "tracker$delegate", "Lkotlin/Lazy;", "trackAiPhotoClick", "", "mediaId", "", "trackShowPhoto", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPhotoAnalytics {
    public static final int $stable = 8;
    private final AnalyticsEngine analytics;
    private final Lazy tracker$delegate;

    @Inject
    public ChatPhotoAnalytics(AnalyticsEngine analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
        this.tracker$delegate = LazyKt.lazy(new ChatPhotoAnalytics$tracker$2(this));
    }

    private final AnnalsTrackerAnalyticsSender getTracker() {
        return (AnnalsTrackerAnalyticsSender) this.tracker$delegate.getValue();
    }

    public final void trackAiPhotoClick(String mediaId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        getTracker().sendEvent("click-photo-ai", MapsKt.mapOf(TuplesKt.to("photo_id", mediaId)));
    }

    public final void trackShowPhoto() {
        AnalyticsSender.DefaultImpls.sendEvent$default(getTracker(), "mount-image-preview", null, 2, null);
    }
}
