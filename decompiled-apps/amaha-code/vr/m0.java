package vr;

import java.util.concurrent.Executor;
/* compiled from: FixedObjectPool.java */
/* loaded from: classes2.dex */
public final class m0<T> implements l2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f35766a;

    public m0(T t3) {
        sc.b.w(t3, "object");
        this.f35766a = t3;
    }

    @Override // vr.l2
    public final T b() {
        return this.f35766a;
    }

    @Override // vr.l2
    public final void a(Executor executor) {
    }
}
