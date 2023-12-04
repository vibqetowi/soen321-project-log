package com.ifriend.presentation.analytics;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatTopicsAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/analytics/ChatTopicsAnalytics;", "", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "(Lcom/ifriend/analytics/AnalyticsEngine;)V", "sendClickPremiumTopic", "", "botUserId", "", "topicId", "topicName", "sendClickPremiumTopicShowTunedPopup", "sendClickTopic", "topicPosition", "", "absolutePosition", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopicsAnalytics {
    public static final int $stable = 8;
    private final AnalyticsEngine analytics;

    @Inject
    public ChatTopicsAnalytics(AnalyticsEngine analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
    }

    public final void sendClickTopic(String botUserId, int i, int i2, String topicName) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        AnalyticsSender[] analyticsSenders = this.analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i3];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i3++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        annalsTrackerAnalyticsSender2.sendEvent("click-topic-btn-ai", MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())), new Pair("topic_btn_text", topicName), new Pair("topic_position", Integer.valueOf(i)), new Pair("abs_topic_position", Integer.valueOf(i2)), new Pair(com.ifriend.analytics.CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }

    public final void sendClickPremiumTopic(String botUserId, String topicId, String topicName) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        AnalyticsSender[] analyticsSenders = this.analytics.getAnalyticsSenders();
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
        annalsTrackerAnalyticsSender2.sendEvent("click-lullaby-btn-ai", MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())), new Pair("scenario-id", topicId), new Pair("scenario-name", topicName), new Pair(com.ifriend.analytics.CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }

    public final void sendClickPremiumTopicShowTunedPopup(String botUserId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        AnalyticsSender[] analyticsSenders = this.analytics.getAnalyticsSenders();
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
        annalsTrackerAnalyticsSender2.sendEvent("click-lullaby-stand-tuned-modal-btn-ai", MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())), new Pair(com.ifriend.analytics.CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }
}
