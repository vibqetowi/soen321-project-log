package com.google.android.gms.internal.cast;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f7621a;

    /* renamed from: b  reason: collision with root package name */
    public static final y4<?, ?> f7622b;

    /* renamed from: c  reason: collision with root package name */
    public static final y4<?, ?> f7623c;

    /* renamed from: d  reason: collision with root package name */
    public static final a5 f7624d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7621a = cls;
        f7622b = t(false);
        f7623c = t(true);
        f7624d = new a5();
    }

    public static int A(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            i6 = 0;
            while (i10 < size) {
                d3Var.m(i10);
                i6 += q2.n0(d3Var.f7511v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += q2.n0(list.get(i10).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int B(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + A(list);
    }

    public static int C(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            i6 = 0;
            while (i10 < size) {
                d3Var.m(i10);
                i6 += q2.n0(d3Var.f7511v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += q2.n0(list.get(i10).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int D(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + C(list);
    }

    public static int E(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            i6 = 0;
            while (i10 < size) {
                d3Var.m(i10);
                i6 += q2.o0(d3Var.f7511v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += q2.o0(list.get(i10).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int F(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + E(list);
    }

    public static int G(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            i6 = 0;
            while (i10 < size) {
                d3Var.m(i10);
                int i11 = d3Var.f7511v[i10];
                i6 += q2.o0((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                int intValue = list.get(i10).intValue();
                i6 += q2.o0((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i6;
    }

    public static int H(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + G(list);
    }

    public static int I(List<?> list) {
        return list.size() * 4;
    }

    public static int J(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.o0(i6 << 3) + 4) * size;
    }

    public static int K(List<?> list) {
        return list.size() * 8;
    }

    public static int L(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.o0(i6 << 3) + 8) * size;
    }

    public static int M(List<?> list) {
        return list.size();
    }

    public static int N(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.o0(i6 << 3) + 1) * size;
    }

    public static int O(int i6, List<?> list) {
        int q02;
        int q03;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int m02 = q2.m0(i6) * size;
        if (list instanceof o3) {
            o3 o3Var = (o3) list;
            while (i10 < size) {
                Object y10 = o3Var.y(i10);
                if (y10 instanceof n2) {
                    int m10 = ((n2) y10).m();
                    q03 = q2.o0(m10) + m10;
                } else {
                    q03 = q2.q0((String) y10);
                }
                m02 += q03;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof n2) {
                    int m11 = ((n2) obj).m();
                    q02 = q2.o0(m11) + m11;
                } else {
                    q02 = q2.q0((String) obj);
                }
                m02 += q02;
                i10++;
            }
        }
        return m02;
    }

    public static int P(int i6, o4 o4Var, Object obj) {
        int i10;
        if (obj instanceof m3) {
            m3 m3Var = (m3) obj;
            int o02 = q2.o0(i6 << 3);
            if (m3Var.f7591b != null) {
                i10 = ((m2) m3Var.f7591b).f7589w.length;
            } else if (m3Var.f7590a != null) {
                i10 = m3Var.f7590a.m();
            } else {
                i10 = 0;
            }
            return q2.o0(i10) + i10 + o02;
        }
        int o03 = q2.o0(i6 << 3);
        g2 g2Var = (g2) ((c4) obj);
        int a10 = g2Var.a();
        if (a10 == -1) {
            a10 = o4Var.d(g2Var);
            g2Var.b(a10);
        }
        return q2.o0(a10) + a10 + o03;
    }

    public static int Q(int i6, List<?> list, o4 o4Var) {
        int i10;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m02 = q2.m0(i6) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof m3) {
                m3 m3Var = (m3) obj;
                if (m3Var.f7591b != null) {
                    i10 = ((m2) m3Var.f7591b).f7589w.length;
                } else if (m3Var.f7590a != null) {
                    i10 = m3Var.f7590a.m();
                } else {
                    i10 = 0;
                }
                m02 = q2.o0(i10) + i10 + m02;
            } else {
                g2 g2Var = (g2) ((c4) obj);
                int a10 = g2Var.a();
                if (a10 == -1) {
                    a10 = o4Var.d(g2Var);
                    g2Var.b(a10);
                }
                m02 = q2.o0(a10) + a10 + m02;
            }
        }
        return m02;
    }

    public static int R(int i6, List<n2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m02 = q2.m0(i6) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int m10 = list.get(i10).m();
            m02 += q2.o0(m10) + m10;
        }
        return m02;
    }

    public static int S(int i6, List<c4> list, o4 o4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += q2.V(i6, list.get(i11), o4Var);
        }
        return i10;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void b(int i6, List<Double> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).doubleValue();
                    i11 += 8;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.l0(Double.doubleToRawLongBits(list.get(i10).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.c0(i6, Double.doubleToRawLongBits(list.get(i10).doubleValue()));
                i10++;
            }
        }
    }

    public static void c(int i6, List<Float> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).floatValue();
                    i11 += 4;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.j0(Float.floatToRawIntBits(list.get(i10).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.a0(i6, Float.floatToRawIntBits(list.get(i10).floatValue()));
                i10++;
            }
        }
    }

    public static void d(int i6, List<Long> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += q2.p0(list.get(i12).longValue());
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.k0(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.b0(i6, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void e(int i6, List<Long> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += q2.p0(list.get(i12).longValue());
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.k0(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.b0(i6, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void f(int i6, List<Long> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = list.get(i12).longValue();
                    i11 += q2.p0((longValue >> 63) ^ (longValue + longValue));
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    long longValue2 = list.get(i10).longValue();
                    q2Var.k0((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = list.get(i10).longValue();
                q2Var.b0(i6, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void g(int i6, List<Long> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).longValue();
                    i11 += 8;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.l0(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.c0(i6, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void h(int i6, List<Long> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).longValue();
                    i11 += 8;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.l0(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.c0(i6, list.get(i10).longValue());
                i10++;
            }
        }
    }

    public static void i(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += q2.n0(list.get(i12).intValue());
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.h0(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.Y(i6, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void j(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += q2.o0(list.get(i12).intValue());
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.i0(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.Z(i6, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void k(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = list.get(i12).intValue();
                    i11 += q2.o0((intValue >> 31) ^ (intValue + intValue));
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    int intValue2 = list.get(i10).intValue();
                    q2Var.i0((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = list.get(i10).intValue();
                q2Var.Z(i6, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void l(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).intValue();
                    i11 += 4;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.j0(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.a0(i6, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void m(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).intValue();
                    i11 += 4;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.j0(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.a0(i6, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void n(int i6, List<Integer> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += q2.n0(list.get(i12).intValue());
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.h0(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.Y(i6, list.get(i10).intValue());
                i10++;
            }
        }
    }

    public static void o(int i6, List<Boolean> list, r2 r2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q2 q2Var = r2Var.f7630a;
            int i10 = 0;
            if (z10) {
                q2Var.X(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    list.get(i12).booleanValue();
                    i11++;
                }
                q2Var.i0(i11);
                while (i10 < list.size()) {
                    q2Var.g0(list.get(i10).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.d0(i6, list.get(i10).booleanValue());
                i10++;
            }
        }
    }

    public static void p(int i6, List<String> list, r2 r2Var) {
        if (list != null && !list.isEmpty()) {
            r2Var.getClass();
            boolean z10 = list instanceof o3;
            int i10 = 0;
            q2 q2Var = r2Var.f7630a;
            if (z10) {
                o3 o3Var = (o3) list;
                while (i10 < list.size()) {
                    Object y10 = o3Var.y(i10);
                    if (y10 instanceof String) {
                        q2Var.e0(i6, (String) y10);
                    } else {
                        q2Var.f0(i6, (n2) y10);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                q2Var.e0(i6, list.get(i10));
                i10++;
            }
        }
    }

    public static void q(int i6, List<n2> list, r2 r2Var) {
        if (list != null && !list.isEmpty()) {
            r2Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                r2Var.f7630a.f0(i6, list.get(i10));
            }
        }
    }

    public static void r(int i6, List<?> list, r2 r2Var, o4 o4Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                r2Var.p(i6, o4Var, list.get(i10));
            }
        }
    }

    public static void s(int i6, List<?> list, r2 r2Var, o4 o4Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                r2Var.q(i6, o4Var, list.get(i10));
            }
        }
    }

    public static y4<?, ?> t(boolean z10) {
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
            return (y4) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int u(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            s3 s3Var = (s3) list;
            i6 = 0;
            while (i10 < size) {
                s3Var.g(i10);
                i6 += q2.p0(s3Var.f7638v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += q2.p0(list.get(i10).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static int v(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (q2.m0(i6) * list.size()) + u(list);
    }

    public static int w(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            s3 s3Var = (s3) list;
            i6 = 0;
            while (i10 < size) {
                s3Var.g(i10);
                i6 += q2.p0(s3Var.f7638v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += q2.p0(list.get(i10).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static int x(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + w(list);
    }

    public static int y(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s3) {
            s3 s3Var = (s3) list;
            i6 = 0;
            while (i10 < size) {
                s3Var.g(i10);
                long j10 = s3Var.f7638v[i10];
                i6 += q2.p0((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                long longValue = list.get(i10).longValue();
                i6 += q2.p0((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i6;
    }

    public static int z(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q2.m0(i6) * size) + y(list);
    }
}
