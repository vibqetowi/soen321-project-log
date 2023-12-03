package uf;

import java.lang.reflect.Method;
/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class m extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f34093b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f34094c;

    public m(Method method, Object obj) {
        this.f34093b = method;
        this.f34094c = obj;
    }

    @Override // androidx.work.k
    public final <T> T x(Class<T> cls) {
        androidx.work.k.b(cls);
        return (T) this.f34093b.invoke(this.f34094c, cls);
    }
}
