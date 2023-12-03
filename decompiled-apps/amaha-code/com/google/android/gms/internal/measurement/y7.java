package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f8716a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f8717b;

    /* renamed from: c  reason: collision with root package name */
    public static final w7 f8718c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8719d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8720e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f8721g;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    static {
        w7 w7Var;
        boolean z10;
        w7 w7Var2;
        boolean z11;
        Field b10;
        w7 w7Var3;
        Unsafe k10 = k();
        f8716a = k10;
        f8717b = t4.a();
        Class<?> cls = Long.TYPE;
        boolean s10 = s(cls);
        boolean s11 = s(Integer.TYPE);
        boolean z12 = true;
        if (k10 != null) {
            if (s10) {
                w7Var = new w7(k10, 1);
            } else if (s11) {
                w7Var = new w7(k10, 0);
            }
            f8718c = w7Var;
            if (w7Var != null) {
                try {
                    Class<?> cls2 = w7Var.f8691a.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                } catch (Throwable th2) {
                    l(th2);
                }
                if (b() != null) {
                    z10 = true;
                    f8719d = z10;
                    w7Var2 = f8718c;
                    if (w7Var2 != null) {
                        try {
                            Class<?> cls3 = w7Var2.f8691a.getClass();
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
                        f8720e = z11;
                        f = u(byte[].class);
                        u(boolean[].class);
                        a(boolean[].class);
                        u(int[].class);
                        a(int[].class);
                        u(long[].class);
                        a(long[].class);
                        u(float[].class);
                        a(float[].class);
                        u(double[].class);
                        a(double[].class);
                        u(Object[].class);
                        a(Object[].class);
                        b10 = b();
                        if (b10 != null && (w7Var3 = f8718c) != null) {
                            w7Var3.e(b10);
                        }
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            z12 = false;
                        }
                        f8721g = z12;
                    }
                    z11 = false;
                    f8720e = z11;
                    f = u(byte[].class);
                    u(boolean[].class);
                    a(boolean[].class);
                    u(int[].class);
                    a(int[].class);
                    u(long[].class);
                    a(long[].class);
                    u(float[].class);
                    a(float[].class);
                    u(double[].class);
                    a(double[].class);
                    u(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null) {
                        w7Var3.e(b10);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                    }
                    f8721g = z12;
                }
            }
            z10 = false;
            f8719d = z10;
            w7Var2 = f8718c;
            if (w7Var2 != null) {
            }
            z11 = false;
            f8720e = z11;
            f = u(byte[].class);
            u(boolean[].class);
            a(boolean[].class);
            u(int[].class);
            a(int[].class);
            u(long[].class);
            a(long[].class);
            u(float[].class);
            a(float[].class);
            u(double[].class);
            a(double[].class);
            u(Object[].class);
            a(Object[].class);
            b10 = b();
            if (b10 != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            f8721g = z12;
        }
        w7Var = null;
        f8718c = w7Var;
        if (w7Var != null) {
        }
        z10 = false;
        f8719d = z10;
        w7Var2 = f8718c;
        if (w7Var2 != null) {
        }
        z11 = false;
        f8720e = z11;
        f = u(byte[].class);
        u(boolean[].class);
        a(boolean[].class);
        u(int[].class);
        a(int[].class);
        u(long[].class);
        a(long[].class);
        u(float[].class);
        a(float[].class);
        u(double[].class);
        a(double[].class);
        u(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f8721g = z12;
    }

    public static void a(Class cls) {
        if (f8720e) {
            f8718c.b(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i6 = t4.f8611a;
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
        w7 w7Var = f8718c;
        int c10 = w7Var.c(j11, obj);
        int i6 = ((~((int) j10)) & 3) << 3;
        w7Var.g(((255 & b10) << i6) | (c10 & (~(255 << i6))), j11, obj);
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        w7 w7Var = f8718c;
        int i6 = (((int) j10) & 3) << 3;
        w7Var.g(((255 & b10) << i6) | (w7Var.c(j11, obj) & (~(255 << i6))), j11, obj);
    }

    public static double e(long j10, Object obj) {
        w7 w7Var = f8718c;
        switch (w7Var.f8646b) {
            case 0:
                return Double.longBitsToDouble(w7Var.d(j10, obj));
            default:
                return Double.longBitsToDouble(w7Var.d(j10, obj));
        }
    }

    public static float f(long j10, Object obj) {
        w7 w7Var = f8718c;
        switch (w7Var.f8646b) {
            case 0:
                return Float.intBitsToFloat(w7Var.c(j10, obj));
            default:
                return Float.intBitsToFloat(w7Var.c(j10, obj));
        }
    }

    public static int g(long j10, Object obj) {
        return f8718c.c(j10, obj);
    }

    public static long h(long j10, Object obj) {
        return f8718c.d(j10, obj);
    }

    public static Object i(Class cls) {
        try {
            return f8716a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(long j10, Object obj) {
        return f8718c.f(j10, obj);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new v7());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th2) {
        Logger.getLogger(y7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void m(Object obj, long j10, boolean z10) {
        int i6 = f8718c.f8646b;
        boolean z11 = f8721g;
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
        int i6 = f8718c.f8646b;
        boolean z10 = f8721g;
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
        w7 w7Var = f8718c;
        switch (w7Var.f8646b) {
            case 0:
                w7Var.h(obj, j10, Double.doubleToLongBits(d10));
                return;
            default:
                w7Var.h(obj, j10, Double.doubleToLongBits(d10));
                return;
        }
    }

    public static void p(Object obj, long j10, float f2) {
        w7 w7Var = f8718c;
        switch (w7Var.f8646b) {
            case 0:
                w7Var.g(Float.floatToIntBits(f2), j10, obj);
                return;
            default:
                w7Var.g(Float.floatToIntBits(f2), j10, obj);
                return;
        }
    }

    public static void q(int i6, long j10, Object obj) {
        f8718c.g(i6, j10, obj);
    }

    public static void r(long j10, Object obj, Object obj2) {
        f8718c.i(j10, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(Class cls) {
        int i6 = t4.f8611a;
        try {
            Class cls2 = f8717b;
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

    public static boolean t(long j10, Object obj) {
        w7 w7Var = f8718c;
        int i6 = w7Var.f8646b;
        boolean z10 = f8721g;
        switch (i6) {
            case 0:
                if (z10) {
                    if (((byte) ((w7Var.c((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((w7Var.c((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
            default:
                if (z10) {
                    if (((byte) ((w7Var.c((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((w7Var.c((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    public static int u(Class cls) {
        if (f8720e) {
            return f8718c.a(cls);
        }
        return -1;
    }
}
