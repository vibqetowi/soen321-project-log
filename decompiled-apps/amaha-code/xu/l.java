package xu;

import ta.v;
import wu.b0;
import wu.m1;
import wu.w0;
import xu.d;
import xu.e;
/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes2.dex */
public final class l implements k {

    /* renamed from: c  reason: collision with root package name */
    public final e f38117c;

    /* renamed from: d  reason: collision with root package name */
    public final d f38118d;

    /* renamed from: e  reason: collision with root package name */
    public final iu.l f38119e;

    public l(e.a kotlinTypeRefiner) {
        d.a kotlinTypePreparator = d.a.f38096v;
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.i.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f38117c = kotlinTypeRefiner;
        this.f38118d = kotlinTypePreparator;
        this.f38119e = new iu.l(iu.l.f20699g, kotlinTypeRefiner, kotlinTypePreparator);
    }

    @Override // xu.k
    public final iu.l a() {
        return this.f38119e;
    }

    @Override // xu.k
    public final e b() {
        return this.f38117c;
    }

    @Override // xu.c
    public final boolean c(b0 a10, b0 b10) {
        kotlin.jvm.internal.i.g(a10, "a");
        kotlin.jvm.internal.i.g(b10, "b");
        w0 p10 = v.p(false, false, null, this.f38118d, this.f38117c, 6);
        m1 a11 = a10.R0();
        m1 b11 = b10.R0();
        kotlin.jvm.internal.i.g(a11, "a");
        kotlin.jvm.internal.i.g(b11, "b");
        return kc.f.C(p10, a11, b11);
    }

    public final boolean d(b0 subtype, b0 supertype) {
        kotlin.jvm.internal.i.g(subtype, "subtype");
        kotlin.jvm.internal.i.g(supertype, "supertype");
        w0 p10 = v.p(true, false, null, this.f38118d, this.f38117c, 6);
        m1 subType = subtype.R0();
        m1 superType = supertype.R0();
        kotlin.jvm.internal.i.g(subType, "subType");
        kotlin.jvm.internal.i.g(superType, "superType");
        return kc.f.M(kc.f.f23229s0, p10, subType, superType);
    }
}
