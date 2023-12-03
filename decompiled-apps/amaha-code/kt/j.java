package kt;

import java.util.Collections;
import java.util.List;
import vu.c;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes2.dex */
public final class j implements ss.a<wu.i0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ fu.e f23850u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f23851v;

    public j(k kVar, fu.e eVar) {
        this.f23851v = kVar;
        this.f23850u = eVar;
    }

    @Override // ss.a
    public final wu.i0 invoke() {
        wu.v0.f37300v.getClass();
        wu.v0 v0Var = wu.v0.f37301w;
        wu.x0 l2 = this.f23851v.l();
        List emptyList = Collections.emptyList();
        i iVar = new i(this);
        c.a NO_LOCKS = vu.c.f36140e;
        kotlin.jvm.internal.i.f(NO_LOCKS, "NO_LOCKS");
        return wu.c0.g(emptyList, new pu.h(NO_LOCKS, iVar), v0Var, l2, false);
    }
}
