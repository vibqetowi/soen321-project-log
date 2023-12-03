package k5;

import gv.m;
import h5.p;
import h5.w;
import is.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.v;
/* compiled from: AppEventsConversionsAPITransformer.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<k5.b, c> f22974a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<l, b> f22975b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, i> f22976c;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        OPTIONS("data_processing_options"),
        /* JADX INFO: Fake field, exist only in values array */
        COUNTRY("data_processing_options_country"),
        /* JADX INFO: Fake field, exist only in values array */
        STATE("data_processing_options_state");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f22978u;

        a(String str) {
            this.f22978u = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final j f22979a;

        /* renamed from: b  reason: collision with root package name */
        public final h f22980b;

        public b(j jVar, h hVar) {
            this.f22979a = jVar;
            this.f22980b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22979a == bVar.f22979a && this.f22980b == bVar.f22980b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            j jVar = this.f22979a;
            if (jVar == null) {
                hashCode = 0;
            } else {
                hashCode = jVar.hashCode();
            }
            return this.f22980b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f22979a + ", field=" + this.f22980b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final j f22981a;

        /* renamed from: b  reason: collision with root package name */
        public final k f22982b;

        public c(j jVar, k kVar) {
            this.f22981a = jVar;
            this.f22982b = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f22981a == cVar.f22981a && this.f22982b == cVar.f22982b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f22981a.hashCode() * 31;
            k kVar = this.f22982b;
            if (kVar == null) {
                hashCode = 0;
            } else {
                hashCode = kVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "SectionFieldMapping(section=" + this.f22981a + ", field=" + this.f22982b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* loaded from: classes.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;
        

        /* renamed from: u  reason: collision with root package name */
        public static final a f22983u = new a();

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            return (d[]) Arrays.copyOf(values(), 3);
        }
    }

    static {
        k5.b bVar = k5.b.ANON_ID;
        j jVar = j.USER_DATA;
        k5.b bVar2 = k5.b.ADV_TE;
        j jVar2 = j.APP_DATA;
        f22974a = e0.u0(new hs.f(bVar, new c(jVar, k.ANON_ID)), new hs.f(k5.b.APP_USER_ID, new c(jVar, k.FB_LOGIN_ID)), new hs.f(k5.b.ADVERTISER_ID, new c(jVar, k.MAD_ID)), new hs.f(k5.b.PAGE_ID, new c(jVar, k.PAGE_ID)), new hs.f(k5.b.PAGE_SCOPED_USER_ID, new c(jVar, k.PAGE_SCOPED_USER_ID)), new hs.f(bVar2, new c(jVar2, k.ADV_TE)), new hs.f(k5.b.APP_TE, new c(jVar2, k.APP_TE)), new hs.f(k5.b.CONSIDER_VIEWS, new c(jVar2, k.CONSIDER_VIEWS)), new hs.f(k5.b.DEVICE_TOKEN, new c(jVar2, k.DEVICE_TOKEN)), new hs.f(k5.b.EXT_INFO, new c(jVar2, k.EXT_INFO)), new hs.f(k5.b.INCLUDE_DWELL_DATA, new c(jVar2, k.INCLUDE_DWELL_DATA)), new hs.f(k5.b.INCLUDE_VIDEO_DATA, new c(jVar2, k.INCLUDE_VIDEO_DATA)), new hs.f(k5.b.INSTALL_REFERRER, new c(jVar2, k.INSTALL_REFERRER)), new hs.f(k5.b.INSTALLER_PACKAGE, new c(jVar2, k.INSTALLER_PACKAGE)), new hs.f(k5.b.RECEIPT_DATA, new c(jVar2, k.RECEIPT_DATA)), new hs.f(k5.b.URL_SCHEMES, new c(jVar2, k.URL_SCHEMES)), new hs.f(k5.b.USER_DATA, new c(jVar, null)));
        l lVar = l.VALUE_TO_SUM;
        j jVar3 = j.CUSTOM_DATA;
        f22975b = e0.u0(new hs.f(l.EVENT_TIME, new b(null, h.EVENT_TIME)), new hs.f(l.EVENT_NAME, new b(null, h.EVENT_NAME)), new hs.f(lVar, new b(jVar3, h.VALUE_TO_SUM)), new hs.f(l.CONTENT_IDS, new b(jVar3, h.CONTENT_IDS)), new hs.f(l.CONTENTS, new b(jVar3, h.CONTENTS)), new hs.f(l.CONTENT_TYPE, new b(jVar3, h.CONTENT_TYPE)), new hs.f(l.CURRENCY, new b(jVar3, h.CURRENCY)), new hs.f(l.DESCRIPTION, new b(jVar3, h.DESCRIPTION)), new hs.f(l.LEVEL, new b(jVar3, h.LEVEL)), new hs.f(l.MAX_RATING_VALUE, new b(jVar3, h.MAX_RATING_VALUE)), new hs.f(l.NUM_ITEMS, new b(jVar3, h.NUM_ITEMS)), new hs.f(l.PAYMENT_INFO_AVAILABLE, new b(jVar3, h.PAYMENT_INFO_AVAILABLE)), new hs.f(l.REGISTRATION_METHOD, new b(jVar3, h.REGISTRATION_METHOD)), new hs.f(l.SEARCH_STRING, new b(jVar3, h.SEARCH_STRING)), new hs.f(l.SUCCESS, new b(jVar3, h.SUCCESS)), new hs.f(l.ORDER_ID, new b(jVar3, h.ORDER_ID)), new hs.f(l.AD_TYPE, new b(jVar3, h.AD_TYPE)));
        f22976c = e0.u0(new hs.f("fb_mobile_achievement_unlocked", i.UNLOCKED_ACHIEVEMENT), new hs.f("fb_mobile_activate_app", i.ACTIVATED_APP), new hs.f("fb_mobile_add_payment_info", i.ADDED_PAYMENT_INFO), new hs.f("fb_mobile_add_to_cart", i.ADDED_TO_CART), new hs.f("fb_mobile_add_to_wishlist", i.ADDED_TO_WISHLIST), new hs.f("fb_mobile_complete_registration", i.COMPLETED_REGISTRATION), new hs.f("fb_mobile_content_view", i.VIEWED_CONTENT), new hs.f("fb_mobile_initiated_checkout", i.INITIATED_CHECKOUT), new hs.f("fb_mobile_level_achieved", i.ACHIEVED_LEVEL), new hs.f("fb_mobile_purchase", i.PURCHASED), new hs.f("fb_mobile_rate", i.RATED), new hs.f("fb_mobile_search", i.SEARCHED), new hs.f("fb_mobile_spent_credits", i.SPENT_CREDITS), new hs.f("fb_mobile_tutorial_completion", i.COMPLETED_TUTORIAL));
    }

    public static final Object a(Object obj, String str) {
        d dVar;
        String str2;
        String str3;
        Cloneable g5;
        d.f22983u.getClass();
        if (kotlin.jvm.internal.i.b(str, "extInfo")) {
            dVar = d.ARRAY;
        } else if (kotlin.jvm.internal.i.b(str, "url_schemes")) {
            dVar = d.ARRAY;
        } else if (kotlin.jvm.internal.i.b(str, "fb_content_id")) {
            dVar = d.ARRAY;
        } else if (kotlin.jvm.internal.i.b(str, "fb_content")) {
            dVar = d.ARRAY;
        } else if (kotlin.jvm.internal.i.b(str, "data_processing_options")) {
            dVar = d.ARRAY;
        } else if (kotlin.jvm.internal.i.b(str, "advertiser_tracking_enabled")) {
            dVar = d.BOOL;
        } else if (kotlin.jvm.internal.i.b(str, "application_tracking_enabled")) {
            dVar = d.BOOL;
        } else if (kotlin.jvm.internal.i.b(str, "_logTime")) {
            dVar = d.INT;
        } else {
            dVar = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (dVar != null && str2 != null) {
            int ordinal = dVar.ordinal();
            if (ordinal != 0) {
                boolean z10 = true;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return m.w0(obj.toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Integer w02 = m.w0(str2);
                if (w02 == null) {
                    return null;
                }
                if (w02.intValue() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
            try {
                w5.e0 e0Var = w5.e0.f36453a;
                ArrayList<String> g10 = w5.e0.g(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (String str4 : g10) {
                    try {
                        try {
                            w5.e0 e0Var2 = w5.e0.f36453a;
                            g5 = w5.e0.h(new JSONObject(str4));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        w5.e0 e0Var3 = w5.e0.f36453a;
                        g5 = w5.e0.g(new JSONArray(str3));
                    }
                    arrayList.add(g5);
                }
                return arrayList;
            } catch (JSONException unused3) {
                v.a aVar = v.f36544d;
                p.i(w.APP_EVENTS);
                return hs.k.f19476a;
            }
        }
        return obj;
    }
}
