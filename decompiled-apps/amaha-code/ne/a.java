package ne;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26150u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f26151v;

    public /* synthetic */ a(b bVar, int i6) {
        this.f26150u = i6;
        this.f26151v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i6 = this.f26150u;
        b bVar = this.f26151v;
        switch (i6) {
            case 0:
                y yVar = bVar.f26168i;
                if (yVar == y.Backoff) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "State should still be backoff but was %s", yVar);
                bVar.f26168i = y.Initial;
                bVar.f();
                ca.a.u0(bVar.d(), "Stream should have started", new Object[0]);
                return;
            default:
                if (bVar.c()) {
                    bVar.f26168i = y.Healthy;
                    return;
                }
                return;
        }
    }
}
