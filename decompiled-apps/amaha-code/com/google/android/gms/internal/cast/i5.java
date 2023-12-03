package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7555a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f7556b;

    /* renamed from: c  reason: collision with root package name */
    public static final g5 f7557c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7558d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7559e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7560g;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    static {
        g5 g5Var;
        boolean z10;
        g5 g5Var2;
        boolean z11;
        Field b10;
        g5 g5Var3;
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe o10 = o();
        f7555a = o10;
        f7556b = i2.a();
        Class<?> cls = Long.TYPE;
        boolean p10 = p(cls);
        boolean p11 = p(Integer.TYPE);
        boolean z12 = true;
        if (o10 != null) {
            if (p10) {
                g5Var = new g5(o10, 1);
            } else if (p11) {
                g5Var = new g5(o10, 0);
            }
            f7557c = g5Var;
            if (g5Var != null && (unsafe2 = g5Var.f7550a) != null) {
                try {
                    Class<?> cls2 = unsafe2.getClass();
                    cls2.getMethod("objectFieldOffset", Field.class);
                    cls2.getMethod("getLong", Object.class, cls);
                } catch (Throwable th2) {
                    q(th2);
                }
                if (b() != null) {
                    z10 = true;
                    f7558d = z10;
                    g5Var2 = f7557c;
                    if (g5Var2 != null && (unsafe = g5Var2.f7550a) != null) {
                        try {
                            Class<?> cls3 = unsafe.getClass();
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
                            q(th3);
                        }
                        f7559e = z11;
                        f = r(byte[].class);
                        r(boolean[].class);
                        a(boolean[].class);
                        r(int[].class);
                        a(int[].class);
                        r(long[].class);
                        a(long[].class);
                        r(float[].class);
                        a(float[].class);
                        r(double[].class);
                        a(double[].class);
                        r(Object[].class);
                        a(Object[].class);
                        b10 = b();
                        if (b10 != null && (g5Var3 = f7557c) != null) {
                            g5Var3.a(b10);
                        }
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            z12 = false;
                        }
                        f7560g = z12;
                    }
                    z11 = false;
                    f7559e = z11;
                    f = r(byte[].class);
                    r(boolean[].class);
                    a(boolean[].class);
                    r(int[].class);
                    a(int[].class);
                    r(long[].class);
                    a(long[].class);
                    r(float[].class);
                    a(float[].class);
                    r(double[].class);
                    a(double[].class);
                    r(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null) {
                        g5Var3.a(b10);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                    }
                    f7560g = z12;
                }
            }
            z10 = false;
            f7558d = z10;
            g5Var2 = f7557c;
            if (g5Var2 != null) {
                Class<?> cls32 = unsafe.getClass();
                cls32.getMethod("objectFieldOffset", Field.class);
                cls32.getMethod("arrayBaseOffset", Class.class);
                cls32.getMethod("arrayIndexScale", Class.class);
                Class<?> cls42 = Long.TYPE;
                cls32.getMethod("getInt", Object.class, cls42);
                cls32.getMethod("putInt", Object.class, cls42, Integer.TYPE);
                cls32.getMethod("getLong", Object.class, cls42);
                cls32.getMethod("putLong", Object.class, cls42, cls42);
                cls32.getMethod("getObject", Object.class, cls42);
                cls32.getMethod("putObject", Object.class, cls42, Object.class);
                z11 = true;
                f7559e = z11;
                f = r(byte[].class);
                r(boolean[].class);
                a(boolean[].class);
                r(int[].class);
                a(int[].class);
                r(long[].class);
                a(long[].class);
                r(float[].class);
                a(float[].class);
                r(double[].class);
                a(double[].class);
                r(Object[].class);
                a(Object[].class);
                b10 = b();
                if (b10 != null) {
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                f7560g = z12;
            }
            z11 = false;
            f7559e = z11;
            f = r(byte[].class);
            r(boolean[].class);
            a(boolean[].class);
            r(int[].class);
            a(int[].class);
            r(long[].class);
            a(long[].class);
            r(float[].class);
            a(float[].class);
            r(double[].class);
            a(double[].class);
            r(Object[].class);
            a(Object[].class);
            b10 = b();
            if (b10 != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            f7560g = z12;
        }
        g5Var = null;
        f7557c = g5Var;
        if (g5Var != null) {
            Class<?> cls22 = unsafe2.getClass();
            cls22.getMethod("objectFieldOffset", Field.class);
            cls22.getMethod("getLong", Object.class, cls);
            if (b() != null) {
            }
        }
        z10 = false;
        f7558d = z10;
        g5Var2 = f7557c;
        if (g5Var2 != null) {
        }
        z11 = false;
        f7559e = z11;
        f = r(byte[].class);
        r(boolean[].class);
        a(boolean[].class);
        r(int[].class);
        a(int[].class);
        r(long[].class);
        a(long[].class);
        r(float[].class);
        a(float[].class);
        r(double[].class);
        a(double[].class);
        r(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        f7560g = z12;
    }

    public static void a(Class cls) {
        if (f7559e) {
            f7557c.c(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i6 = i2.f7554a;
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
        g5 g5Var = f7557c;
        int d10 = g5Var.d(j11, obj);
        int i6 = ((~((int) j10)) & 3) << 3;
        g5Var.e(((255 & b10) << i6) | (d10 & (~(255 << i6))), j11, obj);
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        g5 g5Var = f7557c;
        int i6 = (((int) j10) & 3) << 3;
        g5Var.e(((255 & b10) << i6) | (g5Var.d(j11, obj) & (~(255 << i6))), j11, obj);
    }

    public static <T> T e(Class<T> cls) {
        try {
            return (T) f7555a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(long j10, Object obj) {
        return f7557c.d(j10, obj);
    }

    public static void g(int i6, long j10, Object obj) {
        f7557c.e(i6, j10, obj);
    }

    public static long h(long j10, Object obj) {
        return f7557c.f(j10, obj);
    }

    public static boolean i(long j10, Object obj) {
        g5 g5Var = f7557c;
        int i6 = g5Var.f7541b;
        boolean z10 = f7560g;
        switch (i6) {
            case 0:
                if (z10) {
                    if (((byte) ((g5Var.d((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((g5Var.d((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
            default:
                if (z10) {
                    if (((byte) ((g5Var.d((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((g5Var.d((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    public static float j(long j10, Object obj) {
        g5 g5Var = f7557c;
        switch (g5Var.f7541b) {
            case 0:
                return Float.intBitsToFloat(g5Var.d(j10, obj));
            default:
                return Float.intBitsToFloat(g5Var.d(j10, obj));
        }
    }

    public static double k(long j10, Object obj) {
        g5 g5Var = f7557c;
        switch (g5Var.f7541b) {
            case 0:
                return Double.longBitsToDouble(g5Var.f(j10, obj));
            default:
                return Double.longBitsToDouble(g5Var.f(j10, obj));
        }
    }

    public static Object l(long j10, Object obj) {
        return f7557c.h(j10, obj);
    }

    public static void m(long j10, Object obj, Object obj2) {
        f7557c.i(j10, obj, obj2);
    }

    public static void n(byte[] bArr, byte b10, long j10) {
        long j11 = f + j10;
        int i6 = f7557c.f7541b;
        boolean z10 = f7560g;
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

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean p(Class<?> cls) {
        int i6 = i2.f7554a;
        try {
            Class<?> cls2 = f7556b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static /* synthetic */ void q(Throwable th2) {
        Logger logger = Logger.getLogger(i5.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", r1.b0.b(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static int r(Class<?> cls) {
        if (f7559e) {
            return f7557c.b(cls);
        }
        return -1;
    }
}
