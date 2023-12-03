package lv;

import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import lv.t;
/* compiled from: Address.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final n f24528a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f24529b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f24530c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f24531d;

    /* renamed from: e  reason: collision with root package name */
    public final g f24532e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f24533g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f24534h;

    /* renamed from: i  reason: collision with root package name */
    public final t f24535i;

    /* renamed from: j  reason: collision with root package name */
    public final List<y> f24536j;

    /* renamed from: k  reason: collision with root package name */
    public final List<j> f24537k;

    public a(String uriHost, int i6, tr.r dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, xv.c cVar, g gVar, kotlin.jvm.internal.b0 proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        String str;
        kotlin.jvm.internal.i.g(uriHost, "uriHost");
        kotlin.jvm.internal.i.g(dns, "dns");
        kotlin.jvm.internal.i.g(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.g(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.g(protocols, "protocols");
        kotlin.jvm.internal.i.g(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.g(proxySelector, "proxySelector");
        this.f24528a = dns;
        this.f24529b = socketFactory;
        this.f24530c = sSLSocketFactory;
        this.f24531d = cVar;
        this.f24532e = gVar;
        this.f = proxyAuthenticator;
        this.f24533g = null;
        this.f24534h = proxySelector;
        t.a aVar = new t.a();
        if (sSLSocketFactory != null) {
            str = "https";
        } else {
            str = "http";
        }
        boolean z10 = true;
        if (gv.n.A0(str, "http", true)) {
            aVar.f24695a = "http";
        } else if (gv.n.A0(str, "https", true)) {
            aVar.f24695a = "https";
        } else {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(str, "unexpected scheme: "));
        }
        String i02 = hc.d.i0(t.b.d(uriHost, 0, 0, false, 7));
        if (i02 != null) {
            aVar.f24698d = i02;
            if ((1 > i6 || i6 >= 65536) ? false : false) {
                aVar.f24699e = i6;
                this.f24535i = aVar.a();
                this.f24536j = mv.b.x(protocols);
                this.f24537k = mv.b.x(connectionSpecs);
                return;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "unexpected port: ").toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(uriHost, "unexpected host: "));
    }

    public final boolean a(a that) {
        kotlin.jvm.internal.i.g(that, "that");
        if (kotlin.jvm.internal.i.b(this.f24528a, that.f24528a) && kotlin.jvm.internal.i.b(this.f, that.f) && kotlin.jvm.internal.i.b(this.f24536j, that.f24536j) && kotlin.jvm.internal.i.b(this.f24537k, that.f24537k) && kotlin.jvm.internal.i.b(this.f24534h, that.f24534h) && kotlin.jvm.internal.i.b(this.f24533g, that.f24533g) && kotlin.jvm.internal.i.b(this.f24530c, that.f24530c) && kotlin.jvm.internal.i.b(this.f24531d, that.f24531d) && kotlin.jvm.internal.i.b(this.f24532e, that.f24532e) && this.f24535i.f24690e == that.f24535i.f24690e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f24535i, aVar.f24535i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f24528a.hashCode();
        int hashCode2 = this.f.hashCode();
        int hashCode3 = this.f24536j.hashCode();
        int hashCode4 = this.f24537k.hashCode();
        int hashCode5 = this.f24534h.hashCode();
        int hashCode6 = Objects.hashCode(this.f24533g);
        int hashCode7 = Objects.hashCode(this.f24530c);
        int hashCode8 = Objects.hashCode(this.f24531d);
        return Objects.hashCode(this.f24532e) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f24535i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String n10;
        StringBuilder sb2 = new StringBuilder("Address{");
        t tVar = this.f24535i;
        sb2.append(tVar.f24689d);
        sb2.append(':');
        sb2.append(tVar.f24690e);
        sb2.append(", ");
        Proxy proxy = this.f24533g;
        if (proxy != null) {
            n10 = kotlin.jvm.internal.i.n(proxy, "proxy=");
        } else {
            n10 = kotlin.jvm.internal.i.n(this.f24534h, "proxySelector=");
        }
        return v.g.c(sb2, n10, '}');
    }
}
