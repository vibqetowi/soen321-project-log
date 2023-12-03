package p8;
/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ e f28013y;

    public d(e eVar) {
        this.f28013y = eVar;
    }

    @Override // r7.e
    public final void n() {
        e eVar = this.f28013y;
        synchronized (eVar.f30547b) {
            boolean z10 = false;
            this.f30528u = 0;
            this.f28025w = null;
            int i6 = eVar.f30552h;
            eVar.f30552h = i6 + 1;
            eVar.f[i6] = this;
            if (!eVar.f30548c.isEmpty() && eVar.f30552h > 0) {
                z10 = true;
            }
            if (z10) {
                eVar.f30547b.notify();
            }
        }
    }
}
