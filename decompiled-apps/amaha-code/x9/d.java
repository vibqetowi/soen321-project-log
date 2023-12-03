package x9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k;
import v9.f;
import v9.s;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class d extends f<a> {
    public final s W;

    public d(Context context, Looper looper, v9.c cVar, s sVar, e eVar, k kVar) {
        super(context, looper, SubsamplingScaleImageView.ORIENTATION_270, cVar, eVar, kVar);
        this.W = sVar;
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // v9.b
    public final boolean B() {
        return true;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 203400000;
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override // v9.b
    public final s9.d[] t() {
        return ka.b.f23208b;
    }

    @Override // v9.b
    public final Bundle w() {
        s sVar = this.W;
        sVar.getClass();
        Bundle bundle = new Bundle();
        String str = sVar.f34944u;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
}
