package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: UnsafeUtil.java */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f10017a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f10018b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f10019c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f10020d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10021e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f10022g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f10023h;

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.q1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.q1.e
        public final boolean d(long j10, Object obj) {
            if (q1.f10023h) {
                if (q1.j(j10, obj) != 0) {
                    return true;
                }
                return false;
            } else if (q1.k(j10, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.q1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.q1.e
        public final byte f(long j10, Object obj) {
            if (q1.f10023h) {
                return q1.j(j10, obj);
            }
            return q1.k(j10, obj);
        }

        @Override // com.google.protobuf.q1.e
        public final double g(long j10, Object obj) {
            return Double.longBitsToDouble(j(j10, obj));
        }

        @Override // com.google.protobuf.q1.e
        public final float h(long j10, Object obj) {
            return Float.intBitsToFloat(i(j10, obj));
        }

        @Override // com.google.protobuf.q1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (q1.f10023h) {
                q1.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                q1.u(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.q1.e
        public final void n(Object obj, long j10, byte b10) {
            if (q1.f10023h) {
                q1.t(obj, j10, b10);
            } else {
                q1.u(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.q1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.q1.e
        public final void p(Object obj, long j10, float f) {
            q(Float.floatToIntBits(f), j10, obj);
        }

        @Override // com.google.protobuf.q1.e
        public final boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.q1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.q1.e
        public final boolean d(long j10, Object obj) {
            if (q1.f10023h) {
                if (q1.j(j10, obj) != 0) {
                    return true;
                }
                return false;
            } else if (q1.k(j10, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.q1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.q1.e
        public final byte f(long j10, Object obj) {
            if (q1.f10023h) {
                return q1.j(j10, obj);
            }
            return q1.k(j10, obj);
        }

        @Override // com.google.protobuf.q1.e
        public final double g(long j10, Object obj) {
            return Double.longBitsToDouble(j(j10, obj));
        }

        @Override // com.google.protobuf.q1.e
        public final float h(long j10, Object obj) {
            return Float.intBitsToFloat(i(j10, obj));
        }

        @Override // com.google.protobuf.q1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (q1.f10023h) {
                q1.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                q1.u(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.q1.e
        public final void n(Object obj, long j10, byte b10) {
            if (q1.f10023h) {
                q1.t(obj, j10, b10);
            } else {
                q1.u(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.q1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.q1.e
        public final void p(Object obj, long j10, float f) {
            q(Float.floatToIntBits(f), j10, obj);
        }

        @Override // com.google.protobuf.q1.e
        public final boolean u() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.q1.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            this.f10024a.copyMemory((Object) null, j10, bArr, q1.f + j11, j12);
        }

        @Override // com.google.protobuf.q1.e
        public final boolean d(long j10, Object obj) {
            return this.f10024a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.q1.e
        public final byte e(long j10) {
            return this.f10024a.getByte(j10);
        }

        @Override // com.google.protobuf.q1.e
        public final byte f(long j10, Object obj) {
            return this.f10024a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.q1.e
        public final double g(long j10, Object obj) {
            return this.f10024a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.q1.e
        public final float h(long j10, Object obj) {
            return this.f10024a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.q1.e
        public final void m(Object obj, long j10, boolean z10) {
            this.f10024a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.q1.e
        public final void n(Object obj, long j10, byte b10) {
            this.f10024a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.q1.e
        public final void o(Object obj, long j10, double d10) {
            this.f10024a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.q1.e
        public final void p(Object obj, long j10, float f) {
            this.f10024a.putFloat(obj, j10, f);
        }

        @Override // com.google.protobuf.q1.e
        public final boolean t() {
            if (!super.t()) {
                return false;
            }
            try {
                Class<?> cls = this.f10024a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                q1.a(th2);
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.google.protobuf.q1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean u() {
            boolean z10;
            Unsafe unsafe = this.f10024a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    cls.getMethod("getLong", Object.class, Long.TYPE);
                } catch (Throwable th2) {
                    q1.a(th2);
                }
                if (q1.e() != null) {
                    z10 = true;
                    if (z10) {
                        return false;
                    }
                    try {
                        Class<?> cls2 = unsafe.getClass();
                        Class<?> cls3 = Long.TYPE;
                        cls2.getMethod("getByte", cls3);
                        cls2.getMethod("putByte", cls3, Byte.TYPE);
                        cls2.getMethod("getInt", cls3);
                        cls2.getMethod("putInt", cls3, Integer.TYPE);
                        cls2.getMethod("getLong", cls3);
                        cls2.getMethod("putLong", cls3, cls3);
                        cls2.getMethod("copyMemory", cls3, cls3, cls3);
                        cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                        return true;
                    } catch (Throwable th3) {
                        q1.a(th3);
                        return false;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Unsafe f10024a;

        public e(Unsafe unsafe) {
            this.f10024a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f10024a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f10024a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(long j10, Object obj);

        public abstract byte e(long j10);

        public abstract byte f(long j10, Object obj);

        public abstract double g(long j10, Object obj);

        public abstract float h(long j10, Object obj);

        public final int i(long j10, Object obj) {
            return this.f10024a.getInt(obj, j10);
        }

        public final long j(long j10, Object obj) {
            return this.f10024a.getLong(obj, j10);
        }

        public final Object k(long j10, Object obj) {
            return this.f10024a.getObject(obj, j10);
        }

        public final long l(Field field) {
            return this.f10024a.objectFieldOffset(field);
        }

        public abstract void m(Object obj, long j10, boolean z10);

        public abstract void n(Object obj, long j10, byte b10);

        public abstract void o(Object obj, long j10, double d10);

        public abstract void p(Object obj, long j10, float f);

        public final void q(int i6, long j10, Object obj) {
            this.f10024a.putInt(obj, j10, i6);
        }

        public final void r(Object obj, long j10, long j11) {
            this.f10024a.putLong(obj, j10, j11);
        }

        public final void s(long j10, Object obj, Object obj2) {
            this.f10024a.putObject(obj, j10, obj2);
        }

        public boolean t() {
            Unsafe unsafe = this.f10024a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                q1.a(th2);
                return false;
            }
        }

        public abstract boolean u();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    static {
        e eVar;
        boolean u10;
        boolean t3;
        Field e10;
        long j10;
        Unsafe q10 = q();
        f10017a = q10;
        f10018b = com.google.protobuf.d.f9896a;
        boolean f2 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        if (q10 != null) {
            if (com.google.protobuf.d.a()) {
                if (f2) {
                    eVar = new c(q10);
                } else if (f10) {
                    eVar = new b(q10);
                }
            } else {
                eVar = new d(q10);
            }
            f10019c = eVar;
            boolean z10 = false;
            if (eVar != null) {
                u10 = false;
            } else {
                u10 = eVar.u();
            }
            f10020d = u10;
            if (eVar != null) {
                t3 = false;
            } else {
                t3 = eVar.t();
            }
            f10021e = t3;
            f = c(byte[].class);
            c(boolean[].class);
            d(boolean[].class);
            c(int[].class);
            d(int[].class);
            c(long[].class);
            d(long[].class);
            c(float[].class);
            d(float[].class);
            c(double[].class);
            d(double[].class);
            c(Object[].class);
            d(Object[].class);
            e10 = e();
            if (e10 == null && eVar != null) {
                j10 = eVar.l(e10);
            } else {
                j10 = -1;
            }
            f10022g = j10;
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z10 = true;
            }
            f10023h = z10;
        }
        eVar = null;
        f10019c = eVar;
        boolean z102 = false;
        if (eVar != null) {
        }
        f10020d = u10;
        if (eVar != null) {
        }
        f10021e = t3;
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        e10 = e();
        if (e10 == null) {
        }
        j10 = -1;
        f10022g = j10;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        f10023h = z102;
    }

    public static void a(Throwable th2) {
        Logger logger = Logger.getLogger(q1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f10017a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f10021e) {
            return f10019c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f10021e) {
            f10019c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (com.google.protobuf.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class<?> cls) {
        if (!com.google.protobuf.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f10018b;
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

    public static boolean g(long j10, Object obj) {
        return f10019c.d(j10, obj);
    }

    public static byte h(long j10) {
        return f10019c.e(j10);
    }

    public static byte i(byte[] bArr, long j10) {
        return f10019c.f(f + j10, bArr);
    }

    public static byte j(long j10, Object obj) {
        return (byte) ((n((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte k(long j10, Object obj) {
        return (byte) ((n((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double l(long j10, Object obj) {
        return f10019c.g(j10, obj);
    }

    public static float m(long j10, Object obj) {
        return f10019c.h(j10, obj);
    }

    public static int n(long j10, Object obj) {
        return f10019c.i(j10, obj);
    }

    public static long o(long j10, Object obj) {
        return f10019c.j(j10, obj);
    }

    public static Object p(long j10, Object obj) {
        return f10019c.k(j10, obj);
    }

    public static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r(Object obj, long j10, boolean z10) {
        f10019c.m(obj, j10, z10);
    }

    public static void s(byte[] bArr, byte b10, long j10) {
        f10019c.n(bArr, f + j10, b10);
    }

    public static void t(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int n10 = n(j11, obj);
        int i6 = ((~((int) j10)) & 3) << 3;
        x(((255 & b10) << i6) | (n10 & (~(255 << i6))), j11, obj);
    }

    public static void u(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i6 = (((int) j10) & 3) << 3;
        x(((255 & b10) << i6) | (n(j11, obj) & (~(255 << i6))), j11, obj);
    }

    public static void v(Object obj, long j10, double d10) {
        f10019c.o(obj, j10, d10);
    }

    public static void w(Object obj, long j10, float f2) {
        f10019c.p(obj, j10, f2);
    }

    public static void x(int i6, long j10, Object obj) {
        f10019c.q(i6, j10, obj);
    }

    public static void y(Object obj, long j10, long j11) {
        f10019c.r(obj, j10, j11);
    }

    public static void z(long j10, Object obj, Object obj2) {
        f10019c.s(j10, obj, obj2);
    }
}
