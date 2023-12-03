package at;

import at.e0;
import at.w;
/* compiled from: KProperty2Impl.kt */
/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f3504u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e0 f3505v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(e0 e0Var, int i6) {
        super(0);
        this.f3504u = i6;
        this.f3505v = e0Var;
    }

    @Override // ss.a
    public final Object invoke() {
        int i6 = this.f3504u;
        e0 e0Var = this.f3505v;
        switch (i6) {
            case 0:
                return new e0.a(e0Var);
            case 1:
                return e0Var.z();
            default:
                return new w.a((w) e0Var);
        }
    }
}
