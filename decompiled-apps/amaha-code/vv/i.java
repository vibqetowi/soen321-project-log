package vv;

import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.y;
import org.conscrypt.Conscrypt;
import uv.d;
import uv.h;
import vv.j;
/* compiled from: ConscryptSocketAdapter.kt */
/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36178a = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a implements j.a {
        @Override // vv.j.a
        public final boolean a(SSLSocket sSLSocket) {
            boolean z10 = uv.d.f34601d;
            if (d.a.b() && Conscrypt.isConscrypt(sSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // vv.j.a
        public final k b(SSLSocket sSLSocket) {
            return new i();
        }
    }

    @Override // vv.k
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // vv.k
    public final boolean b() {
        boolean z10 = uv.d.f34601d;
        return uv.d.f34601d;
    }

    @Override // vv.k
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // vv.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        kotlin.jvm.internal.i.g(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            uv.h hVar = uv.h.f34614a;
            Object[] array = h.a.a(protocols).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
