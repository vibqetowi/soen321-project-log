package ta;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.i;
import lv.j;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public int f32891a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32892b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32893c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f32894d;

    public /* synthetic */ u2(w2 w2Var, int i6, boolean z10, boolean z11) {
        this.f32894d = w2Var;
        this.f32891a = i6;
        this.f32892b = z10;
        this.f32893c = z11;
    }

    public final lv.j a(SSLSocket sSLSocket) {
        lv.j jVar;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        boolean z11;
        int i6 = this.f32891a;
        List list = (List) this.f32894d;
        int size = list.size();
        while (true) {
            if (i6 < size) {
                int i10 = i6 + 1;
                jVar = (lv.j) list.get(i6);
                if (jVar.b(sSLSocket)) {
                    this.f32891a = i10;
                    break;
                }
                i6 = i10;
            } else {
                jVar = null;
                break;
            }
        }
        if (jVar != null) {
            int i11 = this.f32891a;
            int size2 = list.size();
            while (true) {
                if (i11 < size2) {
                    int i12 = i11 + 1;
                    if (((lv.j) list.get(i11)).b(sSLSocket)) {
                        z10 = true;
                        break;
                    }
                    i11 = i12;
                } else {
                    z10 = false;
                    break;
                }
            }
            this.f32892b = z10;
            boolean z12 = this.f32893c;
            String[] strArr = jVar.f24645c;
            if (strArr != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                kotlin.jvm.internal.i.f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                cipherSuitesIntersection = mv.b.p(enabledCipherSuites, strArr, lv.i.f24625c);
            } else {
                cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = jVar.f24646d;
            if (strArr2 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                kotlin.jvm.internal.i.f(enabledProtocols, "sslSocket.enabledProtocols");
                tlsVersionsIntersection = mv.b.p(enabledProtocols, strArr2, ks.a.f23814u);
            } else {
                tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            kotlin.jvm.internal.i.f(supportedCipherSuites, "supportedCipherSuites");
            i.a aVar = lv.i.f24625c;
            byte[] bArr = mv.b.f25755a;
            int length = supportedCipherSuites.length;
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    if (aVar.compare(supportedCipherSuites[i13], "TLS_FALLBACK_SCSV") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (z12 && i13 != -1) {
                kotlin.jvm.internal.i.f(cipherSuitesIntersection, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i13];
                kotlin.jvm.internal.i.f(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
                kotlin.jvm.internal.i.f(copyOf, "copyOf(this, newSize)");
                cipherSuitesIntersection = (String[]) copyOf;
                cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
            }
            j.a aVar2 = new j.a(jVar);
            kotlin.jvm.internal.i.f(cipherSuitesIntersection, "cipherSuitesIntersection");
            aVar2.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
            kotlin.jvm.internal.i.f(tlsVersionsIntersection, "tlsVersionsIntersection");
            aVar2.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
            lv.j a10 = aVar2.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f24646d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f24645c);
            }
            return jVar;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f32893c);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.i.d(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        kotlin.jvm.internal.i.f(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final void b(String str) {
        ((w2) this.f32894d).u(this.f32891a, this.f32892b, this.f32893c, str, null, null, null);
    }

    public final void c(Object obj, String str) {
        ((w2) this.f32894d).u(this.f32891a, this.f32892b, this.f32893c, str, obj, null, null);
    }

    public final void d(String str, Object obj, Object obj2) {
        ((w2) this.f32894d).u(this.f32891a, this.f32892b, this.f32893c, str, obj, obj2, null);
    }

    public final void e(String str, Object obj, Object obj2, Object obj3) {
        ((w2) this.f32894d).u(this.f32891a, this.f32892b, this.f32893c, str, obj, obj2, obj3);
    }

    public /* synthetic */ u2(List connectionSpecs) {
        kotlin.jvm.internal.i.g(connectionSpecs, "connectionSpecs");
        this.f32894d = connectionSpecs;
    }
}
