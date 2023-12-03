package ls;

import kotlin.jvm.internal.i;
import ls.f;
import ss.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class a implements f.b {

    /* renamed from: u  reason: collision with root package name */
    public final f.c<?> f24509u;

    public a(f.c<?> cVar) {
        this.f24509u = cVar;
    }

    @Override // ls.f.b, ls.f
    public <E extends f.b> E e(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // ls.f.b
    public final f.c<?> getKey() {
        return this.f24509u;
    }

    @Override // ls.f
    public final f h(f context) {
        i.g(context, "context");
        return f.a.a(this, context);
    }

    @Override // ls.f
    public f o(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // ls.f
    public final <R> R s(R r, p<? super R, ? super f.b, ? extends R> operation) {
        i.g(operation, "operation");
        return operation.invoke(r, this);
    }
}
