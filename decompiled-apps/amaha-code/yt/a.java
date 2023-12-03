package yt;

import gt.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import su.f0;
import vu.c;
import wu.b0;
import yt.d;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes2.dex */
public abstract class a<A, C> extends d<A, C0659a<? extends A, ? extends C>> implements su.d<A, C> {

    /* renamed from: b  reason: collision with root package name */
    public final vu.g<o, C0659a<A, C>> f38993b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: yt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0659a<A, C> extends d.a<A> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<r, List<A>> f38994a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<r, C> f38995b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<r, C> f38996c;

        public C0659a(HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
            this.f38994a = hashMap;
            this.f38995b = hashMap2;
            this.f38996c = hashMap3;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.p<C0659a<? extends A, ? extends C>, r, C> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f38997u = new b();

        public b() {
            super(2);
        }

        @Override // ss.p
        public final Object invoke(Object obj, r rVar) {
            C0659a loadConstantFromProperty = (C0659a) obj;
            r it = rVar;
            kotlin.jvm.internal.i.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
            kotlin.jvm.internal.i.g(it, "it");
            return loadConstantFromProperty.f38996c.get(it);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.p<C0659a<? extends A, ? extends C>, r, C> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f38998u = new c();

        public c() {
            super(2);
        }

        @Override // ss.p
        public final Object invoke(Object obj, r rVar) {
            C0659a loadConstantFromProperty = (C0659a) obj;
            r it = rVar;
            kotlin.jvm.internal.i.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
            kotlin.jvm.internal.i.g(it, "it");
            return loadConstantFromProperty.f38995b.get(it);
        }
    }

    public a(vu.c cVar, mt.d dVar) {
        super(dVar);
        this.f38993b = cVar.h(new yt.c(this));
    }

    @Override // su.d
    public final C d(f0 f0Var, au.m proto, b0 b0Var) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return t(f0Var, proto, su.c.PROPERTY, b0Var, c.f38998u);
    }

    @Override // su.d
    public final C k(f0 f0Var, au.m proto, b0 b0Var) {
        kotlin.jvm.internal.i.g(proto, "proto");
        return t(f0Var, proto, su.c.PROPERTY_GETTER, b0Var, b.f38997u);
    }

    public final C t(f0 f0Var, au.m mVar, su.c cVar, b0 b0Var, ss.p<? super C0659a<? extends A, ? extends C>, ? super r, ? extends C> pVar) {
        C invoke;
        ku.v vVar;
        q qVar;
        o o10 = o(f0Var, true, true, cu.b.A.c(mVar.f3769x), eu.h.d(mVar));
        if (o10 == null) {
            if (f0Var instanceof f0.a) {
                q0 q0Var = ((f0.a) f0Var).f32008c;
                if (q0Var instanceof q) {
                    qVar = (q) q0Var;
                } else {
                    qVar = null;
                }
                if (qVar != null) {
                    o10 = qVar.f39055b;
                }
            }
            o10 = null;
        }
        if (o10 == null) {
            return null;
        }
        eu.e eVar = o10.a().f39839b;
        eu.e version = j.f39036e;
        eVar.getClass();
        kotlin.jvm.internal.i.g(version, "version");
        r n10 = d.n(mVar, f0Var.f32006a, f0Var.f32007b, cVar, eVar.a(version.f12015b, version.f12016c, version.f12017d));
        if (n10 == null || (invoke = pVar.invoke((Object) ((c.k) this.f38993b).invoke(o10), n10)) == null) {
            return null;
        }
        if (dt.r.a(b0Var)) {
            C c10 = (C) ((ku.g) invoke);
            if (c10 instanceof ku.d) {
                vVar = new ku.v(((Number) ((ku.d) c10).f23941a).byteValue());
            } else if (c10 instanceof ku.t) {
                vVar = new ku.v(((Number) ((ku.t) c10).f23941a).shortValue());
            } else if (c10 instanceof ku.l) {
                vVar = new ku.v(((Number) ((ku.l) c10).f23941a).intValue());
            } else if (c10 instanceof ku.r) {
                vVar = new ku.v(((Number) ((ku.r) c10).f23941a).longValue());
            } else {
                return c10;
            }
            return (C) vVar;
        }
        return invoke;
    }
}
