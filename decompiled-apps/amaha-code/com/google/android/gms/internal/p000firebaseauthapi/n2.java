package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n2  reason: invalid package */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7998a;

    /* renamed from: b  reason: collision with root package name */
    public static final x2 f7999b;

    /* renamed from: c  reason: collision with root package name */
    public static final x2 f8000c;

    /* renamed from: d  reason: collision with root package name */
    public static final z2 f8001d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7998a = cls;
        f7999b = v(false);
        f8000c = v(true);
        f8001d = new z2();
    }

    public static int A(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.L(i6 << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.L(i6 << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i6, List list, m2 m2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n0.f0(i6, (b2) list.get(i11), m2Var);
        }
        return i10;
    }

    public static int F(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + G(list);
    }

    public static int G(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f1) {
            f1 f1Var = (f1) list;
            i6 = 0;
            while (i10 < size) {
                f1Var.m(i10);
                i6 += n0.g0(f1Var.f7832v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += n0.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int H(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (n0.K(i6) * list.size()) + I(list);
    }

    public static int I(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i6 = 0;
            while (i10 < size) {
                q1Var.m(i10);
                i6 += n0.M(q1Var.f8076v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += n0.M(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static int J(int i6, m2 m2Var, Object obj) {
        int i10;
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            int L = n0.L(i6 << 3);
            if (k1Var.f7932b != null) {
                i10 = ((g0) k1Var.f7932b).f7860w.length;
            } else if (k1Var.f7931a != null) {
                i10 = k1Var.f7931a.j();
            } else {
                i10 = 0;
            }
            return n0.L(i10) + i10 + L;
        }
        int L2 = n0.L(i6 << 3);
        int b10 = ((w) ((b2) obj)).b(m2Var);
        return n0.L(b10) + b10 + L2;
    }

    public static int K(int i6, List list, m2 m2Var) {
        int b10;
        int L;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K = n0.K(i6) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (k1Var.f7932b != null) {
                    b10 = ((g0) k1Var.f7932b).f7860w.length;
                } else if (k1Var.f7931a != null) {
                    b10 = k1Var.f7931a.j();
                } else {
                    b10 = 0;
                }
                L = n0.L(b10);
            } else {
                b10 = ((w) ((b2) obj)).b(m2Var);
                L = n0.L(b10);
            }
            K = L + b10 + K;
        }
        return K;
    }

    public static int L(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + M(list);
    }

    public static int M(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f1) {
            f1 f1Var = (f1) list;
            i6 = 0;
            while (i10 < size) {
                f1Var.m(i10);
                int i11 = f1Var.f7832v[i10];
                i6 += n0.L((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i6 += n0.L((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i6;
    }

    public static int N(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + O(list);
    }

    public static int O(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i6 = 0;
            while (i10 < size) {
                q1Var.m(i10);
                long j10 = q1Var.f8076v[i10];
                i6 += n0.M((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i6 += n0.M((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i6;
    }

    public static int P(int i6, List list) {
        int J;
        int J2;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int K = n0.K(i6) * size;
        if (list instanceof m1) {
            m1 m1Var = (m1) list;
            while (i10 < size) {
                Object j10 = m1Var.j(i10);
                if (j10 instanceof h0) {
                    int m10 = ((h0) j10).m();
                    J2 = n0.L(m10) + m10;
                } else {
                    J2 = n0.J((String) j10);
                }
                K += J2;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof h0) {
                    int m11 = ((h0) obj).m();
                    J = n0.L(m11) + m11;
                } else {
                    J = n0.J((String) obj);
                }
                K += J;
                i10++;
            }
        }
        return K;
    }

    public static int Q(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + R(list);
    }

    public static int R(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f1) {
            f1 f1Var = (f1) list;
            i6 = 0;
            while (i10 < size) {
                f1Var.m(i10);
                i6 += n0.L(f1Var.f7832v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += n0.L(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int S(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + T(list);
    }

    public static int T(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            i6 = 0;
            while (i10 < size) {
                q1Var.m(i10);
                i6 += n0.M(q1Var.f8076v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += n0.M(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static Object a(Object obj, int i6, List list, g1 g1Var, Object obj2, x2 x2Var) {
        if (g1Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                if (g1Var.a()) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    if (obj2 == null) {
                        obj2 = x2Var.c(obj);
                    }
                    x2Var.l(i6, intValue, obj2);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!g1Var.a()) {
                    if (obj2 == null) {
                        obj2 = x2Var.c(obj);
                    }
                    x2Var.l(i6, intValue2, obj2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void c(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    i11++;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.P(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.Q(i6, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void d(int i6, List list, o0 o0Var) {
        if (list != null && !list.isEmpty()) {
            o0Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                o0Var.f8021a.R(i6, (h0) list.get(i10));
            }
        }
    }

    public static void e(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).doubleValue();
                    i11 += 8;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.V(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.U(i6, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
        }
    }

    public static void f(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += n0.g0(((Integer) list.get(i12)).intValue());
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.X(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.W(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void g(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.T(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.S(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void h(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.V(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.U(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void i(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).floatValue();
                    i11 += 4;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.T(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.S(i6, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void j(int i6, List list, o0 o0Var, m2 m2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o0Var.l(i6, m2Var, list.get(i10));
            }
        }
    }

    public static void k(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += n0.g0(((Integer) list.get(i12)).intValue());
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.X(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.W(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void l(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += n0.M(((Long) list.get(i12)).longValue());
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.e0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.d0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void m(int i6, List list, o0 o0Var, m2 m2Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o0Var.o(i6, m2Var, list.get(i10));
            }
        }
    }

    public static void n(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.T(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.S(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void o(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.V(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.U(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void p(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += n0.L((intValue >> 31) ^ (intValue + intValue));
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    n0Var.c0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                n0Var.b0(i6, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void q(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += n0.M((longValue >> 63) ^ (longValue + longValue));
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    n0Var.e0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                n0Var.d0(i6, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void r(int i6, List list, o0 o0Var) {
        if (list != null && !list.isEmpty()) {
            o0Var.getClass();
            boolean z10 = list instanceof m1;
            int i10 = 0;
            n0 n0Var = o0Var.f8021a;
            if (z10) {
                m1 m1Var = (m1) list;
                while (i10 < list.size()) {
                    Object j10 = m1Var.j(i10);
                    if (j10 instanceof String) {
                        n0Var.Z(i6, (String) j10);
                    } else {
                        n0Var.R(i6, (h0) j10);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.Z(i6, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void s(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += n0.L(((Integer) list.get(i12)).intValue());
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.c0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.b0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static int t(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.L(i6 << 3) + 1) * size;
    }

    public static void u(int i6, List list, o0 o0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0 n0Var = o0Var.f8021a;
            int i10 = 0;
            if (z10) {
                n0Var.a0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += n0.M(((Long) list.get(i12)).longValue());
                }
                n0Var.c0(i11);
                while (i10 < list.size()) {
                    n0Var.e0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                n0Var.d0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static x2 v(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (x2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int w(List list) {
        return list.size();
    }

    public static int x(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K = n0.K(i6) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int m10 = ((h0) list.get(i10)).m();
            K += n0.L(m10) + m10;
        }
        return K;
    }

    public static int y(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n0.K(i6) * size) + z(list);
    }

    public static int z(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f1) {
            f1 f1Var = (f1) list;
            i6 = 0;
            while (i10 < size) {
                f1Var.m(i10);
                i6 += n0.g0(f1Var.f7832v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += n0.g0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i6;
    }
}
