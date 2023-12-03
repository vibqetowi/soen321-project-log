package com.google.firebase.auth;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.be;
import com.google.android.gms.internal.p000firebaseauthapi.j;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.rd;
import com.google.android.gms.internal.p000firebaseauthapi.sd;
import com.google.android.gms.internal.p000firebaseauthapi.td;
import com.google.android.gms.internal.p000firebaseauthapi.ud;
import com.google.android.gms.internal.p000firebaseauthapi.ue;
import com.google.android.gms.internal.p000firebaseauthapi.vd;
import com.google.android.gms.internal.p000firebaseauthapi.wd;
import com.google.android.gms.internal.p000firebaseauthapi.xd;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import fd.b0;
import fd.c0;
import fd.d;
import fd.f;
import fd.m;
import fd.x;
import gd.k0;
import gd.l;
import gd.s;
import gd.t;
import gd.v;
import gd.w;
import gd.y;
import gd.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import sc.e;
import v9.o;
import ya.k;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public abstract class FirebaseAuth implements gd.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f9536a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f9537b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f9538c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f9539d;

    /* renamed from: e  reason: collision with root package name */
    public final xd f9540e;
    public f f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9541g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9542h;

    /* renamed from: i  reason: collision with root package name */
    public String f9543i;

    /* renamed from: j  reason: collision with root package name */
    public final t f9544j;

    /* renamed from: k  reason: collision with root package name */
    public final y f9545k;

    /* renamed from: l  reason: collision with root package name */
    public final re.b f9546l;

    /* renamed from: m  reason: collision with root package name */
    public v f9547m;

    /* renamed from: n  reason: collision with root package name */
    public final w f9548n;

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FirebaseAuth(e eVar, re.b bVar) {
        JSONObject jSONObject;
        k0 a10;
        String string;
        e eVar2;
        byte[] decode;
        fd.a aVar;
        String str;
        fd.a aVar2;
        boolean z10;
        jf jfVar;
        xd xdVar = new xd(eVar);
        eVar.b();
        t tVar = new t(eVar.f31432a, eVar.g());
        y yVar = y.f16453b;
        z zVar = z.f16455a;
        this.f9537b = new CopyOnWriteArrayList();
        this.f9538c = new CopyOnWriteArrayList();
        this.f9539d = new CopyOnWriteArrayList();
        this.f9541g = new Object();
        this.f9542h = new Object();
        this.f9548n = w.f16450v;
        this.f9536a = eVar;
        this.f9540e = xdVar;
        this.f9544j = tVar;
        o.h(yVar);
        this.f9545k = yVar;
        o.h(zVar);
        this.f9546l = bVar;
        String string2 = tVar.f16444a.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                jSONObject = new JSONObject(string2);
            } catch (Exception unused) {
            }
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                a10 = tVar.a(jSONObject);
                this.f = a10;
                char c10 = 0;
                if (a10 != null) {
                    t tVar2 = this.f9544j;
                    tVar2.getClass();
                    String string3 = tVar2.f16444a.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a10.f16426v.f16415u), null);
                    if (string3 != null) {
                        jfVar = jf.f0(string3);
                    } else {
                        jfVar = null;
                    }
                    if (jfVar != null) {
                        i(this, this.f, jfVar, false, false);
                    }
                }
                this.f9545k.f16454a.getClass();
                e eVar3 = this.f9536a;
                eVar3.b();
                SharedPreferences sharedPreferences = eVar3.f31432a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
                string = sharedPreferences.getString("firebaseAppName", "");
                eVar2 = this.f9536a;
                eVar2.b();
                if (!eVar2.f31433b.equals(string)) {
                    char c11 = 65535;
                    if (sharedPreferences.contains("verifyAssertionRequest")) {
                        String string4 = sharedPreferences.getString("verifyAssertionRequest", "");
                        Parcelable.Creator<j> creator = j.CREATOR;
                        if (string4 == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string4, 10);
                        }
                        o.h(creator);
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(decode, 0, decode.length);
                        obtain.setDataPosition(0);
                        obtain.recycle();
                        j createFromParcel = creator.createFromParcel(obtain);
                        String string5 = sharedPreferences.getString("operation", "");
                        String string6 = sharedPreferences.getString("tenantId", null);
                        String string7 = sharedPreferences.getString("firebaseUserUid", "");
                        sharedPreferences.getLong(ServerValues.NAME_OP_TIMESTAMP, 0L);
                        if (string6 != null) {
                            o.e(string6);
                            synchronized (this.f9542h) {
                                this.f9543i = string6;
                            }
                            createFromParcel.H = string6;
                        }
                        int hashCode = string5.hashCode();
                        if (hashCode != -98509410) {
                            if (hashCode != 175006864) {
                                if (hashCode == 1450464913 && string5.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                                    c11 = 0;
                                }
                            } else if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                                c11 = 1;
                            }
                        } else if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                            c11 = 2;
                        }
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 == 2 && this.f.j0().equals(string7)) {
                                    f fVar = this.f;
                                    x g02 = x.g0(createFromParcel);
                                    o.h(fVar);
                                    fd.b f02 = g02.f0();
                                    boolean z11 = f02 instanceof d;
                                    e eVar4 = this.f9536a;
                                    xd xdVar2 = this.f9540e;
                                    if (z11) {
                                        d dVar = (d) f02;
                                        if (!TextUtils.isEmpty(dVar.f14949v)) {
                                            str = SessionManager.KEY_PASS;
                                        } else {
                                            str = "emailLink";
                                        }
                                        if (SessionManager.KEY_PASS.equals(str)) {
                                            String str2 = dVar.f14949v;
                                            o.e(str2);
                                            String i02 = fVar.i0();
                                            b0 b0Var = new b0(this, 1);
                                            xdVar2.getClass();
                                            vd vdVar = new vd(dVar.f14948u, str2, i02, 0);
                                            vdVar.e(eVar4);
                                            vdVar.f(fVar);
                                            vdVar.d(b0Var);
                                            vdVar.f = b0Var;
                                            xdVar2.a(vdVar);
                                        } else {
                                            String str3 = dVar.f14950w;
                                            o.e(str3);
                                            Map map = fd.a.f14942c;
                                            o.e(str3);
                                            try {
                                                aVar2 = new fd.a(str3);
                                            } catch (IllegalArgumentException unused2) {
                                                aVar2 = null;
                                            }
                                            if (aVar2 != null && !TextUtils.equals(this.f9543i, aVar2.f14944b)) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                k.d(be.a(new Status(17072, null)));
                                            } else {
                                                b0 b0Var2 = new b0(this, 1);
                                                xdVar2.getClass();
                                                ud udVar = new ud(dVar, 0);
                                                udVar.e(eVar4);
                                                udVar.f(fVar);
                                                udVar.d(b0Var2);
                                                udVar.f = b0Var2;
                                                xdVar2.a(udVar);
                                            }
                                        }
                                    } else if (f02 instanceof m) {
                                        String str4 = this.f9543i;
                                        b0 b0Var3 = new b0(this, 1);
                                        xdVar2.getClass();
                                        ue.f8187a.clear();
                                        wd wdVar = new wd((m) f02, str4, 0);
                                        wdVar.e(eVar4);
                                        wdVar.f(fVar);
                                        wdVar.d(b0Var3);
                                        wdVar.f = b0Var3;
                                        xdVar2.a(wdVar);
                                    } else {
                                        String i03 = fVar.i0();
                                        b0 b0Var4 = new b0(this, 1);
                                        xdVar2.getClass();
                                        td tdVar = new td(f02, i03, 0);
                                        tdVar.e(eVar4);
                                        tdVar.f(fVar);
                                        tdVar.d(b0Var4);
                                        tdVar.f = b0Var4;
                                        xdVar2.a(tdVar);
                                    }
                                }
                            } else if (this.f.j0().equals(string7)) {
                                f fVar2 = this.f;
                                x g03 = x.g0(createFromParcel);
                                o.h(fVar2);
                                fd.b f03 = g03.f0();
                                b0 b0Var5 = new b0(this, 1);
                                xd xdVar3 = this.f9540e;
                                xdVar3.getClass();
                                e eVar5 = this.f9536a;
                                o.h(eVar5);
                                List s02 = fVar2.s0();
                                if (s02 != null && s02.contains(((x) f03).f14972u)) {
                                    k.d(be.a(new Status(17015, null)));
                                } else if (f03 instanceof d) {
                                    d dVar2 = (d) f03;
                                    if (!(!TextUtils.isEmpty(dVar2.f14950w))) {
                                        sd sdVar = new sd(dVar2, 0);
                                        sdVar.e(eVar5);
                                        sdVar.f(fVar2);
                                        sdVar.d(b0Var5);
                                        sdVar.f = b0Var5;
                                        xdVar3.a(sdVar);
                                    } else {
                                        sd sdVar2 = new sd(dVar2, 1);
                                        sdVar2.e(eVar5);
                                        sdVar2.f(fVar2);
                                        sdVar2.d(b0Var5);
                                        sdVar2.f = b0Var5;
                                        xdVar3.a(sdVar2);
                                    }
                                } else if (f03 instanceof m) {
                                    ue.f8187a.clear();
                                    rd rdVar = new rd((m) f03);
                                    rdVar.e(eVar5);
                                    rdVar.f(fVar2);
                                    rdVar.d(b0Var5);
                                    rdVar.f = b0Var5;
                                    xdVar3.a(rdVar);
                                } else {
                                    rd rdVar2 = new rd(f03);
                                    rdVar2.e(eVar5);
                                    rdVar2.f(fVar2);
                                    rdVar2.d(b0Var5);
                                    rdVar2.f = b0Var5;
                                    xdVar3.a(rdVar2);
                                }
                            }
                        } else {
                            fd.b f04 = x.g0(createFromParcel).f0();
                            boolean z12 = f04 instanceof d;
                            e eVar6 = this.f9536a;
                            xd xdVar4 = this.f9540e;
                            if (z12) {
                                d dVar3 = (d) f04;
                                if (!(!TextUtils.isEmpty(dVar3.f14950w))) {
                                    String str5 = dVar3.f14949v;
                                    o.e(str5);
                                    String str6 = this.f9543i;
                                    c0 c0Var = new c0(this);
                                    xdVar4.getClass();
                                    vd vdVar2 = new vd(dVar3.f14948u, str5, str6, 1);
                                    vdVar2.e(eVar6);
                                    vdVar2.d(c0Var);
                                    xdVar4.a(vdVar2);
                                } else {
                                    String str7 = dVar3.f14950w;
                                    o.e(str7);
                                    Map map2 = fd.a.f14942c;
                                    o.e(str7);
                                    try {
                                        aVar = new fd.a(str7);
                                    } catch (IllegalArgumentException unused3) {
                                        aVar = null;
                                    }
                                    if (aVar != null && !TextUtils.equals(this.f9543i, aVar.f14944b)) {
                                        c10 = 1;
                                    }
                                    if (c10 != 0) {
                                        k.d(be.a(new Status(17072, null)));
                                    } else {
                                        c0 c0Var2 = new c0(this);
                                        xdVar4.getClass();
                                        ud udVar2 = new ud(dVar3, 1);
                                        udVar2.e(eVar6);
                                        udVar2.d(c0Var2);
                                        xdVar4.a(udVar2);
                                    }
                                }
                            } else if (f04 instanceof m) {
                                String str8 = this.f9543i;
                                c0 c0Var3 = new c0(this);
                                xdVar4.getClass();
                                ue.f8187a.clear();
                                wd wdVar2 = new wd((m) f04, str8, 1);
                                wdVar2.e(eVar6);
                                wdVar2.d(c0Var3);
                                xdVar4.a(wdVar2);
                            } else {
                                String str9 = this.f9543i;
                                c0 c0Var4 = new c0(this);
                                xdVar4.getClass();
                                td tdVar2 = new td(f04, str9, 1);
                                tdVar2.e(eVar6);
                                tdVar2.d(c0Var4);
                                xdVar4.a(tdVar2);
                            }
                        }
                        s.a(sharedPreferences);
                        return;
                    } else if (sharedPreferences.contains("recaptchaToken")) {
                        String string8 = sharedPreferences.getString("recaptchaToken", "");
                        String string9 = sharedPreferences.getString("operation", "");
                        sharedPreferences.getLong(ServerValues.NAME_OP_TIMESTAMP, 0L);
                        if (((string9.hashCode() == -214796028 && string9.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) ? (char) 65535 : (char) 65535) == 0) {
                            k.e(string8);
                        }
                        s.a(sharedPreferences);
                        return;
                    } else if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                        sharedPreferences.getLong(ServerValues.NAME_OP_TIMESTAMP, 0L);
                        s.a(sharedPreferences);
                        k.d(be.a(status));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        a10 = null;
        this.f = a10;
        char c102 = 0;
        if (a10 != null) {
        }
        this.f9545k.f16454a.getClass();
        e eVar32 = this.f9536a;
        eVar32.b();
        SharedPreferences sharedPreferences2 = eVar32.f31432a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        string = sharedPreferences2.getString("firebaseAppName", "");
        eVar2 = this.f9536a;
        eVar2.b();
        if (!eVar2.f31433b.equals(string)) {
        }
    }

    public static void g(FirebaseAuth firebaseAuth, f fVar) {
        if (fVar != null) {
            String j02 = fVar.j0();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + j02 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f9548n.execute(new com.google.firebase.auth.b(firebaseAuth));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) e.e().c(FirebaseAuth.class);
    }

    public static void h(FirebaseAuth firebaseAuth, f fVar) {
        String str;
        if (fVar != null) {
            String j02 = fVar.j0();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + j02 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        if (fVar != null) {
            str = fVar.q0();
        } else {
            str = null;
        }
        firebaseAuth.f9548n.execute(new com.google.firebase.auth.a(firebaseAuth, new we.b(str)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:48:0x0128
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void i(com.google.firebase.auth.FirebaseAuth r16, fd.f r17, com.google.android.gms.internal.p000firebaseauthapi.jf r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.i(com.google.firebase.auth.FirebaseAuth, fd.f, com.google.android.gms.internal.firebase-auth-api.jf, boolean, boolean):void");
    }

    @Override // gd.b
    public final String a() {
        f fVar = this.f;
        if (fVar == null) {
            return null;
        }
        return fVar.j0();
    }

    @Override // gd.b
    public final void b(gd.a aVar) {
        v vVar;
        boolean z10;
        o.h(aVar);
        this.f9538c.add(aVar);
        synchronized (this) {
            try {
                if (this.f9547m == null) {
                    e eVar = this.f9536a;
                    o.h(eVar);
                    this.f9547m = new v(eVar);
                }
                vVar = this.f9547m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = this.f9538c.size();
        if (size > 0 && vVar.f16447a == 0) {
            vVar.f16447a = size;
            if (vVar.f16447a > 0 && !vVar.f16449c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vVar.f16448b.a();
            }
        } else if (size == 0 && vVar.f16447a != 0) {
            l lVar = vVar.f16448b;
            lVar.f16434d.removeCallbacks(lVar.f16435e);
        }
        vVar.f16447a = size;
    }

    @Override // gd.b
    public final ya.v c(boolean z10) {
        f fVar = this.f;
        if (fVar == null) {
            return k.d(be.a(new Status(17495, null)));
        }
        jf p02 = fVar.p0();
        if (p02.h0() && !z10) {
            return k.e(gd.o.a(p02.f7923v));
        }
        String str = p02.f7922u;
        b0 b0Var = new b0(this, 0);
        xd xdVar = this.f9540e;
        xdVar.getClass();
        rd rdVar = new rd(str, 0);
        rdVar.e(this.f9536a);
        rdVar.f(fVar);
        rdVar.d(b0Var);
        rdVar.f = b0Var;
        return xdVar.a(rdVar);
    }

    public final void d() {
        synchronized (this.f9541g) {
        }
    }

    public final ya.v e(String str) {
        o.e(str);
        String str2 = this.f9543i;
        c0 c0Var = new c0(this);
        xd xdVar = this.f9540e;
        xdVar.getClass();
        rd rdVar = new rd(str, str2);
        rdVar.e(this.f9536a);
        rdVar.d(c0Var);
        return xdVar.a(rdVar);
    }

    public final void f() {
        t tVar = this.f9544j;
        o.h(tVar);
        f fVar = this.f;
        SharedPreferences sharedPreferences = tVar.f16444a;
        if (fVar != null) {
            sharedPreferences.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", fVar.j0())).apply();
            this.f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        h(this, null);
        g(this, null);
        v vVar = this.f9547m;
        if (vVar != null) {
            l lVar = vVar.f16448b;
            lVar.f16434d.removeCallbacks(lVar.f16435e);
        }
    }

    @Keep
    public static FirebaseAuth getInstance(e eVar) {
        return (FirebaseAuth) eVar.c(FirebaseAuth.class);
    }
}
