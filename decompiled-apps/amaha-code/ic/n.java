package ic;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.appupdate.internal.zzy;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f19936v = 1;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f19937w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f19938x;

    public n(q qVar, IBinder iBinder) {
        this.f19938x = qVar;
        this.f19937w = iBinder;
    }

    @Override // ic.l
    public final void a() {
        g eVar;
        int i6 = this.f19936v;
        Object obj = this.f19937w;
        Object obj2 = this.f19938x;
        switch (i6) {
            case 0:
                r rVar = (r) obj2;
                l lVar = (l) obj;
                IInterface iInterface = rVar.f19955m;
                ArrayList arrayList = rVar.f19947d;
                k kVar = rVar.f19945b;
                if (iInterface == null && !rVar.f19949g) {
                    kVar.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(lVar);
                    q qVar = new q(rVar, 0);
                    rVar.f19954l = qVar;
                    rVar.f19949g = true;
                    if (!rVar.f19944a.bindService(rVar.f19950h, qVar, 1)) {
                        kVar.a("Failed to bind to the service.", new Object[0]);
                        rVar.f19949g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            zzy zzyVar = new zzy();
                            ya.i iVar = ((l) it.next()).f19933u;
                            if (iVar != null) {
                                iVar.c(zzyVar);
                            }
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                } else if (rVar.f19949g) {
                    kVar.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(lVar);
                    return;
                } else {
                    lVar.run();
                    return;
                }
            default:
                q qVar2 = (q) obj2;
                r rVar2 = (r) qVar2.f19942v;
                IBinder iBinder = (IBinder) obj;
                int i10 = f.f19930b;
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
                    if (queryLocalInterface instanceof g) {
                        eVar = (g) queryLocalInterface;
                    } else {
                        eVar = new e(iBinder);
                    }
                }
                rVar2.f19955m = eVar;
                Object obj3 = qVar2.f19942v;
                r rVar3 = (r) obj3;
                rVar3.f19945b.a("linkToDeath", new Object[0]);
                try {
                    rVar3.f19955m.asBinder().linkToDeath(rVar3.f19952j, 0);
                } catch (RemoteException e10) {
                    Object[] objArr = new Object[0];
                    k kVar2 = rVar3.f19945b;
                    kVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", k.b(kVar2.f19932a, "linkToDeath failed", objArr), e10);
                    }
                }
                r rVar4 = (r) obj3;
                rVar4.f19949g = false;
                Iterator it2 = rVar4.f19947d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((r) obj3).f19947d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, ya.i iVar, hc.i iVar2) {
        super(iVar);
        this.f19938x = rVar;
        this.f19937w = iVar2;
    }
}
