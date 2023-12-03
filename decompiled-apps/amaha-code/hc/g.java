package hc;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.s;
import com.google.android.play.core.install.InstallException;
import ic.n;
import ic.r;
import ya.v;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final k f17377a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17378b;

    public g(k kVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f17377a = kVar;
        this.f17378b = context;
    }

    @Override // hc.b
    public final boolean a(a aVar, int i6, Activity activity, int i10) {
        boolean z10;
        byte b10 = (byte) (((byte) 1) | 2);
        if (b10 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" appUpdateType");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        m mVar = new m(i6, false);
        if (activity == null) {
            return false;
        }
        if (aVar.a(mVar) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !aVar.f17366j) {
            aVar.f17366j = true;
            activity.startIntentSenderForResult(aVar.a(mVar).getIntentSender(), i10, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    @Override // hc.b
    public final v b() {
        k kVar = this.f17377a;
        String packageName = this.f17378b.getPackageName();
        if (kVar.f17388a == null) {
            Object[] objArr = {-9};
            ic.k kVar2 = k.f17387e;
            kVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ic.k.b(kVar2.f19932a, "onError(%d)", objArr));
            }
            return ya.k.d(new InstallException(-9));
        }
        k.f17387e.a("requestUpdateInfo(%s)", packageName);
        ya.i iVar = new ya.i();
        r rVar = kVar.f17388a;
        i iVar2 = new i(kVar, iVar, packageName, iVar);
        synchronized (rVar.f) {
            rVar.f19948e.add(iVar);
            iVar.f38392a.addOnCompleteListener(new s(rVar, iVar, 1));
        }
        synchronized (rVar.f) {
            if (rVar.f19953k.getAndIncrement() > 0) {
                ic.k kVar3 = rVar.f19945b;
                Object[] objArr2 = new Object[0];
                kVar3.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", ic.k.b(kVar3.f19932a, "Already connected to the service.", objArr2));
                }
            }
        }
        rVar.a().post(new n(rVar, iVar, iVar2));
        return iVar.f38392a;
    }
}
