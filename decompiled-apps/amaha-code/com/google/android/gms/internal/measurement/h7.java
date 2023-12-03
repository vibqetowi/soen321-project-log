package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class h7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f8413a;

    /* renamed from: b  reason: collision with root package name */
    public static final r7 f8414b;

    /* renamed from: c  reason: collision with root package name */
    public static final r7 f8415c;

    /* renamed from: d  reason: collision with root package name */
    public static final t7 f8416d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8413a = cls;
        f8414b = v(false);
        f8415c = v(true);
        f8416d = new t7();
    }

    public static int A(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.V(i6 << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.V(i6 << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i6, List list, g7 g7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += e5.n0(i6, (v6) list.get(i11), g7Var);
        }
        return i10;
    }

    public static int F(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.q0(i6) * size) + G(list);
    }

    public static int G(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x5) {
            x5 x5Var = (x5) list;
            i6 = 0;
            while (i10 < size) {
                x5Var.m(i10);
                i6 += e5.o0(x5Var.f8688v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += e5.o0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int H(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (e5.q0(i6) * list.size()) + I(list);
    }

    public static int I(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i6 = 0;
            while (i10 < size) {
                l6Var.m(i10);
                i6 += e5.X(l6Var.f8457v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += e5.X(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static int J(int i6, g7 g7Var, Object obj) {
        int i10;
        if (obj instanceof e6) {
            e6 e6Var = (e6) obj;
            int V = e5.V(i6 << 3);
            if (e6Var.f8359b != null) {
                i10 = ((a5) e6Var.f8359b).f8302w.length;
            } else if (e6Var.f8358a != null) {
                i10 = e6Var.f8358a.c();
            } else {
                i10 = 0;
            }
            return e5.V(i10) + i10 + V;
        }
        int V2 = e5.V(i6 << 3);
        int e10 = ((r4) ((v6) obj)).e(g7Var);
        return e5.V(e10) + e10 + V2;
    }

    public static int K(int i6, List list, g7 g7Var) {
        int e10;
        int V;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int q02 = e5.q0(i6) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof e6) {
                e6 e6Var = (e6) obj;
                if (e6Var.f8359b != null) {
                    e10 = ((a5) e6Var.f8359b).f8302w.length;
                } else if (e6Var.f8358a != null) {
                    e10 = e6Var.f8358a.c();
                } else {
                    e10 = 0;
                }
                V = e5.V(e10);
            } else {
                e10 = ((r4) ((v6) obj)).e(g7Var);
                V = e5.V(e10);
            }
            q02 = V + e10 + q02;
        }
        return q02;
    }

    public static int L(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.q0(i6) * size) + M(list);
    }

    public static int M(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x5) {
            x5 x5Var = (x5) list;
            i6 = 0;
            while (i10 < size) {
                x5Var.m(i10);
                int i11 = x5Var.f8688v[i10];
                i6 += e5.V((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i6 += e5.V((intValue >> 31) ^ (intValue + intValue));
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
        return (e5.q0(i6) * size) + O(list);
    }

    public static int O(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i6 = 0;
            while (i10 < size) {
                l6Var.m(i10);
                long j10 = l6Var.f8457v[i10];
                i6 += e5.X((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i6 += e5.X((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i6;
    }

    public static int P(int i6, List list) {
        int p02;
        int p03;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int q02 = e5.q0(i6) * size;
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            while (i10 < size) {
                Object j10 = g6Var.j(i10);
                if (j10 instanceof b5) {
                    int m10 = ((b5) j10).m();
                    p03 = e5.V(m10) + m10;
                } else {
                    p03 = e5.p0((String) j10);
                }
                q02 += p03;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof b5) {
                    int m11 = ((b5) obj).m();
                    p02 = e5.V(m11) + m11;
                } else {
                    p02 = e5.p0((String) obj);
                }
                q02 += p02;
                i10++;
            }
        }
        return q02;
    }

    public static int Q(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.q0(i6) * size) + R(list);
    }

    public static int R(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x5) {
            x5 x5Var = (x5) list;
            i6 = 0;
            while (i10 < size) {
                x5Var.m(i10);
                i6 += e5.V(x5Var.f8688v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += e5.V(((Integer) list.get(i10)).intValue());
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
        return (e5.q0(i6) * size) + T(list);
    }

    public static int T(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i6 = 0;
            while (i10 < size) {
                l6Var.m(i10);
                i6 += e5.X(l6Var.f8457v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += e5.X(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static void a(Object obj, int i6, b6 b6Var, y5 y5Var, r7 r7Var) {
        if (y5Var == null) {
            return;
        }
        s7 s7Var = null;
        if (b6Var instanceof RandomAccess) {
            int size = b6Var.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = ((Integer) b6Var.get(i11)).intValue();
                if (y5Var.a(intValue)) {
                    if (i11 != i10) {
                        b6Var.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    if (s7Var == null) {
                        s7Var = r7Var.c(obj);
                    }
                    r7Var.f(i6, intValue, s7Var);
                }
            }
            if (i10 != size) {
                b6Var.subList(i10, size).clear();
                return;
            }
            return;
        }
        Iterator it = b6Var.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!y5Var.a(intValue2)) {
                if (s7Var == null) {
                    s7Var = r7Var.c(obj);
                }
                r7Var.f(i6, intValue2, s7Var);
                it.remove();
            }
        }
    }

    public static void b(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    i11++;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.Y(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.Z(i6, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void c(int i6, List list, f5 f5Var) {
        if (list != null && !list.isEmpty()) {
            f5Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                f5Var.f8376a.a0(i6, (b5) list.get(i10));
            }
        }
    }

    public static void d(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).doubleValue();
                    i11 += 8;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.e0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.d0(i6, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
        }
    }

    public static void e(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += e5.o0(((Integer) list.get(i12)).intValue());
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.g0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.f0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void f(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.c0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.b0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void g(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.e0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.d0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void h(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).floatValue();
                    i11 += 4;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.c0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.b0(i6, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void i(int i6, List list, f5 f5Var, g7 g7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                f5Var.l(i6, g7Var, list.get(i10));
            }
        }
    }

    public static void j(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += e5.o0(((Integer) list.get(i12)).intValue());
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.g0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.f0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void k(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += e5.X(((Long) list.get(i12)).longValue());
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.m0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.l0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void l(int i6, List list, f5 f5Var, g7 g7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                f5Var.o(i6, g7Var, list.get(i10));
            }
        }
    }

    public static void m(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.c0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.b0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void n(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.e0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.d0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void o(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += e5.V((intValue >> 31) ^ (intValue + intValue));
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    e5Var.k0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                e5Var.j0(i6, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void p(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += e5.X((longValue >> 63) ^ (longValue + longValue));
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    e5Var.m0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                e5Var.l0(i6, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void q(int i6, List list, f5 f5Var) {
        if (list != null && !list.isEmpty()) {
            f5Var.getClass();
            boolean z10 = list instanceof g6;
            int i10 = 0;
            e5 e5Var = f5Var.f8376a;
            if (z10) {
                g6 g6Var = (g6) list;
                while (i10 < list.size()) {
                    Object j10 = g6Var.j(i10);
                    if (j10 instanceof String) {
                        e5Var.h0(i6, (String) j10);
                    } else {
                        e5Var.a0(i6, (b5) j10);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.h0(i6, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void r(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += e5.V(((Integer) list.get(i12)).intValue());
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.k0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.j0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i6, List list, f5 f5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            e5 e5Var = f5Var.f8376a;
            int i10 = 0;
            if (z10) {
                e5Var.i0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += e5.X(((Long) list.get(i12)).longValue());
                }
                e5Var.k0(i11);
                while (i10 < list.size()) {
                    e5Var.m0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                e5Var.l0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int u(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.V(i6 << 3) + 1) * size;
    }

    public static r7 v(boolean z10) {
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
            return (r7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
        int q02 = e5.q0(i6) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int m10 = ((b5) list.get(i10)).m();
            q02 += e5.V(m10) + m10;
        }
        return q02;
    }

    public static int y(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e5.q0(i6) * size) + z(list);
    }

    public static int z(List list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x5) {
            x5 x5Var = (x5) list;
            i6 = 0;
            while (i10 < size) {
                x5Var.m(i10);
                i6 += e5.o0(x5Var.f8688v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += e5.o0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i6;
    }
}
