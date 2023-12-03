package vv;

import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.y;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import uv.h;
import vv.j;
/* compiled from: BouncyCastleSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36174a = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a implements j.a {
        @Override // vv.j.a
        public final boolean a(SSLSocket sSLSocket) {
            if (uv.c.f34599d && (sSLSocket instanceof BCSSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // vv.j.a
        public final k b(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // vv.k
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // vv.k
    public final boolean b() {
        boolean z10 = uv.c.f34599d;
        return uv.c.f34599d;
    }

    @Override // vv.k
    public final String c(SSLSocket sSLSocket) {
        boolean b10;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            b10 = true;
        } else {
            b10 = kotlin.jvm.internal.i.b(applicationProtocol, "");
        }
        if (b10) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // vv.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        kotlin.jvm.internal.i.g(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            uv.h hVar = uv.h.f34614a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
