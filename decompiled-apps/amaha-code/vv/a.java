package vv;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import lv.y;
import uv.h;
/* compiled from: Android10SocketAdapter.kt */
/* loaded from: classes2.dex */
public final class a implements k {
    @Override // vv.k
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // vv.k
    public final boolean b() {
        uv.h hVar = uv.h.f34614a;
        if (h.a.c() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // vv.k
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean b10;
        applicationProtocol = sSLSocket.getApplicationProtocol();
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
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            uv.h hVar = uv.h.f34614a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
