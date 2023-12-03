package ta;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class m4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32742u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f32743v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t4 f32744w;

    public /* synthetic */ m4(t4 t4Var, long j10, int i6) {
        this.f32742u = i6;
        this.f32744w = t4Var;
        this.f32743v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32742u;
        long j10 = this.f32743v;
        t4 t4Var = this.f32744w;
        switch (i6) {
            case 0:
                j3 j3Var = t4Var.f32943u.B;
                y3.i(j3Var);
                j3Var.D.b(j10);
                w2 w2Var = t4Var.f32943u.C;
                y3.k(w2Var);
                w2Var.G.c(Long.valueOf(j10), "Session timeout duration set");
                return;
            default:
                t4Var.r(true, j10);
                t4Var.f32943u.t().y(new AtomicReference());
                return;
        }
    }
}
