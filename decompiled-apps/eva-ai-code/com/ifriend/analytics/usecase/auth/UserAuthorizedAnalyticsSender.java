package com.ifriend.analytics.usecase.auth;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.AppsFlyerAnalyticsSender;
import com.ifriend.analytics.FirebaseAnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.domain.data.install.AppInstallStorage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserAuthorizedAnalyticsSender.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;", "", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "(Lcom/ifriend/domain/data/install/AppInstallStorage;[Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "send", "", "userCreated", "", FirebaseAnalytics.Param.METHOD, "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender$Method;", "Method", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAuthorizedAnalyticsSender {
    private final AnalyticsSender[] analyticsSenders;
    private final AppInstallStorage appInstallStorage;

    /* compiled from: UserAuthorizedAnalyticsSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Method.values().length];
            try {
                iArr[Method.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Method.FB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserAuthorizedAnalyticsSender(AppInstallStorage appInstallStorage, AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.appInstallStorage = appInstallStorage;
        this.analyticsSenders = analyticsSenders;
    }

    public final void send(boolean z, Method method) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        FirebaseAnalyticsSender firebaseAnalyticsSender;
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender;
        Intrinsics.checkNotNullParameter(method, "method");
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            annalsTrackerAnalyticsSender = null;
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
            if (z) {
                firebaseAnalyticsSender2.sendEvent(FirebaseAnalytics.Event.SIGN_UP, MapsKt.mapOf(new Pair(FirebaseAnalytics.UserProperty.SIGN_UP_METHOD, method.name())));
            } else {
                firebaseAnalyticsSender2.sendEvent(FirebaseAnalytics.Event.LOGIN, MapsKt.mapOf(new Pair("LOGIN_METHOD", method.name())));
            }
            firebaseAnalyticsSender2.setUserProperty("YES", "USER_" + method.name());
        }
        int length2 = analyticsSenderArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                appsFlyerAnalyticsSender = null;
                break;
            }
            appsFlyerAnalyticsSender = analyticsSenderArr[i2];
            if (appsFlyerAnalyticsSender instanceof AppsFlyerAnalyticsSender) {
                break;
            }
            i2++;
        }
        AppsFlyerAnalyticsSender appsFlyerAnalyticsSender2 = appsFlyerAnalyticsSender;
        if (appsFlyerAnalyticsSender2 != null && z) {
            Pair[] pairArr = new Pair[2];
            int i3 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
            pairArr[0] = new Pair(AFInAppEventParameterName.REGSITRATION_METHOD, i3 != 1 ? i3 != 2 ? "email" : AccessToken.DEFAULT_GRAPH_DOMAIN : "google");
            pairArr[1] = new Pair(AFInAppEventParameterName.REVENUE, 0);
            appsFlyerAnalyticsSender2.sendEvent(AFInAppEventType.COMPLETE_REGISTRATION, MapsKt.mapOf(pairArr));
        }
        int length3 = analyticsSenderArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                break;
            }
            AnalyticsSender analyticsSender = analyticsSenderArr[i4];
            if (analyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                annalsTrackerAnalyticsSender = analyticsSender;
                break;
            }
            i4++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 != null) {
            Pair[] pairArr2 = new Pair[3];
            pairArr2[0] = AnalyticsConstants.INSTANCE.getTimestamp();
            pairArr2[1] = TuplesKt.to(AnalyticsConstants.UUID, this.appInstallStorage.getUUID());
            pairArr2[2] = TuplesKt.to(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, z ? "signup" : "signin");
            annalsTrackerAnalyticsSender2.sendEvent("auth-finished", MapsKt.mapOf(pairArr2));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAuthorizedAnalyticsSender.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender$Method;", "", "(Ljava/lang/String;I)V", "EMAIL", "GOOGLE", "FB", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Method {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        public static final Method EMAIL = new Method("EMAIL", 0);
        public static final Method GOOGLE = new Method("GOOGLE", 1);
        public static final Method FB = new Method("FB", 2);

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{EMAIL, GOOGLE, FB};
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }

        private Method(String str, int i) {
        }

        static {
            Method[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
