package je;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21840u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f21841v;

    public /* synthetic */ j(k kVar, int i6) {
        this.f21840u = i6;
        this.f21841v = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f21840u;
        k kVar = this.f21841v;
        switch (i6) {
            case 0:
                kVar.f21847b.start();
                return;
            default:
                kVar.f21848c.start();
                return;
        }
    }
}
