package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class g5 extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f32576e;
    public final /* synthetic */ l5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(l5 l5Var, f4 f4Var, int i6) {
        super(f4Var);
        this.f32576e = i6;
        this.f = l5Var;
    }

    @Override // ta.m
    public final void b() {
        int i6 = this.f32576e;
        l5 l5Var = this.f;
        switch (i6) {
            case 0:
                l5Var.h();
                if (l5Var.n()) {
                    w2 w2Var = l5Var.f32943u.C;
                    y3.k(w2Var);
                    w2Var.H.b("Inactivity, disconnecting from the service");
                    l5Var.x();
                    return;
                }
                return;
            default:
                w2 w2Var2 = l5Var.f32943u.C;
                y3.k(w2Var2);
                w2Var2.C.b("Tasks have been queued for a long time");
                return;
        }
    }
}
