package com.ifriend.presentation.features.update.analytics;

import com.ifriend.analytics.api.events.AnnalsAnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InAppUpdateAnalytics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/update/analytics/InAppUpdateAnalytics;", "", "interactor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "trackHardUpdateClick", "", "id", "", "buildNumber", "", "trackHardUpdatePopupShow", "trackUpdatePopupCancel", "number", "trackUpdatePopupClick", "trackUpdatePopupShow", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdateAnalytics {
    public static final int $stable = 8;
    private final AnalyticsInteractor interactor;

    @Inject
    public InAppUpdateAnalytics(AnalyticsInteractor interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
    }

    public final void trackUpdatePopupShow(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.interactor.trackEvent(new AnnalsAnalyticsEvent("soft-popup-update-view-ai", MapsKt.mapOf(TuplesKt.to("popup_num", String.valueOf(i)), TuplesKt.to("buildNumber", String.valueOf(i2)), TuplesKt.to("id", id))));
    }

    public final void trackUpdatePopupClick(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.interactor.trackEvent(new AnnalsAnalyticsEvent("soft-popup-update-click-update-btn-ai", MapsKt.mapOf(TuplesKt.to("popup_num", String.valueOf(i)), TuplesKt.to("buildNumber", String.valueOf(i2)), TuplesKt.to("id", id))));
    }

    public final void trackUpdatePopupCancel(String id, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.interactor.trackEvent(new AnnalsAnalyticsEvent("soft-popup-update-click-close-btn-ai", MapsKt.mapOf(TuplesKt.to("popup_num", String.valueOf(i)), TuplesKt.to("buildNumber", String.valueOf(i2)), TuplesKt.to("id", id))));
    }

    public final void trackHardUpdatePopupShow(String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.interactor.trackEvent(new AnnalsAnalyticsEvent("hard-popup-update-view-ai", MapsKt.mapOf(TuplesKt.to("buildNumber", String.valueOf(i)), TuplesKt.to("id", id))));
    }

    public final void trackHardUpdateClick(String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.interactor.trackEvent(new AnnalsAnalyticsEvent("hard-popup-update-click-update-btn-ai", MapsKt.mapOf(TuplesKt.to("buildNumber", String.valueOf(i)), TuplesKt.to("id", id))));
    }
}
