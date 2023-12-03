package p7;

import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import java.util.Arrays;
/* compiled from: AnalyticsListener.java */
/* loaded from: classes.dex */
public interface o {

    /* compiled from: AnalyticsListener.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f27974a;

        /* renamed from: b  reason: collision with root package name */
        public final e0 f27975b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27976c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a f27977d;

        /* renamed from: e  reason: collision with root package name */
        public final long f27978e;
        public final e0 f;

        /* renamed from: g  reason: collision with root package name */
        public final int f27979g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a f27980h;

        /* renamed from: i  reason: collision with root package name */
        public final long f27981i;

        /* renamed from: j  reason: collision with root package name */
        public final long f27982j;

        public a(long j10, e0 e0Var, int i6, i.a aVar, long j11, e0 e0Var2, int i10, i.a aVar2, long j12, long j13) {
            this.f27974a = j10;
            this.f27975b = e0Var;
            this.f27976c = i6;
            this.f27977d = aVar;
            this.f27978e = j11;
            this.f = e0Var2;
            this.f27979g = i10;
            this.f27980h = aVar2;
            this.f27981i = j12;
            this.f27982j = j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f27974a == aVar.f27974a && this.f27976c == aVar.f27976c && this.f27978e == aVar.f27978e && this.f27979g == aVar.f27979g && this.f27981i == aVar.f27981i && this.f27982j == aVar.f27982j && f6.b.v0(this.f27975b, aVar.f27975b) && f6.b.v0(this.f27977d, aVar.f27977d) && f6.b.v0(this.f, aVar.f) && f6.b.v0(this.f27980h, aVar.f27980h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f27974a), this.f27975b, Integer.valueOf(this.f27976c), this.f27977d, Long.valueOf(this.f27978e), this.f, Integer.valueOf(this.f27979g), this.f27980h, Long.valueOf(this.f27981i), Long.valueOf(this.f27982j)});
        }
    }

    void A();

    @Deprecated
    void B();

    void C();

    @Deprecated
    void D();

    void E();

    void F();

    void G();

    void H();

    void I();

    @Deprecated
    void J();

    @Deprecated
    void K();

    void L();

    void M();

    void N();

    void O();

    void P();

    void Q();

    void R();

    void S();

    void T();

    void U();

    void V();

    @Deprecated
    void W();

    @Deprecated
    void X();

    void Y();

    void Z();

    void a();

    void a0();

    @Deprecated
    void b();

    void b0();

    void c();

    void c0();

    @Deprecated
    void d();

    void d0();

    @Deprecated
    void e();

    void e0();

    void f();

    void f0();

    void g();

    void g0();

    void h();

    void h0();

    @Deprecated
    void i();

    void i0();

    @Deprecated
    void j();

    void j0();

    @Deprecated
    void k();

    void k0();

    @Deprecated
    void l();

    @Deprecated
    void l0();

    void m();

    void m0();

    void n();

    @Deprecated
    void n0();

    void o();

    void o0();

    void p();

    @Deprecated
    void p0();

    void q();

    void q0();

    void r();

    void s();

    void t();

    void u();

    void v();

    void w();

    void x();

    void y();

    void z();
}
