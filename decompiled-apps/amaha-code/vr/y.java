package vr;
/* compiled from: ContextRunnable.java */
/* loaded from: classes2.dex */
public abstract class y implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final tr.l f36123u;

    public y(tr.l lVar) {
        this.f36123u = lVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        tr.l lVar = this.f36123u;
        tr.l a10 = lVar.a();
        try {
            a();
        } finally {
            lVar.c(a10);
        }
    }
}
