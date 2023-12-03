package ta;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class r3 extends y5 implements e {
    public final t.b A;
    public final t.b B;
    public final t.b C;
    public final q3 D;
    public final g.x E;
    public final t.b F;
    public final t.b G;
    public final t.b H;

    /* renamed from: x  reason: collision with root package name */
    public final t.b f32843x;

    /* renamed from: y  reason: collision with root package name */
    public final t.b f32844y;

    /* renamed from: z  reason: collision with root package name */
    public final t.b f32845z;

    public r3(d6 d6Var) {
        super(d6Var);
        this.f32843x = new t.b();
        this.f32844y = new t.b();
        this.f32845z = new t.b();
        this.A = new t.b();
        this.B = new t.b();
        this.F = new t.b();
        this.G = new t.b();
        this.H = new t.b();
        this.C = new t.b();
        this.D = new q3(this);
        this.E = new g.x(26, this);
    }

    public static final t.b p(com.google.android.gms.internal.measurement.c2 c2Var) {
        t.b bVar = new t.b();
        for (com.google.android.gms.internal.measurement.e2 e2Var : c2Var.G()) {
            bVar.put(e2Var.v(), e2Var.w());
        }
        return bVar;
    }

    @Override // ta.e
    public final String e(String str, String str2) {
        h();
        n(str);
        Map map = (Map) this.f32843x.getOrDefault(str, null);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    public final com.google.android.gms.internal.measurement.c2 l(String str, byte[] bArr) {
        Long l2;
        y3 y3Var = this.f32943u;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.c2.A();
        }
        try {
            com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) ((com.google.android.gms.internal.measurement.b2) f6.z(com.google.android.gms.internal.measurement.c2.y(), bArr)).f();
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            u2 u2Var = w2Var.H;
            String str2 = null;
            if (c2Var.L()) {
                l2 = Long.valueOf(c2Var.w());
            } else {
                l2 = null;
            }
            if (c2Var.K()) {
                str2 = c2Var.B();
            }
            u2Var.d("Parsed config. version, gmp_app_id", l2, str2);
            return c2Var;
        } catch (zzkp e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.C.d("Unable to merge remote config. appId", w2.q(str), e10);
            return com.google.android.gms.internal.measurement.c2.A();
        } catch (RuntimeException e11) {
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            w2Var3.C.d("Unable to merge remote config. appId", w2.q(str), e11);
            return com.google.android.gms.internal.measurement.c2.A();
        }
    }

    public final void m(String str, com.google.android.gms.internal.measurement.b2 b2Var) {
        HashSet hashSet = new HashSet();
        t.b bVar = new t.b();
        t.b bVar2 = new t.b();
        t.b bVar3 = new t.b();
        for (com.google.android.gms.internal.measurement.y1 y1Var : Collections.unmodifiableList(((com.google.android.gms.internal.measurement.c2) b2Var.f8613v).E())) {
            hashSet.add(y1Var.v());
        }
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.c2) b2Var.f8613v).v(); i6++) {
            com.google.android.gms.internal.measurement.z1 z1Var = (com.google.android.gms.internal.measurement.z1) ((com.google.android.gms.internal.measurement.c2) b2Var.f8613v).x(i6).r();
            boolean isEmpty = z1Var.k().isEmpty();
            y3 y3Var = this.f32943u;
            if (isEmpty) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.C.b("EventConfig contained null event name");
            } else {
                String k10 = z1Var.k();
                String r02 = kotlin.jvm.internal.h.r0(z1Var.k(), kc.f.f23225o0, kc.f.f23227q0);
                if (!TextUtils.isEmpty(r02)) {
                    z1Var.i();
                    com.google.android.gms.internal.measurement.a2.x((com.google.android.gms.internal.measurement.a2) z1Var.f8613v, r02);
                    b2Var.i();
                    com.google.android.gms.internal.measurement.c2.H((com.google.android.gms.internal.measurement.c2) b2Var.f8613v, i6, (com.google.android.gms.internal.measurement.a2) z1Var.f());
                }
                if (((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).A() && ((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).y()) {
                    bVar.put(k10, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).B() && ((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).z()) {
                    bVar2.put(z1Var.k(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).C()) {
                    if (((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).u() >= 2 && ((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).u() <= 65535) {
                        bVar3.put(z1Var.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).u()));
                    } else {
                        w2 w2Var2 = y3Var.C;
                        y3.k(w2Var2);
                        w2Var2.C.d("Invalid sampling rate. Event name, sample rate", z1Var.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.a2) z1Var.f8613v).u()));
                    }
                }
            }
        }
        this.f32844y.put(str, hashSet);
        this.f32845z.put(str, bVar);
        this.A.put(str, bVar2);
        this.C.put(str, bVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r4 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(String str) {
        Cursor cursor;
        s1.s sVar;
        String str2;
        i();
        h();
        v9.o.e(str);
        t.b bVar = this.B;
        Cursor cursor2 = null;
        if (bVar.getOrDefault(str, null) == 0) {
            k kVar = this.f32947v.f32532w;
            d6.H(kVar);
            y3 y3Var = kVar.f32943u;
            v9.o.e(str);
            kVar.h();
            kVar.i();
            try {
                cursor = kVar.A().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                    } catch (SQLiteException e10) {
                        e = e10;
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.d("Error querying remote config. appId", w2.q(str), e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                }
                throw th;
            }
            if (cursor.moveToFirst()) {
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                if (y3Var.A.q(null, j2.f32657k0)) {
                    str2 = cursor.getString(2);
                } else {
                    str2 = null;
                }
                if (cursor.moveToNext()) {
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.c(w2.q(str), "Got multiple records for app config, expected one. appId");
                }
                if (blob != null) {
                    sVar = new s1.s(12, blob, string, str2);
                    cursor.close();
                    t.b bVar2 = this.H;
                    t.b bVar3 = this.G;
                    t.b bVar4 = this.F;
                    t.b bVar5 = this.f32843x;
                    if (sVar != null) {
                        bVar5.put(str, null);
                        this.f32845z.put(str, null);
                        this.f32844y.put(str, null);
                        this.A.put(str, null);
                        bVar.put(str, null);
                        bVar4.put(str, null);
                        bVar3.put(str, null);
                        bVar2.put(str, null);
                        this.C.put(str, null);
                        return;
                    }
                    com.google.android.gms.internal.measurement.b2 b2Var = (com.google.android.gms.internal.measurement.b2) l(str, (byte[]) sVar.f31224v).r();
                    m(str, b2Var);
                    bVar5.put(str, p((com.google.android.gms.internal.measurement.c2) b2Var.f()));
                    bVar.put(str, (com.google.android.gms.internal.measurement.c2) b2Var.f());
                    o(str, (com.google.android.gms.internal.measurement.c2) b2Var.f());
                    bVar4.put(str, ((com.google.android.gms.internal.measurement.c2) b2Var.f8613v).C());
                    bVar3.put(str, (String) sVar.f31225w);
                    bVar2.put(str, (String) sVar.f31226x);
                    return;
                }
            }
            cursor.close();
            sVar = null;
            t.b bVar22 = this.H;
            t.b bVar32 = this.G;
            t.b bVar42 = this.F;
            t.b bVar52 = this.f32843x;
            if (sVar != null) {
            }
        }
    }

    public final void o(String str, com.google.android.gms.internal.measurement.c2 c2Var) {
        if (c2Var.u() != 0) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.H.c(Integer.valueOf(c2Var.u()), "EES programs found");
            com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) c2Var.F().get(0);
            try {
                com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0();
                h0Var.f8398a.f8683d.f8701a.put("internal.remoteConfig", new p3(this, str, 1));
                h0Var.f8398a.f8683d.f8701a.put("internal.appMetadata", new p3(this, str, 2));
                h0Var.f8398a.f8683d.f8701a.put("internal.logger", new c4.w(2, this));
                h0Var.a(h3Var);
                this.D.c(str, h0Var);
                w2 w2Var2 = this.f32943u.C;
                y3.k(w2Var2);
                w2Var2.H.d("EES program loaded for appId, activities", str, Integer.valueOf(h3Var.u().u()));
                for (com.google.android.gms.internal.measurement.g3 g3Var : h3Var.u().x()) {
                    w2 w2Var3 = this.f32943u.C;
                    y3.k(w2Var3);
                    w2Var3.H.c(g3Var.v(), "EES program activity");
                }
                return;
            } catch (zzd unused) {
                w2 w2Var4 = this.f32943u.C;
                y3.k(w2Var4);
                w2Var4.f32925z.c(str, "Failed to load EES program. appId");
                return;
            }
        }
        q3 q3Var = this.D;
        if (str != null) {
            synchronized (q3Var) {
                if (q3Var.f32235a.remove(str) != null) {
                    q3Var.f32236b--;
                }
            }
            return;
        }
        q3Var.getClass();
        throw new NullPointerException("key == null");
    }

    public final int q(String str, String str2) {
        Integer num;
        h();
        n(str);
        Map map = (Map) this.C.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.c2 r(String str) {
        i();
        h();
        v9.o.e(str);
        n(str);
        return (com.google.android.gms.internal.measurement.c2) this.B.getOrDefault(str, null);
    }

    public final String s(String str) {
        h();
        n(str);
        return (String) this.F.getOrDefault(str, null);
    }

    public final boolean t(String str) {
        com.google.android.gms.internal.measurement.c2 c2Var;
        if (TextUtils.isEmpty(str) || (c2Var = (com.google.android.gms.internal.measurement.c2) this.B.getOrDefault(str, null)) == null || c2Var.u() == 0) {
            return false;
        }
        return true;
    }

    public final boolean u(String str, String str2) {
        Boolean bool;
        h();
        n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.A.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        h();
        n(str);
        if ("1".equals(e(str, "measurement.upload.blacklist_internal")) && k6.S(str2)) {
            return true;
        }
        if ("1".equals(e(str, "measurement.upload.blacklist_public")) && k6.T(str2)) {
            return true;
        }
        Map map = (Map) this.f32845z.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(6:4|(3:6|(2:7|(8:9|(1:11)(1:28)|12|(4:15|(2:17|18)(1:20)|19|13)|21|22|(2:24|25)(1:27)|26)(1:29))|30)(1:45)|31|(3:33|(4:36|(2:38|39)(1:41)|40|34)|42)(1:44)|43|2)|46|47|(2:48|49)|(7:50|51|(4:53|54|(3:152|153|154)(3:56|57|(2:58|(2:60|(3:62|63|64))(1:66)))|65)(1:158)|108|109|110|111)|159|(4:162|(2:164|165)(2:167|168)|166|160)|169|170|171|(4:172|173|174|(1:176)(2:204|(2:205|(2:207|(1:209)(1:210))(2:211|212))))|177|178|(3:179|180|181)|(3:182|183|184)|185|(1:187)|188|189|(1:191)|193|194|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03de, code lost:
        r8 = r1.g();
        r11 = new android.content.ContentValues();
        r11.put(r3, r30);
        r24 = r0;
        r11.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f7, code lost:
        if (r1.D() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03f9, code lost:
        r0 = java.lang.Integer.valueOf(r1.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0402, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0403, code lost:
        r11.put("filter_id", r0);
        r26 = r3;
        r11.put("property_name", r1.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0415, code lost:
        if (r1.E() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0417, code lost:
        r0 = java.lang.Boolean.valueOf(r1.C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0420, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0421, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0435, code lost:
        if (r9.A().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0437, code lost:
        r0 = r6.C;
        ta.y3.k(r0);
        r0.f32925z.c(ta.w2.q(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0448, code lost:
        r0 = r24;
        r3 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x044e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x044f, code lost:
        r1 = r6.C;
        ta.y3.k(r1);
        r1.f32925z.d("Error storing property filter. appId", ta.w2.q(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x045f, code lost:
        r9.i();
        r9.h();
        v9.o.e(r30);
        r0 = r9.A();
        r5 = r20;
        r0.delete("property_filters", r5, new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", r5, new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x048c, code lost:
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x048e, code lost:
        r20 = r5;
        r3 = r23;
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x060a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x060b, code lost:
        ta.y3.k(r7);
        r7.f32925z.d("Error storing remote config. appId", ta.w2.q(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0272, code lost:
        r8 = r0.B().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027e, code lost:
        if (r8.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x028a, code lost:
        if (((com.google.android.gms.internal.measurement.u1) r8.next()).D() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x028c, code lost:
        r0 = r6.C;
        ta.y3.k(r0);
        r0.C.d("Property filter with no ID. Audience definition ignored. appId, audienceId", ta.w2.q(r30), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a2, code lost:
        r8 = r0.A().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02ae, code lost:
        r23 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02ba, code lost:
        if (r8.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02bc, code lost:
        r11 = (com.google.android.gms.internal.measurement.n1) r8.next();
        r9.i();
        r9.h();
        v9.o.e(r30);
        v9.o.h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d6, code lost:
        if (r11.A().isEmpty() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02d8, code lost:
        r0 = r6.C;
        ta.y3.k(r0);
        r0 = r0.C;
        r4 = ta.w2.q(r30);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02ed, code lost:
        if (r11.I() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ef, code lost:
        r6 = java.lang.Integer.valueOf(r11.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f8, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02f9, code lost:
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0300, code lost:
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0304, code lost:
        r24 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0306, code lost:
        r8 = r11.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x030a, code lost:
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x030c, code lost:
        r1 = new android.content.ContentValues();
        r1.put("app_id", r30);
        r1.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x031f, code lost:
        if (r11.I() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0321, code lost:
        r3 = java.lang.Integer.valueOf(r11.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x032a, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x032b, code lost:
        r1.put("filter_id", r3);
        r1.put("event_name", r11.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x033b, code lost:
        if (r11.J() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x033d, code lost:
        r3 = java.lang.Boolean.valueOf(r11.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0346, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0347, code lost:
        r1.put("session_scoped", r3);
        r1.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x035b, code lost:
        if (r9.A().insertWithOnConflict("event_filters", null, r1, 5) != (-1)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035d, code lost:
        r1 = r6.C;
        ta.y3.k(r1);
        r1.f32925z.c(ta.w2.q(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x036d, code lost:
        r3 = r23;
        r8 = r24;
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0375, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0376, code lost:
        r1 = r6.C;
        ta.y3.k(r1);
        r1.f32925z.d("Error storing event filter. appId", ta.w2.q(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0388, code lost:
        r25 = r1;
        r0 = r0.B().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0396, code lost:
        if (r0.hasNext() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0398, code lost:
        r1 = (com.google.android.gms.internal.measurement.u1) r0.next();
        r9.i();
        r9.h();
        v9.o.e(r30);
        v9.o.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03b2, code lost:
        if (r1.y().isEmpty() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b4, code lost:
        r0 = r6.C;
        ta.y3.k(r0);
        r0 = r0.C;
        r4 = ta.w2.q(r30);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03c9, code lost:
        if (r1.D() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03cb, code lost:
        r1 = java.lang.Integer.valueOf(r1.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03d4, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03d5, code lost:
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fb A[Catch: SQLiteException -> 0x060a, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x060a, blocks: (B:158:0x05e2, B:160:0x05fb), top: B:172:0x05e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Iterator it;
        y3 y3Var;
        com.google.android.gms.internal.measurement.b2 b2Var;
        byte[] bArr2;
        k kVar;
        ContentValues contentValues;
        f fVar;
        Integer num;
        com.google.android.gms.internal.measurement.b2 b2Var2;
        t.b bVar;
        boolean z10;
        i();
        h();
        v9.o.e(str);
        com.google.android.gms.internal.measurement.b2 b2Var3 = (com.google.android.gms.internal.measurement.b2) l(str, bArr).r();
        m(str, b2Var3);
        o(str, (com.google.android.gms.internal.measurement.c2) b2Var3.f());
        t.b bVar2 = this.B;
        bVar2.put(str, (com.google.android.gms.internal.measurement.c2) b2Var3.f());
        this.F.put(str, ((com.google.android.gms.internal.measurement.c2) b2Var3.f8613v).C());
        this.G.put(str, str2);
        this.H.put(str, str3);
        this.f32843x.put(str, p((com.google.android.gms.internal.measurement.c2) b2Var3.f()));
        d6 d6Var = this.f32947v;
        k kVar2 = d6Var.f32532w;
        d6.H(kVar2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.c2) b2Var3.f8613v).D()));
        String str4 = "app_id=? and audience_id=?";
        int i6 = 0;
        while (i6 < arrayList.size()) {
            com.google.android.gms.internal.measurement.k1 k1Var = (com.google.android.gms.internal.measurement.k1) ((com.google.android.gms.internal.measurement.l1) arrayList.get(i6)).r();
            if (((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).v() != 0) {
                int i10 = 0;
                while (true) {
                    bVar = bVar2;
                    if (i10 >= ((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).v()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.m1 m1Var = (com.google.android.gms.internal.measurement.m1) ((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).y(i10).r();
                    com.google.android.gms.internal.measurement.m1 m1Var2 = (com.google.android.gms.internal.measurement.m1) m1Var.clone();
                    d6 d6Var2 = d6Var;
                    String r02 = kotlin.jvm.internal.h.r0(((com.google.android.gms.internal.measurement.n1) m1Var.f8613v).A(), kc.f.f23225o0, kc.f.f23227q0);
                    if (r02 != null) {
                        m1Var2.i();
                        com.google.android.gms.internal.measurement.n1.C((com.google.android.gms.internal.measurement.n1) m1Var2.f8613v, r02);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i11 = 0;
                    while (i11 < ((com.google.android.gms.internal.measurement.n1) m1Var.f8613v).u()) {
                        com.google.android.gms.internal.measurement.p1 y10 = ((com.google.android.gms.internal.measurement.n1) m1Var.f8613v).y(i11);
                        com.google.android.gms.internal.measurement.m1 m1Var3 = m1Var;
                        com.google.android.gms.internal.measurement.b2 b2Var4 = b2Var3;
                        String str5 = str4;
                        String r03 = kotlin.jvm.internal.h.r0(y10.y(), kotlin.jvm.internal.b0.X, kotlin.jvm.internal.b0.Y);
                        if (r03 != null) {
                            com.google.android.gms.internal.measurement.o1 o1Var = (com.google.android.gms.internal.measurement.o1) y10.r();
                            o1Var.i();
                            com.google.android.gms.internal.measurement.p1.z((com.google.android.gms.internal.measurement.p1) o1Var.f8613v, r03);
                            m1Var2.i();
                            com.google.android.gms.internal.measurement.n1.D((com.google.android.gms.internal.measurement.n1) m1Var2.f8613v, i11, (com.google.android.gms.internal.measurement.p1) o1Var.f());
                            z11 = true;
                        }
                        i11++;
                        m1Var = m1Var3;
                        b2Var3 = b2Var4;
                        str4 = str5;
                    }
                    com.google.android.gms.internal.measurement.b2 b2Var5 = b2Var3;
                    String str6 = str4;
                    if (z11) {
                        k1Var.i();
                        com.google.android.gms.internal.measurement.l1.D((com.google.android.gms.internal.measurement.l1) k1Var.f8613v, i10, (com.google.android.gms.internal.measurement.n1) m1Var2.f());
                        arrayList.set(i6, (com.google.android.gms.internal.measurement.l1) k1Var.f());
                    }
                    i10++;
                    bVar2 = bVar;
                    d6Var = d6Var2;
                    b2Var3 = b2Var5;
                    str4 = str6;
                }
                b2Var2 = b2Var3;
            } else {
                b2Var2 = b2Var3;
                bVar = bVar2;
            }
            d6 d6Var3 = d6Var;
            String str7 = str4;
            if (((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).w() != 0) {
                for (int i12 = 0; i12 < ((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).w(); i12++) {
                    com.google.android.gms.internal.measurement.u1 z12 = ((com.google.android.gms.internal.measurement.l1) k1Var.f8613v).z(i12);
                    String r04 = kotlin.jvm.internal.h.r0(z12.y(), f6.b.K, f6.b.L);
                    if (r04 != null) {
                        com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) z12.r();
                        t1Var.i();
                        com.google.android.gms.internal.measurement.u1.z((com.google.android.gms.internal.measurement.u1) t1Var.f8613v, r04);
                        k1Var.i();
                        com.google.android.gms.internal.measurement.l1.C((com.google.android.gms.internal.measurement.l1) k1Var.f8613v, i12, (com.google.android.gms.internal.measurement.u1) t1Var.f());
                        arrayList.set(i6, (com.google.android.gms.internal.measurement.l1) k1Var.f());
                    }
                }
            }
            i6++;
            bVar2 = bVar;
            d6Var = d6Var3;
            b2Var3 = b2Var2;
            str4 = str7;
        }
        com.google.android.gms.internal.measurement.b2 b2Var6 = b2Var3;
        t.b bVar3 = bVar2;
        d6 d6Var4 = d6Var;
        String str8 = str4;
        kVar2.i();
        kVar2.h();
        v9.o.e(str);
        SQLiteDatabase A = kVar2.A();
        A.beginTransaction();
        try {
            kVar2.i();
            kVar2.h();
            v9.o.e(str);
            SQLiteDatabase A2 = kVar2.A();
            A2.delete("property_filters", "app_id=?", new String[]{str});
            A2.delete("event_filters", "app_id=?", new String[]{str});
            it = arrayList.iterator();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = A;
        }
        while (true) {
            boolean hasNext = it.hasNext();
            y3Var = kVar2.f32943u;
            if (!hasNext) {
                break;
            }
            try {
                com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) it.next();
                kVar2.i();
                kVar2.h();
                v9.o.e(str);
                v9.o.h(l1Var);
                if (!l1Var.E()) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.C.c(w2.q(str), "Audience with no ID. appId");
                } else {
                    int u10 = l1Var.u();
                    Iterator it2 = l1Var.A().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.n1) it2.next()).I()) {
                                w2 w2Var2 = y3Var.C;
                                y3.k(w2Var2);
                                w2Var2.C.d("Event filter with no ID. Audience definition ignored. appId, audienceId", w2.q(str), Integer.valueOf(u10));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = A;
            }
            th = th;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase = A;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.google.android.gms.internal.measurement.l1 l1Var2 = (com.google.android.gms.internal.measurement.l1) it3.next();
            if (l1Var2.E()) {
                num = Integer.valueOf(l1Var2.u());
            } else {
                num = null;
            }
            arrayList2.add(num);
        }
        v9.o.e(str);
        kVar2.i();
        kVar2.h();
        SQLiteDatabase A3 = kVar2.A();
        try {
            long v10 = kVar2.v("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, y3Var.A.l(str, j2.F)));
            if (v10 > max) {
                ArrayList arrayList3 = new ArrayList();
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList2.size()) {
                        Integer num2 = (Integer) arrayList2.get(i13);
                        if (num2 == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num2.intValue()));
                        i13++;
                    } else {
                        String join = TextUtils.join(",", arrayList3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                        sb2.append("(" + join + ")");
                        sb2.append(" order by rowid desc limit -1 offset ?)");
                        A3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)});
                        break;
                    }
                }
            }
        } catch (SQLiteException e10) {
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            w2Var3.f32925z.d("Database error querying filters. appId", w2.q(str), e10);
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        try {
            b2Var6.i();
            b2Var = b2Var6;
        } catch (RuntimeException e11) {
            e = e11;
            b2Var = b2Var6;
        }
        try {
            com.google.android.gms.internal.measurement.c2.I((com.google.android.gms.internal.measurement.c2) b2Var.f8613v);
            bArr2 = ((com.google.android.gms.internal.measurement.c2) b2Var.f()).g();
        } catch (RuntimeException e12) {
            e = e12;
            w2 w2Var4 = this.f32943u.C;
            y3.k(w2Var4);
            w2Var4.C.d("Unable to serialize reduced-size config. Storing full config instead. appId", w2.q(str), e);
            bArr2 = bArr;
            kVar = d6Var4.f32532w;
            d6.H(kVar);
            v9.o.e(str);
            kVar.h();
            kVar.i();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            y3 y3Var2 = kVar.f32943u;
            fVar = y3Var2.A;
            w2 w2Var5 = y3Var2.C;
            if (fVar.q(null, j2.f32657k0)) {
            }
            if (kVar.A().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
            }
            bVar3.put(str, (com.google.android.gms.internal.measurement.c2) b2Var.f());
        }
        kVar = d6Var4.f32532w;
        d6.H(kVar);
        v9.o.e(str);
        kVar.h();
        kVar.i();
        contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        contentValues.put("config_last_modified_time", str2);
        y3 y3Var22 = kVar.f32943u;
        fVar = y3Var22.A;
        w2 w2Var52 = y3Var22.C;
        if (fVar.q(null, j2.f32657k0)) {
            contentValues.put("e_tag", str3);
        }
        if (kVar.A().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
            y3.k(w2Var52);
            w2Var52.f32925z.c(w2.q(str), "Failed to update remote config (got 0). appId");
        }
        bVar3.put(str, (com.google.android.gms.internal.measurement.c2) b2Var.f());
    }

    @Override // ta.y5
    public final void k() {
    }
}
