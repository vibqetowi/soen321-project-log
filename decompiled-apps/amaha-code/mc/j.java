package mc;

import ic.q;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f25020v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f25021w;

    public /* synthetic */ j(int i6, Object obj) {
        this.f25020v = i6;
        this.f25021w = obj;
    }

    @Override // mc.h
    public final void b() {
        int i6 = this.f25020v;
        Object obj = this.f25021w;
        switch (i6) {
            case 0:
                l lVar = (l) obj;
                if (lVar.f25034m != null) {
                    lVar.f25024b.a("Unbind from service.", new Object[0]);
                    lVar.f25023a.unbindService(lVar.f25033l);
                    lVar.f25028g = false;
                    lVar.f25034m = null;
                    lVar.f25033l = null;
                }
                lVar.b();
                return;
            default:
                q qVar = (q) obj;
                l lVar2 = (l) qVar.f19942v;
                lVar2.f25024b.a("unlinkToDeath", new Object[0]);
                lVar2.f25034m.asBinder().unlinkToDeath(lVar2.f25031j, 0);
                l lVar3 = (l) qVar.f19942v;
                lVar3.f25034m = null;
                lVar3.f25028g = false;
                return;
        }
    }
}
