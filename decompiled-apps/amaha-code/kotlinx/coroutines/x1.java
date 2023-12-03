package kotlinx.coroutines;

import ls.f;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class x1 implements f.b, f.c<x1> {

    /* renamed from: u  reason: collision with root package name */
    public static final x1 f23714u = new x1();

    @Override // ls.f.b, ls.f
    public final <E extends f.b> E e(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // ls.f
    public final ls.f h(ls.f context) {
        kotlin.jvm.internal.i.g(context, "context");
        return f.a.a(this, context);
    }

    @Override // ls.f
    public final ls.f o(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // ls.f
    public final <R> R s(R r, ss.p<? super R, ? super f.b, ? extends R> operation) {
        kotlin.jvm.internal.i.g(operation, "operation");
        return operation.invoke(r, this);
    }

    @Override // ls.f.b
    public final f.c<?> getKey() {
        return this;
    }
}
