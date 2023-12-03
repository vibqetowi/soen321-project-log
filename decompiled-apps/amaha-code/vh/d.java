package vh;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.MediaDrm;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class d implements vh.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35109a;

    /* renamed from: b  reason: collision with root package name */
    public final lh.a f35110b;

    /* renamed from: c  reason: collision with root package name */
    public final ih.p f35111c;

    /* renamed from: d  reason: collision with root package name */
    public final String f35112d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f35113e;
    public final kotlinx.coroutines.e0 f;

    /* renamed from: g  reason: collision with root package name */
    public final v.c f35114g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f35115h;

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.c f35117v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mh.c cVar) {
            super(0);
            this.f35117v = cVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " addEvent() Event : " + this.f35117v.f25061c;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f35119v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str) {
            super(0);
            this.f35119v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " isAttributePresentInCache() : Checking if Attribute is present in cache: " + this.f35119v;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addEvent(): ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public b0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" isAttributePresentInCache() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.a f35123v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mh.a aVar) {
            super(0);
            this.f35123v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " addOrUpdateAttribute() : Attribute: " + this.f35123v;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class c0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public c0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" removeExpiredData() : Deleting expired data", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* renamed from: vh.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0595d extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0595d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateAttribute() : Updating attribute", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class d0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public d0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" removeExpiredData() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateAttribute() : Adding attribute", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class e0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public e0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" storeUserSession() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateAttribute() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class f0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.b f35131v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(mh.b bVar) {
            super(0);
            this.f35131v = bVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " updateBatch() : Updating batch, batch-id: " + this.f35131v.f25057a;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.e f35133v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ih.e eVar) {
            super(0);
            this.f35133v = eVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " addOrUpdateDeviceAttribute() : " + this.f35133v;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class g0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public g0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateBatch() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateDeviceAttribute() : Updating device attribute", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class h0 extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.b f35137v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(mh.b bVar) {
            super(0);
            this.f35137v = bVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " writeBatch() : Batch-id: " + this.f35137v.f25057a;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateDeviceAttribute() : Add device attribute", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class i0 extends kotlin.jvm.internal.k implements ss.a<String> {
        public i0() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeBatch() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {
        public j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateDeviceAttribute() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" clearCachedData() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {
        public l() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" clearTrackedData(): ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" clearData() : Clearing data", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.b f35145v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(mh.b bVar) {
            super(0);
            this.f35145v = bVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " deleteBatch() : Deleting Batch, batch-id: " + this.f35145v.f25057a;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<String> {
        public o() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" deleteBatch() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.a<String> {
        public p() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" deleteInteractionData() : Deleting datapoints", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.a<String> {
        public q() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" deleteInteractionData() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f35150v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(0);
            this.f35150v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " getAttributeByName() : Attribute name: " + this.f35150v;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.a<String> {
        public s() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getAttributeByName() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class t extends kotlin.jvm.internal.k implements ss.a<String> {
        public t() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCurrentUserId() : Generating new unique-id", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.a<String> {
        public u() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCurrentUserId() : unique-id present in DB", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.a<String> {
        public v() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCurrentUserId() : reading unique id from shared preference.", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.a<String> {
        public w() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCurrentUserId() : generating unique id from fallback, something went wrong.", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class x extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f35157v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(0);
            this.f35157v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35112d + " getDeviceAttributeByName() : Attribute Name: " + this.f35157v;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class y extends kotlin.jvm.internal.k implements ss.a<String> {
        public y() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getDeviceAttributeByName() : ", d.this.f35112d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class z extends kotlin.jvm.internal.k implements ss.a<String> {
        public z() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getUserUniqueId() : ", d.this.f35112d);
        }
    }

    public d(Context context, lh.a aVar, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f35109a = context;
        this.f35110b = aVar;
        this.f35111c = sdkInstance;
        this.f35112d = "Core_LocalRepositoryImpl";
        this.f35113e = new Object();
        this.f = new kotlinx.coroutines.e0(10);
        this.f35114g = aVar.f24374b;
        this.f35115h = new Object();
    }

    @Override // vh.c
    public final void A(int i6) {
        this.f35110b.f24373a.H(i6, "PREF_KEY_MOE_ISLAT");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r14 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        return null;
     */
    @Override // vh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ih.e B(String attributeName) {
        Throwable th2;
        Cursor cursor;
        ih.p pVar = this.f35111c;
        kotlin.jvm.internal.i.g(attributeName, "attributeName");
        try {
            hh.g.b(pVar.f20105d, 0, new x(attributeName), 3);
            cursor = this.f35114g.g("USERATTRIBUTES", new p0.f(f6.b.f14868w, new nd.z("attribute_name=?", 11, new String[]{attributeName}), null, 0, 60));
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        this.f.getClass();
                        String string = cursor.getString(1);
                        kotlin.jvm.internal.i.f(string, "cursor.getString(DEVICE_…UMN_INDEX_ATTRIBUTE_NAME)");
                        String string2 = cursor.getString(2);
                        kotlin.jvm.internal.i.f(string2, "cursor.getString(DEVICE_…MN_INDEX_ATTRIBUTE_VALUE)");
                        ih.e eVar = new ih.e(string, string2, 0);
                        cursor.close();
                        return eVar;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        pVar.f20105d.a(1, th2, new y());
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d9  */
    @Override // vh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject C(ih.g devicePreferences, ih.e pushTokens, ih.p sdkInstance) {
        String str;
        boolean z10;
        String str2;
        MediaDrm mediaDrm;
        NetworkInfo networkInfo;
        ad.h a10;
        boolean z11;
        kotlin.jvm.internal.i.g(devicePreferences, "devicePreferences");
        kotlin.jvm.internal.i.g(pushTokens, "pushTokens");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        Context context = this.f35109a;
        kotlin.jvm.internal.i.g(context, "context");
        di.l E0 = f6.b.E0(context, sdkInstance);
        qg.w.f29578a.getClass();
        uh.b f2 = qg.w.f(context, sdkInstance);
        String id2 = TimeZone.getDefault().getID();
        JSONObject jSONObject = E0.f12898b;
        jSONObject.put("device_tz", id2);
        String str3 = pushTokens.f20078b;
        if (!gv.n.B0(str3)) {
            jSONObject.put("push_id", str3);
        }
        String str4 = pushTokens.f20079c;
        if (!gv.n.B0(str4)) {
            jSONObject.put("mi_push_id", str4);
        }
        ih.f E = f2.E();
        if (!devicePreferences.f20083a) {
            if (E.f20080a) {
                String a11 = di.j.a(context);
                if (a11 != null && !gv.n.B0(a11)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    jSONObject.put("android_id", a11);
                }
            }
            if (E.f20081b) {
                String L = f2.L();
                if (gv.n.B0(L) && ((a10 = rg.a.a(context)) == null || (L = a10.f505b) == null)) {
                    L = "";
                }
                if (!gv.n.B0(L)) {
                    jSONObject.put("moe_gaid", L);
                }
            }
        }
        jSONObject.put("os_ver", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("model", Build.MODEL);
        bh.a.f4292a.getClass();
        jSONObject.put("app_version_name", bh.a.a(context).f505b);
        char[] cArr = di.n.f12900a;
        String str5 = null;
        try {
        } catch (Exception e10) {
            xg.i iVar = new xg.i(21);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, iVar);
        }
        if (di.b.p(context, "android.permission.ACCESS_WIFI_STATE") && (networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1)) != null && networkInfo.isConnectedOrConnecting()) {
            str = "wifi";
        } else {
            if (di.b.p(context, "android.permission.READ_PHONE_STATE") && context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str = "2G";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str = "3G";
                        break;
                    case 13:
                        str = "4G";
                        break;
                    default:
                        str = "CouldNotDetermine";
                        break;
                }
            }
            str = null;
        }
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            jSONObject.put("networkType", str);
        }
        ih.e B = f2.B("mi_push_region");
        if (B == null) {
            str2 = null;
        } else {
            str2 = B.f20079c;
        }
        if (str2 != null) {
            jSONObject.put("mi_push_region", str2);
        }
        if (E.f20082c) {
            ug.i iVar2 = ug.i.f34116u;
            bh.a.f4292a.getClass();
            String str6 = bh.a.f4294c;
            if (str6 == null || !(!gv.n.B0(str6))) {
                try {
                    mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                    try {
                        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                        kotlin.jvm.internal.i.f(propertyByteArray, "wvDrm.getPropertyByteArr…ROPERTY_DEVICE_UNIQUE_ID)");
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(propertyByteArray);
                        byte[] digest = messageDigest.digest();
                        kotlin.jvm.internal.i.f(digest, "md.digest()");
                        String Y1 = is.k.Y1(digest, ug.j.f34117u);
                        bh.a.f4294c = Y1;
                        hh.a aVar2 = hh.g.f17610d;
                        g.a.b(0, new ug.g(Y1), 3);
                        try {
                            if (Build.VERSION.SDK_INT >= 28) {
                                mediaDrm.close();
                            } else {
                                mediaDrm.release();
                            }
                        } catch (Throwable th2) {
                            hh.a aVar3 = hh.g.f17610d;
                            g.a.a(1, th2, iVar2);
                        }
                        str5 = Y1;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            hh.a aVar4 = hh.g.f17610d;
                            g.a.a(1, th, ug.h.f34115u);
                            str6 = str5;
                            if (str6 != null) {
                            }
                            return jSONObject;
                        } finally {
                            try {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    if (mediaDrm != null) {
                                        mediaDrm.close();
                                    }
                                } else if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } catch (Throwable th4) {
                                hh.a aVar5 = hh.g.f17610d;
                                g.a.a(1, th4, iVar2);
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    mediaDrm = null;
                }
                str6 = str5;
            }
            if (str6 != null) {
                jSONObject.put("moe_drm_id", str6);
            }
        }
        return jSONObject;
    }

    @Override // vh.c
    public final long D() {
        return this.f35110b.f24373a.t("verfication_registration_time", 0L);
    }

    @Override // vh.c
    public final ih.f E() {
        boolean z10;
        boolean optBoolean;
        lh.a aVar = this.f35110b;
        String y10 = aVar.f24373a.y("device_identifier_tracking_preference", null);
        if (y10 != null && y10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            optBoolean = false;
        } else {
            optBoolean = new JSONObject(y10).optBoolean("isAndroidIdTrackingEnabled", false);
        }
        return new ih.f(optBoolean, aVar.f24373a.o("is_gaid_tracking_enabled", false), aVar.f24373a.o("is_device_tracking_enabled", true));
    }

    @Override // vh.c
    public final jg.d F() {
        return f6.b.y0(this.f35109a, this.f35111c);
    }

    @Override // vh.c
    public final boolean G() {
        return this.f35110b.f24373a.o("has_registered_for_verification", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r14 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        return null;
     */
    @Override // vh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mh.a H(String attributeName) {
        Throwable th2;
        Cursor cursor;
        ih.p pVar = this.f35111c;
        kotlin.jvm.internal.i.g(attributeName, "attributeName");
        try {
            hh.g.b(pVar.f20105d, 0, new r(attributeName), 3);
            cursor = this.f35114g.g("ATTRIBUTE_CACHE", new p0.f(kotlin.jvm.internal.h.f23462x, new nd.z("name = ? ", 11, new String[]{attributeName}), null, 0, 60));
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        this.f.getClass();
                        mh.a d10 = kotlinx.coroutines.e0.d(cursor);
                        cursor.close();
                        return d10;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        pVar.f20105d.a(1, th2, new s());
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
        }
    }

    @Override // vh.c
    public final boolean I() {
        return this.f35110b.f24373a.o("pref_installed", false);
    }

    @Override // vh.c
    public final long J(mh.d dVar) {
        this.f.getClass();
        ContentValues contentValues = new ContentValues();
        long j10 = dVar.f25062a;
        if (j10 != -1) {
            contentValues.put("_id", Long.valueOf(j10));
        }
        contentValues.put("msg", dVar.f25067g);
        contentValues.put("gtime", Long.valueOf(dVar.f25066e));
        contentValues.put("msgclicked", Integer.valueOf(dVar.f25064c));
        contentValues.put("msgttl", Long.valueOf(dVar.f));
        contentValues.put("msg_tag", dVar.f25065d);
        contentValues.put(Constants.CAMPAIGN_ID, dVar.f25063b);
        return ((bi.c) this.f35114g.f34634y).a("MESSAGES", contentValues);
    }

    @Override // vh.c
    public final qh.a K() {
        return new qh.a(g0(), ((SharedPreferences) this.f35110b.f24373a.f31226x).getString("segment_anonymous_id", null), n(), 0);
    }

    @Override // vh.c
    public final String L() {
        String y10 = this.f35110b.f24373a.y("PREF_KEY_MOE_GAID", "");
        if (y10 == null) {
            return "";
        }
        return y10;
    }

    @Override // vh.c
    public final void M(long j10) {
        this.f35110b.f24373a.I(j10, "last_event_sync_time");
    }

    @Override // vh.c
    public final String N() {
        String str;
        lh.a aVar = this.f35110b;
        mh.e a10 = aVar.f24375c.a();
        if (a10 == null) {
            str = null;
        } else {
            str = (String) a10.f25072e;
        }
        if (str == null) {
            return ((SharedPreferences) aVar.f24373a.f31226x).getString("remote_configuration", null);
        }
        return str;
    }

    @Override // vh.c
    public final void O() {
        this.f35110b.f24373a.K("user_session");
    }

    @Override // vh.c
    public final void P(boolean z10) {
        this.f35110b.f24373a.G("enable_logs", z10);
    }

    @Override // vh.c
    public final ih.g Q() {
        return new ih.g(this.f35110b.f24373a.o("data_tracking_opt_out", false));
    }

    @Override // vh.c
    public final int R(mh.b batchEntity) {
        ih.p pVar = this.f35111c;
        kotlin.jvm.internal.i.g(batchEntity, "batchEntity");
        try {
            hh.g.b(pVar.f20105d, 0, new f0(batchEntity), 3);
            long j10 = batchEntity.f25057a;
            if (j10 == -1) {
                return -1;
            }
            v.c cVar = this.f35114g;
            this.f.getClass();
            ContentValues i6 = kotlinx.coroutines.e0.i(batchEntity);
            String[] strArr = {String.valueOf(j10)};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                return cVar2.f4302a.getWritableDatabase().update("BATCH_DATA", i6, "_id = ? ", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.e(cVar2));
                return -1;
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new g0());
            return -1;
        }
    }

    @Override // vh.c
    public final void S(HashSet screenNames) {
        kotlin.jvm.internal.i.g(screenNames, "screenNames");
        s1.s sVar = this.f35110b.f24373a;
        sVar.getClass();
        ((SharedPreferences) sVar.f31226x).edit().putStringSet("sent_activity_list", screenNames).apply();
    }

    @Override // vh.c
    public final String T() {
        String y10 = this.f35110b.f24373a.y("push_service", "FCM");
        if (y10 == null) {
            return "FCM";
        }
        return y10;
    }

    @Override // vh.c
    public final Set<String> U() {
        s1.s sVar = this.f35110b.f24373a;
        is.y yVar = is.y.f20678u;
        sVar.getClass();
        return ((SharedPreferences) sVar.f31226x).getStringSet("sent_activity_list", yVar);
    }

    @Override // vh.c
    public final void V(String gaid) {
        kotlin.jvm.internal.i.g(gaid, "gaid");
        this.f35110b.f24373a.J("PREF_KEY_MOE_GAID", gaid);
    }

    @Override // vh.c
    public final List W() {
        Cursor cursor;
        is.w wVar = is.w.f20676u;
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new vh.i(this), 3);
            cursor = this.f35114g.g("DATAPOINTS", new p0.f(kotlin.jvm.internal.b0.f23451w, null, "gtime ASC", 100, 12));
            if (cursor != null) {
                try {
                    if (cursor.getCount() != 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            this.f.getClass();
                            long j10 = cursor.getLong(0);
                            long j11 = cursor.getLong(1);
                            String string = cursor.getString(2);
                            kotlin.jvm.internal.i.f(string, "cursor.getString(COLUMN_INDEX_DETAILS)");
                            arrayList.add(new mh.c(j10, string, j11));
                        }
                        cursor.close();
                        return arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        pVar.f20105d.a(1, th, new vh.k(this));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return wVar;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            hh.g.b(pVar.f20105d, 0, new vh.j(this), 3);
            if (cursor != null) {
                cursor.close();
            }
            return wVar;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // vh.c
    public final void X(ih.e eVar) {
        ih.p pVar = this.f35111c;
        String str = eVar.f20078b;
        try {
            hh.g.b(pVar.f20105d, 0, new g(eVar), 3);
            this.f.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("attribute_name", str);
            contentValues.put("attribute_value", eVar.f20079c);
            ih.e B = B(str);
            hh.g gVar = pVar.f20105d;
            v.c cVar = this.f35114g;
            if (B != null) {
                hh.g.b(gVar, 0, new h(), 3);
                String[] strArr = {str};
                cVar.getClass();
                bi.c cVar2 = (bi.c) cVar.f34634y;
                cVar2.getClass();
                try {
                    cVar2.f4302a.getWritableDatabase().update("USERATTRIBUTES", contentValues, "attribute_name =? ", strArr);
                } catch (Exception e10) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, e10, new bi.e(cVar2));
                }
            } else {
                hh.g.b(gVar, 0, new i(), 3);
                ((bi.c) cVar.f34634y).a("USERATTRIBUTES", contentValues);
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new j());
        }
    }

    @Override // vh.c
    public final boolean Y() {
        return this.f35110b.f24373a.o("enable_logs", false);
    }

    @Override // vh.c
    public final boolean Z() {
        return this.f35110b.f24373a.o("is_device_registered", false);
    }

    @Override // vh.c
    public final ih.q a() {
        boolean z10;
        String string = ((SharedPreferences) this.f35110b.f24373a.f31226x).getString("feature_status", "");
        if (string != null && string.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new ih.q(true);
        }
        try {
            return new ih.q(new JSONObject(string).optBoolean("isSdkEnabled", true));
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, di.m.f12899u);
            return new ih.q(true);
        }
    }

    @Override // vh.c
    public final void a0() {
        ih.p pVar = this.f35111c;
        v.c cVar = this.f35114g;
        try {
            hh.g.b(pVar.f20105d, 0, new c0(), 3);
            String valueOf = String.valueOf(System.currentTimeMillis());
            String[] strArr = {String.valueOf(sp.b.n()), "expired"};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                cVar2.f4302a.getWritableDatabase().delete("INAPPMSG", "ttl < ? AND status = ?", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.b(cVar2));
            }
            String[] strArr2 = {valueOf};
            bi.c cVar3 = (bi.c) cVar.f34634y;
            cVar3.getClass();
            try {
                cVar3.f4302a.getWritableDatabase().delete("MESSAGES", "msgttl < ?", strArr2);
            } catch (Exception e11) {
                hh.a aVar2 = hh.g.f17610d;
                g.a.a(1, e11, new bi.b(cVar3));
            }
            String[] strArr3 = {valueOf};
            bi.c cVar4 = (bi.c) cVar.f34634y;
            cVar4.getClass();
            try {
                cVar4.f4302a.getWritableDatabase().delete("CAMPAIGNLIST", "ttl < ?", strArr3);
            } catch (Exception e12) {
                hh.a aVar3 = hh.g.f17610d;
                g.a.a(1, e12, new bi.b(cVar4));
            }
            String[] strArr4 = {valueOf};
            bi.c cVar5 = (bi.c) cVar.f34634y;
            cVar5.getClass();
            try {
                cVar5.f4302a.getWritableDatabase().delete("PUSH_REPOST_CAMPAIGNS", "expiry_time < ?", strArr4);
            } catch (Exception e13) {
                hh.a aVar4 = hh.g.f17610d;
                g.a.a(1, e13, new bi.b(cVar5));
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new d0());
        }
    }

    @Override // vh.c
    public final void b() {
        ih.p pVar = this.f35111c;
        hh.g.b(pVar.f20105d, 0, new m(), 3);
        v.c cVar = this.f35114g;
        cVar.b("DATAPOINTS");
        cVar.b("MESSAGES");
        cVar.b("INAPPMSG");
        cVar.b("USERATTRIBUTES");
        cVar.b("CAMPAIGNLIST");
        cVar.b("BATCH_DATA");
        cVar.b("ATTRIBUTE_CACHE");
        cVar.b("PUSH_REPOST_CAMPAIGNS");
        hh.g.b(pVar.f20105d, 0, new vh.l(this), 3);
        s1.s sVar = this.f35110b.f24373a;
        sVar.K("MOE_LAST_IN_APP_SHOWN_TIME");
        sVar.K("user_attribute_unique_id");
        sVar.K("segment_anonymous_id");
        sVar.K("last_config_sync_time");
        sVar.K("is_device_registered");
        sVar.K("APP_UUID");
        sVar.K("user_session");
    }

    @Override // vh.c
    public final void b0(mh.a aVar) {
        String uniqueId = aVar.f25054b;
        kotlin.jvm.internal.i.g(uniqueId, "uniqueId");
        this.f35110b.f24373a.J("user_attribute_unique_id", uniqueId);
        t(aVar);
    }

    @Override // vh.c
    public final void c(String str) {
        synchronized (this.f35113e) {
            this.f35110b.f24373a.J("registration_id", str);
            hs.k kVar = hs.k.f19476a;
        }
    }

    @Override // vh.c
    public final void c0(jh.b session) {
        kotlin.jvm.internal.i.g(session, "session");
        try {
            JSONObject c10 = sg.t.c(session);
            if (c10 == null) {
                return;
            }
            s1.s sVar = this.f35110b.f24373a;
            String jSONObject = c10.toString();
            kotlin.jvm.internal.i.f(jSONObject, "sessionJson.toString()");
            sVar.J("user_session", jSONObject);
        } catch (Exception e10) {
            this.f35111c.f20105d.a(1, e10, new e0());
        }
    }

    @Override // vh.c
    public final boolean d() {
        return a().f20107a;
    }

    @Override // vh.c
    public final long d0(mh.c cVar) {
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new a(cVar), 3);
            v.c cVar2 = this.f35114g;
            this.f.getClass();
            return ((bi.c) cVar2.f34634y).a("DATAPOINTS", kotlinx.coroutines.e0.j(cVar));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
            return -1L;
        }
    }

    public final void e(mh.c cVar) {
        hh.g.b(this.f35111c.f20105d, 0, new vh.e(this, cVar), 3);
        String[] strArr = {String.valueOf(cVar.f25059a)};
        v.c cVar2 = this.f35114g;
        cVar2.getClass();
        bi.c cVar3 = (bi.c) cVar2.f34634y;
        cVar3.getClass();
        try {
            cVar3.f4302a.getWritableDatabase().delete("DATAPOINTS", "_id = ?", strArr);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new bi.b(cVar3));
        }
    }

    @Override // vh.c
    public final ih.e e0() {
        ih.e eVar;
        synchronized (this.f35113e) {
            String y10 = this.f35110b.f24373a.y("registration_id", "");
            if (y10 == null) {
                y10 = "";
            }
            String y11 = this.f35110b.f24373a.y("mi_push_token", "");
            if (y11 == null) {
                y11 = "";
            }
            eVar = new ih.e(y10, y11, 1);
        }
        return eVar;
    }

    @Override // vh.c
    public final long f() {
        return this.f35110b.f24373a.t("last_config_sync_time", 0L);
    }

    @Override // vh.c
    public final void g(boolean z10) {
        this.f35110b.f24373a.G("is_device_registered", z10);
    }

    @Override // vh.c
    public final String g0() {
        String str;
        String str2;
        try {
            mh.a H = H("USER_ATTRIBUTE_UNIQUE_ID");
            if (H == null) {
                str = null;
            } else {
                str = H.f25054b;
            }
            if (str == null) {
                mh.a H2 = H("USER_ATTRIBUTE_UNIQUE_ID");
                if (H2 == null) {
                    str2 = null;
                } else {
                    str2 = H2.f25054b;
                }
                if (str2 == null) {
                    str2 = this.f35110b.f24373a.y("user_attribute_unique_id", null);
                }
                return str2;
            }
            return str;
        } catch (Exception e10) {
            this.f35111c.f20105d.a(1, e10, new z());
            return null;
        }
    }

    @Override // vh.c
    public final jh.b h() {
        String string = ((SharedPreferences) this.f35110b.f24373a.f31226x).getString("user_session", null);
        if (string == null) {
            return null;
        }
        try {
            if (gv.n.B0(string)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            return new jh.b(jSONObject.getString("session_id"), jSONObject.getString("start_time"), sg.t.a(jSONObject), jSONObject.getLong("last_interaction_time"));
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, sg.u.f31564u);
            return null;
        }
    }

    @Override // vh.c
    public final void i(String configurationString) {
        kotlin.jvm.internal.i.g(configurationString, "configurationString");
        vh.b bVar = this.f35110b.f24375c;
        bVar.getClass();
        mh.e a10 = bVar.a();
        v.c cVar = bVar.f35105a;
        kotlinx.coroutines.e0 e0Var = bVar.f35108d;
        if (a10 != null) {
            mh.e eVar = new mh.e(a10.a(), "remote_configuration", configurationString.toString(), System.currentTimeMillis());
            e0Var.getClass();
            ContentValues k10 = kotlinx.coroutines.e0.k(eVar);
            String[] strArr = {(String) eVar.f25070c};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                cVar2.f4302a.getWritableDatabase().update("KEY_VALUE_STORE", k10, "key = ? ", strArr);
                return;
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.e(cVar2));
                return;
            }
        }
        mh.e eVar2 = new mh.e(-1L, "remote_configuration", configurationString.toString(), System.currentTimeMillis());
        e0Var.getClass();
        ((bi.c) cVar.f34634y).a("KEY_VALUE_STORE", kotlinx.coroutines.e0.k(eVar2));
    }

    @Override // vh.c
    public final void j() {
        this.f35110b.f24373a.G("has_registered_for_verification", false);
    }

    @Override // vh.c
    public final int k() {
        return this.f35110b.f24373a.s("PREF_KEY_MOE_ISLAT", 0);
    }

    @Override // vh.c
    public final void l(List<mh.c> list) {
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new p(), 3);
            for (mh.c cVar : list) {
                e(cVar);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new q());
        }
    }

    @Override // vh.c
    public final void m(int i6) {
        this.f35110b.f24373a.H(i6, "appVersion");
    }

    @Override // vh.c
    public final String n() {
        synchronized (this.f35115h) {
            String str = null;
            String string = ((SharedPreferences) this.f35110b.f24373a.f31226x).getString("APP_UUID", null);
            ih.e B = B("APP_UUID");
            if (B != null) {
                str = B.f20079c;
            }
            if (string == null && str == null) {
                hh.g.b(this.f35111c.f20105d, 0, new t(), 3);
                return q();
            } else if (str != null && !gv.n.B0(str)) {
                hh.g.b(this.f35111c.f20105d, 0, new u(), 3);
                this.f35110b.f24373a.J("APP_UUID", str);
                return str;
            } else if (string != null && gv.n.B0(string)) {
                hh.g.b(this.f35111c.f20105d, 0, new v(), 3);
                return string;
            } else {
                hh.g.b(this.f35111c.f20105d, 0, new w(), 3);
                return q();
            }
        }
    }

    @Override // vh.c
    public final long o(mh.b bVar) {
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new h0(bVar), 3);
            v.c cVar = this.f35114g;
            this.f.getClass();
            return ((bi.c) cVar.f34634y).a("BATCH_DATA", kotlinx.coroutines.e0.i(bVar));
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new i0());
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // vh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject p(ih.p sdkInstance) {
        String str;
        boolean z10;
        ad.h a10;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        Context context = this.f35109a;
        kotlin.jvm.internal.i.g(context, "context");
        JSONObject jSONObject = new JSONObject();
        qg.w.f29578a.getClass();
        uh.b f2 = qg.w.f(context, sdkInstance);
        dh.a aVar = sdkInstance.f20103b;
        if (aVar.f.f28422b && !f2.Q().f20083a) {
            jSONObject.put("OS_VERSION", Build.VERSION.RELEASE);
            jSONObject.put("OS_API_LEVEL", Build.VERSION.SDK_INT);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("MODEL", Build.MODEL);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            boolean z11 = false;
            if (aVar.f.f28421a) {
                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony") && di.b.p(context, "android.permission.READ_PHONE_STATE")) {
                    Object systemService = context.getSystemService("phone");
                    if (systemService != null) {
                        str = ((TelephonyManager) systemService).getSimOperatorName();
                        if (str == null && !gv.n.B0(str)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            jSONObject.put("CARRIER", str);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                }
                str = null;
                if (str == null) {
                }
                z10 = true;
                if (!z10) {
                }
            }
            Object systemService2 = context.getSystemService("window");
            if (systemService2 != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics);
                jSONObject.put("DENSITYDPI", displayMetrics.densityDpi);
                jSONObject.put("WIDTH", displayMetrics.widthPixels);
                jSONObject.put("HEIGHT", displayMetrics.heightPixels);
                ih.f E = f2.E();
                if (E.f20081b && (a10 = rg.a.a(context)) != null) {
                    jSONObject.put("MOE_GAID", a10.f505b);
                    jSONObject.put("MOE_ISLAT", a10.f504a);
                }
                if (E.f20080a) {
                    String a11 = di.j.a(context);
                    if (!((a11 == null || gv.n.B0(a11)) ? true : true)) {
                        jSONObject.put("DEVICE_ID", a11);
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        return jSONObject;
    }

    public final String q() {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.i.f(uuid, "randomUUID().toString()");
        X(new ih.e("APP_UUID", uuid, 0));
        this.f35110b.f24373a.J("APP_UUID", uuid);
        return uuid;
    }

    @Override // vh.c
    public final void r() {
        ih.p pVar = this.f35111c;
        v.c cVar = this.f35114g;
        try {
            hh.g.b(pVar.f20105d, 0, new k(), 3);
            cVar.b("DATAPOINTS");
            cVar.b("BATCH_DATA");
            String[] strArr = {"APP_UUID"};
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                cVar2.f4302a.getWritableDatabase().delete("USERATTRIBUTES", "attribute_name != ?", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.b(cVar2));
            }
            cVar.b("ATTRIBUTE_CACHE");
        } catch (Exception e11) {
            pVar.f20105d.a(1, e11, new l());
        }
    }

    @Override // vh.c
    public final void s(long j10) {
        this.f35110b.f24373a.I(j10, "last_config_sync_time");
    }

    @Override // vh.c
    public final void t(mh.a aVar) {
        ih.p pVar = this.f35111c;
        String str = aVar.f25053a;
        try {
            hh.g.b(pVar.f20105d, 0, new c(aVar), 3);
            boolean z10 = z(str);
            hh.g gVar = pVar.f20105d;
            kotlinx.coroutines.e0 e0Var = this.f;
            v.c cVar = this.f35114g;
            if (z10) {
                hh.g.b(gVar, 0, new C0595d(), 3);
                e0Var.getClass();
                ContentValues h10 = kotlinx.coroutines.e0.h(aVar);
                String[] strArr = {str};
                cVar.getClass();
                bi.c cVar2 = (bi.c) cVar.f34634y;
                cVar2.getClass();
                try {
                    cVar2.f4302a.getWritableDatabase().update("ATTRIBUTE_CACHE", h10, "name = ? ", strArr);
                } catch (Exception e10) {
                    hh.a aVar2 = hh.g.f17610d;
                    g.a.a(1, e10, new bi.e(cVar2));
                }
            } else {
                hh.g.b(gVar, 0, new e(), 3);
                e0Var.getClass();
                ((bi.c) cVar.f34634y).a("ATTRIBUTE_CACHE", kotlinx.coroutines.e0.h(aVar));
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new f());
        }
    }

    @Override // vh.c
    public final void u() {
        s1.s sVar = this.f35110b.f24373a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAndroidIdTrackingEnabled", false);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "androidIdPreferenceToJson(isEnabled).toString()");
        sVar.J("device_identifier_tracking_preference", jSONObject2);
    }

    @Override // vh.c
    public final int v() {
        return this.f35110b.f24373a.s("appVersion", 0);
    }

    @Override // vh.c
    public final List w() {
        Throwable th2;
        Cursor cursor;
        is.w wVar = is.w.f20676u;
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new vh.f(this), 3);
            cursor = this.f35114g.g("BATCH_DATA", new p0.f(sc.b.f31421v, null, null, 100, 28));
            if (cursor != null) {
                try {
                    if (cursor.getCount() != 0) {
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        if (cursor.moveToFirst()) {
                            do {
                                this.f.getClass();
                                arrayList.add(new mh.b(cursor.getLong(0), new JSONObject(cursor.getString(1))));
                            } while (cursor.moveToNext());
                            cursor.close();
                            return arrayList;
                        }
                        cursor.close();
                        return arrayList;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        pVar.f20105d.a(1, th2, new vh.h(this));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return wVar;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return wVar;
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
        }
    }

    @Override // vh.c
    public final int x(mh.b bVar) {
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new n(bVar), 3);
            v.c cVar = this.f35114g;
            String[] strArr = {String.valueOf(bVar.f25057a)};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                return cVar2.f4302a.getWritableDatabase().delete("BATCH_DATA", "_id = ?", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.b(cVar2));
                return -1;
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new o());
            return -1;
        }
    }

    @Override // vh.c
    public final void y() {
        this.f35110b.f24373a.G("pref_installed", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r13 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(String str) {
        Throwable th2;
        Cursor cursor;
        ih.p pVar = this.f35111c;
        try {
            hh.g.b(pVar.f20105d, 0, new a0(str), 3);
            cursor = this.f35114g.g("ATTRIBUTE_CACHE", new p0.f(kotlin.jvm.internal.h.f23462x, new nd.z("name = ? ", 11, new String[]{str}), null, 0, 60));
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        cursor.close();
                        return true;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        pVar.f20105d.a(1, th2, new b0());
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
        }
    }
}
