package ls;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import ls.f;
import ss.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class g implements f, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public static final g f24521u = new g();

    private final Object readResolve() {
        return f24521u;
    }

    @Override // ls.f
    public final <E extends f.b> E e(f.c<E> key) {
        i.g(key, "key");
        return null;
    }

    @Override // ls.f
    public final f h(f context) {
        i.g(context, "context");
        return context;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // ls.f
    public final f o(f.c<?> key) {
        i.g(key, "key");
        return this;
    }

    @Override // ls.f
    public final <R> R s(R r, p<? super R, ? super f.b, ? extends R> operation) {
        i.g(operation, "operation");
        return r;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
