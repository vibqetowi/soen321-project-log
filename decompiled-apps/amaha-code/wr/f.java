package wr;

import java.util.logging.Level;
import vr.i;
/* compiled from: OkHttpChannelBuilder.java */
/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i.a f37116u;

    public f(i.a aVar) {
        this.f37116u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a aVar = this.f37116u;
        long j10 = aVar.f35694a;
        long max = Math.max(2 * j10, j10);
        vr.i iVar = vr.i.this;
        if (iVar.f35693b.compareAndSet(j10, max)) {
            vr.i.f35691c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{iVar.f35692a, Long.valueOf(max)});
        }
    }
}
