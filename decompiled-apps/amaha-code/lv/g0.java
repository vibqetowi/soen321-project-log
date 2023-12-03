package lv;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: Route.kt */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f24612a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f24613b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f24614c;

    public g0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.g(address, "address");
        kotlin.jvm.internal.i.g(socketAddress, "socketAddress");
        this.f24612a = address;
        this.f24613b = proxy;
        this.f24614c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (kotlin.jvm.internal.i.b(g0Var.f24612a, this.f24612a) && kotlin.jvm.internal.i.b(g0Var.f24613b, this.f24613b) && kotlin.jvm.internal.i.b(g0Var.f24614c, this.f24614c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f24613b.hashCode();
        return this.f24614c.hashCode() + ((hashCode + ((this.f24612a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f24614c + '}';
    }
}
