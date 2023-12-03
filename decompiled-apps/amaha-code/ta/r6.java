package ta;

import android.util.Log;
import com.google.android.gms.internal.measurement.x8;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class r6 extends s6 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f32855g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f32856h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.w5 f32857i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(b bVar, String str, int i6, com.google.android.gms.internal.measurement.w5 w5Var, int i10) {
        super(str, i6);
        this.f32855g = i10;
        this.f32856h = bVar;
        this.f32857i = w5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Long l2, Long l10, com.google.android.gms.internal.measurement.m2 m2Var, long j10, p pVar, boolean z10) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        String sb2;
        x8.b();
        b bVar = this.f32856h;
        f fVar = bVar.f32943u.A;
        i2 i2Var = j2.W;
        String str = this.f32868a;
        boolean q10 = fVar.q(str, i2Var);
        com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) this.f32857i;
        long j11 = n1Var.G() ? pVar.f32796e : j10;
        y3 y3Var = bVar.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        boolean isLoggable = Log.isLoggable(w2Var.t(), 2);
        int i6 = this.f32869b;
        if (isLoggable) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.H.e("Evaluating filter. audience, filter, event", Integer.valueOf(i6), n1Var.I() ? Integer.valueOf(n1Var.v()) : null, y3Var.G.d(n1Var.A()));
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            f6 f6Var = bVar.f32947v.A;
            d6.H(f6Var);
            if (n1Var == null) {
                sb2 = "null";
            } else {
                StringBuilder c10 = v.h.c("\nevent_filter {\n");
                if (n1Var.I()) {
                    f6.s(c10, 0, "filter_id", Integer.valueOf(n1Var.v()));
                }
                f6.s(c10, 0, "event_name", f6Var.f32943u.G.d(n1Var.A()));
                String q11 = f6.q(n1Var.E(), n1Var.F(), n1Var.G());
                if (!q11.isEmpty()) {
                    f6.s(c10, 0, "filter_type", q11);
                }
                if (n1Var.H()) {
                    f6.t(c10, 1, "event_count_filter", n1Var.z());
                }
                if (n1Var.u() > 0) {
                    c10.append("  filters {\n");
                    for (com.google.android.gms.internal.measurement.p1 p1Var : n1Var.B()) {
                        f6Var.o(c10, 2, p1Var);
                    }
                }
                f6.p(1, c10);
                c10.append("}\n}\n");
                sb2 = c10.toString();
            }
            w2Var3.H.c(sb2, "Filter definition");
        }
        if (!n1Var.I() || n1Var.v() > 256) {
            w2 w2Var4 = y3Var.C;
            y3.k(w2Var4);
            w2Var4.C.d("Invalid event filter ID. appId, id", w2.q(str), String.valueOf(n1Var.I() ? Integer.valueOf(n1Var.v()) : null));
            return false;
        }
        boolean z11 = n1Var.E() || n1Var.F() || n1Var.G();
        if (z10 && !z11) {
            w2 w2Var5 = y3Var.C;
            y3.k(w2Var5);
            w2Var5.H.d("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i6), n1Var.I() ? Integer.valueOf(n1Var.v()) : null);
            return true;
        }
        String B = m2Var.B();
        if (n1Var.H()) {
            try {
                bool5 = s6.a(new BigDecimal(j11), n1Var.z(), 0.0d);
            } catch (NumberFormatException unused) {
                bool5 = null;
            }
            if (bool5 != null) {
                if (!bool5.booleanValue()) {
                    bool4 = Boolean.FALSE;
                    w2 w2Var6 = y3Var.C;
                    y3.k(w2Var6);
                    w2Var6.H.c(bool4 != null ? bool4 : "null", "Event filter result");
                    if (bool4 == null) {
                        return false;
                    }
                    Boolean bool6 = Boolean.TRUE;
                    this.f32870c = bool6;
                    if (bool4.booleanValue()) {
                        this.f32871d = bool6;
                        if (z11 && m2Var.N()) {
                            Long valueOf = Long.valueOf(m2Var.x());
                            if (n1Var.F()) {
                                if (q10 && n1Var.H()) {
                                    valueOf = l2;
                                }
                                this.f = valueOf;
                                return true;
                            }
                            if (q10 && n1Var.H()) {
                                valueOf = l10;
                            }
                            this.f32872e = valueOf;
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            }
            bool4 = null;
            w2 w2Var62 = y3Var.C;
            y3.k(w2Var62);
            w2Var62.H.c(bool4 != null ? bool4 : "null", "Event filter result");
            if (bool4 == null) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it = n1Var.B().iterator();
        while (true) {
            if (it.hasNext()) {
                com.google.android.gms.internal.measurement.p1 p1Var2 = (com.google.android.gms.internal.measurement.p1) it.next();
                if (p1Var2.y().isEmpty()) {
                    w2 w2Var7 = y3Var.C;
                    y3.k(w2Var7);
                    w2Var7.C.c(y3Var.G.d(B), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(p1Var2.y());
            } else {
                t.b bVar2 = new t.b();
                Iterator it2 = m2Var.C().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        com.google.android.gms.internal.measurement.q2 q2Var = (com.google.android.gms.internal.measurement.q2) it2.next();
                        if (hashSet.contains(q2Var.A())) {
                            if (q2Var.P()) {
                                bVar2.put(q2Var.A(), q2Var.P() ? Long.valueOf(q2Var.x()) : null);
                            } else if (q2Var.N()) {
                                bVar2.put(q2Var.A(), q2Var.N() ? Double.valueOf(q2Var.u()) : null);
                            } else if (q2Var.R()) {
                                bVar2.put(q2Var.A(), q2Var.B());
                            } else {
                                w2 w2Var8 = y3Var.C;
                                y3.k(w2Var8);
                                w2Var8.C.d("Unknown value for param. event, param", y3Var.G.d(B), y3Var.G.e(q2Var.A()));
                                break;
                            }
                        }
                    } else {
                        Iterator it3 = n1Var.B().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                com.google.android.gms.internal.measurement.p1 p1Var3 = (com.google.android.gms.internal.measurement.p1) it3.next();
                                boolean z12 = p1Var3.B() && p1Var3.A();
                                String y10 = p1Var3.y();
                                if (y10.isEmpty()) {
                                    w2 w2Var9 = y3Var.C;
                                    y3.k(w2Var9);
                                    w2Var9.C.c(y3Var.G.d(B), "Event has empty param name. event");
                                    break;
                                }
                                Object orDefault = bVar2.getOrDefault(y10, null);
                                if (orDefault instanceof Long) {
                                    if (!p1Var3.C()) {
                                        w2 w2Var10 = y3Var.C;
                                        y3.k(w2Var10);
                                        w2Var10.C.d("No number filter for long param. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                        break;
                                    }
                                    try {
                                        bool = s6.a(new BigDecimal(((Long) orDefault).longValue()), p1Var3.w(), 0.0d);
                                    } catch (NumberFormatException unused2) {
                                        bool = null;
                                    }
                                    if (bool == null) {
                                        break;
                                    } else if (bool.booleanValue() == z12) {
                                        bool4 = Boolean.FALSE;
                                        break;
                                    }
                                } else if (orDefault instanceof Double) {
                                    if (!p1Var3.C()) {
                                        w2 w2Var11 = y3Var.C;
                                        y3.k(w2Var11);
                                        w2Var11.C.d("No number filter for double param. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                        break;
                                    }
                                    double doubleValue = ((Double) orDefault).doubleValue();
                                    try {
                                        bool2 = s6.a(new BigDecimal(doubleValue), p1Var3.w(), Math.ulp(doubleValue));
                                    } catch (NumberFormatException unused3) {
                                        bool2 = null;
                                    }
                                    if (bool2 == null) {
                                        break;
                                    } else if (bool2.booleanValue() == z12) {
                                        bool4 = Boolean.FALSE;
                                        break;
                                    }
                                } else if (orDefault instanceof String) {
                                    if (p1Var3.E()) {
                                        com.google.android.gms.internal.measurement.w1 x10 = p1Var3.x();
                                        w2 w2Var12 = y3Var.C;
                                        y3.k(w2Var12);
                                        bool3 = s6.b((String) orDefault, x10, w2Var12);
                                    } else if (p1Var3.C()) {
                                        String str2 = (String) orDefault;
                                        if (f6.I(str2)) {
                                            com.google.android.gms.internal.measurement.s1 w10 = p1Var3.w();
                                            if (f6.I(str2)) {
                                                try {
                                                    bool3 = s6.a(new BigDecimal(str2), w10, 0.0d);
                                                } catch (NumberFormatException unused4) {
                                                    bool3 = null;
                                                }
                                            }
                                            bool3 = null;
                                        } else {
                                            w2 w2Var13 = y3Var.C;
                                            y3.k(w2Var13);
                                            w2Var13.C.d("Invalid param value for number filter. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                            break;
                                        }
                                    } else {
                                        w2 w2Var14 = y3Var.C;
                                        y3.k(w2Var14);
                                        w2Var14.C.d("No filter for String param. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                        break;
                                    }
                                    if (bool3 == null) {
                                        break;
                                    } else if (bool3.booleanValue() == z12) {
                                        bool4 = Boolean.FALSE;
                                        break;
                                    }
                                } else if (orDefault == null) {
                                    w2 w2Var15 = y3Var.C;
                                    y3.k(w2Var15);
                                    w2Var15.H.d("Missing param for filter. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                    bool4 = Boolean.FALSE;
                                } else {
                                    w2 w2Var16 = y3Var.C;
                                    y3.k(w2Var16);
                                    w2Var16.C.d("Unknown param type. event, param", y3Var.G.d(B), y3Var.G.e(y10));
                                }
                            } else {
                                bool4 = Boolean.TRUE;
                                break;
                            }
                        }
                    }
                }
            }
        }
        bool4 = null;
        w2 w2Var622 = y3Var.C;
        y3.k(w2Var622);
        w2Var622.H.c(bool4 != null ? bool4 : "null", "Event filter result");
        if (bool4 == null) {
        }
    }

    public final boolean e(Long l2, Long l10, com.google.android.gms.internal.measurement.e3 e3Var, boolean z10) {
        boolean z11;
        Object obj;
        x8.b();
        b bVar = this.f32856h;
        boolean q10 = bVar.f32943u.A.q(this.f32868a, j2.U);
        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) this.f32857i;
        boolean A = u1Var.A();
        boolean B = u1Var.B();
        boolean C = u1Var.C();
        if (!A && !B && !C) {
            z11 = false;
        } else {
            z11 = true;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        y3 y3Var = bVar.f32943u;
        if (z10 && !z11) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            Integer valueOf = Integer.valueOf(this.f32869b);
            if (u1Var.D()) {
                num = Integer.valueOf(u1Var.u());
            }
            w2Var.H.d("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        com.google.android.gms.internal.measurement.p1 v10 = u1Var.v();
        boolean A2 = v10.A();
        if (e3Var.K()) {
            if (!v10.C()) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.C.c(y3Var.G.f(e3Var.z()), "No number filter for long property. property");
            } else {
                long v11 = e3Var.v();
                try {
                    bool4 = s6.a(new BigDecimal(v11), v10.w(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                bool = s6.c(bool4, A2);
            }
        } else if (e3Var.J()) {
            if (!v10.C()) {
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.C.c(y3Var.G.f(e3Var.z()), "No number filter for double property. property");
            } else {
                double u10 = e3Var.u();
                try {
                    bool3 = s6.a(new BigDecimal(u10), v10.w(), Math.ulp(u10));
                } catch (NumberFormatException unused2) {
                }
                bool = s6.c(bool3, A2);
            }
        } else if (e3Var.M()) {
            if (!v10.E()) {
                if (!v10.C()) {
                    w2 w2Var4 = y3Var.C;
                    y3.k(w2Var4);
                    w2Var4.C.c(y3Var.G.f(e3Var.z()), "No string or number filter defined. property");
                } else if (f6.I(e3Var.A())) {
                    String A3 = e3Var.A();
                    com.google.android.gms.internal.measurement.s1 w10 = v10.w();
                    if (f6.I(A3)) {
                        try {
                            bool2 = s6.a(new BigDecimal(A3), w10, 0.0d);
                        } catch (NumberFormatException unused3) {
                        }
                    }
                    bool = s6.c(bool2, A2);
                } else {
                    w2 w2Var5 = y3Var.C;
                    y3.k(w2Var5);
                    w2Var5.C.d("Invalid user property value for Numeric number filter. property, value", y3Var.G.f(e3Var.z()), e3Var.A());
                }
            } else {
                String A4 = e3Var.A();
                com.google.android.gms.internal.measurement.w1 x10 = v10.x();
                w2 w2Var6 = y3Var.C;
                y3.k(w2Var6);
                bool = s6.c(s6.b(A4, x10, w2Var6), A2);
            }
        } else {
            w2 w2Var7 = y3Var.C;
            y3.k(w2Var7);
            w2Var7.C.c(y3Var.G.f(e3Var.z()), "User property has no value, property");
        }
        w2 w2Var8 = y3Var.C;
        y3.k(w2Var8);
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        w2Var8.H.c(obj, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.f32870c = Boolean.TRUE;
        if (C && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || u1Var.A()) {
            this.f32871d = bool;
        }
        if (bool.booleanValue() && z11 && e3Var.L()) {
            long w11 = e3Var.w();
            if (l2 != null) {
                w11 = l2.longValue();
            }
            if (q10 && u1Var.A() && !u1Var.B() && l10 != null) {
                w11 = l10.longValue();
            }
            if (u1Var.B()) {
                this.f = Long.valueOf(w11);
            } else {
                this.f32872e = Long.valueOf(w11);
            }
        }
        return true;
    }
}
