package k9;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import java.util.HashMap;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements com.google.android.gms.common.api.internal.n {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23202u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final f0 f23203v;

    /* renamed from: w  reason: collision with root package name */
    public final String f23204w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23205x;

    public z(f0 f0Var, String str, String str2) {
        this.f23203v = f0Var;
        this.f23204w = str;
        this.f23205x = str2;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        int i6 = this.f23202u;
        f0 f0Var = this.f23203v;
        String str = this.f23205x;
        String str2 = this.f23204w;
        switch (i6) {
            case 0:
                p9.z zVar = (p9.z) eVar;
                ya.i iVar = (ya.i) obj;
                HashMap hashMap = f0Var.B;
                long incrementAndGet = f0Var.f23125q.incrementAndGet();
                f0Var.h();
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), iVar);
                    p9.e eVar2 = (p9.e) zVar.y();
                    Parcel z10 = eVar2.z();
                    z10.writeString(str2);
                    z10.writeString(str);
                    z10.writeLong(incrementAndGet);
                    eVar2.S1(z10, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    iVar.a(e10);
                    return;
                }
            default:
                ya.i<e.a> iVar2 = (ya.i) obj;
                f0Var.h();
                p9.e eVar3 = (p9.e) ((p9.z) eVar).y();
                Parcel z11 = eVar3.z();
                z11.writeString(str2);
                z11.writeString(str);
                com.google.android.gms.internal.cast.d.b(z11, null);
                eVar3.S1(z11, 14);
                synchronized (f0Var.r) {
                    if (f0Var.f23123o != null) {
                        f0Var.i(2477);
                    }
                    f0Var.f23123o = iVar2;
                }
                return;
        }
    }

    public z(f0 f0Var, String str, String str2, int i6) {
        this.f23203v = f0Var;
        this.f23204w = str;
        this.f23205x = str2;
    }
}
