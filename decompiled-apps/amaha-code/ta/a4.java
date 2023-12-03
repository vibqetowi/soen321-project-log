package ta;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32466u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m6 f32467v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d4 f32468w;

    public /* synthetic */ a4(d4 d4Var, m6 m6Var, int i6) {
        this.f32466u = i6;
        this.f32468w = d4Var;
        this.f32467v = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32466u;
        m6 m6Var = this.f32467v;
        d4 d4Var = this.f32468w;
        switch (i6) {
            case 0:
                d4Var.f32521a.e();
                d4Var.f32521a.p(m6Var);
                return;
            case 1:
                d4Var.f32521a.e();
                d6 d6Var = d4Var.f32521a;
                d6Var.a().h();
                d6Var.g();
                v9.o.e(m6Var.f32748u);
                d6Var.I(m6Var);
                return;
            case 2:
                d4Var.f32521a.e();
                d6 d6Var2 = d4Var.f32521a;
                d6Var2.a().h();
                d6Var2.g();
                v9.o.e(m6Var.f32748u);
                h b10 = h.b(m6Var.P);
                String str = m6Var.f32748u;
                h K = d6Var2.K(str);
                d6Var2.b().H.d("Setting consent, package, consent", str, b10);
                d6Var2.r(str, b10);
                if (b10.g(K, (g[]) b10.f32584a.keySet().toArray(new g[0]))) {
                    d6Var2.p(m6Var);
                    return;
                }
                return;
            default:
                d4Var.f32521a.e();
                d4Var.f32521a.m(m6Var);
                return;
        }
    }
}
