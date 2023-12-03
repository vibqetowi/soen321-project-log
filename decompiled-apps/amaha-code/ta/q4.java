package ta;

import com.google.android.gms.internal.measurement.ca;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q4 implements Runnable {
    public final /* synthetic */ t4 A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f32826u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f32827v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f32828w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f32829x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f32830y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ h f32831z;

    public q4(t4 t4Var, h hVar, long j10, int i6, long j11, boolean z10, h hVar2) {
        this.A = t4Var;
        this.f32826u = hVar;
        this.f32827v = j10;
        this.f32828w = i6;
        this.f32829x = j11;
        this.f32830y = z10;
        this.f32831z = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t4 t4Var = this.A;
        h hVar = this.f32826u;
        t4Var.v(hVar);
        t4Var.r(false, this.f32827v);
        t4.C(this.A, this.f32826u, this.f32828w, this.f32829x, true, this.f32830y);
        ca.c();
        if (t4Var.f32943u.A.q(null, j2.f32653i0)) {
            t4.B(t4Var, hVar, this.f32831z);
        }
    }
}
