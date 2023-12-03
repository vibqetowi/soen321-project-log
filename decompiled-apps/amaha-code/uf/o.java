package uf;

import java.lang.reflect.Method;
/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class o extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f34097b;

    public o(Method method) {
        this.f34097b = method;
    }

    @Override // androidx.work.k
    public final <T> T x(Class<T> cls) {
        androidx.work.k.b(cls);
        return (T) this.f34097b.invoke(null, cls, Object.class);
    }
}
