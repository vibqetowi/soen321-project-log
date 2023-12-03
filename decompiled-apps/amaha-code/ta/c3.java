package ta;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32500u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f32501v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32502w;

    public /* synthetic */ c3(int i6, Object obj, boolean z10) {
        this.f32500u = i6;
        this.f32502w = obj;
        this.f32501v = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r1 != r3) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        switch (this.f32500u) {
            case 0:
                ((d3) this.f32502w).f32518a.C();
                return;
            default:
                boolean g5 = ((t4) this.f32502w).f32943u.g();
                y3 y3Var = ((t4) this.f32502w).f32943u;
                boolean z11 = true;
                if (y3Var.U != null && y3Var.U.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((t4) this.f32502w).f32943u.U = Boolean.valueOf(this.f32501v);
                if (z10 == this.f32501v) {
                    w2 w2Var = ((t4) this.f32502w).f32943u.C;
                    y3.k(w2Var);
                    w2Var.H.c(Boolean.valueOf(this.f32501v), "Default data collection state already set to");
                }
                if (((t4) this.f32502w).f32943u.g() != g5) {
                    boolean g10 = ((t4) this.f32502w).f32943u.g();
                    y3 y3Var2 = ((t4) this.f32502w).f32943u;
                    if (y3Var2.U == null || !y3Var2.U.booleanValue()) {
                        z11 = false;
                        break;
                    }
                }
                w2 w2Var2 = ((t4) this.f32502w).f32943u.C;
                y3.k(w2Var2);
                w2Var2.E.d("Default data collection is different than actual status", Boolean.valueOf(this.f32501v), Boolean.valueOf(g5));
                ((t4) this.f32502w).z();
                return;
        }
    }
}
