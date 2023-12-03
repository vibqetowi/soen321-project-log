package tr;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import nc.f;
/* compiled from: HttpConnectProxiedSocketAddress.java */
/* loaded from: classes2.dex */
public final class s extends f0 {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f33567y = 0;

    /* renamed from: u  reason: collision with root package name */
    public final SocketAddress f33568u;

    /* renamed from: v  reason: collision with root package name */
    public final InetSocketAddress f33569v;

    /* renamed from: w  reason: collision with root package name */
    public final String f33570w;

    /* renamed from: x  reason: collision with root package name */
    public final String f33571x;

    public s(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        sc.b.w(socketAddress, "proxyAddress");
        sc.b.w(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            sc.b.z(socketAddress, "The proxy address %s is not resolved", !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.f33568u = socketAddress;
        this.f33569v = inetSocketAddress;
        this.f33570w = str;
        this.f33571x = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!f6.b.v0(this.f33568u, sVar.f33568u) || !f6.b.v0(this.f33569v, sVar.f33569v) || !f6.b.v0(this.f33570w, sVar.f33570w) || !f6.b.v0(this.f33571x, sVar.f33571x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33568u, this.f33569v, this.f33570w, this.f33571x});
    }

    public final String toString() {
        boolean z10;
        f.a c10 = nc.f.c(this);
        c10.c(this.f33568u, "proxyAddr");
        c10.c(this.f33569v, "targetAddr");
        c10.c(this.f33570w, "username");
        if (this.f33571x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        c10.d("hasPassword", z10);
        return c10.toString();
    }
}
