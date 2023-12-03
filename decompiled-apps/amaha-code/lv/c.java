package lv;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import lv.h0;
import lv.s;
import lv.t;
import lv.v;
import nv.e;
import qv.i;
import zv.e;
import zv.i;
/* compiled from: Cache.kt */
/* loaded from: classes2.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: u  reason: collision with root package name */
    public final nv.e f24545u;

    /* compiled from: Cache.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e0 {

        /* renamed from: v  reason: collision with root package name */
        public final e.c f24546v;

        /* renamed from: w  reason: collision with root package name */
        public final String f24547w;

        /* renamed from: x  reason: collision with root package name */
        public final String f24548x;

        /* renamed from: y  reason: collision with root package name */
        public final zv.t f24549y;

        /* compiled from: Cache.kt */
        /* renamed from: lv.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0394a extends zv.k {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ zv.z f24550v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f24551w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0394a(zv.z zVar, a aVar) {
                super(zVar);
                this.f24550v = zVar;
                this.f24551w = aVar;
            }

            @Override // zv.k, zv.z, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.f24551w.f24546v.close();
                super.close();
            }
        }

        public a(e.c cVar, String str, String str2) {
            this.f24546v = cVar;
            this.f24547w = str;
            this.f24548x = str2;
            this.f24549y = ta.v.j(new C0394a(cVar.f26876w.get(1), this));
        }

        @Override // lv.e0
        public final long a() {
            String str = this.f24548x;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = mv.b.f25755a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // lv.e0
        public final v e() {
            String str = this.f24547w;
            if (str == null) {
                return null;
            }
            Pattern pattern = v.f24702d;
            return v.a.b(str);
        }

        @Override // lv.e0
        public final zv.h g() {
            return this.f24549y;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static String a(t url) {
            kotlin.jvm.internal.i.g(url, "url");
            zv.i iVar = zv.i.f39888x;
            return i.a.c(url.f24693i).f("MD5").i();
        }

        public static int b(zv.t tVar) {
            boolean z10;
            try {
                long e10 = tVar.e();
                String j02 = tVar.j0();
                if (e10 >= 0 && e10 <= 2147483647L) {
                    if (j02.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return (int) e10;
                    }
                }
                throw new IOException("expected an int but was \"" + e10 + j02 + '\"');
            } catch (NumberFormatException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        public static Set c(s sVar) {
            int length = sVar.f24683u.length / 2;
            TreeSet treeSet = null;
            int i6 = 0;
            while (i6 < length) {
                int i10 = i6 + 1;
                if (gv.n.A0("Vary", sVar.m(i6), true)) {
                    String q10 = sVar.q(i6);
                    if (treeSet == null) {
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        kotlin.jvm.internal.i.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    for (String str : gv.r.Z0(q10, new char[]{','})) {
                        treeSet.add(gv.r.i1(str).toString());
                    }
                }
                i6 = i10;
            }
            if (treeSet == null) {
                return is.y.f20678u;
            }
            return treeSet;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes2.dex */
    public final class d implements nv.c {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f24563a;

        /* renamed from: b  reason: collision with root package name */
        public final zv.x f24564b;

        /* renamed from: c  reason: collision with root package name */
        public final a f24565c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24566d;

        /* compiled from: Cache.kt */
        /* loaded from: classes2.dex */
        public static final class a extends zv.j {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f24568v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f24569w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, d dVar, zv.x xVar) {
                super(xVar);
                this.f24568v = cVar;
                this.f24569w = dVar;
            }

            @Override // zv.j, zv.x, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                c cVar = this.f24568v;
                d dVar = this.f24569w;
                synchronized (cVar) {
                    if (dVar.f24566d) {
                        return;
                    }
                    dVar.f24566d = true;
                    super.close();
                    this.f24569w.f24563a.b();
                }
            }
        }

        public d(e.a aVar) {
            this.f24563a = aVar;
            zv.x d10 = aVar.d(1);
            this.f24564b = d10;
            this.f24565c = new a(c.this, this, d10);
        }

        @Override // nv.c
        public final void abort() {
            synchronized (c.this) {
                if (this.f24566d) {
                    return;
                }
                this.f24566d = true;
                mv.b.d(this.f24564b);
                try {
                    this.f24563a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public c(File file, long j10) {
        this.f24545u = new nv.e(file, j10, ov.d.f27799i);
    }

    public final void a() {
        nv.e eVar = this.f24545u;
        synchronized (eVar) {
            eVar.j();
            Collection<e.b> values = eVar.E.values();
            kotlin.jvm.internal.i.f(values, "lruEntries.values");
            Object[] array = values.toArray(new e.b[0]);
            if (array != null) {
                e.b[] bVarArr = (e.b[]) array;
                int length = bVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    e.b entry = bVarArr[i6];
                    i6++;
                    kotlin.jvm.internal.i.f(entry, "entry");
                    eVar.J(entry);
                }
                eVar.K = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24545u.close();
    }

    public final void e(z request) {
        kotlin.jvm.internal.i.g(request, "request");
        nv.e eVar = this.f24545u;
        String key = b.a(request.f24751a);
        synchronized (eVar) {
            kotlin.jvm.internal.i.g(key, "key");
            eVar.j();
            eVar.a();
            nv.e.R(key);
            e.b bVar = eVar.E.get(key);
            if (bVar != null) {
                eVar.J(bVar);
                if (eVar.C <= eVar.f26857y) {
                    eVar.K = false;
                }
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f24545u.flush();
    }

    public final synchronized void g() {
    }

    /* compiled from: Cache.kt */
    /* renamed from: lv.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0395c {

        /* renamed from: k  reason: collision with root package name */
        public static final String f24552k;

        /* renamed from: l  reason: collision with root package name */
        public static final String f24553l;

        /* renamed from: a  reason: collision with root package name */
        public final t f24554a;

        /* renamed from: b  reason: collision with root package name */
        public final s f24555b;

        /* renamed from: c  reason: collision with root package name */
        public final String f24556c;

        /* renamed from: d  reason: collision with root package name */
        public final y f24557d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24558e;
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public final s f24559g;

        /* renamed from: h  reason: collision with root package name */
        public final r f24560h;

        /* renamed from: i  reason: collision with root package name */
        public final long f24561i;

        /* renamed from: j  reason: collision with root package name */
        public final long f24562j;

        static {
            uv.h hVar = uv.h.f34614a;
            uv.h.f34614a.getClass();
            f24552k = kotlin.jvm.internal.i.n("-Sent-Millis", "OkHttp");
            uv.h.f34614a.getClass();
            f24553l = kotlin.jvm.internal.i.n("-Received-Millis", "OkHttp");
        }

        public C0395c(zv.z rawSource) {
            t tVar;
            h0 h0Var;
            kotlin.jvm.internal.i.g(rawSource, "rawSource");
            try {
                zv.t j10 = ta.v.j(rawSource);
                String j02 = j10.j0();
                try {
                    t.a aVar = new t.a();
                    aVar.d(null, j02);
                    tVar = aVar.a();
                } catch (IllegalArgumentException unused) {
                    tVar = null;
                }
                if (tVar != null) {
                    this.f24554a = tVar;
                    this.f24556c = j10.j0();
                    s.a aVar2 = new s.a();
                    int b10 = b.b(j10);
                    int i6 = 0;
                    while (i6 < b10) {
                        i6++;
                        aVar2.b(j10.j0());
                    }
                    this.f24555b = aVar2.d();
                    qv.i a10 = i.a.a(j10.j0());
                    this.f24557d = a10.f30158a;
                    this.f24558e = a10.f30159b;
                    this.f = a10.f30160c;
                    s.a aVar3 = new s.a();
                    int b11 = b.b(j10);
                    int i10 = 0;
                    while (i10 < b11) {
                        i10++;
                        aVar3.b(j10.j0());
                    }
                    String str = f24552k;
                    String e10 = aVar3.e(str);
                    String str2 = f24553l;
                    String e11 = aVar3.e(str2);
                    aVar3.f(str);
                    aVar3.f(str2);
                    long j11 = 0;
                    this.f24561i = e10 == null ? 0L : Long.parseLong(e10);
                    if (e11 != null) {
                        j11 = Long.parseLong(e11);
                    }
                    this.f24562j = j11;
                    this.f24559g = aVar3.d();
                    if (kotlin.jvm.internal.i.b(this.f24554a.f24686a, "https")) {
                        String j03 = j10.j0();
                        if (!(j03.length() > 0)) {
                            i b12 = i.f24624b.b(j10.j0());
                            List a11 = a(j10);
                            List a12 = a(j10);
                            if (!j10.B()) {
                                h0Var = h0.a.a(j10.j0());
                            } else {
                                h0Var = h0.SSL_3_0;
                            }
                            this.f24560h = new r(h0Var, b12, mv.b.x(a12), new q(mv.b.x(a11)));
                        } else {
                            throw new IOException("expected \"\" but was \"" + j03 + '\"');
                        }
                    } else {
                        this.f24560h = null;
                    }
                    hs.k kVar = hs.k.f19476a;
                    ca.a.z(rawSource, null);
                    return;
                }
                IOException iOException = new IOException(kotlin.jvm.internal.i.n(j02, "Cache corruption for "));
                uv.h hVar = uv.h.f34614a;
                uv.h.f34614a.getClass();
                uv.h.i(5, "cache corruption", iOException);
                throw iOException;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ca.a.z(rawSource, th2);
                    throw th3;
                }
            }
        }

        public static List a(zv.t tVar) {
            int b10 = b.b(tVar);
            if (b10 == -1) {
                return is.w.f20676u;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b10);
                int i6 = 0;
                while (i6 < b10) {
                    i6++;
                    String j02 = tVar.j0();
                    zv.e eVar = new zv.e();
                    zv.i iVar = zv.i.f39888x;
                    zv.i a10 = i.a.a(j02);
                    kotlin.jvm.internal.i.d(a10);
                    eVar.B0(a10);
                    arrayList.add(certificateFactory.generateCertificate(new e.a()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(zv.s sVar, List list) {
            try {
                sVar.E0(list.size());
                sVar.writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    zv.i iVar = zv.i.f39888x;
                    kotlin.jvm.internal.i.f(bytes, "bytes");
                    sVar.T(i.a.d(bytes).d());
                    sVar.writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(e.a aVar) {
            t tVar = this.f24554a;
            r rVar = this.f24560h;
            s sVar = this.f24559g;
            s sVar2 = this.f24555b;
            zv.s h10 = ta.v.h(aVar.d(0));
            try {
                h10.T(tVar.f24693i);
                h10.writeByte(10);
                h10.T(this.f24556c);
                h10.writeByte(10);
                h10.E0(sVar2.f24683u.length / 2);
                h10.writeByte(10);
                int length = sVar2.f24683u.length / 2;
                int i6 = 0;
                while (i6 < length) {
                    int i10 = i6 + 1;
                    h10.T(sVar2.m(i6));
                    h10.T(": ");
                    h10.T(sVar2.q(i6));
                    h10.writeByte(10);
                    i6 = i10;
                }
                y protocol = this.f24557d;
                int i11 = this.f24558e;
                String message = this.f;
                kotlin.jvm.internal.i.g(protocol, "protocol");
                kotlin.jvm.internal.i.g(message, "message");
                StringBuilder sb2 = new StringBuilder();
                if (protocol == y.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i11);
                sb2.append(' ');
                sb2.append(message);
                String sb3 = sb2.toString();
                kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
                h10.T(sb3);
                h10.writeByte(10);
                h10.E0((sVar.f24683u.length / 2) + 2);
                h10.writeByte(10);
                int length2 = sVar.f24683u.length / 2;
                for (int i12 = 0; i12 < length2; i12++) {
                    h10.T(sVar.m(i12));
                    h10.T(": ");
                    h10.T(sVar.q(i12));
                    h10.writeByte(10);
                }
                h10.T(f24552k);
                h10.T(": ");
                h10.E0(this.f24561i);
                h10.writeByte(10);
                h10.T(f24553l);
                h10.T(": ");
                h10.E0(this.f24562j);
                h10.writeByte(10);
                if (kotlin.jvm.internal.i.b(tVar.f24686a, "https")) {
                    h10.writeByte(10);
                    kotlin.jvm.internal.i.d(rVar);
                    h10.T(rVar.f24678b.f24641a);
                    h10.writeByte(10);
                    b(h10, rVar.a());
                    b(h10, rVar.f24679c);
                    h10.T(rVar.f24677a.f24623u);
                    h10.writeByte(10);
                }
                hs.k kVar = hs.k.f19476a;
                ca.a.z(h10, null);
            } finally {
            }
        }

        public C0395c(d0 d0Var) {
            s d10;
            z zVar = d0Var.f24583u;
            this.f24554a = zVar.f24751a;
            d0 d0Var2 = d0Var.B;
            kotlin.jvm.internal.i.d(d0Var2);
            s sVar = d0Var2.f24583u.f24753c;
            s sVar2 = d0Var.f24588z;
            Set c10 = b.c(sVar2);
            if (c10.isEmpty()) {
                d10 = mv.b.f25756b;
            } else {
                s.a aVar = new s.a();
                int length = sVar.f24683u.length / 2;
                int i6 = 0;
                while (i6 < length) {
                    int i10 = i6 + 1;
                    String m10 = sVar.m(i6);
                    if (c10.contains(m10)) {
                        aVar.a(m10, sVar.q(i6));
                    }
                    i6 = i10;
                }
                d10 = aVar.d();
            }
            this.f24555b = d10;
            this.f24556c = zVar.f24752b;
            this.f24557d = d0Var.f24584v;
            this.f24558e = d0Var.f24586x;
            this.f = d0Var.f24585w;
            this.f24559g = sVar2;
            this.f24560h = d0Var.f24587y;
            this.f24561i = d0Var.E;
            this.f24562j = d0Var.F;
        }
    }
}
