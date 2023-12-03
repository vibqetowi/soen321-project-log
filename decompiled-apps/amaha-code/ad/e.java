package ad;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f495u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f496v;

    public /* synthetic */ e(g gVar, int i6) {
        this.f495u = i6;
        this.f496v = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f495u;
        g gVar = this.f496v;
        switch (i6) {
            case 0:
                d dVar = gVar.f499a;
                dVar.f493l.a().onSuccessTask(dVar.f488g, new f0.b(24, dVar)).addOnFailureListener(gVar.f500b, new f(0, gVar));
                return;
            default:
                d dVar2 = gVar.f499a;
                dVar2.f493l.a().onSuccessTask(dVar2.f488g, new f0.b(24, dVar2)).addOnFailureListener(gVar.f500b, new f(0, gVar));
                return;
        }
    }
}
