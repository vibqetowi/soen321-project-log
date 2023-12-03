package ta;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes.dex */
public final class w4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32930u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.n0 f32931v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f32932w;

    public /* synthetic */ w4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, int i6) {
        this.f32930u = i6;
        this.f32932w = appMeasurementDynamiteService;
        this.f32931v = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32930u;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f32932w;
        boolean z10 = false;
        switch (i6) {
            case 0:
                l5 t3 = appMeasurementDynamiteService.f8742a.t();
                com.google.android.gms.internal.measurement.n0 n0Var = this.f32931v;
                t3.h();
                t3.i();
                t3.t(new k9.d0(t3, t3.q(false), n0Var, 10));
                return;
            default:
                k6 k6Var = appMeasurementDynamiteService.f8742a.F;
                y3.i(k6Var);
                y3 y3Var = appMeasurementDynamiteService.f8742a;
                if (y3Var.U != null && y3Var.U.booleanValue()) {
                    z10 = true;
                }
                k6Var.z(this.f32931v, z10);
                return;
        }
    }
}
