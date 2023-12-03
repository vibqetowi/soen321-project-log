package ta;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t4 extends m3 {
    public final AtomicReference A;
    public final Object B;
    public h C;
    public int D;
    public final AtomicLong E;
    public long F;
    public int G;
    public final o6 H;
    public boolean I;
    public final g.x J;

    /* renamed from: w  reason: collision with root package name */
    public s4 f32883w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.appcompat.widget.l f32884x;

    /* renamed from: y  reason: collision with root package name */
    public final CopyOnWriteArraySet f32885y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f32886z;

    public t4(y3 y3Var) {
        super(y3Var);
        this.f32885y = new CopyOnWriteArraySet();
        this.B = new Object();
        this.I = true;
        this.J = new g.x(27, this);
        this.A = new AtomicReference();
        this.C = new h(null, null);
        this.D = 100;
        this.F = -1L;
        this.G = 100;
        this.E = new AtomicLong(0L);
        this.H = new o6(y3Var);
    }

    public static /* bridge */ /* synthetic */ void B(t4 t4Var, h hVar, h hVar2) {
        boolean z10;
        g gVar = g.ANALYTICS_STORAGE;
        g gVar2 = g.AD_STORAGE;
        g[] gVarArr = {gVar, gVar2};
        int i6 = 0;
        while (true) {
            if (i6 < 2) {
                g gVar3 = gVarArr[i6];
                if (!hVar2.f(gVar3) && hVar.f(gVar3)) {
                    z10 = true;
                    break;
                }
                i6++;
            } else {
                z10 = false;
                break;
            }
        }
        boolean g5 = hVar.g(hVar2, gVar, gVar2);
        if (!z10 && !g5) {
            return;
        }
        t4Var.f32943u.p().o();
    }

    public static void C(t4 t4Var, h hVar, int i6, long j10, boolean z10, boolean z11) {
        boolean z12;
        t4Var.h();
        t4Var.i();
        long j11 = t4Var.F;
        y3 y3Var = t4Var.f32943u;
        if (j10 <= j11) {
            int i10 = t4Var.G;
            h hVar2 = h.f32583b;
            if (i10 <= i6) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.F.c(hVar, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        j3Var.h();
        if (j3Var.s(i6)) {
            SharedPreferences.Editor edit = j3Var.l().edit();
            edit.putString("consent_settings", hVar.e());
            edit.putInt("consent_source", i6);
            edit.apply();
            t4Var.F = j10;
            t4Var.G = i6;
            l5 t3 = y3Var.t();
            t3.h();
            t3.i();
            if (z10) {
                y3 y3Var2 = t3.f32943u;
                y3Var2.getClass();
                y3Var2.q().m();
            }
            if (t3.o()) {
                t3.t(new f5(t3, t3.q(false), 3));
            }
            if (z11) {
                y3Var.t().y(new AtomicReference());
                return;
            }
            return;
        }
        w2 w2Var2 = y3Var.C;
        y3.k(w2Var2);
        w2Var2.F.c(Integer.valueOf(i6), "Lower precedence consent source ignored, proposed source");
    }

    public final String A() {
        return (String) this.A.get();
    }

    public final void D() {
        h();
        i();
        y3 y3Var = this.f32943u;
        if (y3Var.h()) {
            i2 i2Var = j2.X;
            f fVar = y3Var.A;
            if (fVar.q(null, i2Var)) {
                fVar.f32943u.getClass();
                Boolean p10 = fVar.p("google_analytics_deferred_deep_link_enabled");
                if (p10 != null && p10.booleanValue()) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.G.b("Deferred Deep Link feature enabled.");
                    w3 w3Var = y3Var.D;
                    y3.k(w3Var);
                    w3Var.p(new k4(this, 0));
                }
            }
            l5 t3 = y3Var.t();
            t3.h();
            t3.i();
            m6 q10 = t3.q(true);
            t3.f32943u.q().o(new byte[0], 3);
            t3.t(new f5(t3, q10, 1));
            this.I = false;
            j3 j3Var = y3Var.B;
            y3.i(j3Var);
            j3Var.h();
            String string = j3Var.l().getString("previous_os_version", null);
            j3Var.f32943u.o().j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = j3Var.l().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                y3Var.o().j();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    o("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // ta.m3
    public final boolean k() {
        return false;
    }

    public final void l(String str, String str2, Bundle bundle) {
        y3 y3Var = this.f32943u;
        y3Var.H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        v9.o.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(SessionManager.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.p(new j4(this, bundle2, 2));
    }

    public final void m() {
        y3 y3Var = this.f32943u;
        if ((y3Var.f32953u.getApplicationContext() instanceof Application) && this.f32883w != null) {
            ((Application) y3Var.f32953u.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f32883w);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        if (r3 > 100) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
        if (r5 > 100) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3;
        Bundle bundle2;
        String str4;
        String str5;
        String str6;
        z4 z4Var;
        String str7;
        boolean z12;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (z11 && this.f32884x != null && !k6.S(str2)) {
                z12 = false;
            } else {
                z12 = true;
            }
            Bundle bundle3 = new Bundle(bundle2);
            for (String str8 : bundle3.keySet()) {
                Object obj = bundle3.get(str8);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str8, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i6 = 0; i6 < parcelableArr.length; i6++) {
                        Parcelable parcelable = parcelableArr[i6];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i6] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            w3 w3Var = this.f32943u.D;
            y3.k(w3Var);
            w3Var.p(new n4(this, str3, str2, j10, bundle3, z11, z12, z10));
            return;
        }
        c5 c5Var = this.f32943u.I;
        y3.j(c5Var);
        synchronized (c5Var.F) {
            try {
                if (!c5Var.E) {
                    w2 w2Var = c5Var.f32943u.C;
                    y3.k(w2Var);
                    w2Var.E.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        c5Var.f32943u.getClass();
                    }
                    w2 w2Var2 = c5Var.f32943u.C;
                    y3.k(w2Var2);
                    w2Var2.E.c(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        c5Var.f32943u.getClass();
                    }
                    w2 w2Var3 = c5Var.f32943u.C;
                    y3.k(w2Var3);
                    w2Var3.E.c(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = c5Var.A;
                    if (activity != null) {
                        str7 = c5Var.o(activity.getClass());
                    } else {
                        str7 = "Activity";
                    }
                    str4 = str7;
                } else {
                    str4 = string2;
                }
                z4 z4Var2 = c5Var.f32509w;
                if (c5Var.B && z4Var2 != null) {
                    c5Var.B = false;
                    boolean Y0 = f6.b.Y0(z4Var2.f32975b, str4);
                    boolean Y02 = f6.b.Y0(z4Var2.f32974a, string);
                    if (Y0 && Y02) {
                        w2 w2Var4 = c5Var.f32943u.C;
                        y3.k(w2Var4);
                        w2Var4.E.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                w2 w2Var5 = c5Var.f32943u.C;
                y3.k(w2Var5);
                u2 u2Var = w2Var5.H;
                if (string == null) {
                    str5 = "null";
                } else {
                    str5 = string;
                }
                if (str4 == null) {
                    str6 = "null";
                } else {
                    str6 = str4;
                }
                u2Var.d("Logging screen view with name, class", str5, str6);
                if (c5Var.f32509w == null) {
                    z4Var = c5Var.f32510x;
                } else {
                    z4Var = c5Var.f32509w;
                }
                k6 k6Var = c5Var.f32943u.F;
                y3.i(k6Var);
                z4 z4Var3 = new z4(string, str4, k6Var.j0(), true, j10);
                c5Var.f32509w = z4Var3;
                c5Var.f32510x = z4Var;
                c5Var.C = z4Var3;
                c5Var.f32943u.H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                w3 w3Var2 = c5Var.f32943u.D;
                y3.k(w3Var2);
                w3Var2.p(new c4(c5Var, bundle2, z4Var3, z4Var, elapsedRealtime, 2));
            } finally {
            }
        }
    }

    public final void o(String str, String str2, Bundle bundle) {
        h();
        this.f32943u.H.getClass();
        p(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void p(long j10, Bundle bundle, String str, String str2) {
        boolean z10;
        h();
        if (this.f32884x != null && !k6.S(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q(str, str2, j10, bundle, true, z10, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        kotlin.jvm.internal.b0 b0Var;
        char c10;
        boolean z13;
        boolean z14;
        boolean z15;
        j3 j3Var;
        long j11;
        String str4;
        String str5;
        k6 k6Var;
        long j12;
        int size;
        int i6;
        int i10;
        String str6;
        String str7;
        boolean o10;
        boolean z16;
        Bundle[] bundleArr;
        boolean z17;
        int i11;
        int i12;
        int i13;
        Class<?> cls;
        v9.o.e(str);
        v9.o.h(bundle);
        h();
        i();
        y3 y3Var = this.f32943u;
        boolean g5 = y3Var.g();
        w2 w2Var = y3Var.C;
        if (g5) {
            List list = y3Var.p().C;
            if (list != null && !list.contains(str2)) {
                y3.k(w2Var);
                w2Var.G.d("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f32886z) {
                this.f32886z = true;
                try {
                    boolean z18 = y3Var.f32957y;
                    Context context = y3Var.f32953u;
                    if (!z18) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, context);
                    } catch (Exception e10) {
                        y3.k(w2Var);
                        w2Var.C.c(e10, "Failed to invoke Tag Manager's initialize() method");
                    }
                } catch (ClassNotFoundException unused) {
                    y3.k(w2Var);
                    w2Var.F.b("Tag Manager is not found and thus will not be used");
                }
            }
            boolean equals = "_cmp".equals(str2);
            kotlin.jvm.internal.b0 b0Var2 = y3Var.H;
            if (equals && bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                b0Var2.getClass();
                b0Var = b0Var2;
                c10 = 0;
                z13 = true;
                x(System.currentTimeMillis(), string, "auto", "_lgclid");
            } else {
                b0Var = b0Var2;
                c10 = 0;
                z13 = true;
            }
            j3 j3Var2 = y3Var.B;
            k6 k6Var2 = y3Var.F;
            if (z10 && (k6.B[c10].equals(str2) ^ z13)) {
                y3.i(k6Var2);
                y3.i(j3Var2);
                k6Var2.v(bundle, j3Var2.Q.a());
            }
            g.x xVar = this.J;
            r2 r2Var = y3Var.G;
            if (!z12 && !"_iap".equals(str2)) {
                y3.i(k6Var2);
                if (k6Var2.O("event", str2)) {
                    if (!k6Var2.J("event", kc.f.f23225o0, kc.f.f23226p0, str2)) {
                        i12 = 13;
                    } else {
                        k6Var2.f32943u.getClass();
                        if (k6Var2.I(40, "event", str2)) {
                            i12 = 0;
                        }
                    }
                    if (i12 != 0) {
                        y3.k(w2Var);
                        w2Var.B.c(r2Var.d(str2), "Invalid public event name. Event will not be logged (FE)");
                        y3.i(k6Var2);
                        k6Var2.getClass();
                        String o11 = k6.o(str2, 40, z13);
                        if (str2 != null) {
                            i13 = str2.length();
                        } else {
                            i13 = 0;
                        }
                        y3.i(k6Var2);
                        k6Var2.getClass();
                        k6.x(xVar, null, i12, "_ev", o11, i13);
                        return;
                    }
                }
                i12 = 2;
                if (i12 != 0) {
                }
            }
            c5 c5Var = y3Var.I;
            y3.j(c5Var);
            z4 n10 = c5Var.n(false);
            if (n10 != null && !bundle.containsKey("_sc")) {
                n10.f32977d = z13;
            }
            if (z10 && !z12) {
                z14 = true;
            } else {
                z14 = false;
            }
            k6.u(n10, bundle, z14);
            boolean equals2 = "am".equals(str);
            boolean S = k6.S(str2);
            if (z10 && this.f32884x != null && !S) {
                if (equals2) {
                    z15 = true;
                } else {
                    y3.k(w2Var);
                    w2Var.G.d("Passing event to registered event handler (FE)", r2Var.d(str2), r2Var.b(bundle));
                    v9.o.h(this.f32884x);
                    androidx.appcompat.widget.l lVar = this.f32884x;
                    lVar.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.q0) lVar.f1471v).d0(j10, bundle, str, str2);
                        return;
                    } catch (RemoteException e11) {
                        y3 y3Var2 = ((AppMeasurementDynamiteService) lVar.f1472w).f8742a;
                        if (y3Var2 != null) {
                            w2 w2Var2 = y3Var2.C;
                            y3.k(w2Var2);
                            w2Var2.C.c(e11, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
            } else {
                z15 = equals2;
            }
            if (y3Var.h()) {
                y3.i(k6Var2);
                int d02 = k6Var2.d0(str2);
                if (d02 != 0) {
                    y3.k(w2Var);
                    w2Var.B.c(r2Var.d(str2), "Invalid event name. Event will not be logged (FE)");
                    y3.i(k6Var2);
                    k6Var2.getClass();
                    String o12 = k6.o(str2, 40, true);
                    if (str2 != null) {
                        i11 = str2.length();
                    } else {
                        i11 = 0;
                    }
                    y3.i(k6Var2);
                    k6Var2.getClass();
                    k6.x(xVar, str3, d02, "_ev", o12, i11);
                    return;
                }
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
                y3.i(k6Var2);
                Bundle m02 = k6Var2.m0(str2, bundle, unmodifiableList, z12);
                v9.o.h(m02);
                y3.j(c5Var);
                z4 n11 = c5Var.n(false);
                v5 v5Var = y3Var.E;
                boolean z19 = z15;
                if (n11 != null && "_ae".equals(str2)) {
                    y3.j(v5Var);
                    mh.e eVar = v5Var.f32917y;
                    ((v5) eVar.f25072e).f32943u.H.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j3Var = j3Var2;
                    long j13 = elapsedRealtime - eVar.f25071d;
                    eVar.f25071d = elapsedRealtime;
                    if (j13 > 0) {
                        y3.i(k6Var2);
                        k6Var2.s(m02, j13);
                    }
                } else {
                    j3Var = j3Var2;
                }
                ((v8) u8.f8623v.f8624u.a()).a();
                if (y3Var.A.q(null, j2.c0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        y3.i(k6Var2);
                        String string2 = m02.getString("_ffr");
                        if (aa.i.b(string2)) {
                            string2 = null;
                        } else if (string2 != null) {
                            string2 = string2.trim();
                        }
                        j3 j3Var3 = k6Var2.f32943u.B;
                        y3.i(j3Var3);
                        String a10 = j3Var3.N.a();
                        if (string2 != a10 && (string2 == null || !string2.equals(a10))) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        y3 y3Var3 = k6Var2.f32943u;
                        if (!z17) {
                            j3 j3Var4 = y3Var3.B;
                            y3.i(j3Var4);
                            j3Var4.N.b(string2);
                        } else {
                            w2 w2Var3 = y3Var3.C;
                            y3.k(w2Var3);
                            w2Var3.G.b("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        y3.i(k6Var2);
                        j3 j3Var5 = k6Var2.f32943u.B;
                        y3.i(j3Var5);
                        String a11 = j3Var5.N.a();
                        if (!TextUtils.isEmpty(a11)) {
                            m02.putString("_ffr", a11);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(m02);
                y3.i(j3Var);
                j3 j3Var6 = j3Var;
                if (j3Var6.H.a() > 0) {
                    y3.i(j3Var6);
                    if (j3Var6.r(j10)) {
                        y3.i(j3Var6);
                        if (j3Var6.K.b()) {
                            y3.k(w2Var);
                            w2Var.H.b("Current session is expired, remove the session number, ID, and engagement time");
                            b0Var.getClass();
                            j11 = j10;
                            str4 = "_ae";
                            str5 = "_o";
                            k6Var = k6Var2;
                            x(System.currentTimeMillis(), null, "auto", "_sid");
                            b0Var.getClass();
                            x(System.currentTimeMillis(), null, "auto", "_sno");
                            b0Var.getClass();
                            x(System.currentTimeMillis(), null, "auto", "_se");
                            y3.i(j3Var6);
                            j12 = 0;
                            j3Var6.I.b(0L);
                            if (m02.getLong("extend_session", j12) == 1) {
                                y3.k(w2Var);
                                w2Var.H.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                                y3.j(v5Var);
                                v5Var.f32916x.b(true, j11);
                            }
                            ArrayList arrayList2 = new ArrayList(m02.keySet());
                            Collections.sort(arrayList2);
                            size = arrayList2.size();
                            for (i6 = 0; i6 < size; i6++) {
                                String str8 = (String) arrayList2.get(i6);
                                if (str8 != null) {
                                    y3.i(k6Var);
                                    Object obj = m02.get(str8);
                                    if (obj instanceof Bundle) {
                                        bundleArr = new Bundle[]{(Bundle) obj};
                                    } else if (obj instanceof Parcelable[]) {
                                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                    } else if (obj instanceof ArrayList) {
                                        ArrayList arrayList3 = (ArrayList) obj;
                                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                                    } else {
                                        bundleArr = null;
                                    }
                                    if (bundleArr != null) {
                                        m02.putParcelableArray(str8, bundleArr);
                                    }
                                }
                            }
                            i10 = 0;
                            while (i10 < arrayList.size()) {
                                Bundle bundle2 = (Bundle) arrayList.get(i10);
                                if (i10 != 0) {
                                    str7 = "_ep";
                                    str6 = str;
                                } else {
                                    str6 = str;
                                    str7 = str2;
                                }
                                String str9 = str5;
                                bundle2.putString(str9, str6);
                                if (z11) {
                                    y3.i(k6Var);
                                    bundle2 = k6Var.l0(bundle2);
                                }
                                Bundle bundle3 = bundle2;
                                ArrayList arrayList4 = arrayList;
                                s sVar = new s(str7, new q(bundle3), str, j10);
                                l5 t3 = y3Var.t();
                                t3.getClass();
                                t3.h();
                                t3.i();
                                y3 y3Var4 = t3.f32943u;
                                y3Var4.getClass();
                                q2 q10 = y3Var4.q();
                                q10.getClass();
                                Parcel obtain = Parcel.obtain();
                                t.a(sVar, obtain, 0);
                                byte[] marshall = obtain.marshall();
                                obtain.recycle();
                                if (marshall.length > 131072) {
                                    w2 w2Var4 = q10.f32943u.C;
                                    y3.k(w2Var4);
                                    w2Var4.A.b("Event is too long for local database. Sending event directly to service");
                                    z16 = true;
                                    o10 = false;
                                } else {
                                    o10 = q10.o(marshall, 0);
                                    z16 = true;
                                }
                                t3.t(new r9.i(t3, t3.q(z16), o10, sVar, str3, 3));
                                if (!z19) {
                                    Iterator it = this.f32885y.iterator();
                                    while (it.hasNext()) {
                                        ((g4) it.next()).a(j10, new Bundle(bundle3), str, str2);
                                    }
                                }
                                i10++;
                                arrayList = arrayList4;
                                str5 = str9;
                            }
                            y3.j(c5Var);
                            if (c5Var.n(false) == null && str4.equals(str2)) {
                                y3.j(v5Var);
                                b0Var.getClass();
                                v5Var.f32917y.b(SystemClock.elapsedRealtime(), true, true);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = j10;
                } else {
                    j11 = j10;
                }
                str4 = "_ae";
                str5 = "_o";
                k6Var = k6Var2;
                j12 = 0;
                if (m02.getLong("extend_session", j12) == 1) {
                }
                ArrayList arrayList22 = new ArrayList(m02.keySet());
                Collections.sort(arrayList22);
                size = arrayList22.size();
                while (i6 < size) {
                }
                i10 = 0;
                while (i10 < arrayList.size()) {
                }
                y3.j(c5Var);
                if (c5Var.n(false) == null) {
                    return;
                }
                return;
            }
            return;
        }
        y3.k(w2Var);
        w2Var.G.b("Event not sent since app measurement is disabled");
    }

    public final void r(boolean z10, long j10) {
        h();
        i();
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.G.b("Resetting analytics data (FE)");
        v5 v5Var = y3Var.E;
        y3.j(v5Var);
        v5Var.h();
        mh.e eVar = v5Var.f32917y;
        ((m) eVar.f25070c).a();
        eVar.f25069b = 0L;
        eVar.f25071d = 0L;
        ca.c();
        i2 i2Var = j2.f32653i0;
        f fVar = y3Var.A;
        if (fVar.q(null, i2Var)) {
            y3Var.p().o();
        }
        boolean g5 = y3Var.g();
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        j3Var.f32679y.b(j10);
        y3 y3Var2 = j3Var.f32943u;
        j3 j3Var2 = y3Var2.B;
        y3.i(j3Var2);
        if (!TextUtils.isEmpty(j3Var2.N.a())) {
            j3Var.N.b(null);
        }
        d9 d9Var = d9.f8343v;
        ((e9) d9Var.f8344u.a()).a();
        i2 i2Var2 = j2.f32645d0;
        f fVar2 = y3Var2.A;
        if (fVar2.q(null, i2Var2)) {
            j3Var.H.b(0L);
        }
        j3Var.I.b(0L);
        if (!fVar2.s()) {
            j3Var.q(!g5);
        }
        j3Var.O.b(null);
        j3Var.P.b(0L);
        j3Var.Q.b(null);
        if (z10) {
            l5 t3 = y3Var.t();
            t3.h();
            t3.i();
            m6 q10 = t3.q(false);
            y3 y3Var3 = t3.f32943u;
            y3Var3.getClass();
            y3Var3.q().m();
            t3.t(new f5(t3, q10, 0));
        }
        ((e9) d9Var.f8344u.a()).a();
        if (fVar.q(null, i2Var2)) {
            y3.j(v5Var);
            v5Var.f32916x.a();
        }
        this.I = !g5;
    }

    public final void s(Bundle bundle, long j10) {
        v9.o.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        y3 y3Var = this.f32943u;
        if (!isEmpty) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.C.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        f6.b.W0(bundle2, "app_id", String.class, null);
        f6.b.W0(bundle2, "origin", String.class, null);
        f6.b.W0(bundle2, SessionManager.KEY_NAME, String.class, null);
        f6.b.W0(bundle2, "value", Object.class, null);
        f6.b.W0(bundle2, "trigger_event_name", String.class, null);
        f6.b.W0(bundle2, "trigger_timeout", Long.class, 0L);
        f6.b.W0(bundle2, "timed_out_event_name", String.class, null);
        f6.b.W0(bundle2, "timed_out_event_params", Bundle.class, null);
        f6.b.W0(bundle2, "triggered_event_name", String.class, null);
        f6.b.W0(bundle2, "triggered_event_params", Bundle.class, null);
        f6.b.W0(bundle2, "time_to_live", Long.class, 0L);
        f6.b.W0(bundle2, "expired_event_name", String.class, null);
        f6.b.W0(bundle2, "expired_event_params", Bundle.class, null);
        v9.o.e(bundle2.getString(SessionManager.KEY_NAME));
        v9.o.e(bundle2.getString("origin"));
        v9.o.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString(SessionManager.KEY_NAME);
        Object obj = bundle2.get("value");
        k6 k6Var = y3Var.F;
        y3.i(k6Var);
        int g02 = k6Var.g0(string);
        r2 r2Var = y3Var.G;
        w2 w2Var2 = y3Var.C;
        if (g02 == 0) {
            k6 k6Var2 = y3Var.F;
            y3.i(k6Var2);
            if (k6Var2.c0(obj, string) == 0) {
                y3.i(k6Var2);
                Object m10 = k6Var2.m(obj, string);
                if (m10 == null) {
                    y3.k(w2Var2);
                    w2Var2.f32925z.d("Unable to normalize conditional user property value", r2Var.f(string), obj);
                    return;
                }
                f6.b.Z0(bundle2, m10);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
                    y3.k(w2Var2);
                    w2Var2.f32925z.d("Invalid conditional user property timeout", r2Var.f(string), Long.valueOf(j11));
                    return;
                }
                long j12 = bundle2.getLong("time_to_live");
                if (j12 <= 15552000000L && j12 >= 1) {
                    w3 w3Var = y3Var.D;
                    y3.k(w3Var);
                    w3Var.p(new j4(this, bundle2, 1));
                    return;
                }
                y3.k(w2Var2);
                w2Var2.f32925z.d("Invalid conditional user property time to live", r2Var.f(string), Long.valueOf(j12));
                return;
            }
            y3.k(w2Var2);
            w2Var2.f32925z.d("Invalid conditional user property value", r2Var.f(string), obj);
            return;
        }
        y3.k(w2Var2);
        w2Var2.f32925z.c(r2Var.f(string), "Invalid conditional user property name");
    }

    public final void t(Bundle bundle, int i6, long j10) {
        Object obj;
        String string;
        i();
        h hVar = h.f32583b;
        g[] values = g.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            g gVar = values[i10];
            if (bundle.containsKey(gVar.f32567u) && (string = bundle.getString(gVar.f32567u)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i10++;
        }
        if (obj != null) {
            y3 y3Var = this.f32943u;
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.E.c(obj, "Ignoring invalid consent setting");
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.E.b("Valid consent values are 'granted', 'denied'");
        }
        u(h.a(bundle), i6, j10);
    }

    public final void u(h hVar, int i6, long j10) {
        h hVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h hVar3 = hVar;
        i();
        if (i6 != -10) {
            if (((Boolean) hVar3.f32584a.get(g.AD_STORAGE)) == null) {
                if (((Boolean) hVar3.f32584a.get(g.ANALYTICS_STORAGE)) == null) {
                    w2 w2Var = this.f32943u.C;
                    y3.k(w2Var);
                    w2Var.E.b("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.B) {
            try {
                hVar2 = this.C;
                int i10 = this.D;
                h hVar4 = h.f32583b;
                z10 = true;
                z11 = false;
                if (i6 <= i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean g5 = hVar3.g(hVar2, (g[]) hVar3.f32584a.keySet().toArray(new g[0]));
                    g gVar = g.ANALYTICS_STORAGE;
                    if (hVar3.f(gVar) && !this.C.f(gVar)) {
                        z11 = true;
                    }
                    hVar3 = hVar3.d(this.C);
                    this.C = hVar3;
                    this.D = i6;
                    z13 = z11;
                    z11 = g5;
                } else {
                    z10 = false;
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            w2 w2Var2 = this.f32943u.C;
            y3.k(w2Var2);
            w2Var2.F.c(hVar3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.E.getAndIncrement();
        if (z11) {
            this.A.set(null);
            w3 w3Var = this.f32943u.D;
            y3.k(w3Var);
            w3Var.q(new q4(this, hVar3, j10, i6, andIncrement, z13, hVar2));
            return;
        }
        r4 r4Var = new r4(this, hVar3, i6, andIncrement, z13, hVar2);
        if (i6 != 30 && i6 != -10) {
            w3 w3Var2 = this.f32943u.D;
            y3.k(w3Var2);
            w3Var2.p(r4Var);
            return;
        }
        w3 w3Var3 = this.f32943u.D;
        y3.k(w3Var3);
        w3Var3.q(r4Var);
    }

    public final void v(h hVar) {
        boolean z10;
        Boolean bool;
        h();
        if ((hVar.f(g.ANALYTICS_STORAGE) && hVar.f(g.AD_STORAGE)) || this.f32943u.t().o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y3 y3Var = this.f32943u;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.h();
        if (z10 != y3Var.X) {
            y3 y3Var2 = this.f32943u;
            w3 w3Var2 = y3Var2.D;
            y3.k(w3Var2);
            w3Var2.h();
            y3Var2.X = z10;
            j3 j3Var = this.f32943u.B;
            y3.i(j3Var);
            j3Var.h();
            if (j3Var.l().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(j3Var.l().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                y(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void w(String str, String str2, Object obj, boolean z10, long j10) {
        String str3;
        int i6;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        int i10 = 0;
        y3 y3Var = this.f32943u;
        if (z10) {
            k6 k6Var = y3Var.F;
            y3.i(k6Var);
            i6 = k6Var.g0(str2);
        } else {
            k6 k6Var2 = y3Var.F;
            y3.i(k6Var2);
            if (k6Var2.O("user property", str2)) {
                if (!k6Var2.J("user property", f6.b.K, null, str2)) {
                    i6 = 15;
                } else {
                    k6Var2.f32943u.getClass();
                    if (k6Var2.I(24, "user property", str2)) {
                        i6 = 0;
                    }
                }
            }
            i6 = 6;
        }
        g.x xVar = this.J;
        if (i6 != 0) {
            k6 k6Var3 = y3Var.F;
            y3.i(k6Var3);
            k6Var3.getClass();
            String o10 = k6.o(str2, 24, true);
            if (str2 != null) {
                i10 = str2.length();
            }
            k6 k6Var4 = y3Var.F;
            y3.i(k6Var4);
            k6Var4.getClass();
            k6.x(xVar, null, i6, "_ev", o10, i10);
        } else if (obj != null) {
            k6 k6Var5 = y3Var.F;
            y3.i(k6Var5);
            int c0 = k6Var5.c0(obj, str2);
            k6 k6Var6 = y3Var.F;
            if (c0 != 0) {
                y3.i(k6Var6);
                k6Var6.getClass();
                String o11 = k6.o(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i10 = obj.toString().length();
                }
                y3.i(k6Var6);
                k6Var6.getClass();
                k6.x(xVar, null, c0, "_ev", o11, i10);
                return;
            }
            y3.i(k6Var6);
            Object m10 = k6Var6.m(obj, str2);
            if (m10 != null) {
                w3 w3Var = y3Var.D;
                y3.k(w3Var);
                w3Var.p(new c4(this, str3, str2, m10, j10, 1));
            }
        } else {
            w3 w3Var2 = y3Var.D;
            y3.k(w3Var2);
            w3Var2.p(new c4(this, str3, str2, null, j10, 1));
        }
    }

    public final void x(long j10, Object obj, String str, String str2) {
        boolean o10;
        long j11;
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        boolean equals = "allow_personalized_ads".equals(str2);
        y3 y3Var = this.f32943u;
        if (equals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if (true != "false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j11 = 0;
                    } else {
                        j11 = 1;
                    }
                    Long valueOf = Long.valueOf(j11);
                    j3 j3Var = y3Var.B;
                    y3.i(j3Var);
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    j3Var.F.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                j3 j3Var2 = y3Var.B;
                y3.i(j3Var2);
                j3Var2.F.b("unset");
                obj = obj;
                str2 = "_npa";
            }
        }
        Object obj2 = obj;
        String str5 = str2;
        if (!y3Var.g()) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.H.b("User property not set since app measurement is disabled");
        } else if (!y3Var.h()) {
        } else {
            g6 g6Var = new g6(j10, obj2, str5, str);
            l5 t3 = y3Var.t();
            t3.h();
            t3.i();
            y3 y3Var2 = t3.f32943u;
            y3Var2.getClass();
            q2 q10 = y3Var2.q();
            q10.getClass();
            Parcel obtain = Parcel.obtain();
            h6.a(g6Var, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                w2 w2Var2 = q10.f32943u.C;
                y3.k(w2Var2);
                w2Var2.A.b("User property too long for local database. Sending directly to service");
                o10 = false;
            } else {
                o10 = q10.o(marshall, 1);
            }
            t3.t(new e5(t3, t3.q(true), o10, g6Var));
        }
    }

    public final void y(Boolean bool, boolean z10) {
        h();
        i();
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.G.c(bool, "Setting app measurement enabled (FE)");
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        j3Var.p(bool);
        if (z10) {
            j3 j3Var2 = y3Var.B;
            y3.i(j3Var2);
            j3Var2.h();
            SharedPreferences.Editor edit = j3Var2.l().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.h();
        if (!y3Var.X && (bool == null || bool.booleanValue())) {
            return;
        }
        z();
    }

    public final void z() {
        long j10;
        h();
        y3 y3Var = this.f32943u;
        j3 j3Var = y3Var.B;
        y3.i(j3Var);
        String a10 = j3Var.F.a();
        if (a10 != null) {
            boolean equals = "unset".equals(a10);
            kotlin.jvm.internal.b0 b0Var = y3Var.H;
            if (equals) {
                b0Var.getClass();
                x(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(a10)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                Long valueOf = Long.valueOf(j10);
                b0Var.getClass();
                x(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean g5 = y3Var.g();
        w2 w2Var = y3Var.C;
        if (g5 && this.I) {
            y3.k(w2Var);
            w2Var.G.b("Recording app launch after enabling measurement for the first time (FE)");
            D();
            ((e9) d9.f8343v.f8344u.a()).a();
            if (y3Var.A.q(null, j2.f32645d0)) {
                v5 v5Var = y3Var.E;
                y3.j(v5Var);
                v5Var.f32916x.a();
            }
            w3 w3Var = y3Var.D;
            y3.k(w3Var);
            w3Var.p(new k4(this, 1));
            return;
        }
        y3.k(w2Var);
        w2Var.G.b("Updating Scion state (FE)");
        l5 t3 = y3Var.t();
        t3.h();
        t3.i();
        t3.t(new f5(t3, t3.q(true), 2));
    }
}
