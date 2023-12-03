package ke;

import ag.a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.h;
import com.google.protobuf.l1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import r1.b0;
import rf.n;
import rf.s;
/* compiled from: Values.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final rf.s f23299a;

    /* renamed from: b  reason: collision with root package name */
    public static final rf.s f23300b;

    /* renamed from: c  reason: collision with root package name */
    public static final rf.s f23301c;

    /* renamed from: d  reason: collision with root package name */
    public static final rf.s f23302d;

    /* renamed from: e  reason: collision with root package name */
    public static final rf.s f23303e;

    static {
        s.a j02 = rf.s.j0();
        j02.y(Double.NaN);
        f23299a = j02.r();
        s.a j03 = rf.s.j0();
        j03.u();
        rf.s.T((rf.s) j03.f10073v);
        rf.s r = j03.r();
        f23300b = r;
        f23301c = r;
        s.a j04 = rf.s.j0();
        j04.u();
        rf.s.N((rf.s) j04.f10073v, "__max__");
        rf.s r10 = j04.r();
        f23302d = r10;
        s.a j05 = rf.s.j0();
        n.a S = rf.n.S();
        S.x(r10, "__type__");
        j05.z(S);
        f23303e = j05.r();
    }

    public static String a(rf.s sVar) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, sVar);
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, rf.s sVar) {
        boolean z10 = true;
        switch (v.h.d(sVar.i0())) {
            case 0:
                sb2.append("null");
                return;
            case 1:
                sb2.append(sVar.Y());
                return;
            case 2:
                sb2.append(sVar.d0());
                return;
            case 3:
                sb2.append(sVar.b0());
                return;
            case 4:
                l1 h02 = sVar.h0();
                sb2.append(String.format("time(%s,%s)", Long.valueOf(h02.Q()), Integer.valueOf(h02.P())));
                return;
            case 5:
                sb2.append(sVar.g0());
                return;
            case 6:
                sb2.append(oe.n.h(sVar.Z()));
                return;
            case 7:
                ca.a.u0(k(sVar), "Value should be a ReferenceValue", new Object[0]);
                sb2.append(i.h(sVar.f0()));
                return;
            case 8:
                ag.a c0 = sVar.c0();
                sb2.append(String.format("geo(%s,%s)", Double.valueOf(c0.P()), Double.valueOf(c0.Q())));
                return;
            case 9:
                rf.a X = sVar.X();
                sb2.append("[");
                for (int i6 = 0; i6 < X.R(); i6++) {
                    b(sb2, X.Q(i6));
                    if (i6 != X.R() - 1) {
                        sb2.append(",");
                    }
                }
                sb2.append("]");
                return;
            case 10:
                rf.n e0 = sVar.e0();
                ArrayList arrayList = new ArrayList(e0.P().keySet());
                Collections.sort(arrayList);
                sb2.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!z10) {
                        sb2.append(",");
                    } else {
                        z10 = false;
                    }
                    sb2.append(str);
                    sb2.append(":");
                    b(sb2, e0.R(str));
                }
                sb2.append("}");
                return;
            default:
                ca.a.V("Invalid value type: ".concat(b0.e(sVar.i0())), new Object[0]);
                throw null;
        }
    }

    public static int c(rf.s sVar, rf.s sVar2) {
        int m10 = m(sVar);
        int m11 = m(sVar2);
        if (m10 != m11) {
            return oe.n.d(m10, m11);
        }
        int i6 = 0;
        if (m10 != Integer.MAX_VALUE) {
            switch (m10) {
                case 0:
                    return 0;
                case 1:
                    boolean Y = sVar.Y();
                    boolean Y2 = sVar2.Y();
                    SecureRandom secureRandom = oe.n.f27432a;
                    if (Y == Y2) {
                        return 0;
                    }
                    if (Y) {
                        return 1;
                    }
                    return -1;
                case 2:
                    if (sVar.i0() == 4) {
                        double b02 = sVar.b0();
                        if (sVar2.i0() == 4) {
                            double b03 = sVar2.b0();
                            SecureRandom secureRandom2 = oe.n.f27432a;
                            return f6.b.w0(b02, b03);
                        } else if (sVar2.i0() == 3) {
                            return oe.n.e(b02, sVar2.d0());
                        }
                    } else if (sVar.i0() == 3) {
                        long d02 = sVar.d0();
                        if (sVar2.i0() == 3) {
                            long d03 = sVar2.d0();
                            SecureRandom secureRandom3 = oe.n.f27432a;
                            int i10 = (d02 > d03 ? 1 : (d02 == d03 ? 0 : -1));
                            if (i10 < 0) {
                                i6 = -1;
                            } else if (i10 > 0) {
                                i6 = 1;
                            }
                            return i6;
                        } else if (sVar2.i0() == 4) {
                            return oe.n.e(sVar2.b0(), d02) * (-1);
                        }
                    }
                    ca.a.V("Unexpected values: %s vs %s", sVar, sVar2);
                    throw null;
                case 3:
                    return d(sVar.h0(), sVar2.h0());
                case 4:
                    return d(q.a(sVar), q.a(sVar2));
                case 5:
                    return sVar.g0().compareTo(sVar2.g0());
                case 6:
                    return oe.n.c(sVar.Z(), sVar2.Z());
                case 7:
                    String f02 = sVar.f0();
                    String f03 = sVar2.f0();
                    String[] split = f02.split("/", -1);
                    String[] split2 = f03.split("/", -1);
                    int min = Math.min(split.length, split2.length);
                    while (i6 < min) {
                        int compareTo = split[i6].compareTo(split2[i6]);
                        if (compareTo == 0) {
                            i6++;
                        } else {
                            return compareTo;
                        }
                    }
                    return oe.n.d(split.length, split2.length);
                case 8:
                    ag.a c0 = sVar.c0();
                    ag.a c02 = sVar2.c0();
                    double P = c0.P();
                    double P2 = c02.P();
                    SecureRandom secureRandom4 = oe.n.f27432a;
                    int w02 = f6.b.w0(P, P2);
                    if (w02 == 0) {
                        return f6.b.w0(c0.Q(), c02.Q());
                    }
                    return w02;
                case 9:
                    rf.a X = sVar.X();
                    rf.a X2 = sVar2.X();
                    int min2 = Math.min(X.R(), X2.R());
                    while (i6 < min2) {
                        int c10 = c(X.Q(i6), X2.Q(i6));
                        if (c10 == 0) {
                            i6++;
                        } else {
                            return c10;
                        }
                    }
                    return oe.n.d(X.R(), X2.R());
                case 10:
                    rf.n e0 = sVar.e0();
                    rf.n e02 = sVar2.e0();
                    Iterator it = new TreeMap(e0.P()).entrySet().iterator();
                    Iterator it2 = new TreeMap(e02.P()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int compareTo2 = ((String) entry.getKey()).compareTo((String) entry2.getKey());
                        if (compareTo2 == 0) {
                            int c11 = c((rf.s) entry.getValue(), (rf.s) entry2.getValue());
                            if (c11 != 0) {
                                return c11;
                            }
                        } else {
                            return compareTo2;
                        }
                    }
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    SecureRandom secureRandom5 = oe.n.f27432a;
                    if (hasNext != hasNext2) {
                        if (hasNext) {
                            i6 = 1;
                        } else {
                            i6 = -1;
                        }
                    }
                    return i6;
                default:
                    ca.a.V(defpackage.c.p("Invalid value type: ", m10), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int d(l1 l1Var, l1 l1Var2) {
        int i6;
        long Q = l1Var.Q();
        long Q2 = l1Var2.Q();
        SecureRandom secureRandom = oe.n.f27432a;
        int i10 = (Q > Q2 ? 1 : (Q == Q2 ? 0 : -1));
        if (i10 < 0) {
            i6 = -1;
        } else if (i10 > 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (i6 != 0) {
            return i6;
        }
        return oe.n.d(l1Var.P(), l1Var2.P());
    }

    public static boolean e(rf.b bVar, rf.s sVar) {
        for (rf.s sVar2 : bVar.p()) {
            if (f(sVar2, sVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        if (r5.d0() == r6.d0()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (java.lang.Double.doubleToLongBits(r5.b0()) == java.lang.Double.doubleToLongBits(r6.b0())) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(rf.s sVar, rf.s sVar2) {
        int m10;
        boolean z10 = true;
        if (sVar == sVar2) {
            return true;
        }
        if (sVar == null || sVar2 == null || (m10 = m(sVar)) != m(sVar2)) {
            return false;
        }
        if (m10 != 2) {
            if (m10 != 4) {
                if (m10 == Integer.MAX_VALUE) {
                    return true;
                }
                if (m10 != 9) {
                    if (m10 != 10) {
                        return sVar.equals(sVar2);
                    }
                    rf.n e0 = sVar.e0();
                    rf.n e02 = sVar2.e0();
                    if (e0.O() == e02.O()) {
                        for (Map.Entry<String, rf.s> entry : e0.P().entrySet()) {
                            if (!f(entry.getValue(), e02.P().get(entry.getKey()))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                rf.a X = sVar.X();
                rf.a X2 = sVar2.X();
                if (X.R() == X2.R()) {
                    for (int i6 = 0; i6 < X.R(); i6++) {
                        if (f(X.Q(i6), X2.Q(i6))) {
                        }
                    }
                    return true;
                }
                return false;
            }
            return q.a(sVar).equals(q.a(sVar2));
        } else if (sVar.i0() != 3 || sVar2.i0() != 3) {
            if (sVar.i0() != 4 || sVar2.i0() != 4) {
                return false;
            }
        }
    }

    public static rf.s g(int i6) {
        if (i6 != 0) {
            switch (i6 - 1) {
                case 0:
                    return f23300b;
                case 1:
                    s.a j02 = rf.s.j0();
                    j02.u();
                    rf.s.U((rf.s) j02.f10073v, false);
                    return j02.r();
                case 2:
                case 3:
                    s.a j03 = rf.s.j0();
                    j03.y(Double.NaN);
                    return j03.r();
                case 4:
                    s.a j04 = rf.s.j0();
                    l1.a R = l1.R();
                    R.u();
                    l1.M((l1) R.f10073v, Long.MIN_VALUE);
                    j04.B(R);
                    return j04.r();
                case 5:
                    s.a j05 = rf.s.j0();
                    j05.u();
                    rf.s.N((rf.s) j05.f10073v, "");
                    return j05.r();
                case 6:
                    s.a j06 = rf.s.j0();
                    h.C0164h c0164h = com.google.protobuf.h.f9922v;
                    j06.u();
                    rf.s.O((rf.s) j06.f10073v, c0164h);
                    return j06.r();
                case 7:
                    i f = i.f();
                    s.a j07 = rf.s.j0();
                    String format = String.format("projects/%s/databases/%s/documents/%s", "", "", f.toString());
                    j07.u();
                    rf.s.P((rf.s) j07.f10073v, format);
                    return j07.r();
                case 8:
                    s.a j08 = rf.s.j0();
                    a.C0011a R2 = ag.a.R();
                    R2.u();
                    ag.a.M((ag.a) R2.f10073v, -90.0d);
                    R2.u();
                    ag.a.N((ag.a) R2.f10073v, -180.0d);
                    j08.u();
                    rf.s.Q((rf.s) j08.f10073v, R2.r());
                    return j08.r();
                case 9:
                    s.a j09 = rf.s.j0();
                    rf.a P = rf.a.P();
                    j09.u();
                    rf.s.R(P, (rf.s) j09.f10073v);
                    return j09.r();
                case 10:
                    s.a j010 = rf.s.j0();
                    j010.A(rf.n.N());
                    return j010.r();
                default:
                    throw new IllegalArgumentException("Unknown value type: ".concat(b0.e(i6)));
            }
        }
        throw null;
    }

    public static boolean h(rf.s sVar) {
        if (sVar != null && sVar.i0() == 10) {
            return true;
        }
        return false;
    }

    public static boolean i(rf.s sVar) {
        if (sVar != null && sVar.i0() == 4) {
            return true;
        }
        return false;
    }

    public static boolean j(rf.s sVar) {
        if (sVar != null && sVar.i0() == 3) {
            return true;
        }
        return false;
    }

    public static boolean k(rf.s sVar) {
        if (sVar != null && sVar.i0() == 8) {
            return true;
        }
        return false;
    }

    public static rf.s l(f fVar, i iVar) {
        s.a j02 = rf.s.j0();
        String format = String.format("projects/%s/databases/%s/documents/%s", fVar.f23269u, fVar.f23270v, iVar.toString());
        j02.u();
        rf.s.P((rf.s) j02.f10073v, format);
        return j02.r();
    }

    public static int m(rf.s sVar) {
        switch (v.h.d(sVar.i0())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (q.c(sVar)) {
                    return 4;
                }
                if (f23302d.equals(sVar.e0().P().get("__type__"))) {
                    return SubsamplingScaleImageView.TILE_SIZE_AUTO;
                }
                return 10;
            default:
                ca.a.V("Invalid value type: ".concat(b0.e(sVar.i0())), new Object[0]);
                throw null;
        }
    }
}
