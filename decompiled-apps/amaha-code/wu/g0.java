package wu;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class g0 extends r {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f37243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 delegate, int i6) {
        super(delegate);
        this.f37243w = i6;
        if (i6 != 1) {
            kotlin.jvm.internal.i.g(delegate, "delegate");
            return;
        }
        kotlin.jvm.internal.i.g(delegate, "delegate");
        super(delegate);
    }

    @Override // wu.q, wu.b0
    public final boolean P0() {
        switch (this.f37243w) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // wu.q
    public final q Z0(i0 i0Var) {
        switch (this.f37243w) {
            case 0:
                return new g0(i0Var, 0);
            default:
                return new g0(i0Var, 1);
        }
    }
}
