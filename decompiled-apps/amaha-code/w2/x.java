package w2;

import androidx.work.u;
import java.util.UUID;
/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ UUID f36341u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.work.d f36342v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x2.c f36343w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ y f36344x;

    public x(y yVar, UUID uuid, androidx.work.d dVar, x2.c cVar) {
        this.f36344x = yVar;
        this.f36341u = uuid;
        this.f36342v = dVar;
        this.f36343w = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v2.s p10;
        x2.c cVar = this.f36343w;
        UUID uuid = this.f36341u;
        String uuid2 = uuid.toString();
        androidx.work.q d10 = androidx.work.q.d();
        String str = y.f36345c;
        StringBuilder sb2 = new StringBuilder("Updating progress for ");
        sb2.append(uuid);
        sb2.append(" (");
        androidx.work.d dVar = this.f36342v;
        sb2.append(dVar);
        sb2.append(")");
        d10.a(str, sb2.toString());
        y yVar = this.f36344x;
        yVar.f36346a.c();
        try {
            p10 = yVar.f36346a.u().p(uuid2);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (p10 != null) {
            if (p10.f34735b == u.a.RUNNING) {
                yVar.f36346a.t().b(new v2.p(uuid2, dVar));
            } else {
                androidx.work.q d11 = androidx.work.q.d();
                d11.g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
            }
            cVar.i(null);
            yVar.f36346a.n();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}
