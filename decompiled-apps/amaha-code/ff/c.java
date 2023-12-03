package ff;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import lf.h;
/* compiled from: FirebasePerfNetworkValidator.java */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final df.a f15026c = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final h f15027a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15028b;

    public c(h hVar, Context context) {
        this.f15028b = context;
        this.f15027a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @Override // ff.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean isEmpty;
        URI create;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        h hVar = this.f15027a;
        String j02 = hVar.j0();
        if (j02 == null) {
            isEmpty = true;
        } else {
            isEmpty = j02.trim().isEmpty();
        }
        df.a aVar = f15026c;
        if (isEmpty) {
            aVar.f("URL is missing:" + hVar.j0());
            return false;
        }
        String j03 = hVar.j0();
        h.c cVar = null;
        if (j03 != null) {
            try {
                create = URI.create(j03);
            } catch (IllegalArgumentException | IllegalStateException e10) {
                aVar.g("getResultUrl throws exception %s", e10.getMessage());
            }
            if (create != null) {
                aVar.f("URL cannot be parsed");
                return false;
            }
            Context context = this.f15028b;
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
            if (identifier != 0) {
                df.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
                if (ca.a.E == null) {
                    ca.a.E = resources.getStringArray(identifier);
                }
                String host = create.getHost();
                if (host != null) {
                    for (String str : ca.a.E) {
                        if (!host.contains(str)) {
                        }
                    }
                    z10 = false;
                    if (z10) {
                        aVar.f("URL fails allowlist rule: " + create);
                        return false;
                    }
                    String host2 = create.getHost();
                    if (host2 != null && !host2.trim().isEmpty() && host2.length() <= 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        aVar.f("URL host is null or invalid");
                        return false;
                    }
                    String scheme = create.getScheme();
                    if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        aVar.f("URL scheme is null or invalid");
                        return false;
                    }
                    if (create.getUserInfo() == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        aVar.f("URL user info is null");
                        return false;
                    }
                    int port = create.getPort();
                    if (port != -1 && port <= 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (!z14) {
                        aVar.f("URL port is less than or equal to 0");
                        return false;
                    }
                    if (hVar.l0()) {
                        cVar = hVar.b0();
                    }
                    if (cVar != null && cVar != h.c.HTTP_METHOD_UNKNOWN) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        aVar.f("HTTP Method is null or invalid: " + hVar.b0());
                        return false;
                    }
                    if (hVar.m0()) {
                        if (hVar.c0() > 0) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!z20) {
                            aVar.f("HTTP ResponseCode is a negative value:" + hVar.c0());
                            return false;
                        }
                    }
                    if (hVar.n0()) {
                        if (hVar.e0() >= 0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            aVar.f("Request Payload is a negative value:" + hVar.e0());
                            return false;
                        }
                    }
                    if (hVar.o0()) {
                        if (hVar.f0() >= 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (!z18) {
                            aVar.f("Response Payload is a negative value:" + hVar.f0());
                            return false;
                        }
                    }
                    if (hVar.k0() && hVar.Z() > 0) {
                        if (hVar.p0()) {
                            if (hVar.g0() >= 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (!z17) {
                                aVar.f("Time to complete the request is a negative value:" + hVar.g0());
                                return false;
                            }
                        }
                        if (hVar.r0()) {
                            if (hVar.i0() >= 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (!z16) {
                                aVar.f("Time from the start of the request to the start of the response is null or a negative value:" + hVar.i0());
                                return false;
                            }
                        }
                        if (hVar.q0() && hVar.h0() > 0) {
                            if (hVar.m0()) {
                                return true;
                            }
                            aVar.f("Did not receive a HTTP Response Code");
                            return false;
                        }
                        aVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + hVar.h0());
                        return false;
                    }
                    aVar.f("Start time of the request is null, or zero, or a negative value:" + hVar.Z());
                    return false;
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        create = null;
        if (create != null) {
        }
    }
}
