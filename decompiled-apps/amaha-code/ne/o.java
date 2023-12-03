package ne;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26253u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f26254v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ tr.b0 f26255w;

    public /* synthetic */ o(p pVar, tr.b0 b0Var, int i6) {
        this.f26253u = i6;
        this.f26254v = pVar;
        this.f26255w = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f26253u;
        tr.b0 b0Var = this.f26255w;
        p pVar = this.f26254v;
        switch (i6) {
            case 0:
                pVar.a(b0Var);
                return;
            case 1:
                pVar.getClass();
                kc.f.A(1, "GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (pVar.f26259d != null) {
                    kc.f.z("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    pVar.f26259d.a();
                    pVar.f26259d = null;
                }
                pVar.f26257b.b(new o(pVar, b0Var, 3));
                return;
            case 2:
                pVar.getClass();
                pVar.f26257b.b(new o(pVar, b0Var, 4));
                return;
            case 3:
                pVar.getClass();
                b0Var.G();
                pVar.f26256a = ya.k.c(oe.g.f27422c, new w2.f(3, pVar));
                return;
            default:
                pVar.a(b0Var);
                return;
        }
    }
}
