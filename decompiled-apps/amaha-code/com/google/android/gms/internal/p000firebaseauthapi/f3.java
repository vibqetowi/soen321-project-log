package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f3  reason: invalid package */
/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7838a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f7839b;

    /* renamed from: c  reason: collision with root package name */
    public static final d3 f7840c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7841d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7842e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7843g;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    static {
        d3 d3Var;
        boolean z10;
        d3 d3Var2;
        boolean z11;
        Field b10;
        d3 d3Var3;
        Unsafe k10 = k();
        f7838a = k10;
        f7839b = y.a();
        Class<?> cls = Long.TYPE;
        boolean t3 = t(cls);
        boolean t10 = t(Integer.TYPE);
        boolean z12 = true;
        if (k10 != null) {
            if (t3) {
                d3Var = new d3(k10, 1);
            } else if (t10) {
                d3Var = new d3(k10, 0);
            }
            f7840c = d3Var;
            if (d3Var != null) {
                try {
                    Class<?> cls2 = d3Var.f7812a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                } catch (Throwable th2) {
                    l(th2);
                }
                if (b() != null) {
                    z10 = true;
                    f7841d = z10;
                    d3Var2 = f7840c;
                    if (d3Var2 != null) {
                        try {
                            Class<?> cls3 = d3Var2.f7812a.getClass();
                            cls3.getMethod("objectFieldOffset", Field.class);
                            cls3.getMethod("arrayBaseOffset", Class.class);
                            cls3.getMethod("arrayIndexScale", Class.class);
                            Class<?> cls4 = Long.TYPE;
                            cls3.getMethod("getInt", Object.class, cls4);
                            cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                            cls3.getMethod("getLong", Object.class, cls4);
                            cls3.getMethod("putLong", Object.class, cls4, cls4);
                            cls3.getMethod("getObject", Object.class, cls4);
                            cls3.getMethod("putObject", Object.class, cls4, Object.class);
                            z11 = true;
                        } catch (Throwable th3) {
                            l(th3);
                        }
                        f7842e = z11;
                        f = v(byte[].class);
                        v(boolean[].class);
                        a(boolean[].class);
                        v(int[].class);
                        a(int[].class);
                        v(long[].class);
                        a(long[].class);
                        v(float[].class);
                        a(float[].class);
                        v(double[].class);
                        a(double[].class);
                        v(Object[].class);
                        a(Object[].class);
                        b10 = b();
                        if (b10 != null && (d3Var3 = f7840c) != null) {
                            d3Var3.e(b10);
                        }
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            z12 = false;
                        }
                        f7843g = z12;
                    }
                    z11 = false;
                    f7842e = z11;
                    f = v(byte[].class);
                    v(boolean[].class);
                    a(boolean[].class);
                    v(int[].class);
                    a(int[].class);
                    v(long[].class);
                    a(long[].class);
                    v(float[].class);
                    a(float[].class);
                    v(double[].class);
                    a(double[].class);
                    v(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null) {
                        d3Var3.e(b10);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                    }
                    f7843g = z12;
                }
            }
            z10 = false;
            f7841d = z10;
            d3Var2 = f7840c;
            if (d3Var2 != null) {
            }
            z11 = false;
            f7842e = z11;
            f = v(byte[].class);
            v(boolean[].class);
            a(boolean[].class);
            v(int[].class);
            a(int[].class);
            v(long[].class);
            a(long[].class);
            v(float[].class);
            a(float[].class);
            v(double[].class);
            a(double[].class);
            v(Object[].class);
            a(Object[].class);
            b10 = b();
            if (b10 != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            f7843g = z12;
        }
        d3Var = null;
        f7840c = d3Var;
        if (d3Var != null) {
        }
        z10 = false;
        f7841d = z10;
        d3Var2 = f7840c;
        if (d3Var2 != null) {
        }
        z11 = false;
        f7842e = z11;
        f = v(byte[].class);
        v(boolean[].class);
        a(boolean[].class);
        v(int[].class);
        a(int[].class);
        v(long[].class);
        a(long[].class);
        v(float[].class);
        a(float[].class);
        v(double[].class);
        a(double[].class);
        v(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f7843g = z12;
    }

    public static void a(Class cls) {
        if (f7842e) {
            f7840c.b(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i6 = y.f8247a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        d3 d3Var = f7840c;
        int c10 = d3Var.c(j11, obj);
        int i6 = ((~((int) j10)) & 3) << 3;
        d3Var.g(((255 & b10) << i6) | (c10 & (~(255 << i6))), j11, obj);
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        d3 d3Var = f7840c;
        int i6 = (((int) j10) & 3) << 3;
        d3Var.g(((255 & b10) << i6) | (d3Var.c(j11, obj) & (~(255 << i6))), j11, obj);
    }

    public static double e(long j10, Object obj) {
        d3 d3Var = f7840c;
        switch (d3Var.f7770b) {
            case 0:
                return Double.longBitsToDouble(d3Var.d(j10, obj));
            default:
                return Double.longBitsToDouble(d3Var.d(j10, obj));
        }
    }

    public static float f(long j10, Object obj) {
        d3 d3Var = f7840c;
        switch (d3Var.f7770b) {
            case 0:
                return Float.intBitsToFloat(d3Var.c(j10, obj));
            default:
                return Float.intBitsToFloat(d3Var.c(j10, obj));
        }
    }

    public static int g(long j10, Object obj) {
        return f7840c.c(j10, obj);
    }

    public static long h(long j10, Object obj) {
        return f7840c.d(j10, obj);
    }

    public static Object i(Class cls) {
        try {
            return f7838a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(long j10, Object obj) {
        return f7840c.f(j10, obj);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(f3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void m(Object obj, long j10, boolean z10) {
        int i6 = f7840c.f7770b;
        boolean z11 = f7843g;
        switch (i6) {
            case 0:
                if (z11) {
                    c(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    d(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (z11) {
                    c(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    d(obj, j10, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    public static void n(byte[] bArr, byte b10, long j10) {
        long j11 = f + j10;
        int i6 = f7840c.f7770b;
        boolean z10 = f7843g;
        switch (i6) {
            case 0:
                if (z10) {
                    c(bArr, j11, b10);
                    return;
                } else {
                    d(bArr, j11, b10);
                    return;
                }
            default:
                if (z10) {
                    c(bArr, j11, b10);
                    return;
                } else {
                    d(bArr, j11, b10);
                    return;
                }
        }
    }

    public static void o(Object obj, long j10, double d10) {
        d3 d3Var = f7840c;
        switch (d3Var.f7770b) {
            case 0:
                d3Var.h(obj, j10, Double.doubleToLongBits(d10));
                return;
            default:
                d3Var.h(obj, j10, Double.doubleToLongBits(d10));
                return;
        }
    }

    public static void p(Object obj, long j10, float f2) {
        d3 d3Var = f7840c;
        switch (d3Var.f7770b) {
            case 0:
                d3Var.g(Float.floatToIntBits(f2), j10, obj);
                return;
            default:
                d3Var.g(Float.floatToIntBits(f2), j10, obj);
                return;
        }
    }

    public static void q(int i6, long j10, Object obj) {
        f7840c.g(i6, j10, obj);
    }

    public static void r(Object obj, long j10, long j11) {
        f7840c.h(obj, j10, j11);
    }

    public static void s(long j10, Object obj, Object obj2) {
        f7840c.i(j10, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(Class cls) {
        int i6 = y.f8247a;
        try {
            Class cls2 = f7839b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean u(long j10, Object obj) {
        d3 d3Var = f7840c;
        int i6 = d3Var.f7770b;
        boolean z10 = f7843g;
        switch (i6) {
            case 0:
                if (z10) {
                    if (((byte) ((d3Var.c((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((d3Var.c((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
            default:
                if (z10) {
                    if (((byte) ((d3Var.c((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((d3Var.c((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    public static int v(Class cls) {
        if (f7842e) {
            return f7840c.a(cls);
        }
        return -1;
    }
}
