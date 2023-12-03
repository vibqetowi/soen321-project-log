package vv;

import gv.n;
import javax.net.ssl.SSLSocket;
import vv.j;
/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class e implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f36168a = "com.google.android.gms.org.conscrypt";

    @Override // vv.j.a
    public final boolean a(SSLSocket sSLSocket) {
        return n.H0(sSLSocket.getClass().getName(), kotlin.jvm.internal.i.n(".", this.f36168a));
    }

    @Override // vv.j.a
    public final k b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!kotlin.jvm.internal.i.b(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(kotlin.jvm.internal.i.n(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(cls2);
    }
}
