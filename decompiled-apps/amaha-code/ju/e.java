package ju;

import gt.g;
import gt.v0;
import wu.b0;
import wu.d1;
import wu.g1;
import wu.p;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f22635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g1 g1Var, boolean z10) {
        super(g1Var);
        this.f22635c = z10;
    }

    @Override // wu.g1
    public final boolean b() {
        return this.f22635c;
    }

    @Override // wu.g1
    public final d1 d(b0 b0Var) {
        d1 d10 = this.f37283b.d(b0Var);
        v0 v0Var = null;
        if (d10 == null) {
            return null;
        }
        g a10 = b0Var.O0().a();
        if (a10 instanceof v0) {
            v0Var = (v0) a10;
        }
        return d.a(d10, v0Var);
    }
}
