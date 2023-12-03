package u2;

import v2.s;
/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f33758u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.a f33759v;

    public b(androidx.work.impl.foreground.a aVar, String str) {
        this.f33759v = aVar;
        this.f33758u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s c10 = this.f33759v.f3301u.f.c(this.f33758u);
        if (c10 != null && c10.b()) {
            synchronized (this.f33759v.f3303w) {
                this.f33759v.f3306z.put(ca.a.a0(c10), c10);
                this.f33759v.A.add(c10);
                androidx.work.impl.foreground.a aVar = this.f33759v;
                aVar.B.d(aVar.A);
            }
        }
    }
}
