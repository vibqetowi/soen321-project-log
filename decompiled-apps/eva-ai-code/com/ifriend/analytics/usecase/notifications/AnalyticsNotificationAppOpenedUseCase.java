package com.ifriend.analytics.usecase.notifications;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedAnalyticsSender;
import com.ifriend.core.tools.api.AppIdentityConverter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsNotificationAppOpenedUseCase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationAppOpenedUseCase;", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/core/tools/api/AppIdentityConverter;[Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "gson", "Lcom/google/gson/Gson;", "handle", "", "notification", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsPushNotification;", "chatId", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsNotificationAppOpenedUseCase {
    private final AnalyticsSender[] analyticsSenders;
    private final AppIdentityConverter appIdentityConverter;
    private final Gson gson;

    public AnalyticsNotificationAppOpenedUseCase(AppIdentityConverter appIdentityConverter, AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.appIdentityConverter = appIdentityConverter;
        this.analyticsSenders = analyticsSenders;
        this.gson = new Gson();
    }

    public final void handle(AnalyticsPushNotification notification, String chatId) {
        PushNotificationOpenedAnalyticsSender pushNotificationOpenedAnalyticsSender;
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            pushNotificationOpenedAnalyticsSender = null;
            if (i2 >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenderArr[i2];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i2++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 != null) {
            annalsTrackerAnalyticsSender2.sendEvent("push-notification-views", MapsKt.mapOf(new Pair("notification-payload", new Gson().toJson(notification.getPayload())), new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId))));
        }
        try {
            Object fromJson = this.gson.fromJson(notification.getPayload(), new TypeToken<Map<String, ? extends Object>>() { // from class: com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase$handle$1$params$1
            }.getType());
            Intrinsics.checkNotNull(fromJson);
            Map<String, ? extends Object> map = (Map) fromJson;
            int length2 = analyticsSenderArr.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                AnalyticsSender analyticsSender = analyticsSenderArr[i];
                if (analyticsSender instanceof PushNotificationOpenedAnalyticsSender) {
                    pushNotificationOpenedAnalyticsSender = analyticsSender;
                    break;
                }
                i++;
            }
            PushNotificationOpenedAnalyticsSender pushNotificationOpenedAnalyticsSender2 = pushNotificationOpenedAnalyticsSender;
            if (pushNotificationOpenedAnalyticsSender2 != null) {
                pushNotificationOpenedAnalyticsSender2.sendEvent("last-open-push", map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
