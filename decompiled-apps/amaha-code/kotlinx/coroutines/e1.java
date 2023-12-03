package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class e1 extends g1 implements s {

    /* renamed from: v  reason: collision with root package name */
    public final boolean f23501v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var) {
        super(true);
        o oVar;
        o oVar2;
        boolean z10 = true;
        U(c1Var);
        n P = P();
        if (P instanceof o) {
            oVar = (o) P;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            g1 C = oVar.C();
            while (!C.L()) {
                n P2 = C.P();
                if (P2 instanceof o) {
                    oVar2 = (o) P2;
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    C = oVar2.C();
                }
            }
            this.f23501v = z10;
        }
        z10 = false;
        this.f23501v = z10;
    }

    @Override // kotlinx.coroutines.g1
    public final boolean L() {
        return this.f23501v;
    }

    @Override // kotlinx.coroutines.g1
    public final boolean M() {
        return true;
    }
}
