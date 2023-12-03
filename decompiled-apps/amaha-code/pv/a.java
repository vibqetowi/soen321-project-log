package pv;

import hs.k;
import java.io.IOException;
import lv.d0;
import lv.u;
import lv.x;
import okhttp3.internal.connection.RouteException;
/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29023a = new a();

    @Override // lv.u
    public final d0 a(qv.f fVar) {
        boolean z10;
        d dVar = fVar.f30146a;
        dVar.getClass();
        synchronized (dVar) {
            if (dVar.I) {
                if (!dVar.H) {
                    if (!dVar.G) {
                        k kVar = k.f19476a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        c cVar = dVar.C;
        kotlin.jvm.internal.i.d(cVar);
        x client = dVar.f29048u;
        kotlin.jvm.internal.i.g(client, "client");
        try {
            int i6 = fVar.f;
            int i10 = fVar.f30151g;
            int i11 = fVar.f30152h;
            boolean z11 = client.f24725z;
            if (!kotlin.jvm.internal.i.b(fVar.f30150e.f24752b, "GET")) {
                z10 = true;
            } else {
                z10 = false;
            }
            b bVar = new b(dVar, dVar.f29052y, cVar, cVar.a(i6, i10, i11, z11, z10).k(client, fVar));
            dVar.F = bVar;
            dVar.K = bVar;
            synchronized (dVar) {
                dVar.G = true;
                dVar.H = true;
            }
            if (!dVar.J) {
                return qv.f.b(fVar, 0, bVar, null, 61).c(fVar.f30150e);
            }
            throw new IOException("Canceled");
        } catch (IOException e10) {
            cVar.c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            cVar.c(e11.f27605v);
            throw e11;
        }
    }
}
