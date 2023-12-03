package pv;

import hs.k;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import lv.g0;
import lv.o;
import lv.t;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import pv.j;
/* compiled from: ExchangeFinder.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final i f29039a;

    /* renamed from: b  reason: collision with root package name */
    public final lv.a f29040b;

    /* renamed from: c  reason: collision with root package name */
    public final d f29041c;

    /* renamed from: d  reason: collision with root package name */
    public final o f29042d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f29043e;
    public j f;

    /* renamed from: g  reason: collision with root package name */
    public int f29044g;

    /* renamed from: h  reason: collision with root package name */
    public int f29045h;

    /* renamed from: i  reason: collision with root package name */
    public int f29046i;

    /* renamed from: j  reason: collision with root package name */
    public g0 f29047j;

    public c(i connectionPool, lv.a aVar, d dVar, o eventListener) {
        kotlin.jvm.internal.i.g(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.g(eventListener, "eventListener");
        this.f29039a = connectionPool;
        this.f29040b = aVar;
        this.f29041c = dVar;
        this.f29042d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e a(int i6, int i10, int i11, boolean z10, boolean z11) {
        List<g0> list;
        boolean z12;
        boolean a10;
        Socket i12;
        while (!this.f29041c.J) {
            e eVar = this.f29041c.D;
            boolean z13 = true;
            boolean z14 = false;
            if (eVar != null) {
                synchronized (eVar) {
                    if (!eVar.f29066j && b(eVar.f29059b.f24612a.f24535i)) {
                        i12 = null;
                        k kVar = k.f19476a;
                    }
                    i12 = this.f29041c.i();
                    k kVar2 = k.f19476a;
                }
                if (this.f29041c.D != null) {
                    if (i12 == null) {
                        z14 = true;
                    }
                    if (!z14) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    z12 = z11;
                    if (eVar.j(z12)) {
                        return eVar;
                    }
                    eVar.l();
                    if (this.f29047j == null) {
                        j.a aVar = this.f29043e;
                        if (aVar == null) {
                            a10 = true;
                        } else {
                            a10 = aVar.a();
                        }
                        if (a10) {
                            continue;
                        } else {
                            j jVar = this.f;
                            if (jVar != null) {
                                z13 = jVar.a();
                            }
                            if (!z13) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i12 != null) {
                        mv.b.e(i12);
                    }
                    o oVar = this.f29042d;
                    d call = this.f29041c;
                    oVar.getClass();
                    kotlin.jvm.internal.i.g(call, "call");
                }
            }
            this.f29044g = 0;
            this.f29045h = 0;
            this.f29046i = 0;
            if (this.f29039a.a(this.f29040b, this.f29041c, null, false)) {
                eVar = this.f29041c.D;
                kotlin.jvm.internal.i.d(eVar);
                o oVar2 = this.f29042d;
                d call2 = this.f29041c;
                oVar2.getClass();
                kotlin.jvm.internal.i.g(call2, "call");
            } else {
                g0 g0Var = this.f29047j;
                try {
                    if (g0Var != null) {
                        this.f29047j = null;
                    } else {
                        j.a aVar2 = this.f29043e;
                        if (aVar2 != null && aVar2.a()) {
                            j.a aVar3 = this.f29043e;
                            kotlin.jvm.internal.i.d(aVar3);
                            if (aVar3.a()) {
                                int i13 = aVar3.f29093b;
                                aVar3.f29093b = i13 + 1;
                                g0Var = aVar3.f29092a.get(i13);
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            j jVar2 = this.f;
                            if (jVar2 == null) {
                                lv.a aVar4 = this.f29040b;
                                d dVar = this.f29041c;
                                jVar2 = new j(aVar4, dVar.f29048u.T, dVar, this.f29042d);
                                this.f = jVar2;
                            }
                            j.a b10 = jVar2.b();
                            this.f29043e = b10;
                            list = b10.f29092a;
                            if (!this.f29041c.J) {
                                if (this.f29039a.a(this.f29040b, this.f29041c, list, false)) {
                                    eVar = this.f29041c.D;
                                    kotlin.jvm.internal.i.d(eVar);
                                    o oVar3 = this.f29042d;
                                    d call3 = this.f29041c;
                                    oVar3.getClass();
                                    kotlin.jvm.internal.i.g(call3, "call");
                                } else if (b10.a()) {
                                    int i14 = b10.f29093b;
                                    b10.f29093b = i14 + 1;
                                    g0Var = b10.f29092a.get(i14);
                                    e eVar2 = new e(this.f29039a, g0Var);
                                    this.f29041c.L = eVar2;
                                    eVar2.c(i6, i10, i11, z10, this.f29041c, this.f29042d);
                                    this.f29041c.L = null;
                                    this.f29041c.f29048u.T.a(eVar2.f29059b);
                                    if (!this.f29039a.a(this.f29040b, this.f29041c, list, true)) {
                                        e eVar3 = this.f29041c.D;
                                        kotlin.jvm.internal.i.d(eVar3);
                                        this.f29047j = g0Var;
                                        Socket socket = eVar2.f29061d;
                                        kotlin.jvm.internal.i.d(socket);
                                        mv.b.e(socket);
                                        o oVar4 = this.f29042d;
                                        d call4 = this.f29041c;
                                        oVar4.getClass();
                                        kotlin.jvm.internal.i.g(call4, "call");
                                        z12 = z11;
                                        eVar = eVar3;
                                        if (eVar.j(z12)) {
                                        }
                                    } else {
                                        synchronized (eVar2) {
                                            i iVar = this.f29039a;
                                            iVar.getClass();
                                            byte[] bArr = mv.b.f25755a;
                                            iVar.f29084e.add(eVar2);
                                            iVar.f29082c.c(iVar.f29083d, 0L);
                                            this.f29041c.b(eVar2);
                                            k kVar3 = k.f19476a;
                                        }
                                        o oVar5 = this.f29042d;
                                        d call5 = this.f29041c;
                                        oVar5.getClass();
                                        kotlin.jvm.internal.i.g(call5, "call");
                                        eVar = eVar2;
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                throw new IOException("Canceled");
                            }
                        }
                    }
                    eVar2.c(i6, i10, i11, z10, this.f29041c, this.f29042d);
                    this.f29041c.L = null;
                    this.f29041c.f29048u.T.a(eVar2.f29059b);
                    if (!this.f29039a.a(this.f29040b, this.f29041c, list, true)) {
                    }
                } catch (Throwable th2) {
                    this.f29041c.L = null;
                    throw th2;
                }
                list = null;
                e eVar22 = new e(this.f29039a, g0Var);
                this.f29041c.L = eVar22;
            }
            z12 = z11;
            if (eVar.j(z12)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(t url) {
        kotlin.jvm.internal.i.g(url, "url");
        t tVar = this.f29040b.f24535i;
        if (url.f24690e == tVar.f24690e && kotlin.jvm.internal.i.b(url.f24689d, tVar.f24689d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException e10) {
        kotlin.jvm.internal.i.g(e10, "e");
        this.f29047j = null;
        if (e10 instanceof StreamResetException) {
            if (((StreamResetException) e10).f27606u == sv.a.REFUSED_STREAM) {
                this.f29044g++;
                return;
            }
        }
        if (e10 instanceof ConnectionShutdownException) {
            this.f29045h++;
        } else {
            this.f29046i++;
        }
    }
}
