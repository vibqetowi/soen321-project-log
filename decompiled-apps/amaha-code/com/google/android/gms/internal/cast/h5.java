package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class h5 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f7550a;

    public h5(Unsafe unsafe) {
        this.f7550a = unsafe;
    }

    public final void a(Field field) {
        this.f7550a.objectFieldOffset(field);
    }

    public final int b(Class<?> cls) {
        return this.f7550a.arrayBaseOffset(cls);
    }

    public final int c(Class<?> cls) {
        return this.f7550a.arrayIndexScale(cls);
    }

    public final int d(long j10, Object obj) {
        return this.f7550a.getInt(obj, j10);
    }

    public final void e(int i6, long j10, Object obj) {
        this.f7550a.putInt(obj, j10, i6);
    }

    public final long f(long j10, Object obj) {
        return this.f7550a.getLong(obj, j10);
    }

    public final void g(Object obj, long j10, long j11) {
        this.f7550a.putLong(obj, j10, j11);
    }

    public final Object h(long j10, Object obj) {
        return this.f7550a.getObject(obj, j10);
    }

    public final void i(long j10, Object obj, Object obj2) {
        this.f7550a.putObject(obj, j10, obj2);
    }
}
