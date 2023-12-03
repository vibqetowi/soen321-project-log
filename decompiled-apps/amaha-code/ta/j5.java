package ta;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class j5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32684u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k5 f32685v;

    public /* synthetic */ j5(k5 k5Var, int i6) {
        this.f32684u = i6;
        this.f32685v = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32684u;
        k5 k5Var = this.f32685v;
        switch (i6) {
            case 0:
                l5 l5Var = k5Var.f32697w;
                Context context = l5Var.f32943u.f32953u;
                k5Var.f32697w.f32943u.getClass();
                l5.v(l5Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            default:
                l5 l5Var2 = k5Var.f32697w;
                l5Var2.f32730x = null;
                l5Var2.r();
                return;
        }
    }
}
