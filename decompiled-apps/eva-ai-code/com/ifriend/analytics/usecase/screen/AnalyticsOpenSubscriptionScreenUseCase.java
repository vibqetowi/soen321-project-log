package com.ifriend.analytics.usecase.screen;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.AppsFlyerAnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.FirebaseAnalyticsSender;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.core.tools.api.AppIdentityConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsOpenSubscriptionScreenUseCase.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/core/tools/api/AppIdentityConverter;[Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "reason", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "chatId", "", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsOpenSubscriptionScreenUseCase {
    private final AnalyticsSender[] analyticsSenders;
    private final AppIdentityConverter appIdentityConverter;

    /* compiled from: AnalyticsOpenSubscriptionScreenUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseSource.values().length];
            try {
                iArr[PurchaseSource.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseSource.MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseSource.WATCH_AI_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseSource.SEXTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseSource.GENERATE_AVATAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchaseSource.GET_FREE_NEURONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchaseSource.CHANGE_VOICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchaseSource.RESTORE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchaseSource.DIARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PurchaseSource.GIFT_STORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PurchaseSource.CHATLIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PurchaseSource.CHATLIST_DIGITAL_COPY_SUBSCRIPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PurchaseSource.DEEPLINK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PurchaseSource.CALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PurchaseSource.AUTO_AFTER_N_DAYS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PurchaseSource.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnalyticsOpenSubscriptionScreenUseCase(AppIdentityConverter appIdentityConverter, AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.appIdentityConverter = appIdentityConverter;
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle(PurchaseSource reason, String chatId) {
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender;
        FirebaseAnalyticsSender firebaseAnalyticsSender;
        String str;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            appsFlyerAnalyticsSender = null;
            if (i >= length) {
                firebaseAnalyticsSender = null;
                break;
            }
            firebaseAnalyticsSender = analyticsSenderArr[i];
            if (firebaseAnalyticsSender instanceof FirebaseAnalyticsSender) {
                break;
            }
            i++;
        }
        FirebaseAnalyticsSender firebaseAnalyticsSender2 = firebaseAnalyticsSender;
        if (firebaseAnalyticsSender2 != null) {
            firebaseAnalyticsSender2.sendEvent(FirebaseAnalytics.Event.BEGIN_CHECKOUT, MapsKt.mapOf(new Pair("reason", reason.name()), new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId))));
        }
        int length2 = analyticsSenderArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            AnalyticsSender analyticsSender = analyticsSenderArr[i2];
            if (analyticsSender instanceof AppsFlyerAnalyticsSender) {
                appsFlyerAnalyticsSender = analyticsSender;
                break;
            }
            i2++;
        }
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender2 = appsFlyerAnalyticsSender;
        if (appsFlyerAnalyticsSender2 != null) {
            Pair[] pairArr = new Pair[2];
            switch (WhenMappings.$EnumSwitchMapping$0[reason.ordinal()]) {
                case 1:
                    str = "chat";
                    break;
                case 2:
                    str = "menu";
                    break;
                case 3:
                    str = "watch-ai-photo";
                    break;
                case 4:
                    str = "sexting";
                    break;
                case 5:
                    str = "generate-avatar";
                    break;
                case 6:
                    str = "get-free-neurons";
                    break;
                case 7:
                    str = "change-voice";
                    break;
                case 8:
                    str = "restore";
                    break;
                case 9:
                    str = "diary";
                    break;
                case 10:
                    str = "GIFT_STORE";
                    break;
                case 11:
                    str = "CHATLIST";
                    break;
                case 12:
                    str = "CHATLIST_DIGITAL_COPY_SUBSCRIPTION";
                    break;
                case 13:
                    str = "DEEPLINK";
                    break;
                case 14:
                    str = "CALL";
                    break;
                case 15:
                    str = "auto_after_N_day";
                    break;
                case 16:
                    str = "unknown";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            pairArr[0] = new Pair("reason", str);
            pairArr[1] = new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), this.appIdentityConverter.convertToDbId(chatId));
            appsFlyerAnalyticsSender2.sendEvent(FirebaseAnalytics.Event.BEGIN_CHECKOUT, MapsKt.mapOf(pairArr));
        }
    }
}
