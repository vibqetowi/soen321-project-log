package r1;

import r1.l;
/* compiled from: MediaRouter.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30363u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f30364v;

    public n(p pVar, int i6) {
        this.f30364v = pVar;
        this.f30363u = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.g gVar = l.d.this.f30313q;
        if (gVar != null) {
            gVar.j(this.f30363u);
        }
    }
}
