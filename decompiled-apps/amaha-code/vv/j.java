package vv;

import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.y;
/* compiled from: DeferredSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final a f36179a;

    /* renamed from: b  reason: collision with root package name */
    public k f36180b;

    /* compiled from: DeferredSocketAdapter.kt */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        this.f36179a = aVar;
    }

    @Override // vv.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f36179a.a(sSLSocket);
    }

    @Override // vv.k
    public final boolean b() {
        return true;
    }

    @Override // vv.k
    public final String c(SSLSocket sSLSocket) {
        k kVar;
        synchronized (this) {
            if (this.f36180b == null && this.f36179a.a(sSLSocket)) {
                this.f36180b = this.f36179a.b(sSLSocket);
            }
            kVar = this.f36180b;
        }
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    @Override // vv.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        k kVar;
        kotlin.jvm.internal.i.g(protocols, "protocols");
        synchronized (this) {
            if (this.f36180b == null && this.f36179a.a(sSLSocket)) {
                this.f36180b = this.f36179a.b(sSLSocket);
            }
            kVar = this.f36180b;
        }
        if (kVar != null) {
            kVar.d(sSLSocket, str, protocols);
        }
    }
}
