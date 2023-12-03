package ta;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class s2 extends v9.b {
    public s2(Context context, Looper looper, k5 k5Var, k5 k5Var2) {
        super(context, looper, v9.g.a(context), s9.f.f31339b, 93, k5Var, k5Var2, null);
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof m2) {
            return (m2) queryLocalInterface;
        }
        return new k2(iBinder);
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
