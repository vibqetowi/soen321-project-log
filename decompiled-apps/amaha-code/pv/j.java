package pv;

import is.q;
import is.w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import lv.g0;
import lv.o;
import lv.t;
/* compiled from: RouteSelector.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final lv.a f29085a;

    /* renamed from: b  reason: collision with root package name */
    public final hh.a f29086b;

    /* renamed from: c  reason: collision with root package name */
    public final lv.e f29087c;

    /* renamed from: d  reason: collision with root package name */
    public final o f29088d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends Proxy> f29089e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends InetSocketAddress> f29090g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f29091h;

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<g0> f29092a;

        /* renamed from: b  reason: collision with root package name */
        public int f29093b;

        public a(ArrayList arrayList) {
            this.f29092a = arrayList;
        }

        public final boolean a() {
            if (this.f29093b < this.f29092a.size()) {
                return true;
            }
            return false;
        }
    }

    public j(lv.a address, hh.a routeDatabase, d call, o eventListener) {
        boolean z10;
        List<? extends Proxy> x10;
        kotlin.jvm.internal.i.g(address, "address");
        kotlin.jvm.internal.i.g(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(eventListener, "eventListener");
        this.f29085a = address;
        this.f29086b = routeDatabase;
        this.f29087c = call;
        this.f29088d = eventListener;
        w wVar = w.f20676u;
        this.f29089e = wVar;
        this.f29090g = wVar;
        this.f29091h = new ArrayList();
        t url = address.f24535i;
        kotlin.jvm.internal.i.g(url, "url");
        Proxy proxy = address.f24533g;
        if (proxy != null) {
            x10 = ca.a.O0(proxy);
        } else {
            URI g5 = url.g();
            if (g5.getHost() == null) {
                x10 = mv.b.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f24534h.select(g5);
                if (proxiesOrNull != null && !proxiesOrNull.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    x10 = mv.b.l(Proxy.NO_PROXY);
                } else {
                    kotlin.jvm.internal.i.f(proxiesOrNull, "proxiesOrNull");
                    x10 = mv.b.x(proxiesOrNull);
                }
            }
        }
        this.f29089e = x10;
        this.f = 0;
    }

    public final boolean a() {
        boolean z10;
        if (this.f < this.f29089e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!this.f29091h.isEmpty())) {
            return true;
        }
        return false;
    }

    public final a b() {
        boolean z10;
        boolean z11;
        String domainName;
        int i6;
        boolean contains;
        if (a()) {
            ArrayList arrayList = new ArrayList();
            do {
                boolean z12 = false;
                if (this.f < this.f29089e.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                if (this.f < this.f29089e.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lv.a aVar = this.f29085a;
                if (z11) {
                    List<? extends Proxy> list = this.f29089e;
                    int i10 = this.f;
                    this.f = i10 + 1;
                    Proxy proxy = list.get(i10);
                    ArrayList arrayList2 = new ArrayList();
                    this.f29090g = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress proxyAddress = proxy.address();
                        if (proxyAddress instanceof InetSocketAddress) {
                            kotlin.jvm.internal.i.f(proxyAddress, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                            InetAddress address = inetSocketAddress.getAddress();
                            if (address == null) {
                                domainName = inetSocketAddress.getHostName();
                                kotlin.jvm.internal.i.f(domainName, "hostName");
                            } else {
                                domainName = address.getHostAddress();
                                kotlin.jvm.internal.i.f(domainName, "address.hostAddress");
                            }
                            i6 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                        }
                    } else {
                        t tVar = aVar.f24535i;
                        domainName = tVar.f24689d;
                        i6 = tVar.f24690e;
                    }
                    if (1 <= i6 && i6 < 65536) {
                        z12 = true;
                    }
                    if (z12) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(domainName, i6));
                        } else {
                            this.f29088d.getClass();
                            lv.e call = this.f29087c;
                            kotlin.jvm.internal.i.g(call, "call");
                            kotlin.jvm.internal.i.g(domainName, "domainName");
                            List<InetAddress> b10 = aVar.f24528a.b(domainName);
                            if (!b10.isEmpty()) {
                                for (InetAddress inetAddress : b10) {
                                    arrayList2.add(new InetSocketAddress(inetAddress, i6));
                                }
                            } else {
                                throw new UnknownHostException(aVar.f24528a + " returned no addresses for " + domainName);
                            }
                        }
                        for (InetSocketAddress inetSocketAddress2 : this.f29090g) {
                            g0 g0Var = new g0(this.f29085a, proxy, inetSocketAddress2);
                            hh.a aVar2 = this.f29086b;
                            synchronized (aVar2) {
                                contains = aVar2.f17604a.contains(g0Var);
                            }
                            if (contains) {
                                this.f29091h.add(g0Var);
                            } else {
                                arrayList.add(g0Var);
                            }
                        }
                    } else {
                        throw new SocketException("No route to " + domainName + ':' + i6 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + aVar.f24535i.f24689d + "; exhausted proxy configurations: " + this.f29089e);
                }
            } while (!(!arrayList.isEmpty()));
            if (arrayList.isEmpty()) {
                q.R1(this.f29091h, arrayList);
                this.f29091h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
