package at;

import java.lang.reflect.Type;
import java.util.List;
/* compiled from: KTypeImpl.kt */
/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.k implements ss.a<List<? extends Type>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f3524u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var) {
        super(0);
        this.f3524u = j0Var;
    }

    @Override // ss.a
    public final List<? extends Type> invoke() {
        Type k10 = this.f3524u.k();
        kotlin.jvm.internal.i.d(k10);
        return nt.d.c(k10);
    }
}
