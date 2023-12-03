package p9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class t extends v9.f<h> {
    public t(Context context, Looper looper, v9.c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 161, cVar, aVar, bVar);
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b
    public final /* bridge */ /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new h(iBinder);
    }

    @Override // v9.b
    public final s9.d[] t() {
        return k9.x.f23197e;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.cast.internal.ICastService";
    }
}
