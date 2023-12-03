package mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.integrity.internal.zzu;
import ic.q;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f25017v = 1;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25018w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f25019x;

    public i(q qVar, IBinder iBinder) {
        this.f25019x = qVar;
        this.f25018w = iBinder;
    }

    @Override // mc.h
    public final void b() {
        e cVar;
        int i6 = this.f25017v;
        Object obj = this.f25018w;
        Object obj2 = this.f25019x;
        switch (i6) {
            case 0:
                l lVar = (l) obj2;
                h hVar = (h) obj;
                IInterface iInterface = lVar.f25034m;
                ArrayList arrayList = lVar.f25026d;
                g gVar = lVar.f25024b;
                if (iInterface == null && !lVar.f25028g) {
                    gVar.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(hVar);
                    q qVar = new q(lVar, 1);
                    lVar.f25033l = qVar;
                    lVar.f25028g = true;
                    if (!lVar.f25023a.bindService(lVar.f25029h, qVar, 1)) {
                        gVar.a("Failed to bind to the service.", new Object[0]);
                        lVar.f25028g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).a(new zzu());
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                } else if (lVar.f25028g) {
                    gVar.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(hVar);
                    return;
                } else {
                    hVar.run();
                    return;
                }
            default:
                q qVar2 = (q) obj2;
                l lVar2 = (l) qVar2.f19942v;
                IBinder iBinder = (IBinder) obj;
                int i10 = d.f25014b;
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (queryLocalInterface instanceof e) {
                        cVar = (e) queryLocalInterface;
                    } else {
                        cVar = new c(iBinder);
                    }
                }
                lVar2.f25034m = cVar;
                Object obj3 = qVar2.f19942v;
                l lVar3 = (l) obj3;
                lVar3.f25024b.a("linkToDeath", new Object[0]);
                try {
                    lVar3.f25034m.asBinder().linkToDeath(lVar3.f25031j, 0);
                } catch (RemoteException e10) {
                    Object[] objArr = new Object[0];
                    g gVar2 = lVar3.f25024b;
                    gVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", g.b(gVar2.f25015a, "linkToDeath failed", objArr), e10);
                    }
                }
                l lVar4 = (l) obj3;
                lVar4.f25028g = false;
                Iterator it2 = lVar4.f25026d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((l) obj3).f25026d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, ya.i iVar, kc.h hVar) {
        super(iVar);
        this.f25019x = lVar;
        this.f25018w = hVar;
    }
}
