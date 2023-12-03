package ht;

import ht.h;
import is.v;
import java.util.Iterator;
import java.util.List;
/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19496u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final Object f19497v;

    public i(List list) {
        this.f19497v = list;
    }

    @Override // ht.h
    public final boolean H(fu.c cVar) {
        switch (this.f19496u) {
            case 0:
                return h.b.b(this, cVar);
            default:
                return h.b.b(this, cVar);
        }
    }

    @Override // ht.h
    public final boolean isEmpty() {
        switch (this.f19496u) {
            case 0:
                return ((List) this.f19497v).isEmpty();
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        switch (this.f19496u) {
            case 0:
                return ((List) this.f19497v).iterator();
            default:
                return v.f20675u;
        }
    }

    @Override // ht.h
    public final c l(fu.c fqName) {
        switch (this.f19496u) {
            case 0:
                return h.b.a(this, fqName);
            default:
                kotlin.jvm.internal.i.g(fqName, "fqName");
                if (kotlin.jvm.internal.i.b(fqName, (fu.c) this.f19497v)) {
                    return xt.e.f38011a;
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f19496u) {
            case 0:
                return ((List) this.f19497v).toString();
            default:
                return super.toString();
        }
    }

    public i(fu.c cVar) {
        this.f19497v = cVar;
    }
}
