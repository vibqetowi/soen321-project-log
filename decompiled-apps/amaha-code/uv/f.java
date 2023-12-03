package uv;

import gv.m;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import lv.y;
import uv.h;
/* compiled from: Jdk9Platform.kt */
/* loaded from: classes2.dex */
public final class f extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f34611c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0.intValue() >= 9) goto L11;
     */
    static {
        Integer w02;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            w02 = null;
        } else {
            w02 = m.w0(property);
        }
        boolean z10 = false;
        if (w02 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }
        z10 = true;
        f34611c = z10;
    }

    @Override // uv.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        i.g(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = h.a.a(protocols).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // uv.h
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean b10;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                b10 = true;
            } else {
                b10 = i.b(applicationProtocol, "");
            }
        } catch (UnsupportedOperationException unused) {
        }
        if (b10) {
            return null;
        }
        return applicationProtocol;
    }
}
