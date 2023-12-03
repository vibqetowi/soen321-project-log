package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.q0;
import com.google.protobuf.r.a;
import com.google.protobuf.v;
import com.google.protobuf.y;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class r<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final r f10025d = new r(0);

    /* renamed from: a  reason: collision with root package name */
    public final j1<T, Object> f10026a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10027b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10028c;

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        void e();

        void g();

        void m();

        t1 o();

        void q();

        v.a s(q0.a aVar, q0 q0Var);
    }

    public r() {
        int i6 = j1.A;
        this.f10026a = new i1(16);
    }

    public static int b(s1 s1Var, int i6, Object obj) {
        int c0 = CodedOutputStream.c0(i6);
        if (s1Var == s1.f10038y) {
            c0 *= 2;
        }
        return c(s1Var, obj) + c0;
    }

    public static int c(s1 s1Var, Object obj) {
        switch (s1Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f9865w;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f9865w;
                return 4;
            case 2:
                return CodedOutputStream.g0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.g0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.T(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f9865w;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f9865w;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f9865w;
                return 1;
            case 8:
                if (obj instanceof h) {
                    Logger logger6 = CodedOutputStream.f9865w;
                    int size = ((h) obj).size();
                    return CodedOutputStream.e0(size) + size;
                }
                return CodedOutputStream.b0((String) obj);
            case 9:
                Logger logger7 = CodedOutputStream.f9865w;
                return ((q0) obj).b();
            case 10:
                if (obj instanceof c0) {
                    return CodedOutputStream.V((c0) obj);
                }
                Logger logger8 = CodedOutputStream.f9865w;
                int b10 = ((q0) obj).b();
                return CodedOutputStream.e0(b10) + b10;
            case 11:
                if (obj instanceof h) {
                    Logger logger9 = CodedOutputStream.f9865w;
                    int size2 = ((h) obj).size();
                    return CodedOutputStream.e0(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f9865w;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.e0(length) + length;
            case 12:
                return CodedOutputStream.e0(((Integer) obj).intValue());
            case 13:
                if (obj instanceof y.a) {
                    return CodedOutputStream.T(((y.a) obj).e());
                }
                return CodedOutputStream.T(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f9865w;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f9865w;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.e0((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.g0((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(a<?> aVar, Object obj) {
        aVar.m();
        aVar.e();
        aVar.g();
        return b(null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.o() == t1.D) {
            aVar.g();
            aVar.q();
            if (value instanceof c0) {
                ((a) entry.getKey()).e();
                return CodedOutputStream.V((c0) value) + CodedOutputStream.c0(3) + CodedOutputStream.d0(2, 0) + (CodedOutputStream.c0(1) * 2);
            }
            ((a) entry.getKey()).e();
            int d02 = CodedOutputStream.d0(2, 0) + (CodedOutputStream.c0(1) * 2);
            int c0 = CodedOutputStream.c0(3);
            int b10 = ((q0) value).b();
            return CodedOutputStream.e0(b10) + b10 + c0 + d02;
        }
        return d(aVar, value);
    }

    public static <T extends a<T>> boolean j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.o() != t1.D) {
            return true;
        }
        key.g();
        Object value = entry.getValue();
        if (value instanceof r0) {
            return ((r0) value).d();
        }
        if (value instanceof c0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void o(a aVar, Object obj) {
        aVar.m();
        Charset charset = y.f10086a;
        obj.getClass();
        throw null;
    }

    public static void p(CodedOutputStream codedOutputStream, s1 s1Var, int i6, Object obj) {
        if (s1Var == s1.f10038y) {
            codedOutputStream.z0(i6, 3);
            ((q0) obj).f(codedOutputStream);
            codedOutputStream.z0(i6, 4);
            return;
        }
        codedOutputStream.z0(i6, s1Var.f10041v);
        switch (s1Var.ordinal()) {
            case 0:
                codedOutputStream.q0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.o0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.D0(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.D0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.s0(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.q0(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.o0(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.i0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof h) {
                    codedOutputStream.m0((h) obj);
                    return;
                } else {
                    codedOutputStream.y0((String) obj);
                    return;
                }
            case 9:
                ((q0) obj).f(codedOutputStream);
                return;
            case 10:
                codedOutputStream.u0((q0) obj);
                return;
            case 11:
                if (obj instanceof h) {
                    codedOutputStream.m0((h) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.k0(bArr, bArr.length);
                return;
            case 12:
                codedOutputStream.B0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof y.a) {
                    codedOutputStream.s0(((y.a) obj).e());
                    return;
                } else {
                    codedOutputStream.s0(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.o0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.q0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.B0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.D0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final r<T> clone() {
        j1<T, Object> j1Var;
        r<T> rVar = new r<>();
        int i6 = 0;
        while (true) {
            j1Var = this.f10026a;
            if (i6 >= j1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c10 = j1Var.c(i6);
            rVar.n(c10.getKey(), c10.getValue());
            i6++;
        }
        for (Map.Entry<T, Object> entry : j1Var.f()) {
            rVar.n(entry.getKey(), entry.getValue());
        }
        rVar.f10028c = this.f10028c;
        return rVar;
    }

    public final Object e(T t3) {
        Object obj = this.f10026a.get(t3);
        if (obj instanceof c0) {
            return ((c0) obj).a(null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f10026a.equals(((r) obj).f10026a);
    }

    public final int g() {
        j1<T, Object> j1Var;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            j1Var = this.f10026a;
            if (i6 >= j1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c10 = j1Var.c(i6);
            i10 += d(c10.getKey(), c10.getValue());
            i6++;
        }
        for (Map.Entry<T, Object> entry : j1Var.f()) {
            i10 += d(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public final boolean h() {
        return this.f10026a.isEmpty();
    }

    public final int hashCode() {
        return this.f10026a.hashCode();
    }

    public final boolean i() {
        int i6 = 0;
        while (true) {
            j1<T, Object> j1Var = this.f10026a;
            if (i6 < j1Var.d()) {
                if (!j(j1Var.c(i6))) {
                    return false;
                }
                i6++;
            } else {
                for (Map.Entry<T, Object> entry : j1Var.f()) {
                    if (!j(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        boolean z10 = this.f10028c;
        j1<T, Object> j1Var = this.f10026a;
        if (z10) {
            return new c0.b(j1Var.entrySet().iterator());
        }
        return j1Var.entrySet().iterator();
    }

    public final void l() {
        if (this.f10027b) {
            return;
        }
        int i6 = 0;
        while (true) {
            j1<T, Object> j1Var = this.f10026a;
            if (i6 < j1Var.d()) {
                Map.Entry<T, Object> c10 = j1Var.c(i6);
                if (c10.getValue() instanceof v) {
                    ((v) c10.getValue()).E();
                }
                i6++;
            } else {
                j1Var.h();
                this.f10027b = true;
                return;
            }
        }
    }

    public final void m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).a(null);
        }
        key.g();
        t1 o10 = key.o();
        t1 t1Var = t1.D;
        j1<T, Object> j1Var = this.f10026a;
        if (o10 == t1Var) {
            Object e10 = e(key);
            if (e10 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                j1Var.put(key, value);
                return;
            }
            j1Var.put(key, key.s(((q0) e10).a(), (q0) value).r());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        j1Var.put(key, value);
    }

    public final void n(T t3, Object obj) {
        t3.g();
        o(t3, obj);
        throw null;
    }

    public r(int i6) {
        int i10 = j1.A;
        this.f10026a = new i1(0);
        l();
        l();
    }
}
