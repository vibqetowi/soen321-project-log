package vr;

import java.lang.reflect.InvocationTargetException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ProxyDetectorImpl.java */
/* loaded from: classes2.dex */
public final class q2 implements tr.g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f35939d = Logger.getLogger(q2.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final a f35940e = new a();
    public static final b f = new b();

    /* renamed from: a  reason: collision with root package name */
    public final nc.m<ProxySelector> f35941a;

    /* renamed from: b  reason: collision with root package name */
    public final c f35942b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f35943c;

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public class a implements c {
        @Override // vr.q2.c
        public final PasswordAuthentication a(String str, InetAddress inetAddress, int i6) {
            URL url;
            try {
                url = new URL("https", str, i6, "");
            } catch (MalformedURLException unused) {
                q2.f35939d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i6, "https", "", null, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public class b implements nc.m<ProxySelector> {
        @Override // nc.m
        public final ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* compiled from: ProxyDetectorImpl.java */
    /* loaded from: classes2.dex */
    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i6);
    }

    public q2() {
        int i6;
        String str = System.getenv("GRPC_PROXY_EXP");
        b bVar = f;
        bVar.getClass();
        this.f35941a = bVar;
        a aVar = f35940e;
        aVar.getClass();
        this.f35942b = aVar;
        if (str != null) {
            String[] split = str.split(":", 2);
            if (split.length > 1) {
                i6 = Integer.parseInt(split[1]);
            } else {
                i6 = 80;
            }
            f35939d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.f35943c = new InetSocketAddress(split[0], i6);
            return;
        }
        this.f35943c = null;
    }

    @Override // tr.g0
    public final tr.f0 a(InetSocketAddress inetSocketAddress) {
        String hostName;
        String hostName2;
        tr.s sVar;
        String str = null;
        if (!(inetSocketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f35943c;
        if (inetSocketAddress2 != null) {
            int i6 = tr.s.f33567y;
            sc.b.w(inetSocketAddress, "targetAddress");
            return new tr.s(inetSocketAddress2, inetSocketAddress, null, null);
        }
        Logger logger = f35939d;
        try {
            Logger logger2 = u0.f35973a;
            try {
                hostName = (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                hostName = inetSocketAddress.getHostName();
            }
            try {
                URI uri = new URI("https", null, hostName, inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f35941a.get();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                try {
                    hostName2 = (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress3, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    hostName2 = inetSocketAddress3.getHostName();
                }
                PasswordAuthentication a10 = this.f35942b.a(hostName2, inetSocketAddress3.getAddress(), inetSocketAddress3.getPort());
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i10 = tr.s.f33567y;
                if (a10 == null) {
                    sVar = new tr.s(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    String userName = a10.getUserName();
                    if (a10.getPassword() != null) {
                        str = new String(a10.getPassword());
                    }
                    sVar = new tr.s(inetSocketAddress3, inetSocketAddress, userName, str);
                }
                return sVar;
            } catch (URISyntaxException e10) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th2) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
            return null;
        }
    }
}
