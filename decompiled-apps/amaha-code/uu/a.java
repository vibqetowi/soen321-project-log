package uu;

import ht.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes2.dex */
public class a implements ht.h {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f34528v = {y.c(new s(y.a(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: u  reason: collision with root package name */
    public final vu.i f34529u;

    public a(vu.l storageManager, ss.a<? extends List<? extends ht.c>> aVar) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f34529u = storageManager.e(aVar);
    }

    @Override // ht.h
    public final boolean H(fu.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ht.h
    public boolean isEmpty() {
        return ((List) kotlin.jvm.internal.h.C(this.f34529u, f34528v[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<ht.c> iterator() {
        return ((List) kotlin.jvm.internal.h.C(this.f34529u, f34528v[0])).iterator();
    }

    @Override // ht.h
    public final ht.c l(fu.c cVar) {
        return h.b.a(this, cVar);
    }
}
