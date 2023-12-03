package ic;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f19939v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f19940w;

    public /* synthetic */ o(int i6, Object obj) {
        this.f19939v = i6;
        this.f19940w = obj;
    }

    @Override // ic.l
    public final void a() {
        int i6 = this.f19939v;
        Object obj = this.f19940w;
        switch (i6) {
            case 0:
                r rVar = (r) obj;
                if (rVar.f19955m != null) {
                    rVar.f19945b.a("Unbind from service.", new Object[0]);
                    rVar.f19944a.unbindService(rVar.f19954l);
                    rVar.f19949g = false;
                    rVar.f19955m = null;
                    rVar.f19954l = null;
                }
                rVar.c();
                return;
            default:
                q qVar = (q) obj;
                r rVar2 = (r) qVar.f19942v;
                rVar2.f19945b.a("unlinkToDeath", new Object[0]);
                rVar2.f19955m.asBinder().unlinkToDeath(rVar2.f19952j, 0);
                r rVar3 = (r) qVar.f19942v;
                rVar3.f19955m = null;
                rVar3.f19949g = false;
                return;
        }
    }
}
