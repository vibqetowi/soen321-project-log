package k9;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23095u;

    /* renamed from: v  reason: collision with root package name */
    public final e0 f23096v;

    /* renamed from: w  reason: collision with root package name */
    public final int f23097w;

    public /* synthetic */ c0(e0 e0Var, int i6, int i10) {
        this.f23095u = i10;
        this.f23096v = e0Var;
        this.f23097w = i6;
    }

    private final void a() {
        e0 e0Var = this.f23096v;
        int i6 = this.f23097w;
        if (i6 == 0) {
            f0 f0Var = e0Var.f23116b;
            f0Var.F = 2;
            f0Var.f23121m = true;
            f0Var.f23122n = true;
            synchronized (f0Var.E) {
                for (w0 w0Var : e0Var.f23116b.E) {
                    w0Var.a();
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.f23116b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            for (w0 w0Var2 : e0Var.f23116b.E) {
                w0Var2.b(i6);
            }
        }
        e0Var.f23116b.g();
    }

    private final void b() {
        e0 e0Var = this.f23096v;
        int i6 = this.f23097w;
        f0 f0Var = e0Var.f23116b;
        f0Var.F = 3;
        synchronized (f0Var.E) {
            for (w0 w0Var : e0Var.f23116b.E) {
                w0Var.c(i6);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23095u) {
            case 0:
                e0 e0Var = this.f23096v;
                int i6 = this.f23097w;
                f0 f0Var = e0Var.f23116b;
                f0Var.f23131x = -1;
                f0Var.f23132y = -1;
                f0Var.f23127t = null;
                f0Var.f23128u = null;
                f0Var.f23129v = 0.0d;
                f0Var.k();
                f0Var.f23130w = false;
                f0Var.f23133z = null;
                f0 f0Var2 = e0Var.f23116b;
                f0Var2.F = 1;
                synchronized (f0Var2.E) {
                    for (w0 w0Var : e0Var.f23116b.E) {
                        w0Var.d(i6);
                    }
                }
                e0Var.f23116b.g();
                f0 f0Var3 = e0Var.f23116b;
                f0Var3.f(f0Var3.f23119k);
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            default:
                this.f23096v.f23116b.D.b(this.f23097w);
                return;
        }
    }
}
