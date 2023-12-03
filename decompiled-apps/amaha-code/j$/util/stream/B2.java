package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
/* loaded from: classes3.dex */
final class B2 extends AbstractC0746d {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC0741c f21255j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f21256k;

    /* renamed from: l  reason: collision with root package name */
    private final long f21257l;

    /* renamed from: m  reason: collision with root package name */
    private final long f21258m;

    /* renamed from: n  reason: collision with root package name */
    private long f21259n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f21260o;

    B2(B2 b22, j$.util.S s10) {
        super(b22, s10);
        this.f21255j = b22.f21255j;
        this.f21256k = b22.f21256k;
        this.f21257l = b22.f21257l;
        this.f21258m = b22.f21258m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B2(AbstractC0741c abstractC0741c, AbstractC0741c abstractC0741c2, j$.util.S s10, IntFunction intFunction, long j10, long j11) {
        super(abstractC0741c2, s10);
        this.f21255j = abstractC0741c;
        this.f21256k = intFunction;
        this.f21257l = j10;
        this.f21258m = j11;
    }

    private long k(long j10) {
        if (this.f21260o) {
            return this.f21259n;
        }
        B2 b22 = (B2) this.f21455d;
        B2 b23 = (B2) this.f21456e;
        if (b22 == null || b23 == null) {
            return this.f21259n;
        }
        long k10 = b22.k(j10);
        return k10 >= j10 ? k10 : k10 + b23.k(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final Object a() {
        if (d() == null) {
            D0 D0 = this.f21255j.D0(EnumC0765g3.SIZED.G(this.f21255j.f21430j) ? this.f21255j.k0(this.f21453b) : -1L, this.f21256k);
            InterfaceC0818r2 W0 = this.f21255j.W0(this.f21452a.s0(), D0);
            AbstractC0850z0 abstractC0850z0 = this.f21452a;
            abstractC0850z0.g0(this.f21453b, abstractC0850z0.J0(W0));
            return D0.build();
        }
        D0 D02 = this.f21255j.D0(-1L, this.f21256k);
        if (this.f21257l == 0) {
            InterfaceC0818r2 W02 = this.f21255j.W0(this.f21452a.s0(), D02);
            AbstractC0850z0 abstractC0850z02 = this.f21452a;
            abstractC0850z02.g0(this.f21453b, abstractC0850z02.J0(W02));
        } else {
            this.f21452a.I0(this.f21453b, D02);
        }
        I0 build = D02.build();
        this.f21259n = build.count();
        this.f21260o = true;
        this.f21453b = null;
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final AbstractC0756f e(j$.util.S s10) {
        return new B2(this, s10);
    }

    @Override // j$.util.stream.AbstractC0746d
    protected final void h() {
        this.f21442i = true;
        if (this.f21260o) {
            f(j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0746d
    /* renamed from: l */
    public final AbstractC0748d1 j() {
        return AbstractC0850z0.j0(this.f21255j.P0());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        B2 b22;
        I0 e0;
        AbstractC0756f abstractC0756f = this.f21455d;
        boolean z10 = true;
        if (!(abstractC0756f == null)) {
            this.f21259n = ((B2) abstractC0756f).f21259n + ((B2) this.f21456e).f21259n;
            if (this.f21442i) {
                this.f21259n = 0L;
            } else if (this.f21259n != 0) {
                e0 = ((B2) this.f21455d).f21259n == 0 ? (I0) ((B2) this.f21456e).c() : AbstractC0850z0.e0(this.f21255j.P0(), (I0) ((B2) this.f21455d).c(), (I0) ((B2) this.f21456e).c());
                I0 i02 = e0;
                if (d() != null) {
                    i02 = i02.i(this.f21257l, this.f21258m >= 0 ? Math.min(i02.count(), this.f21257l + this.f21258m) : this.f21259n, this.f21256k);
                }
                f(i02);
                this.f21260o = true;
            }
            e0 = j();
            I0 i022 = e0;
            if (d() != null) {
            }
            f(i022);
            this.f21260o = true;
        }
        if (this.f21258m >= 0) {
            if (!(d() == null)) {
                long j10 = this.f21257l + this.f21258m;
                long k10 = this.f21260o ? this.f21259n : k(j10);
                if (k10 < j10) {
                    B2 b23 = (B2) d();
                    B2 b24 = this;
                    while (true) {
                        if (b23 != null) {
                            if (b24 == b23.f21456e && (b22 = (B2) b23.f21455d) != null) {
                                k10 += b22.k(j10);
                                if (k10 >= j10) {
                                    break;
                                }
                            }
                            b24 = b23;
                            b23 = (B2) b23.d();
                        } else if (k10 < j10) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    i();
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
