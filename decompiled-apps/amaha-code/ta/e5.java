package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class e5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m6 f32545u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f32546v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g6 f32547w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ l5 f32548x;

    public e5(l5 l5Var, m6 m6Var, boolean z10, g6 g6Var) {
        this.f32548x = l5Var;
        this.f32545u = m6Var;
        this.f32546v = z10;
        this.f32547w = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g6 g6Var;
        l5 l5Var = this.f32548x;
        m2 m2Var = l5Var.f32730x;
        if (m2Var == null) {
            w2 w2Var = l5Var.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Discarding data. Failed to set user property");
            return;
        }
        m6 m6Var = this.f32545u;
        v9.o.h(m6Var);
        if (this.f32546v) {
            g6Var = null;
        } else {
            g6Var = this.f32547w;
        }
        l5Var.l(m2Var, g6Var, m6Var);
        l5Var.s();
    }
}
