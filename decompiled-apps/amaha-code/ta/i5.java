package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class i5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32628u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m2 f32629v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k5 f32630w;

    public /* synthetic */ i5(k5 k5Var, m2 m2Var, int i6) {
        this.f32628u = i6;
        this.f32630w = k5Var;
        this.f32629v = m2Var;
    }

    private final void a() {
        synchronized (this.f32630w) {
            try {
                this.f32630w.f32695u = false;
                if (!this.f32630w.f32697w.n()) {
                    w2 w2Var = this.f32630w.f32697w.f32943u.C;
                    y3.k(w2Var);
                    w2Var.G.b("Connected to remote service");
                    l5 l5Var = this.f32630w.f32697w;
                    m2 m2Var = this.f32629v;
                    l5Var.h();
                    v9.o.h(m2Var);
                    l5Var.f32730x = m2Var;
                    l5Var.s();
                    l5Var.r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32628u) {
            case 0:
                synchronized (this.f32630w) {
                    this.f32630w.f32695u = false;
                    if (!this.f32630w.f32697w.n()) {
                        w2 w2Var = this.f32630w.f32697w.f32943u.C;
                        y3.k(w2Var);
                        w2Var.H.b("Connected to service");
                        l5 l5Var = this.f32630w.f32697w;
                        m2 m2Var = this.f32629v;
                        l5Var.h();
                        v9.o.h(m2Var);
                        l5Var.f32730x = m2Var;
                        l5Var.s();
                        l5Var.r();
                    }
                }
                return;
            default:
                a();
                return;
        }
    }
}
