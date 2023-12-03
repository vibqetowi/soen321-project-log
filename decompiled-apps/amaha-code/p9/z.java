package p9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.c;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class z extends v9.f<e> {

    /* renamed from: a0  reason: collision with root package name */
    public static final b f28080a0 = new b("CastClientImplCxless");
    public final CastDevice W;
    public final long X;
    public final Bundle Y;
    public final String Z;

    public z(Context context, Looper looper, v9.c cVar, CastDevice castDevice, long j10, Bundle bundle, String str, c.a aVar, c.b bVar) {
        super(context, looper, 10, cVar, aVar, bVar);
        this.W = castDevice;
        this.X = j10;
        this.Y = bundle;
        this.Z = str;
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // v9.b
    public final boolean E() {
        return true;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final void h() {
        try {
            try {
                e eVar = (e) y();
                eVar.S1(eVar.z(), 1);
            } finally {
                super.h();
            }
        } catch (RemoteException | IllegalStateException e10) {
            f28080a0.a("Error while disconnecting the controller interface", e10, new Object[0]);
        }
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 19390000;
    }

    @Override // v9.b
    public final /* bridge */ /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new e(iBinder);
    }

    @Override // v9.b
    public final s9.d[] t() {
        return k9.x.f23197e;
    }

    @Override // v9.b
    public final Bundle w() {
        Bundle bundle = new Bundle();
        f28080a0.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.W;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.X);
        bundle.putString("connectionless_client_record_id", this.Z);
        Bundle bundle2 = this.Y;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }
}
