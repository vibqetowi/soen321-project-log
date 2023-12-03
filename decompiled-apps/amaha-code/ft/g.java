package ft;

import gt.a0;
import kotlin.jvm.internal.y;
import kt.g0;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes2.dex */
public final class g extends dt.j {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f15877h = {y.c(new kotlin.jvm.internal.s(y.a(g.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    public ss.a<a> f;

    /* renamed from: g  reason: collision with root package name */
    public final vu.i f15878g;

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f15879a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15880b;

        public a(a0 ownerModuleDescriptor, boolean z10) {
            kotlin.jvm.internal.i.g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f15879a = ownerModuleDescriptor;
            this.f15880b = z10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vu.c cVar) {
        super(cVar);
        defpackage.d.j(1, "kind");
        this.f15878g = cVar.e(new i(this, cVar));
        int d10 = v.h.d(1);
        if (d10 != 1) {
            if (d10 == 2) {
                d(true);
                return;
            }
            return;
        }
        d(false);
    }

    public final k M() {
        return (k) kotlin.jvm.internal.h.C(this.f15878g, f15877h[0]);
    }

    @Override // dt.j
    public final jt.a e() {
        return M();
    }

    @Override // dt.j
    public final Iterable m() {
        Iterable<jt.b> m10 = super.m();
        vu.l lVar = this.f13364d;
        if (lVar != null) {
            g0 builtInsModule = l();
            kotlin.jvm.internal.i.f(builtInsModule, "builtInsModule");
            return is.u.t2(m10, new e(lVar, builtInsModule));
        }
        dt.j.a(6);
        throw null;
    }

    @Override // dt.j
    public final jt.c q() {
        return M();
    }
}
