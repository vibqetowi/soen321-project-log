package com.ifriend.app;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.appsflyer.AppsFlyerLib;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import com.ifriend.app.ui.splash.SplashActivity;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.common_utils.Constants;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import com.ifriend.domain.data.generateAvatar.FileFormat;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import com.ifriend.push_notification.PushConstant;
import com.ifriend.ui.utils.UIUtils$$ExternalSyntheticApiModelOutline0;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.logging.LogFactory;
import timber.log.Timber;
/* compiled from: AppFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0002\\]B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0003J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J\u001a\u0010K\u001a\u00020F2\u0006\u0010I\u001a\u00020J2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020Q2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020FH\u0016J\u0012\u0010U\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J+\u0010V\u001a\u00020Q2\u0006\u0010I\u001a\u00020J2\u0006\u0010W\u001a\u00020F2\b\u0010L\u001a\u0004\u0018\u00010MH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010XJ\u0010\u0010Y\u001a\u00020Q2\u0006\u0010I\u001a\u00020JH\u0002J\u0014\u0010L\u001a\u0004\u0018\u00010M2\b\u0010Z\u001a\u0004\u0018\u00010FH\u0002J\u000e\u0010[\u001a\u00020O*\u0004\u0018\u00010FH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b>\u0010\u0002\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/ifriend/app/AppFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "analyticsNotificationReceivedUseCase", "Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase;", "getAnalyticsNotificationReceivedUseCase", "()Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase;", "setAnalyticsNotificationReceivedUseCase", "(Lcom/ifriend/analytics/usecase/notifications/AnalyticsNotificationReceivedUseCase;)V", "appsFlyerLib", "Lcom/appsflyer/AppsFlyerLib;", "kotlin.jvm.PlatformType", "getAppsFlyerLib", "()Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib$delegate", "Lkotlin/Lazy;", "avatarInPushToggle", "Lcom/ifriend/data/toggle/AvatarInPushToggle;", "getAvatarInPushToggle", "()Lcom/ifriend/data/toggle/AvatarInPushToggle;", "setAvatarInPushToggle", "(Lcom/ifriend/data/toggle/AvatarInPushToggle;)V", "avatarInRetentionPushToggle", "Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "getAvatarInRetentionPushToggle", "()Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "setAvatarInRetentionPushToggle", "(Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;)V", "avatarsStorage", "Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "getAvatarsStorage", "()Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;", "setAvatarsStorage", "(Lcom/ifriend/domain/data/generateAvatar/AvatarsStorage;)V", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "getChatsInfoConfigurationRepository", "()Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "setChatsInfoConfigurationRepository", "(Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;)V", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "getCoroutineDispatchers", "()Lcom/ifriend/domain/CoroutineDispatchers;", "setCoroutineDispatchers", "(Lcom/ifriend/domain/CoroutineDispatchers;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "gson", "Lcom/google/gson/Gson;", "longTermNotificationHandler", "Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "getLongTermNotificationHandler", "()Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "setLongTermNotificationHandler", "(Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;)V", "preferences", "Lcom/ifriend/domain/data/Preferences;", "getPreferences$annotations", "getPreferences", "()Lcom/ifriend/domain/data/Preferences;", "setPreferences", "(Lcom/ifriend/domain/data/Preferences;)V", "channelImportance", "", PushConstant.PUSH_DATA_IMPORTANCE_KEY, "", "createPendingIntent", "Landroid/app/PendingIntent;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/google/firebase/messaging/RemoteMessage;", "initChannel", "soundUri", "Landroid/net/Uri;", "isAppInBackground", "", "onCreate", "", "onMessageReceived", "onNewToken", "token", LogFactory.PRIORITY_KEY, "pushNotification", "channelId", "(Lcom/google/firebase/messaging/RemoteMessage;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showNotification", "soundName", "isHighImportance", "Companion", "NotificationType", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppFirebaseMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion(null);
    public static final String HIGH_PRIORITY_CHANNEL_ID = "contact-eva";
    public static final String NORMAL_PRIORITY_CHANNEL_ID = "messages-eva";
    @Inject
    public AnalyticsNotificationReceivedUseCase analyticsNotificationReceivedUseCase;
    @Inject
    public AvatarInPushToggle avatarInPushToggle;
    @Inject
    public AvatarInRetentionPushToggle avatarInRetentionPushToggle;
    @Inject
    public AvatarsStorage avatarsStorage;
    @Inject
    public ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    @Inject
    public CoroutineDispatchers coroutineDispatchers;
    @Inject
    public CoroutineScope coroutineScope;
    @Inject
    public LongTermNotificationByTypeOfPushHandler longTermNotificationHandler;
    @Inject
    public Preferences preferences;
    private final Gson gson = new Gson();
    private final Lazy appsFlyerLib$delegate = LazyKt.lazy(AppFirebaseMessagingService$appsFlyerLib$2.INSTANCE);

    @UserSessionSharedPreferences
    public static /* synthetic */ void getPreferences$annotations() {
    }

    /* compiled from: AppFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/app/AppFirebaseMessagingService$Companion;", "", "()V", "HIGH_PRIORITY_CHANNEL_ID", "", "NORMAL_PRIORITY_CHANNEL_ID", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ifriend/app/AppFirebaseMessagingService$NotificationType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "DIARY_NOTE", "DAILY_COINS_REMINDER", "SEXTING_MESSAGE", "AVATAR_GENERATION", "UNKNOWN", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NotificationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final Companion Companion;
        private final String type;
        public static final NotificationType DIARY_NOTE = new NotificationType("DIARY_NOTE", 0, "diaryNote");
        public static final NotificationType DAILY_COINS_REMINDER = new NotificationType("DAILY_COINS_REMINDER", 1, "e");
        public static final NotificationType SEXTING_MESSAGE = new NotificationType("SEXTING_MESSAGE", 2, "sextingMessage");
        public static final NotificationType AVATAR_GENERATION = new NotificationType("AVATAR_GENERATION", 3, "avatarGeneration");
        public static final NotificationType UNKNOWN = new NotificationType("UNKNOWN", 4, "unknown");

        private static final /* synthetic */ NotificationType[] $values() {
            return new NotificationType[]{DIARY_NOTE, DAILY_COINS_REMINDER, SEXTING_MESSAGE, AVATAR_GENERATION, UNKNOWN};
        }

        public static EnumEntries<NotificationType> getEntries() {
            return $ENTRIES;
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }

        private NotificationType(String str, int i, String str2) {
            this.type = str2;
        }

        public final String getType() {
            return this.type;
        }

        static {
            NotificationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
        }

        /* compiled from: AppFirebaseMessagingService.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00020\b*\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ifriend/app/AppFirebaseMessagingService$NotificationType$Companion;", "", "()V", "from", "Lcom/ifriend/app/AppFirebaseMessagingService$NotificationType;", "type", "", "isMessageWithoutDefaultAvatar", "", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final NotificationType from(String type) {
                Object obj;
                Intrinsics.checkNotNullParameter(type, "type");
                Iterator<E> it = NotificationType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((NotificationType) obj).getType(), type)) {
                        break;
                    }
                }
                NotificationType notificationType = (NotificationType) obj;
                return notificationType == null ? NotificationType.UNKNOWN : notificationType;
            }

            public final boolean isMessageWithoutDefaultAvatar(NotificationType notificationType) {
                Intrinsics.checkNotNullParameter(notificationType, "<this>");
                return notificationType == NotificationType.DIARY_NOTE || notificationType == NotificationType.DAILY_COINS_REMINDER || notificationType == NotificationType.SEXTING_MESSAGE || notificationType == NotificationType.AVATAR_GENERATION;
            }
        }
    }

    public final AnalyticsNotificationReceivedUseCase getAnalyticsNotificationReceivedUseCase() {
        AnalyticsNotificationReceivedUseCase analyticsNotificationReceivedUseCase = this.analyticsNotificationReceivedUseCase;
        if (analyticsNotificationReceivedUseCase != null) {
            return analyticsNotificationReceivedUseCase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsNotificationReceivedUseCase");
        return null;
    }

    public final void setAnalyticsNotificationReceivedUseCase(AnalyticsNotificationReceivedUseCase analyticsNotificationReceivedUseCase) {
        Intrinsics.checkNotNullParameter(analyticsNotificationReceivedUseCase, "<set-?>");
        this.analyticsNotificationReceivedUseCase = analyticsNotificationReceivedUseCase;
    }

    public final Preferences getPreferences() {
        Preferences preferences = this.preferences;
        if (preferences != null) {
            return preferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferences");
        return null;
    }

    public final void setPreferences(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "<set-?>");
        this.preferences = preferences;
    }

    public final LongTermNotificationByTypeOfPushHandler getLongTermNotificationHandler() {
        LongTermNotificationByTypeOfPushHandler longTermNotificationByTypeOfPushHandler = this.longTermNotificationHandler;
        if (longTermNotificationByTypeOfPushHandler != null) {
            return longTermNotificationByTypeOfPushHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longTermNotificationHandler");
        return null;
    }

    public final void setLongTermNotificationHandler(LongTermNotificationByTypeOfPushHandler longTermNotificationByTypeOfPushHandler) {
        Intrinsics.checkNotNullParameter(longTermNotificationByTypeOfPushHandler, "<set-?>");
        this.longTermNotificationHandler = longTermNotificationByTypeOfPushHandler;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    public final AvatarsStorage getAvatarsStorage() {
        AvatarsStorage avatarsStorage = this.avatarsStorage;
        if (avatarsStorage != null) {
            return avatarsStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarsStorage");
        return null;
    }

    public final void setAvatarsStorage(AvatarsStorage avatarsStorage) {
        Intrinsics.checkNotNullParameter(avatarsStorage, "<set-?>");
        this.avatarsStorage = avatarsStorage;
    }

    public final CoroutineDispatchers getCoroutineDispatchers() {
        CoroutineDispatchers coroutineDispatchers = this.coroutineDispatchers;
        if (coroutineDispatchers != null) {
            return coroutineDispatchers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineDispatchers");
        return null;
    }

    public final void setCoroutineDispatchers(CoroutineDispatchers coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "<set-?>");
        this.coroutineDispatchers = coroutineDispatchers;
    }

    public final AvatarInPushToggle getAvatarInPushToggle() {
        AvatarInPushToggle avatarInPushToggle = this.avatarInPushToggle;
        if (avatarInPushToggle != null) {
            return avatarInPushToggle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarInPushToggle");
        return null;
    }

    public final void setAvatarInPushToggle(AvatarInPushToggle avatarInPushToggle) {
        Intrinsics.checkNotNullParameter(avatarInPushToggle, "<set-?>");
        this.avatarInPushToggle = avatarInPushToggle;
    }

    public final AvatarInRetentionPushToggle getAvatarInRetentionPushToggle() {
        AvatarInRetentionPushToggle avatarInRetentionPushToggle = this.avatarInRetentionPushToggle;
        if (avatarInRetentionPushToggle != null) {
            return avatarInRetentionPushToggle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarInRetentionPushToggle");
        return null;
    }

    public final void setAvatarInRetentionPushToggle(AvatarInRetentionPushToggle avatarInRetentionPushToggle) {
        Intrinsics.checkNotNullParameter(avatarInRetentionPushToggle, "<set-?>");
        this.avatarInRetentionPushToggle = avatarInRetentionPushToggle;
    }

    public final ChatsInfoConfigurationRepository getChatsInfoConfigurationRepository() {
        ChatsInfoConfigurationRepository chatsInfoConfigurationRepository = this.chatsInfoConfigurationRepository;
        if (chatsInfoConfigurationRepository != null) {
            return chatsInfoConfigurationRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatsInfoConfigurationRepository");
        return null;
    }

    public final void setChatsInfoConfigurationRepository(ChatsInfoConfigurationRepository chatsInfoConfigurationRepository) {
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "<set-?>");
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
    }

    private final AppsFlyerLib getAppsFlyerLib() {
        return (AppsFlyerLib) this.appsFlyerLib$delegate.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Application application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.ifriend.app.App");
        ((App) application).getAppComponent().inject(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        getAppsFlyerLib().updateServerUninstallToken(getApplicationContext(), token);
        Timber.Forest.tag("TOKEN").e(token, new Object[0]);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        Timber.Forest.tag("onMessageReceived").e(message.toString(), new Object[0]);
        if (message.getData().containsKey("af-uinstall-tracking")) {
            return;
        }
        boolean isAppInBackground = isAppInBackground();
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AppFirebaseMessagingService$onMessageReceived$1(this, isAppInBackground, message, null), 3, null);
        if (isAppInBackground) {
            showNotification(message);
        }
    }

    private final void showNotification(RemoteMessage remoteMessage) {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), getCoroutineDispatchers().getIO(), null, new AppFirebaseMessagingService$showNotification$1(remoteMessage, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pushNotification(RemoteMessage remoteMessage, String str, Uri uri, Continuation<? super Unit> continuation) {
        AppFirebaseMessagingService$pushNotification$1 appFirebaseMessagingService$pushNotification$1;
        Object obj;
        int i;
        RemoteMessage remoteMessage2;
        String str2;
        Uri uri2;
        NotificationType notificationType;
        String str3;
        String str4;
        Ref.ObjectRef objectRef;
        String str5;
        AppFirebaseMessagingService appFirebaseMessagingService;
        RemoteMessage remoteMessage3;
        String str6;
        String str7;
        Uri uri3;
        boolean z;
        String str8;
        Ref.ObjectRef objectRef2;
        AppFirebaseMessagingService appFirebaseMessagingService2;
        String str9;
        String str10;
        Uri uri4;
        RemoteMessage remoteMessage4;
        String str11;
        if (continuation instanceof AppFirebaseMessagingService$pushNotification$1) {
            appFirebaseMessagingService$pushNotification$1 = (AppFirebaseMessagingService$pushNotification$1) continuation;
            if ((appFirebaseMessagingService$pushNotification$1.label & Integer.MIN_VALUE) != 0) {
                appFirebaseMessagingService$pushNotification$1.label -= Integer.MIN_VALUE;
                obj = appFirebaseMessagingService$pushNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appFirebaseMessagingService$pushNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NotificationType.Companion companion = NotificationType.Companion;
                    String str12 = remoteMessage.getData().get("type");
                    if (str12 == null) {
                        str12 = "";
                    }
                    NotificationType from = companion.from(str12);
                    String str13 = remoteMessage.getData().get("title");
                    String str14 = remoteMessage.getData().get("text");
                    String str15 = remoteMessage.getData().get(PushConstant.PUSH_DATA_IMPORTANCE_KEY);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    AvatarInPushToggle avatarInPushToggle = getAvatarInPushToggle();
                    appFirebaseMessagingService$pushNotification$1.L$0 = this;
                    remoteMessage2 = remoteMessage;
                    appFirebaseMessagingService$pushNotification$1.L$1 = remoteMessage2;
                    str2 = str;
                    appFirebaseMessagingService$pushNotification$1.L$2 = str2;
                    uri2 = uri;
                    appFirebaseMessagingService$pushNotification$1.L$3 = uri2;
                    appFirebaseMessagingService$pushNotification$1.L$4 = from;
                    appFirebaseMessagingService$pushNotification$1.L$5 = str13;
                    appFirebaseMessagingService$pushNotification$1.L$6 = str14;
                    appFirebaseMessagingService$pushNotification$1.L$7 = str15;
                    appFirebaseMessagingService$pushNotification$1.L$8 = objectRef3;
                    appFirebaseMessagingService$pushNotification$1.label = 1;
                    Object isEnabledCachedValue = avatarInPushToggle.isEnabledCachedValue(appFirebaseMessagingService$pushNotification$1);
                    if (isEnabledCachedValue == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    notificationType = from;
                    str3 = str13;
                    obj = isEnabledCachedValue;
                    str4 = str14;
                    objectRef = objectRef3;
                    str5 = str15;
                    appFirebaseMessagingService = this;
                } else if (i != 1) {
                    if (i == 2) {
                        objectRef2 = (Ref.ObjectRef) appFirebaseMessagingService$pushNotification$1.L$7;
                        str9 = (String) appFirebaseMessagingService$pushNotification$1.L$6;
                        str10 = (String) appFirebaseMessagingService$pushNotification$1.L$5;
                        str7 = (String) appFirebaseMessagingService$pushNotification$1.L$4;
                        uri4 = (Uri) appFirebaseMessagingService$pushNotification$1.L$3;
                        str11 = (String) appFirebaseMessagingService$pushNotification$1.L$2;
                        remoteMessage4 = (RemoteMessage) appFirebaseMessagingService$pushNotification$1.L$1;
                        appFirebaseMessagingService2 = (AppFirebaseMessagingService) appFirebaseMessagingService$pushNotification$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byte[] bArr = (byte[]) obj;
                        objectRef2.element = bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : 0;
                        int priority = appFirebaseMessagingService2.priority(str9);
                        PendingIntent createPendingIntent = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                        LongTermNotificationByTypeOfPushHandler longTermNotificationHandler = appFirebaseMessagingService2.getLongTermNotificationHandler();
                        Map<String, String> data = remoteMessage4.getData();
                        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                        longTermNotificationHandler.handle(data);
                        NotificationCompat.Builder contentText = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority).setContentText(str10);
                        if (uri4 != null) {
                        }
                        NotificationCompat.Builder autoCancel = contentText.setAutoCancel(true);
                        if (objectRef2.element != 0) {
                        }
                        NotificationCompat.Builder contentIntent = autoCancel.setContentIntent(createPendingIntent);
                        Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
                        Object systemService = appFirebaseMessagingService2.getSystemService("notification");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).notify(1, contentIntent.build());
                        return Unit.INSTANCE;
                    } else if (i != 3) {
                        if (i == 4) {
                            objectRef2 = (Ref.ObjectRef) appFirebaseMessagingService$pushNotification$1.L$7;
                            str9 = (String) appFirebaseMessagingService$pushNotification$1.L$6;
                            str10 = (String) appFirebaseMessagingService$pushNotification$1.L$5;
                            str7 = (String) appFirebaseMessagingService$pushNotification$1.L$4;
                            uri4 = (Uri) appFirebaseMessagingService$pushNotification$1.L$3;
                            str11 = (String) appFirebaseMessagingService$pushNotification$1.L$2;
                            remoteMessage4 = (RemoteMessage) appFirebaseMessagingService$pushNotification$1.L$1;
                            appFirebaseMessagingService2 = (AppFirebaseMessagingService) appFirebaseMessagingService$pushNotification$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            byte[] bArr2 = (byte[]) obj;
                            objectRef2.element = bArr2 != null ? BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length) : 0;
                            int priority2 = appFirebaseMessagingService2.priority(str9);
                            PendingIntent createPendingIntent2 = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                            LongTermNotificationByTypeOfPushHandler longTermNotificationHandler2 = appFirebaseMessagingService2.getLongTermNotificationHandler();
                            Map<String, String> data2 = remoteMessage4.getData();
                            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
                            longTermNotificationHandler2.handle(data2);
                            NotificationCompat.Builder contentText2 = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority2).setContentText(str10);
                            if (uri4 != null) {
                                contentText2.setSound(uri4);
                            }
                            NotificationCompat.Builder autoCancel2 = contentText2.setAutoCancel(true);
                            if (objectRef2.element != 0) {
                                autoCancel2.setLargeIcon((Bitmap) objectRef2.element);
                            }
                            NotificationCompat.Builder contentIntent2 = autoCancel2.setContentIntent(createPendingIntent2);
                            Intrinsics.checkNotNullExpressionValue(contentIntent2, "setContentIntent(...)");
                            Object systemService2 = appFirebaseMessagingService2.getSystemService("notification");
                            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                            ((NotificationManager) systemService2).notify(1, contentIntent2.build());
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        boolean z2 = appFirebaseMessagingService$pushNotification$1.Z$0;
                        str8 = (String) appFirebaseMessagingService$pushNotification$1.L$6;
                        str6 = (String) appFirebaseMessagingService$pushNotification$1.L$5;
                        uri3 = (Uri) appFirebaseMessagingService$pushNotification$1.L$3;
                        remoteMessage3 = (RemoteMessage) appFirebaseMessagingService$pushNotification$1.L$1;
                        ResultKt.throwOnFailure(obj);
                        appFirebaseMessagingService = (AppFirebaseMessagingService) appFirebaseMessagingService$pushNotification$1.L$0;
                        z = z2;
                        objectRef = (Ref.ObjectRef) appFirebaseMessagingService$pushNotification$1.L$7;
                        str7 = (String) appFirebaseMessagingService$pushNotification$1.L$4;
                        str2 = (String) appFirebaseMessagingService$pushNotification$1.L$2;
                        if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(true)) && !z) {
                            AvatarsStorage avatarsStorage = appFirebaseMessagingService.getAvatarsStorage();
                            FileFormat fileFormat = FileFormat.PNG;
                            appFirebaseMessagingService$pushNotification$1.L$0 = appFirebaseMessagingService;
                            appFirebaseMessagingService$pushNotification$1.L$1 = remoteMessage3;
                            appFirebaseMessagingService$pushNotification$1.L$2 = str2;
                            appFirebaseMessagingService$pushNotification$1.L$3 = uri3;
                            appFirebaseMessagingService$pushNotification$1.L$4 = str7;
                            appFirebaseMessagingService$pushNotification$1.L$5 = str6;
                            appFirebaseMessagingService$pushNotification$1.L$6 = str8;
                            appFirebaseMessagingService$pushNotification$1.L$7 = objectRef;
                            appFirebaseMessagingService$pushNotification$1.label = 4;
                            obj = avatarsStorage.getUserAvatar(fileFormat, appFirebaseMessagingService$pushNotification$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef;
                            appFirebaseMessagingService2 = appFirebaseMessagingService;
                            str9 = str8;
                            str10 = str6;
                            str11 = str2;
                            uri4 = uri3;
                            remoteMessage4 = remoteMessage3;
                            byte[] bArr22 = (byte[]) obj;
                            objectRef2.element = bArr22 != null ? BitmapFactory.decodeByteArray(bArr22, 0, bArr22.length) : 0;
                            int priority22 = appFirebaseMessagingService2.priority(str9);
                            PendingIntent createPendingIntent22 = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                            LongTermNotificationByTypeOfPushHandler longTermNotificationHandler22 = appFirebaseMessagingService2.getLongTermNotificationHandler();
                            Map<String, String> data22 = remoteMessage4.getData();
                            Intrinsics.checkNotNullExpressionValue(data22, "getData(...)");
                            longTermNotificationHandler22.handle(data22);
                            NotificationCompat.Builder contentText22 = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority22).setContentText(str10);
                            if (uri4 != null) {
                            }
                            NotificationCompat.Builder autoCancel22 = contentText22.setAutoCancel(true);
                            if (objectRef2.element != 0) {
                            }
                            NotificationCompat.Builder contentIntent22 = autoCancel22.setContentIntent(createPendingIntent22);
                            Intrinsics.checkNotNullExpressionValue(contentIntent22, "setContentIntent(...)");
                            Object systemService22 = appFirebaseMessagingService2.getSystemService("notification");
                            Intrinsics.checkNotNull(systemService22, "null cannot be cast to non-null type android.app.NotificationManager");
                            ((NotificationManager) systemService22).notify(1, contentIntent22.build());
                            return Unit.INSTANCE;
                        }
                        objectRef2 = objectRef;
                        appFirebaseMessagingService2 = appFirebaseMessagingService;
                        str9 = str8;
                        str10 = str6;
                        str11 = str2;
                        uri4 = uri3;
                        remoteMessage4 = remoteMessage3;
                        int priority222 = appFirebaseMessagingService2.priority(str9);
                        PendingIntent createPendingIntent222 = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                        LongTermNotificationByTypeOfPushHandler longTermNotificationHandler222 = appFirebaseMessagingService2.getLongTermNotificationHandler();
                        Map<String, String> data222 = remoteMessage4.getData();
                        Intrinsics.checkNotNullExpressionValue(data222, "getData(...)");
                        longTermNotificationHandler222.handle(data222);
                        NotificationCompat.Builder contentText222 = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority222).setContentText(str10);
                        if (uri4 != null) {
                        }
                        NotificationCompat.Builder autoCancel222 = contentText222.setAutoCancel(true);
                        if (objectRef2.element != 0) {
                        }
                        NotificationCompat.Builder contentIntent222 = autoCancel222.setContentIntent(createPendingIntent222);
                        Intrinsics.checkNotNullExpressionValue(contentIntent222, "setContentIntent(...)");
                        Object systemService222 = appFirebaseMessagingService2.getSystemService("notification");
                        Intrinsics.checkNotNull(systemService222, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService222).notify(1, contentIntent222.build());
                        return Unit.INSTANCE;
                    }
                } else {
                    objectRef = (Ref.ObjectRef) appFirebaseMessagingService$pushNotification$1.L$8;
                    str5 = (String) appFirebaseMessagingService$pushNotification$1.L$7;
                    String str16 = (String) appFirebaseMessagingService$pushNotification$1.L$6;
                    NotificationType notificationType2 = (NotificationType) appFirebaseMessagingService$pushNotification$1.L$4;
                    uri2 = (Uri) appFirebaseMessagingService$pushNotification$1.L$3;
                    appFirebaseMessagingService = (AppFirebaseMessagingService) appFirebaseMessagingService$pushNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    remoteMessage2 = (RemoteMessage) appFirebaseMessagingService$pushNotification$1.L$1;
                    str4 = str16;
                    str3 = (String) appFirebaseMessagingService$pushNotification$1.L$5;
                    str2 = (String) appFirebaseMessagingService$pushNotification$1.L$2;
                    notificationType = notificationType2;
                }
                if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(true))) {
                    AvatarsStorage avatarsStorage2 = appFirebaseMessagingService.getAvatarsStorage();
                    FileFormat fileFormat2 = FileFormat.PNG;
                    appFirebaseMessagingService$pushNotification$1.L$0 = appFirebaseMessagingService;
                    appFirebaseMessagingService$pushNotification$1.L$1 = remoteMessage2;
                    appFirebaseMessagingService$pushNotification$1.L$2 = str2;
                    appFirebaseMessagingService$pushNotification$1.L$3 = uri2;
                    appFirebaseMessagingService$pushNotification$1.L$4 = str3;
                    appFirebaseMessagingService$pushNotification$1.L$5 = str4;
                    appFirebaseMessagingService$pushNotification$1.L$6 = str5;
                    appFirebaseMessagingService$pushNotification$1.L$7 = objectRef;
                    appFirebaseMessagingService$pushNotification$1.L$8 = null;
                    appFirebaseMessagingService$pushNotification$1.label = 2;
                    obj = avatarsStorage2.getUserAvatar(fileFormat2, appFirebaseMessagingService$pushNotification$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                    appFirebaseMessagingService2 = appFirebaseMessagingService;
                    str9 = str5;
                    str10 = str4;
                    str7 = str3;
                    uri4 = uri2;
                    String str17 = str2;
                    remoteMessage4 = remoteMessage2;
                    str11 = str17;
                    byte[] bArr3 = (byte[]) obj;
                    objectRef2.element = bArr3 != null ? BitmapFactory.decodeByteArray(bArr3, 0, bArr3.length) : 0;
                    int priority2222 = appFirebaseMessagingService2.priority(str9);
                    PendingIntent createPendingIntent2222 = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                    LongTermNotificationByTypeOfPushHandler longTermNotificationHandler2222 = appFirebaseMessagingService2.getLongTermNotificationHandler();
                    Map<String, String> data2222 = remoteMessage4.getData();
                    Intrinsics.checkNotNullExpressionValue(data2222, "getData(...)");
                    longTermNotificationHandler2222.handle(data2222);
                    NotificationCompat.Builder contentText2222 = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority2222).setContentText(str10);
                    if (uri4 != null) {
                    }
                    NotificationCompat.Builder autoCancel2222 = contentText2222.setAutoCancel(true);
                    if (objectRef2.element != 0) {
                    }
                    NotificationCompat.Builder contentIntent2222 = autoCancel2222.setContentIntent(createPendingIntent2222);
                    Intrinsics.checkNotNullExpressionValue(contentIntent2222, "setContentIntent(...)");
                    Object systemService2222 = appFirebaseMessagingService2.getSystemService("notification");
                    Intrinsics.checkNotNull(systemService2222, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService2222).notify(1, contentIntent2222.build());
                    return Unit.INSTANCE;
                }
                boolean isMessageWithoutDefaultAvatar = NotificationType.Companion.isMessageWithoutDefaultAvatar(notificationType);
                AvatarInRetentionPushToggle avatarInRetentionPushToggle = appFirebaseMessagingService.getAvatarInRetentionPushToggle();
                appFirebaseMessagingService$pushNotification$1.L$0 = appFirebaseMessagingService;
                appFirebaseMessagingService$pushNotification$1.L$1 = remoteMessage2;
                appFirebaseMessagingService$pushNotification$1.L$2 = str2;
                appFirebaseMessagingService$pushNotification$1.L$3 = uri2;
                appFirebaseMessagingService$pushNotification$1.L$4 = str3;
                appFirebaseMessagingService$pushNotification$1.L$5 = str4;
                appFirebaseMessagingService$pushNotification$1.L$6 = str5;
                appFirebaseMessagingService$pushNotification$1.L$7 = objectRef;
                appFirebaseMessagingService$pushNotification$1.L$8 = null;
                appFirebaseMessagingService$pushNotification$1.Z$0 = isMessageWithoutDefaultAvatar;
                appFirebaseMessagingService$pushNotification$1.label = 3;
                Object isEnabledCachedValue2 = avatarInRetentionPushToggle.isEnabledCachedValue(appFirebaseMessagingService$pushNotification$1);
                if (isEnabledCachedValue2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                remoteMessage3 = remoteMessage2;
                str6 = str4;
                str7 = str3;
                uri3 = uri2;
                String str18 = str5;
                z = isMessageWithoutDefaultAvatar;
                obj = isEnabledCachedValue2;
                str8 = str18;
                if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(true))) {
                }
                objectRef2 = objectRef;
                appFirebaseMessagingService2 = appFirebaseMessagingService;
                str9 = str8;
                str10 = str6;
                str11 = str2;
                uri4 = uri3;
                remoteMessage4 = remoteMessage3;
                int priority22222 = appFirebaseMessagingService2.priority(str9);
                PendingIntent createPendingIntent22222 = appFirebaseMessagingService2.createPendingIntent(remoteMessage4);
                LongTermNotificationByTypeOfPushHandler longTermNotificationHandler22222 = appFirebaseMessagingService2.getLongTermNotificationHandler();
                Map<String, String> data22222 = remoteMessage4.getData();
                Intrinsics.checkNotNullExpressionValue(data22222, "getData(...)");
                longTermNotificationHandler22222.handle(data22222);
                NotificationCompat.Builder contentText22222 = new NotificationCompat.Builder(appFirebaseMessagingService2.getApplicationContext(), str11).setSmallIcon(R.mipmap.ic_app_icon).setContentTitle(str7).setPriority(priority22222).setContentText(str10);
                if (uri4 != null) {
                }
                NotificationCompat.Builder autoCancel22222 = contentText22222.setAutoCancel(true);
                if (objectRef2.element != 0) {
                }
                NotificationCompat.Builder contentIntent22222 = autoCancel22222.setContentIntent(createPendingIntent22222);
                Intrinsics.checkNotNullExpressionValue(contentIntent22222, "setContentIntent(...)");
                Object systemService22222 = appFirebaseMessagingService2.getSystemService("notification");
                Intrinsics.checkNotNull(systemService22222, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService22222).notify(1, contentIntent22222.build());
                return Unit.INSTANCE;
            }
        }
        appFirebaseMessagingService$pushNotification$1 = new AppFirebaseMessagingService$pushNotification$1(this, continuation);
        obj = appFirebaseMessagingService$pushNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appFirebaseMessagingService$pushNotification$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(true))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri soundUri(String str) {
        String str2 = Intrinsics.areEqual(str, "electric_bell.wav") ? "electric_bell" : null;
        if (str2 != null) {
            String packageName = getApplicationContext().getPackageName();
            return Uri.parse("android.resource://" + packageName + "/raw/" + str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String initChannel(RemoteMessage remoteMessage, Uri uri) {
        int i = Build.VERSION.SDK_INT;
        String str = NORMAL_PRIORITY_CHANNEL_ID;
        if (i < 26) {
            return NORMAL_PRIORITY_CHANNEL_ID;
        }
        String str2 = remoteMessage.getData().get(PushConstant.PUSH_DATA_IMPORTANCE_KEY);
        String str3 = Intrinsics.areEqual(remoteMessage.getData().get(PushConstant.PUSH_DATA_SOUND_KEY), "electric_bell.wav") ? "1" : "0";
        if (isHighImportance(str2)) {
            str = HIGH_PRIORITY_CHANNEL_ID;
        }
        String str4 = str + "_" + str3;
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel m = UIUtils$$ExternalSyntheticApiModelOutline0.m(str4, "Eva_FCM", channelImportance(str2));
        AudioAttributes build = new AudioAttributes.Builder().setContentType(0).setUsage(5).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (uri != null) {
            m.setSound(uri, build);
        }
        notificationManager.createNotificationChannel(m);
        return str4;
    }

    private final PendingIntent createPendingIntent(RemoteMessage remoteMessage) {
        AppFirebaseMessagingService appFirebaseMessagingService = this;
        Intent intent = new Intent(appFirebaseMessagingService, SplashActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.putExtra(Constants.NOTIFICATION_OPEN_APP, true);
        intent.putExtra(Constants.NOTIFICATION_PAYLOAD, this.gson.toJson(remoteMessage.getData()));
        intent.putExtra(Constants.DEEP_LINK_URI, remoteMessage.getData().get("uri"));
        PendingIntent activity = PendingIntent.getActivity(appFirebaseMessagingService, 0, intent, 1140850688);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    private final int priority(String str) {
        return isHighImportance(str) ? 1 : 0;
    }

    private final int channelImportance(String str) {
        return isHighImportance(str) ? 4 : 3;
    }

    private final boolean isHighImportance(String str) {
        return Intrinsics.areEqual(str, "high");
    }

    private final boolean isAppInBackground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance != 100;
    }
}
