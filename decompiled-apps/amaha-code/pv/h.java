package pv;

import hs.k;
import java.net.Socket;
import java.util.Iterator;
/* compiled from: RealConnectionPool.kt */
/* loaded from: classes2.dex */
public final class h extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f29079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str) {
        super(str, true);
        this.f29079e = iVar;
    }

    @Override // ov.a
    public final long a() {
        i iVar = this.f29079e;
        long nanoTime = System.nanoTime();
        Iterator<e> it = iVar.f29084e.iterator();
        int i6 = 0;
        long j10 = Long.MIN_VALUE;
        e eVar = null;
        int i10 = 0;
        while (it.hasNext()) {
            e connection = it.next();
            kotlin.jvm.internal.i.f(connection, "connection");
            synchronized (connection) {
                if (iVar.b(connection, nanoTime) > 0) {
                    i10++;
                } else {
                    i6++;
                    long j11 = nanoTime - connection.f29073q;
                    if (j11 > j10) {
                        eVar = connection;
                        j10 = j11;
                    }
                    k kVar = k.f19476a;
                }
            }
        }
        long j12 = iVar.f29081b;
        if (j10 < j12 && i6 <= iVar.f29080a) {
            if (i6 > 0) {
                return j12 - j10;
            }
            if (i10 <= 0) {
                return -1L;
            }
            return j12;
        }
        kotlin.jvm.internal.i.d(eVar);
        synchronized (eVar) {
            if (!(!eVar.f29072p.isEmpty())) {
                if (eVar.f29073q + j10 == nanoTime) {
                    eVar.f29066j = true;
                    iVar.f29084e.remove(eVar);
                    Socket socket = eVar.f29061d;
                    kotlin.jvm.internal.i.d(socket);
                    mv.b.e(socket);
                    if (iVar.f29084e.isEmpty()) {
                        iVar.f29082c.a();
                    }
                }
            }
        }
        return 0L;
    }
}
