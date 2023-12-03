package ta;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes.dex */
public final class l6 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.q0 f32733a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f32734b;

    public l6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.q0 q0Var) {
        this.f32734b = appMeasurementDynamiteService;
        this.f32733a = q0Var;
    }

    @Override // ta.g4
    public final void a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f32733a.d0(j10, bundle, str, str2);
        } catch (RemoteException e10) {
            y3 y3Var = this.f32734b.f8742a;
            if (y3Var != null) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.C.c(e10, "Event listener threw exception");
            }
        }
    }
}
