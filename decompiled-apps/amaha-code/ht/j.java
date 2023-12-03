package ht;

import gt.q0;
import java.util.Map;
import wu.b0;
import wu.i0;
/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes2.dex */
public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final dt.j f19498a;

    /* renamed from: b  reason: collision with root package name */
    public final fu.c f19499b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<fu.e, ku.g<?>> f19500c;

    /* renamed from: d  reason: collision with root package name */
    public final hs.d f19501d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<i0> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final i0 invoke() {
            j jVar = j.this;
            return jVar.f19498a.j(jVar.f19499b).r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(dt.j jVar, fu.c fqName, Map<fu.e, ? extends ku.g<?>> map) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        this.f19498a = jVar;
        this.f19499b = fqName;
        this.f19500c = map;
        this.f19501d = sp.b.N(2, new a());
    }

    @Override // ht.c
    public final b0 a() {
        Object value = this.f19501d.getValue();
        kotlin.jvm.internal.i.f(value, "<get-type>(...)");
        return (b0) value;
    }

    @Override // ht.c
    public final Map<fu.e, ku.g<?>> b() {
        return this.f19500c;
    }

    @Override // ht.c
    public final fu.c e() {
        return this.f19499b;
    }

    @Override // ht.c
    public final q0 g() {
        return q0.f16815a;
    }
}
