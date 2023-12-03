package vr;

import java.util.concurrent.Executor;
import vr.c3;
/* compiled from: SharedResourcePool.java */
/* loaded from: classes2.dex */
public final class e3<T> implements l2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c3.c<T> f35557a;

    public e3(c3.c<T> cVar) {
        this.f35557a = cVar;
    }

    @Override // vr.l2
    public final void a(Executor executor) {
        c3.b(this.f35557a, executor);
    }

    @Override // vr.l2
    public final T b() {
        return (T) c3.a(this.f35557a);
    }
}
