package sv;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import lv.d0;
import lv.s;
import lv.x;
import lv.y;
import lv.z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import qv.i;
/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes2.dex */
public final class o implements qv.d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f32165g = mv.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f32166h = mv.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final pv.e f32167a;

    /* renamed from: b  reason: collision with root package name */
    public final qv.f f32168b;

    /* renamed from: c  reason: collision with root package name */
    public final e f32169c;

    /* renamed from: d  reason: collision with root package name */
    public volatile q f32170d;

    /* renamed from: e  reason: collision with root package name */
    public final y f32171e;
    public volatile boolean f;

    public o(x xVar, pv.e connection, qv.f fVar, e eVar) {
        kotlin.jvm.internal.i.g(connection, "connection");
        this.f32167a = connection;
        this.f32168b = fVar;
        this.f32169c = eVar;
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f32171e = xVar.M.contains(yVar) ? yVar : y.HTTP_2;
    }

    @Override // qv.d
    public final void a(z zVar) {
        boolean z10;
        String d10;
        int i6;
        q qVar;
        if (this.f32170d != null) {
            return;
        }
        boolean z11 = false;
        if (zVar.f24754d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        lv.s sVar = zVar.f24753c;
        ArrayList arrayList = new ArrayList((sVar.f24683u.length / 2) + 4);
        arrayList.add(new b(b.f, zVar.f24752b));
        zv.i iVar = b.f32099g;
        lv.t url = zVar.f24751a;
        kotlin.jvm.internal.i.g(url, "url");
        String b10 = url.b();
        if (url.d() != null) {
            b10 = b10 + '?' + ((Object) d10);
        }
        arrayList.add(new b(iVar, b10));
        String g5 = zVar.f24753c.g("Host");
        if (g5 != null) {
            arrayList.add(new b(b.f32101i, g5));
        }
        arrayList.add(new b(b.f32100h, url.f24686a));
        int length = sVar.f24683u.length / 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String m10 = sVar.m(i10);
            Locale locale = Locale.US;
            String e10 = ri.e.e(locale, "US", m10, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f32165g.contains(e10) || (kotlin.jvm.internal.i.b(e10, "te") && kotlin.jvm.internal.i.b(sVar.q(i10), "trailers"))) {
                arrayList.add(new b(e10, sVar.q(i10)));
            }
            i10 = i11;
        }
        e eVar = this.f32169c;
        eVar.getClass();
        boolean z12 = !z10;
        synchronized (eVar.S) {
            synchronized (eVar) {
                if (eVar.f32132z > 1073741823) {
                    eVar.m(a.REFUSED_STREAM);
                }
                if (!eVar.A) {
                    i6 = eVar.f32132z;
                    eVar.f32132z = i6 + 2;
                    qVar = new q(i6, eVar, z12, false, null);
                    z11 = (!z10 || eVar.P >= eVar.Q || qVar.f32187e >= qVar.f) ? true : true;
                    if (qVar.i()) {
                        eVar.f32129w.put(Integer.valueOf(i6), qVar);
                    }
                    hs.k kVar = hs.k.f19476a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            eVar.S.h(i6, arrayList, z12);
        }
        if (z11) {
            eVar.S.flush();
        }
        this.f32170d = qVar;
        if (!this.f) {
            q qVar2 = this.f32170d;
            kotlin.jvm.internal.i.d(qVar2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qVar2.f32192k.g(this.f32168b.f30151g, timeUnit);
            q qVar3 = this.f32170d;
            kotlin.jvm.internal.i.d(qVar3);
            qVar3.f32193l.g(this.f32168b.f30152h, timeUnit);
            return;
        }
        q qVar4 = this.f32170d;
        kotlin.jvm.internal.i.d(qVar4);
        qVar4.e(a.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // qv.d
    public final void b() {
        q qVar = this.f32170d;
        kotlin.jvm.internal.i.d(qVar);
        qVar.g().close();
    }

    @Override // qv.d
    public final d0.a c(boolean z10) {
        lv.s sVar;
        q qVar = this.f32170d;
        kotlin.jvm.internal.i.d(qVar);
        synchronized (qVar) {
            qVar.f32192k.h();
            while (qVar.f32188g.isEmpty() && qVar.f32194m == null) {
                qVar.l();
            }
            qVar.f32192k.l();
            if (!qVar.f32188g.isEmpty()) {
                lv.s removeFirst = qVar.f32188g.removeFirst();
                kotlin.jvm.internal.i.f(removeFirst, "headersQueue.removeFirst()");
                sVar = removeFirst;
            } else {
                IOException iOException = qVar.f32195n;
                if (iOException == null) {
                    a aVar = qVar.f32194m;
                    kotlin.jvm.internal.i.d(aVar);
                    throw new StreamResetException(aVar);
                }
                throw iOException;
            }
        }
        y protocol = this.f32171e;
        kotlin.jvm.internal.i.g(protocol, "protocol");
        s.a aVar2 = new s.a();
        int length = sVar.f24683u.length / 2;
        int i6 = 0;
        qv.i iVar = null;
        while (i6 < length) {
            int i10 = i6 + 1;
            String m10 = sVar.m(i6);
            String q10 = sVar.q(i6);
            if (kotlin.jvm.internal.i.b(m10, ":status")) {
                iVar = i.a.a(kotlin.jvm.internal.i.n(q10, "HTTP/1.1 "));
            } else if (!f32166h.contains(m10)) {
                aVar2.c(m10, q10);
            }
            i6 = i10;
        }
        if (iVar != null) {
            d0.a aVar3 = new d0.a();
            aVar3.f24590b = protocol;
            aVar3.f24591c = iVar.f30159b;
            String message = iVar.f30160c;
            kotlin.jvm.internal.i.g(message, "message");
            aVar3.f24592d = message;
            aVar3.c(aVar2.d());
            if (z10 && aVar3.f24591c == 100) {
                return null;
            }
            return aVar3;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // qv.d
    public final void cancel() {
        this.f = true;
        q qVar = this.f32170d;
        if (qVar != null) {
            qVar.e(a.CANCEL);
        }
    }

    @Override // qv.d
    public final pv.e d() {
        return this.f32167a;
    }

    @Override // qv.d
    public final zv.x e(z zVar, long j10) {
        q qVar = this.f32170d;
        kotlin.jvm.internal.i.d(qVar);
        return qVar.g();
    }

    @Override // qv.d
    public final long f(d0 d0Var) {
        if (!qv.e.a(d0Var)) {
            return 0L;
        }
        return mv.b.k(d0Var);
    }

    @Override // qv.d
    public final void g() {
        this.f32169c.flush();
    }

    @Override // qv.d
    public final zv.z h(d0 d0Var) {
        q qVar = this.f32170d;
        kotlin.jvm.internal.i.d(qVar);
        return qVar.f32190i;
    }
}
