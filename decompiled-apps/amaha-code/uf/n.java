package uf;

import java.lang.reflect.Method;
/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class n extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f34095b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f34096c;

    public n(int i6, Method method) {
        this.f34095b = method;
        this.f34096c = i6;
    }

    @Override // androidx.work.k
    public final <T> T x(Class<T> cls) {
        androidx.work.k.b(cls);
        return (T) this.f34095b.invoke(null, cls, Integer.valueOf(this.f34096c));
    }
}
