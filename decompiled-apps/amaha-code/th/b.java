package th;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import is.y;
import java.util.HashSet;
import java.util.Set;
import u7.s;
/* compiled from: RemoteConfigDefault.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f33018a = ca.a.m1("NOTIFICATION_RECEIVED_MOE", "MOE_NOTIFICATION_RECEIVED_PA_PLUS");

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f33019b = ca.a.m1("NOTIFICATION_RECEIVED_MOE", "NOTIFICATION_CLICKED_MOE", "MOE_IN_APP_SHOWN", "MOE_IN_APP_CLICKED", "MOE_IN_APP_AUTO_DISMISS", "MOE_IN_APP_DISMISSED", "MOE_CARD_DELIVERED", "MOE_CARD_IMPRESSION", "MOE_CARD_CLICKED", "MOE_CARD_DISMISSED", "MOE_CARD_INBOX_CLICKED", "EVENT_ACTION_COUPON_CODE_COPY", "NOTIFICATION_OFFLINE_MOE", "DT_CAMPAIGN_SCHEDULED", "EVENT_ACTION_ACTIVITY_START", "MOE_APP_RATED", "TOKEN_EVENT", "MOE_APP_EXIT", "INSTALL", "UPDATE");

    public static final a a() {
        return new a(true, new mu.b(true), new ph.a(1800000L, 60L, 30, new HashSet(), new HashSet(f33018a), 1800L, new HashSet(f33019b), new HashSet(), new HashSet(), true, new HashSet(), 43200L), new fs.c(1800000L, new HashSet()), new ph.c(2419200000L, y.f20678u), new ph.b(0, false), new s(10800000L), new ih.g(false), new s5("28caa46a6e9c77fbe291287e4fec061f", 6));
    }
}
