package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f20765b;

    /* renamed from: a  reason: collision with root package name */
    private final Unsafe f20766a;

    static {
        Field i6 = i();
        i6.setAccessible(true);
        try {
            f20765b = new b((Unsafe) i6.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    b(Unsafe unsafe) {
        this.f20766a = unsafe;
    }

    public static b h() {
        return f20765b;
    }

    private static Field i() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int a(Class cls) {
        return this.f20766a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f20766a.arrayIndexScale(cls);
    }

    public final boolean c(Object obj, long j10, int i6, int i10) {
        return this.f20766a.compareAndSwapInt(obj, j10, i6, i10);
    }

    public final boolean d(Object obj, long j10, long j11, long j12) {
        return this.f20766a.compareAndSwapLong(obj, j10, j11, j12);
    }

    public final boolean e(Object obj, long j10, Object obj2) {
        return a.a(this.f20766a, obj, j10, obj2);
    }

    public final int f(Object obj, long j10) {
        int intVolatile;
        do {
            intVolatile = this.f20766a.getIntVolatile(obj, j10);
        } while (!this.f20766a.compareAndSwapInt(obj, j10, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final Object g(Object obj, long j10) {
        return this.f20766a.getObjectVolatile(obj, j10);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final long k(Field field) {
        return this.f20766a.objectFieldOffset(field);
    }

    public final void l(Object obj, long j10, Object obj2) {
        this.f20766a.putObjectVolatile(obj, j10, obj2);
    }
}
