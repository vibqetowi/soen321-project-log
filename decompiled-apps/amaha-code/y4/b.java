package y4;

import d5.i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import k4.k;
import k4.t;
/* compiled from: LoadPathCache.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final t<?, ?, ?> f38245c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new k(Object.class, Object.class, Object.class, Collections.emptyList(), new uf.c(), null)), null);

    /* renamed from: a  reason: collision with root package name */
    public final t.b<i, t<?, ?, ?>> f38246a = new t.b<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<i> f38247b = new AtomicReference<>();

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f38246a) {
            t.b<i, t<?, ?, ?>> bVar = this.f38246a;
            i iVar = new i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f38245c;
            }
            bVar.put(iVar, tVar);
        }
    }
}
