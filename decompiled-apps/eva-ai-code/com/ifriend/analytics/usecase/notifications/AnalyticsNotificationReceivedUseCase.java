package com.ifriend.analytics.usecase.notifications;

import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.core.tools.api.AppIdentityConverter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsNotificationReceivedUseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase;", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/core/tools/api/AppIdentityConverter;[Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "result", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase$NotificationResult;", "appInBackground", "", "notification", "Lcom/google/firebase/messaging/RemoteMessage;", "chatId", "", "NotificationResult", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsNotificationReceivedUseCase {
    private final AnalyticsSender[] analyticsSenders;
    private final AppIdentityConverter appIdentityConverter;

    public AnalyticsNotificationReceivedUseCase(AppIdentityConverter appIdentityConverter, AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.appIdentityConverter = appIdentityConverter;
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle(NotificationResult result, boolean z, RemoteMessage notification, String chatId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        int i = 0;
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(new Pair("displayed", Boolean.valueOf(z)), new Pair(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, new Gson().toJson(notification.getData())), new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId)));
        if (!z) {
            mutableMapOf.put("reason", DownloadService.KEY_FOREGROUND);
        }
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
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
            annalsTrackerAnalyticsSender2.sendEvent("push-notification-receive", mutableMapOf);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnalyticsNotificationReceivedUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase$NotificationResult;", "", "(Ljava/lang/String;I)V", "DISABLED", "FOREGROUND", "SUCCESS", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NotificationResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NotificationResult[] $VALUES;
        public static final NotificationResult DISABLED = new NotificationResult("DISABLED", 0);
        public static final NotificationResult FOREGROUND = new NotificationResult("FOREGROUND", 1);
        public static final NotificationResult SUCCESS = new NotificationResult("SUCCESS", 2);

        private static final /* synthetic */ NotificationResult[] $values() {
            return new NotificationResult[]{DISABLED, FOREGROUND, SUCCESS};
        }

        public static EnumEntries<NotificationResult> getEntries() {
            return $ENTRIES;
        }

        public static NotificationResult valueOf(String str) {
            return (NotificationResult) Enum.valueOf(NotificationResult.class, str);
        }

        public static NotificationResult[] values() {
            return (NotificationResult[]) $VALUES.clone();
        }

        private NotificationResult(String str, int i) {
        }

        static {
            NotificationResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
