package ic;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19935b;

    public /* synthetic */ m(int i6, Object obj) {
        this.f19934a = i6;
        this.f19935b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i6 = this.f19934a;
        Object obj = this.f19935b;
        switch (i6) {
            case 0:
                r rVar = (r) obj;
                rVar.f19945b.a("reportBinderDeath", new Object[0]);
                p pVar = (p) rVar.f19951i.get();
                k kVar = rVar.f19945b;
                if (pVar != null) {
                    kVar.a("calling onBinderDied", new Object[0]);
                    pVar.a();
                } else {
                    String str = rVar.f19946c;
                    kVar.a("%s : Binder has died.", str);
                    ArrayList arrayList = rVar.f19947d;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                        ya.i iVar = ((l) it.next()).f19933u;
                        if (iVar != null) {
                            iVar.c(remoteException);
                        }
                    }
                    arrayList.clear();
                }
                rVar.c();
                return;
            default:
                mc.l lVar = (mc.l) obj;
                lVar.f25024b.a("reportBinderDeath", new Object[0]);
                mc.k kVar2 = (mc.k) lVar.f25030i.get();
                mc.g gVar = lVar.f25024b;
                if (kVar2 != null) {
                    gVar.a("calling onBinderDied", new Object[0]);
                    kVar2.a();
                } else {
                    String str2 = lVar.f25025c;
                    gVar.a("%s : Binder has died.", str2);
                    ArrayList arrayList2 = lVar.f25026d;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((mc.h) it2.next()).a(new RemoteException(String.valueOf(str2).concat(" : Binder has died.")));
                    }
                    arrayList2.clear();
                }
                lVar.b();
                return;
        }
    }
}
