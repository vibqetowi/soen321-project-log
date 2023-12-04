package com.ifriend.analytics.usecase.chat;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.core.tools.api.AppIdentityConverter;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatScreenAnalyticsUseCase.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/core/tools/api/AppIdentityConverter;[Lcom/ifriend/analytics/AnalyticsSender;)V", "tracker", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerAnalyticsSender;", "trackClickAvatarName", "", "trackClickAvatarPic", "trackClickBackScreen", "notificationsCount", "", "chatId", "", "trackInAppNotificationClick", "header", TtmlNode.TAG_BODY, "trackInAppNotificationReceive", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatScreenAnalyticsUseCase {
    private final AppIdentityConverter appIdentityConverter;
    private final AnnalsTrackerAnalyticsSender tracker;

    public ChatScreenAnalyticsUseCase(AppIdentityConverter appIdentityConverter, AnalyticsSender... analyticsSenders) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.appIdentityConverter = appIdentityConverter;
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
        this.tracker = annalsTrackerAnalyticsSender;
    }

    public final void trackClickAvatarPic() {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.tracker;
        if (annalsTrackerAnalyticsSender != null) {
            annalsTrackerAnalyticsSender.sendEvent("click-avatar-mini-pic-chat-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
        }
    }

    public final void trackClickAvatarName() {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.tracker;
        if (annalsTrackerAnalyticsSender != null) {
            annalsTrackerAnalyticsSender.sendEvent("click-avatar-name-chat-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
        }
    }

    public final void trackClickBackScreen(int i, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.tracker;
        if (annalsTrackerAnalyticsSender != null) {
            annalsTrackerAnalyticsSender.sendEvent("click-back-arrow-chat-screen-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to(CommonAnalyticsKeys.QTY_NOTIFICATIONS.getValue(), Integer.valueOf(i)), TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId))));
        }
    }

    public final void trackInAppNotificationReceive(String header, String body, String chatId) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.tracker;
        if (annalsTrackerAnalyticsSender != null) {
            annalsTrackerAnalyticsSender.sendEvent("inapp-push-notification-receive", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to(CommonAnalyticsKeys.IN_APP_PUSH_TYPE.getValue(), "chatlist"), TuplesKt.to(CommonAnalyticsKeys.HEADER.getValue(), header), TuplesKt.to(CommonAnalyticsKeys.TEXT.getValue(), body), TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId))));
        }
    }

    public final void trackInAppNotificationClick(String header, String body, String chatId) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = this.tracker;
        if (annalsTrackerAnalyticsSender != null) {
            annalsTrackerAnalyticsSender.sendEvent("inapp-push-notification-click", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), TuplesKt.to(CommonAnalyticsKeys.IN_APP_PUSH_TYPE.getValue(), "chatlist"), TuplesKt.to(CommonAnalyticsKeys.HEADER.getValue(), header), TuplesKt.to(CommonAnalyticsKeys.TEXT.getValue(), body), TuplesKt.to(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId))));
        }
    }
}
