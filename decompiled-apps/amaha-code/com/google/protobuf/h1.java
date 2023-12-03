package com.google.protobuf;

import com.google.protobuf.r;
import com.google.protobuf.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f9933a;

    /* renamed from: b  reason: collision with root package name */
    public static final m1<?, ?> f9934b;

    /* renamed from: c  reason: collision with root package name */
    public static final m1<?, ?> f9935c;

    /* renamed from: d  reason: collision with root package name */
    public static final o1 f9936d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f9933a = cls;
        f9934b = A(false);
        f9935c = A(true);
        f9936d = new o1();
    }

    public static m1<?, ?> A(boolean z10) {
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
            return (m1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends r.a<FT>> void B(o<FT> oVar, T t3, T t10) {
        j1<FT, Object> j1Var;
        r<FT> c10 = oVar.c(t10);
        if (!c10.h()) {
            r<FT> d10 = oVar.d(t3);
            d10.getClass();
            int i6 = 0;
            while (true) {
                j1Var = c10.f10026a;
                if (i6 >= j1Var.d()) {
                    break;
                }
                d10.m(j1Var.c(i6));
                i6++;
            }
            for (Map.Entry<FT, Object> entry : j1Var.f()) {
                d10.m(entry);
            }
        }
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <UT, UB> UB D(Object obj, int i6, int i10, UB ub2, m1<UT, UB> m1Var) {
        if (ub2 == null) {
            ub2 = (UB) m1Var.f(obj);
        }
        m1Var.e(i6, i10, ub2);
        return ub2;
    }

    public static void E(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11++;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.i0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.j0(i6, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void F(int i6, List list, k kVar) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                kVar.f9994a.l0(i6, (h) list.get(i10));
            }
        }
    }

    public static void G(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).doubleValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 8;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.q0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.p0(i6, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
        }
    }

    public static void H(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.T(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.s0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.r0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void I(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 4;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.o0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.n0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void J(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 8;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.q0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.p0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void K(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).floatValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 4;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.o0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.n0(i6, Float.floatToRawIntBits(floatValue));
                i10++;
            }
        }
    }

    public static void L(int i6, List list, k kVar, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                kVar.h(i6, g1Var, list.get(i10));
            }
        }
    }

    public static void M(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.T(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.s0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.r0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void N(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.g0(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.D0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.C0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void O(int i6, List list, k kVar, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                kVar.k(i6, g1Var, list.get(i10));
            }
        }
    }

    public static void P(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 4;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.o0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.n0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void Q(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    Logger logger = CodedOutputStream.f9865w;
                    i11 += 8;
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.q0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.p0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void R(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += CodedOutputStream.e0((intValue >> 31) ^ (intValue << 1));
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    codedOutputStream.B0((intValue2 >> 31) ^ (intValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                codedOutputStream.A0(i6, (intValue3 >> 31) ^ (intValue3 << 1));
                i10++;
            }
        }
    }

    public static void S(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += CodedOutputStream.g0((longValue >> 63) ^ (longValue << 1));
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    codedOutputStream.D0((longValue2 >> 63) ^ (longValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                codedOutputStream.C0(i6, (longValue3 >> 63) ^ (longValue3 << 1));
                i10++;
            }
        }
    }

    public static void T(int i6, List list, k kVar) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            boolean z10 = list instanceof f0;
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                f0 f0Var = (f0) list;
                while (i10 < list.size()) {
                    Object b02 = f0Var.b0(i10);
                    if (b02 instanceof String) {
                        codedOutputStream.x0(i6, (String) b02);
                    } else {
                        codedOutputStream.l0(i6, (h) b02);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.x0(i6, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void U(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.e0(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.B0(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.A0(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void V(int i6, List list, k kVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = kVar.f9994a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.z0(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.g0(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.B0(i11);
                while (i10 < list.size()) {
                    codedOutputStream.D0(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.C0(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static int a(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.J(i6) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i6, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c0 = CodedOutputStream.c0(i6) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int size2 = list.get(i10).size();
            c0 += CodedOutputStream.e0(size2) + size2;
        }
        return c0;
    }

    public static int d(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.T(xVar.o(i10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.T(list.get(i10).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int f(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.N(i6) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.P(i6) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i6, List<q0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += CodedOutputStream.R(i6, list.get(i11), g1Var);
        }
        return i10;
    }

    public static int k(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.T(xVar.o(i10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.T(list.get(i10).intValue());
                i10++;
            }
        }
        return i6;
    }

    public static int m(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i6 = 0;
            while (i10 < size) {
                h0Var.m(i10);
                i6 += CodedOutputStream.g0(h0Var.f9931v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.g0(list.get(i10).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static int o(int i6, g1 g1Var, Object obj) {
        if (obj instanceof d0) {
            return CodedOutputStream.V((d0) obj) + CodedOutputStream.c0(i6);
        }
        int c0 = CodedOutputStream.c0(i6);
        int r = ((a) ((q0) obj)).r(g1Var);
        return CodedOutputStream.e0(r) + r + c0;
    }

    public static int p(int i6, List<?> list, g1 g1Var) {
        int e0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c0 = CodedOutputStream.c0(i6) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof d0) {
                e0 = CodedOutputStream.V((d0) obj);
            } else {
                int r = ((a) ((q0) obj)).r(g1Var);
                e0 = r + CodedOutputStream.e0(r);
            }
            c0 += e0;
        }
        return c0;
    }

    public static int q(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i6 = 0;
            while (i10 < size) {
                int o10 = xVar.o(i10);
                i6 += CodedOutputStream.e0((o10 >> 31) ^ (o10 << 1));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                int intValue = list.get(i10).intValue();
                i6 += CodedOutputStream.e0((intValue >> 31) ^ (intValue << 1));
                i10++;
            }
        }
        return i6;
    }

    public static int s(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i6 = 0;
            while (i10 < size) {
                h0Var.m(i10);
                long j10 = h0Var.f9931v[i10];
                i6 += CodedOutputStream.g0((j10 >> 63) ^ (j10 << 1));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                long longValue = list.get(i10).longValue();
                i6 += CodedOutputStream.g0((longValue >> 63) ^ (longValue << 1));
                i10++;
            }
        }
        return i6;
    }

    public static int u(int i6, List<?> list) {
        int b02;
        int b03;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int c0 = CodedOutputStream.c0(i6) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i10 < size) {
                Object b04 = f0Var.b0(i10);
                if (b04 instanceof h) {
                    int size2 = ((h) b04).size();
                    b03 = CodedOutputStream.e0(size2) + size2;
                } else {
                    b03 = CodedOutputStream.b0((String) b04);
                }
                c0 += b03;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof h) {
                    int size3 = ((h) obj).size();
                    b02 = CodedOutputStream.e0(size3) + size3;
                } else {
                    b02 = CodedOutputStream.b0((String) obj);
                }
                c0 += b02;
                i10++;
            }
        }
        return c0;
    }

    public static int v(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.c0(i6) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.e0(xVar.o(i10));
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.e0(list.get(i10).intValue());
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
        return (CodedOutputStream.c0(i6) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i6;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i6 = 0;
            while (i10 < size) {
                h0Var.m(i10);
                i6 += CodedOutputStream.g0(h0Var.f9931v[i10]);
                i10++;
            }
        } else {
            i6 = 0;
            while (i10 < size) {
                i6 += CodedOutputStream.g0(list.get(i10).longValue());
                i10++;
            }
        }
        return i6;
    }

    public static <UT, UB> UB z(Object obj, int i6, List<Integer> list, y.b bVar, UB ub2, m1<UT, UB> m1Var) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = list.get(i11).intValue();
                if (bVar.a(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    ub2 = (UB) D(obj, i6, intValue, ub2, m1Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bVar.a(intValue2)) {
                    ub2 = (UB) D(obj, i6, intValue2, ub2, m1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
