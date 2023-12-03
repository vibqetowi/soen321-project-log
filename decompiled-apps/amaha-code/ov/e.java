package ov;

import hs.k;
import java.util.logging.Level;
import kotlin.jvm.internal.i;
import ov.d;
import ta.v;
/* compiled from: TaskRunner.kt */
/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f27808u;

    public e(d dVar) {
        this.f27808u = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c10;
        long j10;
        while (true) {
            d dVar = this.f27808u;
            synchronized (dVar) {
                c10 = dVar.c();
            }
            if (c10 == null) {
                return;
            }
            c cVar = c10.f27790c;
            i.d(cVar);
            d dVar2 = this.f27808u;
            d.b bVar = d.f27798h;
            boolean isLoggable = d.f27800j.isLoggable(Level.FINE);
            if (isLoggable) {
                j10 = cVar.f27793a.f27801a.c();
                v.d(c10, cVar, "starting");
            } else {
                j10 = -1;
            }
            try {
                d.a(dVar2, c10);
                k kVar = k.f19476a;
                if (isLoggable) {
                    v.d(c10, cVar, i.n(v.u(cVar.f27793a.f27801a.c() - j10), "finished run in "));
                }
            } catch (Throwable th2) {
                if (isLoggable) {
                    v.d(c10, cVar, i.n(v.u(cVar.f27793a.f27801a.c() - j10), "failed a run in "));
                }
                throw th2;
            }
        }
    }
}
