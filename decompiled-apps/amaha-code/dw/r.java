package dw;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dw.x;
import java.io.IOException;
import java.util.ArrayList;
import lv.d0;
import lv.e;
import lv.f0;
import lv.p;
import lv.s;
import lv.t;
import lv.w;
import lv.z;
/* compiled from: OkHttpCall.java */
/* loaded from: classes2.dex */
public final class r<T> implements dw.b<T> {
    public Throwable A;
    public boolean B;

    /* renamed from: u  reason: collision with root package name */
    public final y f13587u;

    /* renamed from: v  reason: collision with root package name */
    public final Object[] f13588v;

    /* renamed from: w  reason: collision with root package name */
    public final e.a f13589w;

    /* renamed from: x  reason: collision with root package name */
    public final f<lv.e0, T> f13590x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f13591y;

    /* renamed from: z  reason: collision with root package name */
    public lv.e f13592z;

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes2.dex */
    public class a implements lv.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13593a;

        public a(d dVar) {
            this.f13593a = dVar;
        }

        @Override // lv.f
        public final void a(pv.d dVar, IOException iOException) {
            try {
                this.f13593a.onFailure(r.this, iOException);
            } catch (Throwable th2) {
                e0.m(th2);
                th2.printStackTrace();
            }
        }

        @Override // lv.f
        public final void b(pv.d dVar, lv.d0 d0Var) {
            d dVar2 = this.f13593a;
            r rVar = r.this;
            try {
                try {
                    dVar2.onResponse(rVar, rVar.c(d0Var));
                } catch (Throwable th2) {
                    e0.m(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                e0.m(th3);
                try {
                    dVar2.onFailure(rVar, th3);
                } catch (Throwable th4) {
                    e0.m(th4);
                    th4.printStackTrace();
                }
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes2.dex */
    public static final class b extends lv.e0 {

        /* renamed from: v  reason: collision with root package name */
        public final lv.e0 f13595v;

        /* renamed from: w  reason: collision with root package name */
        public final zv.t f13596w;

        /* renamed from: x  reason: collision with root package name */
        public IOException f13597x;

        /* compiled from: OkHttpCall.java */
        /* loaded from: classes2.dex */
        public class a extends zv.k {
            public a(zv.h hVar) {
                super(hVar);
            }

            @Override // zv.k, zv.z
            public final long o0(zv.e eVar, long j10) {
                try {
                    return super.o0(eVar, j10);
                } catch (IOException e10) {
                    b.this.f13597x = e10;
                    throw e10;
                }
            }
        }

        public b(lv.e0 e0Var) {
            this.f13595v = e0Var;
            this.f13596w = ta.v.j(new a(e0Var.g()));
        }

        @Override // lv.e0
        public final long a() {
            return this.f13595v.a();
        }

        @Override // lv.e0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f13595v.close();
        }

        @Override // lv.e0
        public final lv.v e() {
            return this.f13595v.e();
        }

        @Override // lv.e0
        public final zv.h g() {
            return this.f13596w;
        }
    }

    /* compiled from: OkHttpCall.java */
    /* loaded from: classes2.dex */
    public static final class c extends lv.e0 {

        /* renamed from: v  reason: collision with root package name */
        public final lv.v f13599v;

        /* renamed from: w  reason: collision with root package name */
        public final long f13600w;

        public c(lv.v vVar, long j10) {
            this.f13599v = vVar;
            this.f13600w = j10;
        }

        @Override // lv.e0
        public final long a() {
            return this.f13600w;
        }

        @Override // lv.e0
        public final lv.v e() {
            return this.f13599v;
        }

        @Override // lv.e0
        public final zv.h g() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public r(y yVar, Object[] objArr, e.a aVar, f<lv.e0, T> fVar) {
        this.f13587u = yVar;
        this.f13588v = objArr;
        this.f13589w = aVar;
        this.f13590x = fVar;
    }

    @Override // dw.b
    public final void I(d<T> dVar) {
        lv.e eVar;
        Throwable th2;
        synchronized (this) {
            if (!this.B) {
                this.B = true;
                eVar = this.f13592z;
                th2 = this.A;
                if (eVar == null && th2 == null) {
                    lv.e a10 = a();
                    this.f13592z = a10;
                    eVar = a10;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.onFailure(this, th2);
            return;
        }
        if (this.f13591y) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new a(dVar));
    }

    public final lv.e a() {
        t.a aVar;
        lv.t a10;
        y yVar = this.f13587u;
        yVar.getClass();
        Object[] objArr = this.f13588v;
        int length = objArr.length;
        v<?>[] vVarArr = yVar.f13670j;
        if (length == vVarArr.length) {
            x xVar = new x(yVar.f13664c, yVar.f13663b, yVar.f13665d, yVar.f13666e, yVar.f, yVar.f13667g, yVar.f13668h, yVar.f13669i);
            if (yVar.f13671k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i6 = 0; i6 < length; i6++) {
                arrayList.add(objArr[i6]);
                vVarArr[i6].a(xVar, objArr[i6]);
            }
            t.a aVar2 = xVar.f13653d;
            if (aVar2 != null) {
                a10 = aVar2.a();
            } else {
                String link = xVar.f13652c;
                lv.t tVar = xVar.f13651b;
                tVar.getClass();
                kotlin.jvm.internal.i.g(link, "link");
                try {
                    aVar = new t.a();
                    aVar.d(tVar, link);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    a10 = null;
                } else {
                    a10 = aVar.a();
                }
                if (a10 == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + tVar + ", Relative: " + xVar.f13652c);
                }
            }
            x.a aVar3 = xVar.f13659k;
            if (aVar3 == null) {
                p.a aVar4 = xVar.f13658j;
                if (aVar4 != null) {
                    aVar3 = new lv.p(aVar4.f24674b, aVar4.f24675c);
                } else {
                    w.a aVar5 = xVar.f13657i;
                    if (aVar5 != null) {
                        ArrayList arrayList2 = aVar5.f24717c;
                        if (!arrayList2.isEmpty()) {
                            aVar3 = new lv.w(aVar5.f24715a, aVar5.f24716b, mv.b.x(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (xVar.f13656h) {
                        long j10 = 0;
                        mv.b.c(j10, j10, j10);
                        aVar3 = new lv.b0(null, new byte[0], 0, 0);
                    }
                }
            }
            lv.v vVar = xVar.f13655g;
            s.a aVar6 = xVar.f;
            if (vVar != null) {
                if (aVar3 != null) {
                    aVar3 = new x.a(aVar3, vVar);
                } else {
                    aVar6.a("Content-Type", vVar.f24704a);
                }
            }
            z.a aVar7 = xVar.f13654e;
            aVar7.getClass();
            aVar7.f24756a = a10;
            aVar7.f24758c = aVar6.d().o();
            aVar7.c(xVar.f13650a, aVar3);
            aVar7.d(j.class, new j(yVar.f13662a, arrayList));
            pv.d a11 = this.f13589w.a(aVar7.a());
            if (a11 != null) {
                return a11;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(pl.a.g(defpackage.c.u("Argument count (", length, ") doesn't match expected count ("), vVarArr.length, ")"));
    }

    public final lv.e b() {
        lv.e eVar = this.f13592z;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.A;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            lv.e a10 = a();
            this.f13592z = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            e0.m(e10);
            this.A = e10;
            throw e10;
        }
    }

    public final z<T> c(lv.d0 d0Var) {
        lv.e0 e0Var = d0Var.A;
        d0.a aVar = new d0.a(d0Var);
        aVar.f24594g = new c(e0Var.e(), e0Var.a());
        lv.d0 a10 = aVar.a();
        boolean z10 = true;
        int i6 = a10.f24586x;
        if (i6 >= 200 && i6 < 300) {
            if (i6 != 204 && i6 != 205) {
                b bVar = new b(e0Var);
                try {
                    T a11 = this.f13590x.a(bVar);
                    if (200 > i6 || i6 >= 300) {
                        z10 = false;
                    }
                    if (z10) {
                        return new z<>(a10, a11, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e10) {
                    IOException iOException = bVar.f13597x;
                    if (iOException == null) {
                        throw e10;
                    }
                    throw iOException;
                }
            }
            if ((200 > i6 || i6 >= 300) ? false : false) {
                return new z<>(a10, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            zv.e eVar = new zv.e();
            e0Var.g().S(eVar);
            f0 f0Var = new f0(e0Var.e(), e0Var.a(), eVar);
            if (200 > i6 || i6 >= 300) {
                z10 = false;
            }
            if (!z10) {
                return new z<>(a10, null, f0Var);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            e0Var.close();
        }
    }

    @Override // dw.b
    public final void cancel() {
        lv.e eVar;
        this.f13591y = true;
        synchronized (this) {
            eVar = this.f13592z;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // dw.b
    public final dw.b clone() {
        return new r(this.f13587u, this.f13588v, this.f13589w, this.f13590x);
    }

    @Override // dw.b
    public final z<T> g() {
        lv.e b10;
        synchronized (this) {
            if (!this.B) {
                this.B = true;
                b10 = b();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f13591y) {
            b10.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(b10));
    }

    @Override // dw.b
    public final boolean o() {
        boolean z10 = true;
        if (this.f13591y) {
            return true;
        }
        synchronized (this) {
            lv.e eVar = this.f13592z;
            if (eVar == null || !eVar.o()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // dw.b
    public final synchronized lv.z s() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().s();
    }

    @Override // dw.b
    public final Object clone() {
        return new r(this.f13587u, this.f13588v, this.f13589w, this.f13590x);
    }
}
