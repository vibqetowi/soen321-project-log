package vr;

import io.grpc.l;
import java.net.URI;
import vr.u0;
/* compiled from: DnsNameResolverProvider.java */
/* loaded from: classes2.dex */
public final class i0 extends io.grpc.m {
    @Override // io.grpc.l.c
    public final String a() {
        return "dns";
    }

    @Override // io.grpc.l.c
    public final io.grpc.l b(URI uri, l.a aVar) {
        boolean z10;
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            sc.b.w(path, "targetPath");
            sc.b.r(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
            String substring = path.substring(1);
            uri.getAuthority();
            u0.b bVar = u0.f35987p;
            nc.l lVar = new nc.l();
            try {
                Class.forName("android.app.Application", false, i0.class.getClassLoader());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            return new h0(substring, aVar, bVar, lVar, z10);
        }
        return null;
    }

    @Override // io.grpc.m
    public boolean c() {
        return true;
    }

    @Override // io.grpc.m
    public int d() {
        return 5;
    }
}
