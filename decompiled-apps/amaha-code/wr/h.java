package wr;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.c0;
import tr.d0;
import tr.i0;
import tr.y;
import tr.z;
import vr.a;
import vr.e;
import vr.g3;
import vr.k3;
import vr.m3;
import vr.n1;
import vr.s;
import vr.s2;
import vr.u0;
import vr.x0;
import wr.o;
/* compiled from: OkHttpClientStream.java */
/* loaded from: classes2.dex */
public final class h extends vr.a {

    /* renamed from: p  reason: collision with root package name */
    public static final zv.e f37117p = new zv.e();

    /* renamed from: h  reason: collision with root package name */
    public final d0<?, ?> f37118h;

    /* renamed from: i  reason: collision with root package name */
    public final String f37119i;

    /* renamed from: j  reason: collision with root package name */
    public final g3 f37120j;

    /* renamed from: k  reason: collision with root package name */
    public String f37121k;

    /* renamed from: l  reason: collision with root package name */
    public final b f37122l;

    /* renamed from: m  reason: collision with root package name */
    public final a f37123m;

    /* renamed from: n  reason: collision with root package name */
    public final io.grpc.a f37124n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f37125o;

    /* compiled from: OkHttpClientStream.java */
    /* loaded from: classes2.dex */
    public class a {
        public a() {
        }

        public final void a(c0 c0Var, byte[] bArr) {
            fs.b.c();
            String str = "/" + h.this.f37118h.f33451b;
            if (bArr != null) {
                h.this.f37125o = true;
                StringBuilder d10 = v.g.d(str, "?");
                d10.append(BaseEncoding.f9523a.c(bArr));
                str = d10.toString();
            }
            try {
                synchronized (h.this.f37122l.f37128x) {
                    b.o(h.this.f37122l, c0Var, str);
                }
            } finally {
                fs.b.e();
            }
        }
    }

    /* compiled from: OkHttpClientStream.java */
    /* loaded from: classes2.dex */
    public class b extends x0 implements o.a {
        public boolean A;
        public boolean B;
        public boolean C;
        public int D;
        public int E;
        public final wr.b F;
        public final o G;
        public final i H;
        public boolean I;
        public final fs.c J;
        public o.b K;
        public int L;

        /* renamed from: w  reason: collision with root package name */
        public final int f37127w;

        /* renamed from: x  reason: collision with root package name */
        public final Object f37128x;

        /* renamed from: y  reason: collision with root package name */
        public ArrayList f37129y;

        /* renamed from: z  reason: collision with root package name */
        public final zv.e f37130z;

        public b(int i6, g3 g3Var, Object obj, wr.b bVar, o oVar, i iVar, int i10) {
            super(i6, g3Var, h.this.f35360a);
            this.f37130z = new zv.e();
            this.A = false;
            this.B = false;
            this.C = false;
            this.I = true;
            this.L = -1;
            sc.b.w(obj, "lock");
            this.f37128x = obj;
            this.F = bVar;
            this.G = oVar;
            this.H = iVar;
            this.D = i10;
            this.E = i10;
            this.f37127w = i10;
            fs.b.f15847a.getClass();
            this.J = fs.a.f15845a;
        }

        public static void o(b bVar, c0 c0Var, String str) {
            boolean z10;
            boolean z11;
            h hVar = h.this;
            String str2 = hVar.f37121k;
            boolean z12 = hVar.f37125o;
            i iVar = bVar.H;
            if (iVar.B == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yr.d dVar = d.f37090a;
            sc.b.w(c0Var, "headers");
            sc.b.w(str, "defaultPath");
            sc.b.w(str2, "authority");
            c0Var.a(u0.f35980i);
            c0Var.a(u0.f35981j);
            c0.b bVar2 = u0.f35982k;
            c0Var.a(bVar2);
            ArrayList arrayList = new ArrayList(c0Var.f33443b + 7);
            if (z10) {
                arrayList.add(d.f37091b);
            } else {
                arrayList.add(d.f37090a);
            }
            if (z12) {
                arrayList.add(d.f37093d);
            } else {
                arrayList.add(d.f37092c);
            }
            arrayList.add(new yr.d(yr.d.f38927h, str2));
            arrayList.add(new yr.d(yr.d.f, str));
            arrayList.add(new yr.d(bVar2.f33446a, hVar.f37119i));
            arrayList.add(d.f37094e);
            arrayList.add(d.f);
            Logger logger = k3.f35747a;
            Charset charset = y.f33590a;
            int i6 = c0Var.f33443b * 2;
            byte[][] bArr = new byte[i6];
            Object[] objArr = c0Var.f33442a;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i6);
            } else {
                for (int i10 = 0; i10 < c0Var.f33443b; i10++) {
                    int i11 = i10 * 2;
                    bArr[i11] = c0Var.e(i10);
                    bArr[i11 + 1] = c0Var.g(i10);
                }
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i6; i13 += 2) {
                byte[] bArr2 = bArr[i13];
                byte[] bArr3 = bArr[i13 + 1];
                if (k3.a(bArr2, k3.f35748b)) {
                    bArr[i12] = bArr2;
                    bArr[i12 + 1] = y.f33591b.c(bArr3).getBytes(nc.c.f25986a);
                } else {
                    for (byte b10 : bArr3) {
                        if (b10 < 32 || b10 > 126) {
                            z11 = false;
                            break;
                        }
                    }
                    z11 = true;
                    if (z11) {
                        bArr[i12] = bArr2;
                        bArr[i12 + 1] = bArr3;
                    } else {
                        StringBuilder g5 = defpackage.d.g("Metadata key=", new String(bArr2, nc.c.f25986a), ", value=");
                        g5.append(Arrays.toString(bArr3));
                        g5.append(" contains invalid ASCII characters");
                        k3.f35747a.warning(g5.toString());
                    }
                }
                i12 += 2;
            }
            if (i12 != i6) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i12);
            }
            for (int i14 = 0; i14 < bArr.length; i14 += 2) {
                zv.i l2 = zv.i.l(bArr[i14]);
                byte[] bArr4 = l2.f39889u;
                if (bArr4.length != 0 && bArr4[0] != 58) {
                    arrayList.add(new yr.d(l2, zv.i.l(bArr[i14 + 1])));
                }
            }
            bVar.f37129y = arrayList;
            i0 i0Var = iVar.f37150v;
            if (i0Var != null) {
                hVar.f37122l.l(i0Var, s.a.MISCARRIED, true, new c0());
            } else if (iVar.f37143n.size() >= iVar.D) {
                iVar.E.add(hVar);
                if (!iVar.f37154z) {
                    iVar.f37154z = true;
                    n1 n1Var = iVar.G;
                    if (n1Var != null) {
                        n1Var.b();
                    }
                }
                if (hVar.f35362c) {
                    iVar.P.c(hVar, true);
                }
            } else {
                iVar.v(hVar);
            }
        }

        public static void p(b bVar, zv.e eVar, boolean z10, boolean z11) {
            boolean z12;
            if (!bVar.C) {
                if (bVar.I) {
                    bVar.f37130z.n(eVar, (int) eVar.f39885v);
                    bVar.A |= z10;
                    bVar.B |= z11;
                    return;
                }
                if (bVar.L != -1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.B("streamId should be set", z12);
                bVar.G.a(z10, bVar.K, eVar, z11);
            }
        }

        @Override // vr.h2.a
        public final void c(boolean z10) {
            boolean z11 = this.f35377o;
            s.a aVar = s.a.PROCESSED;
            if (!z11) {
                this.H.l(this.L, null, aVar, false, yr.a.CANCEL, null);
            } else {
                this.H.l(this.L, null, aVar, false, null, null);
            }
            sc.b.B("status should have been reported on deframer closed", this.f35378p);
            this.f35375m = true;
            if (this.f35379q && z10) {
                k(new c0(), i0.f33487l.g("Encountered end-of-stream mid-frame"), true);
            }
            a.b.RunnableC0602a runnableC0602a = this.f35376n;
            if (runnableC0602a != null) {
                runnableC0602a.run();
                this.f35376n = null;
            }
        }

        @Override // vr.h2.a
        public final void d(int i6) {
            int i10 = this.E - i6;
            this.E = i10;
            int i11 = this.f37127w;
            if (i10 <= i11 * 0.5f) {
                int i12 = i11 - i10;
                this.D += i12;
                this.E = i10 + i12;
                this.F.f(this.L, i12);
            }
        }

        @Override // vr.h2.a
        public final void e(Throwable th2) {
            q(new c0(), i0.d(th2), true);
        }

        @Override // vr.h.d
        public final void f(Runnable runnable) {
            synchronized (this.f37128x) {
                runnable.run();
            }
        }

        public final void q(c0 c0Var, i0 i0Var, boolean z10) {
            if (this.C) {
                return;
            }
            this.C = true;
            if (this.I) {
                i iVar = this.H;
                LinkedList linkedList = iVar.E;
                h hVar = h.this;
                linkedList.remove(hVar);
                iVar.q(hVar);
                this.f37129y = null;
                this.f37130z.a();
                this.I = false;
                if (c0Var == null) {
                    c0Var = new c0();
                }
                k(c0Var, i0Var, true);
                return;
            }
            this.H.l(this.L, i0Var, s.a.PROCESSED, z10, yr.a.CANCEL, c0Var);
        }

        public final o.b r() {
            o.b bVar;
            synchronized (this.f37128x) {
                bVar = this.K;
            }
            return bVar;
        }

        public final void s(zv.e eVar, boolean z10) {
            long j10 = eVar.f39885v;
            int i6 = this.D - ((int) j10);
            this.D = i6;
            if (i6 < 0) {
                this.F.N(this.L, yr.a.FLOW_CONTROL_ERROR);
                this.H.l(this.L, i0.f33487l.g("Received data size exceeded our receiving window size"), s.a.PROCESSED, false, null, null);
                return;
            }
            l lVar = new l(eVar);
            i0 i0Var = this.r;
            boolean z11 = false;
            if (i0Var != null) {
                Charset charset = this.f36115t;
                s2.b bVar = s2.f35952a;
                sc.b.w(charset, "charset");
                int i10 = (int) eVar.f39885v;
                byte[] bArr = new byte[i10];
                lVar.K(0, bArr, i10);
                this.r = i0Var.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
                lVar.close();
                if (this.r.f33492b.length() > 1000 || z10) {
                    q(this.f36114s, this.r, false);
                }
            } else if (!this.f36116u) {
                q(new c0(), i0.f33487l.g("headers not received before payload"), false);
            } else {
                int i11 = (int) j10;
                try {
                    if (this.f35378p) {
                        vr.a.f35359g.log(Level.INFO, "Received data on closed stream");
                        lVar.close();
                    } else {
                        try {
                            this.f35521a.m(lVar);
                        } catch (Throwable th2) {
                            try {
                                e(th2);
                            } catch (Throwable th3) {
                                th = th3;
                                if (z11) {
                                    lVar.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (z10) {
                        if (i11 > 0) {
                            this.r = i0.f33487l.g("Received unexpected EOS on non-empty DATA frame from server");
                        } else {
                            this.r = i0.f33487l.g("Received unexpected EOS on empty DATA frame from server");
                        }
                        c0 c0Var = new c0();
                        this.f36114s = c0Var;
                        k(c0Var, this.r, false);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z11 = true;
                }
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void t(ArrayList arrayList, boolean z10) {
            i0 n10;
            StringBuilder sb2;
            i0 g5;
            i0 a10;
            c0.f fVar = x0.f36113v;
            if (z10) {
                byte[][] a11 = p.a(arrayList);
                Charset charset = y.f33590a;
                c0 c0Var = new c0(a11);
                if (this.r == null && !this.f36116u) {
                    i0 n11 = x0.n(c0Var);
                    this.r = n11;
                    if (n11 != null) {
                        this.f36114s = c0Var;
                    }
                }
                i0 i0Var = this.r;
                if (i0Var != null) {
                    i0 a12 = i0Var.a("trailers: " + c0Var);
                    this.r = a12;
                    q(this.f36114s, a12, false);
                    return;
                }
                c0.f fVar2 = z.f33593b;
                i0 i0Var2 = (i0) c0Var.c(fVar2);
                if (i0Var2 != null) {
                    a10 = i0Var2.g((String) c0Var.c(z.f33592a));
                } else if (this.f36116u) {
                    a10 = i0.f33482g.g("missing GRPC status in response");
                } else {
                    Integer num = (Integer) c0Var.c(fVar);
                    if (num != null) {
                        g5 = u0.f(num.intValue());
                    } else {
                        g5 = i0.f33487l.g("missing HTTP status code");
                    }
                    a10 = g5.a("missing GRPC status, inferred error from HTTP status code");
                }
                c0Var.a(fVar);
                c0Var.a(fVar2);
                c0Var.a(z.f33592a);
                if (this.f35378p) {
                    vr.a.f35359g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{a10, c0Var});
                    return;
                }
                for (com.android.volley.toolbox.a aVar : this.f35370h.f35635a) {
                    ((io.grpc.c) aVar).getClass();
                }
                k(c0Var, a10, false);
                return;
            }
            byte[][] a13 = p.a(arrayList);
            Charset charset2 = y.f33590a;
            c0 c0Var2 = new c0(a13);
            i0 i0Var3 = this.r;
            if (i0Var3 != null) {
                this.r = i0Var3.a("headers: " + c0Var2);
                return;
            }
            try {
                if (this.f36116u) {
                    n10 = i0.f33487l.g("Received headers twice");
                    this.r = n10;
                    sb2 = new StringBuilder("headers: ");
                } else {
                    Integer num2 = (Integer) c0Var2.c(fVar);
                    if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                        n10 = this.r;
                        if (n10 != null) {
                            sb2 = new StringBuilder("headers: ");
                        } else {
                            return;
                        }
                    } else {
                        this.f36116u = true;
                        n10 = x0.n(c0Var2);
                        this.r = n10;
                        if (n10 != null) {
                            sb2 = new StringBuilder("headers: ");
                        } else {
                            c0Var2.a(fVar);
                            c0Var2.a(z.f33593b);
                            c0Var2.a(z.f33592a);
                            j(c0Var2);
                            n10 = this.r;
                            if (n10 != null) {
                                sb2 = new StringBuilder("headers: ");
                            } else {
                                return;
                            }
                        }
                    }
                }
                sb2.append(c0Var2);
                this.r = n10.a(sb2.toString());
                this.f36114s = c0Var2;
                this.f36115t = x0.m(c0Var2);
            } catch (Throwable th2) {
                i0 i0Var4 = this.r;
                if (i0Var4 != null) {
                    this.r = i0Var4.a("headers: " + c0Var2);
                    this.f36114s = c0Var2;
                    this.f36115t = x0.m(c0Var2);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(d0<?, ?> d0Var, c0 c0Var, wr.b bVar, i iVar, o oVar, Object obj, int i6, int i10, String str, String str2, g3 g3Var, m3 m3Var, io.grpc.b bVar2, boolean z10) {
        super(r1, g3Var, m3Var, c0Var, bVar2, r6);
        boolean z11;
        ca.a aVar = new ca.a();
        if (z10 && d0Var.f33456h) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37123m = new a();
        this.f37125o = false;
        this.f37120j = g3Var;
        this.f37118h = d0Var;
        this.f37121k = str;
        this.f37119i = str2;
        this.f37124n = iVar.f37149u;
        String str3 = d0Var.f33451b;
        this.f37122l = new b(i6, g3Var, obj, bVar, oVar, iVar, i10);
    }

    public static void s(h hVar, int i6) {
        e.a f = hVar.f();
        synchronized (f.f35522b) {
            f.f35525e += i6;
        }
    }

    @Override // vr.a, vr.e
    public final e.a f() {
        return this.f37122l;
    }

    @Override // vr.r
    public final void l(String str) {
        sc.b.w(str, "authority");
        this.f37121k = str;
    }

    @Override // vr.a
    public final a q() {
        return this.f37123m;
    }

    @Override // vr.a
    public final b r() {
        return this.f37122l;
    }
}
