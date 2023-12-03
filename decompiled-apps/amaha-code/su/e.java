package su;

import au.a;
import java.util.ArrayList;
import java.util.List;
import su.f0;
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class e implements d<ht.c, ku.g<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final ru.a f31997a;

    /* renamed from: b  reason: collision with root package name */
    public final f f31998b;

    public e(gt.a0 module, gt.c0 c0Var, tu.a protocol) {
        kotlin.jvm.internal.i.g(module, "module");
        kotlin.jvm.internal.i.g(protocol, "protocol");
        this.f31997a = protocol;
        this.f31998b = new f(module, c0Var);
    }

    @Override // su.g
    public final ArrayList a(f0.a container) {
        kotlin.jvm.internal.i.g(container, "container");
        Iterable<au.a> iterable = (List) container.f32009d.k(this.f31997a.f31020c);
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a aVar : iterable) {
            arrayList.add(this.f31998b.a(aVar, container.f32006a));
        }
        return arrayList;
    }

    @Override // su.g
    public final List b(f0.a container, au.f proto) {
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(proto, "proto");
        Iterable<au.a> iterable = (List) proto.k(this.f31997a.f31024h);
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a aVar : iterable) {
            arrayList.add(this.f31998b.a(aVar, container.f32006a));
        }
        return arrayList;
    }

    @Override // su.g
    public final List<ht.c> c(f0 container, gu.n callableProto, c kind, int i6, au.t proto) {
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(callableProto, "callableProto");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(proto, "proto");
        Iterable<au.a> iterable = (List) proto.k(this.f31997a.f31026j);
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a aVar : iterable) {
            arrayList.add(this.f31998b.a(aVar, container.f32006a));
        }
        return arrayList;
    }

    @Override // su.d
    public final ku.g<?> d(f0 f0Var, au.m proto, wu.b0 b0Var) {
        kotlin.jvm.internal.i.g(proto, "proto");
        a.b.c cVar = (a.b.c) kotlin.jvm.internal.h.w(proto, this.f31997a.f31025i);
        if (cVar == null) {
            return null;
        }
        return this.f31998b.c(b0Var, cVar, f0Var.f32006a);
    }

    @Override // su.g
    public final ArrayList e(au.r proto, cu.c nameResolver) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        Iterable<au.a> iterable = (List) proto.k(this.f31997a.f31028l);
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a aVar : iterable) {
            arrayList.add(this.f31998b.a(aVar, nameResolver));
        }
        return arrayList;
    }

    @Override // su.g
    public final List<ht.c> f(f0 f0Var, au.m proto) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return is.w.f20676u;
    }

    @Override // su.g
    public final List<ht.c> g(f0 f0Var, gu.n proto, c kind) {
        List<au.a> list;
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(kind, "kind");
        boolean z10 = proto instanceof au.c;
        ru.a aVar = this.f31997a;
        if (z10) {
            list = (List) ((au.c) proto).k(aVar.f31019b);
        } else if (proto instanceof au.h) {
            list = (List) ((au.h) proto).k(aVar.f31021d);
        } else if (proto instanceof au.m) {
            int ordinal = kind.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        list = (List) ((au.m) proto).k(aVar.f31023g);
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                } else {
                    list = (List) ((au.m) proto).k(aVar.f);
                }
            } else {
                list = (List) ((au.m) proto).k(aVar.f31022e);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + proto).toString());
        }
        if (list == null) {
            list = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        for (au.a aVar2 : list) {
            arrayList.add(this.f31998b.a(aVar2, f0Var.f32006a));
        }
        return arrayList;
    }

    @Override // su.g
    public final ArrayList h(au.p proto, cu.c nameResolver) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        Iterable<au.a> iterable = (List) proto.k(this.f31997a.f31027k);
        if (iterable == null) {
            iterable = is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
        for (au.a aVar : iterable) {
            arrayList.add(this.f31998b.a(aVar, nameResolver));
        }
        return arrayList;
    }

    @Override // su.g
    public final List<ht.c> i(f0 f0Var, au.m proto) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return is.w.f20676u;
    }

    @Override // su.g
    public final List<ht.c> j(f0 f0Var, gu.n proto, c kind) {
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(kind, "kind");
        return is.w.f20676u;
    }

    @Override // su.d
    public final ku.g<?> k(f0 f0Var, au.m proto, wu.b0 b0Var) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return null;
    }
}
