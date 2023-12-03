package r1;

import r1.l;
/* compiled from: MediaRouter.java */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30365u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f30366v;

    public o(p pVar, int i6) {
        this.f30366v = pVar;
        this.f30365u = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.g gVar = l.d.this.f30313q;
        if (gVar != null) {
            gVar.k(this.f30365u);
        }
    }
}
