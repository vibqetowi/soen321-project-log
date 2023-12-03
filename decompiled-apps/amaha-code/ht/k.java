package ht;

import fv.f;
import fv.t;
import is.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public final class k implements h {

    /* renamed from: u  reason: collision with root package name */
    public final List<h> f19503u;

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<h, c> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fu.c f19504u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fu.c cVar) {
            super(1);
            this.f19504u = cVar;
        }

        @Override // ss.l
        public final c invoke(h hVar) {
            h it = hVar;
            kotlin.jvm.internal.i.g(it, "it");
            return it.l(this.f19504u);
        }
    }

    /* compiled from: Annotations.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<h, fv.h<? extends c>> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f19505u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final fv.h<? extends c> invoke(h hVar) {
            h it = hVar;
            kotlin.jvm.internal.i.g(it, "it");
            return u.X1(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends h> list) {
        this.f19503u = list;
    }

    @Override // ht.h
    public final boolean H(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        Iterator<Object> it = u.X1(this.f19503u).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).H(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // ht.h
    public final boolean isEmpty() {
        List<h> list = this.f19503u;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (h hVar : list) {
            if (!hVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return new f.a(t.E0(u.X1(this.f19503u), b.f19505u));
    }

    @Override // ht.h
    public final c l(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return (c) t.D0(t.H0(u.X1(this.f19503u), new a(fqName)));
    }

    public k(h... hVarArr) {
        this.f19503u = is.k.i2(hVarArr);
    }
}
