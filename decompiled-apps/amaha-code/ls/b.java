package ls;

import kotlin.jvm.internal.i;
import ls.f;
import ls.f.b;
import ss.l;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: u  reason: collision with root package name */
    public final l<f.b, E> f24510u;

    /* renamed from: v  reason: collision with root package name */
    public final f.c<?> f24511v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ss.l<? super ls.f$b, ? extends E extends B>, ss.l<ls.f$b, E extends B>, java.lang.Object] */
    public b(f.c<B> baseKey, l<? super f.b, ? extends E> safeCast) {
        i.g(baseKey, "baseKey");
        i.g(safeCast, "safeCast");
        this.f24510u = safeCast;
        this.f24511v = baseKey instanceof b ? (f.c<B>) ((b) baseKey).f24511v : baseKey;
    }
}
