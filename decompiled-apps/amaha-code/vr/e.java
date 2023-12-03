package vr;

import java.io.InputStream;
import vr.a;
import vr.h;
import vr.h2;
import vr.i3;
import wr.h;
/* compiled from: AbstractStream.java */
/* loaded from: classes2.dex */
public abstract class e implements h3 {

    /* compiled from: AbstractStream.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements h.d, h2.a {

        /* renamed from: a  reason: collision with root package name */
        public z f35521a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f35522b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final m3 f35523c;

        /* renamed from: d  reason: collision with root package name */
        public final h2 f35524d;

        /* renamed from: e  reason: collision with root package name */
        public int f35525e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f35526g;

        public a(int i6, g3 g3Var, m3 m3Var) {
            sc.b.w(m3Var, "transportTracer");
            this.f35523c = m3Var;
            h2 h2Var = new h2(this, i6, g3Var, m3Var);
            this.f35524d = h2Var;
            this.f35521a = h2Var;
        }

        @Override // vr.h2.a
        public final void a(i3.a aVar) {
            ((a.b) this).f35372j.a(aVar);
        }

        public final void b(int i6) {
            boolean z10;
            boolean z11;
            boolean z12;
            synchronized (this.f35522b) {
                sc.b.B("onStreamAllocated was not called, but it seems the stream is active", this.f);
                int i10 = this.f35525e;
                z10 = false;
                if (i10 < 32768) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = i10 - i6;
                this.f35525e = i11;
                if (i11 < 32768) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z11 && z12) {
                    z10 = true;
                }
            }
            if (z10) {
                h();
            }
        }

        public final boolean g() {
            boolean z10;
            synchronized (this.f35522b) {
                if (this.f && this.f35525e < 32768 && !this.f35526g) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }

        public final void h() {
            boolean g5;
            synchronized (this.f35522b) {
                g5 = g();
            }
            if (g5) {
                ((a.b) this).f35372j.onReady();
            }
        }
    }

    @Override // vr.h3
    public final void a(tr.h hVar) {
        sc.b.w(hVar, "compressor");
        ((vr.a) this).f35361b.a(hVar);
    }

    @Override // vr.h3
    public final void b(InputStream inputStream) {
        sc.b.w(inputStream, "message");
        try {
            if (!((vr.a) this).f35361b.isClosed()) {
                ((vr.a) this).f35361b.b(inputStream);
            }
        } finally {
            u0.b(inputStream);
        }
    }

    @Override // vr.h3
    public final void c() {
        a f = f();
        h2 h2Var = f.f35524d;
        h2Var.f35679u = f;
        f.f35521a = h2Var;
    }

    @Override // vr.h3
    public final void e(int i6) {
        a f = f();
        f.getClass();
        fs.b.a();
        ((h.b) f).f(new d(f, i6));
    }

    public abstract a f();

    @Override // vr.h3
    public final void flush() {
        s0 s0Var = ((vr.a) this).f35361b;
        if (!s0Var.isClosed()) {
            s0Var.flush();
        }
    }
}
