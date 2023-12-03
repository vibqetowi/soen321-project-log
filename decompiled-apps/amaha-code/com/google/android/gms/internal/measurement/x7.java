package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class x7 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f8691a;

    public x7(Unsafe unsafe) {
        this.f8691a = unsafe;
    }

    public final int a(Class cls) {
        return this.f8691a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f8691a.arrayIndexScale(cls);
    }

    public final int c(long j10, Object obj) {
        return this.f8691a.getInt(obj, j10);
    }

    public final long d(long j10, Object obj) {
        return this.f8691a.getLong(obj, j10);
    }

    public final void e(Field field) {
        this.f8691a.objectFieldOffset(field);
    }

    public final Object f(long j10, Object obj) {
        return this.f8691a.getObject(obj, j10);
    }

    public final void g(int i6, long j10, Object obj) {
        this.f8691a.putInt(obj, j10, i6);
    }

    public final void h(Object obj, long j10, long j11) {
        this.f8691a.putLong(obj, j10, j11);
    }

    public final void i(long j10, Object obj, Object obj2) {
        this.f8691a.putObject(obj, j10, obj2);
    }
}
