package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e3  reason: invalid package */
/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f7812a;

    public e3(Unsafe unsafe) {
        this.f7812a = unsafe;
    }

    public final int a(Class cls) {
        return this.f7812a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f7812a.arrayIndexScale(cls);
    }

    public final int c(long j10, Object obj) {
        return this.f7812a.getInt(obj, j10);
    }

    public final long d(long j10, Object obj) {
        return this.f7812a.getLong(obj, j10);
    }

    public final void e(Field field) {
        this.f7812a.objectFieldOffset(field);
    }

    public final Object f(long j10, Object obj) {
        return this.f7812a.getObject(obj, j10);
    }

    public final void g(int i6, long j10, Object obj) {
        this.f7812a.putInt(obj, j10, i6);
    }

    public final void h(Object obj, long j10, long j11) {
        this.f7812a.putLong(obj, j10, j11);
    }

    public final void i(long j10, Object obj, Object obj2) {
        this.f7812a.putObject(obj, j10, obj2);
    }
}
