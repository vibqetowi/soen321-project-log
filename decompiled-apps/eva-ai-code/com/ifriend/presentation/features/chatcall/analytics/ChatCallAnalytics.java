package com.ifriend.presentation.features.chatcall.analytics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.api.events.AnnalsAnalyticsEvent;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatCallAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u0006J\u001f\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;", "", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "(Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;)V", "trackAutoEndCallButtonClick", "", "reason", "", "stopPhrase", "trackCallButtonClick", "trackEndCallButtonClick", "startPhrase", "durationInSecond", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallAnalytics {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;

    @Inject
    public ChatCallAnalytics(AnalyticsInteractor analyticsInteractor) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.analyticsInteractor = analyticsInteractor;
    }

    public final void trackCallButtonClick() {
        this.analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("ai-click-call-btn", null, 2, null));
    }

    public final void trackEndCallButtonClick(String str, Long l) {
        AnalyticsInteractor analyticsInteractor = this.analyticsInteractor;
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "NULL";
        }
        pairArr[0] = TuplesKt.to("start_phrase", str);
        pairArr[1] = AnalyticsConstants.INSTANCE.getTimestampAsString();
        pairArr[2] = TuplesKt.to("call_duration", String.valueOf(l != null ? l.longValue() : -1L));
        analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("ai-click-end-call-btn", MapsKt.mapOf(pairArr)));
    }

    public final void trackAutoEndCallButtonClick(String reason, String str) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        AnalyticsInteractor analyticsInteractor = this.analyticsInteractor;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = AnalyticsConstants.INSTANCE.getTimestampAsString();
        if (str == null) {
            str = "NULL";
        }
        pairArr[1] = TuplesKt.to("stop_phrase", str);
        pairArr[2] = TuplesKt.to("reason", reason);
        analyticsInteractor.trackEvent(new AnnalsAnalyticsEvent("ai-click-end-call-btn", MapsKt.mapOf(pairArr)));
    }
}
