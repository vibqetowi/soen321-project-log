package com.ifriend.analytics.usecase.audioAi;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsAudioAiClickPlayUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiClickPlayUseCase;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "messageId", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsAudioAiClickPlayUseCase {
    private final AnalyticsSender[] analyticsSenders;

    public AnalyticsAudioAiClickPlayUseCase(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle(String messageId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
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
            annalsTrackerAnalyticsSender2.sendEvent("click-play-audio-ai", MapsKt.mapOf(new Pair(AnalyticsAudioAiConstants.MESSAGE_ID, messageId), new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()))));
        }
    }
}
