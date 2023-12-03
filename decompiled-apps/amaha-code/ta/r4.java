package ta;

import com.google.android.gms.internal.measurement.ca;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class r4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f32846u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f32847v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f32848w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f32849x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ h f32850y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ t4 f32851z;

    public r4(t4 t4Var, h hVar, int i6, long j10, boolean z10, h hVar2) {
        this.f32851z = t4Var;
        this.f32846u = hVar;
        this.f32847v = i6;
        this.f32848w = j10;
        this.f32849x = z10;
        this.f32850y = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t4 t4Var = this.f32851z;
        h hVar = this.f32846u;
        t4Var.v(hVar);
        t4.C(this.f32851z, this.f32846u, this.f32847v, this.f32848w, false, this.f32849x);
        ca.c();
        if (t4Var.f32943u.A.q(null, j2.f32653i0)) {
            t4.B(t4Var, hVar, this.f32850y);
        }
    }
}
