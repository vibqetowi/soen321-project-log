package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0741c extends AbstractC0850z0 implements InterfaceC0771i {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0741c f21428h;

    /* renamed from: i  reason: collision with root package name */
    private final AbstractC0741c f21429i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f21430j;

    /* renamed from: k  reason: collision with root package name */
    private AbstractC0741c f21431k;

    /* renamed from: l  reason: collision with root package name */
    private int f21432l;

    /* renamed from: m  reason: collision with root package name */
    private int f21433m;

    /* renamed from: n  reason: collision with root package name */
    private j$.util.S f21434n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f21435o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21436p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f21437q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0741c(j$.util.S s10, int i6, boolean z10) {
        this.f21429i = null;
        this.f21434n = s10;
        this.f21428h = this;
        int i10 = EnumC0765g3.f21463g & i6;
        this.f21430j = i10;
        this.f21433m = (~(i10 << 1)) & EnumC0765g3.f21468l;
        this.f21432l = 0;
        this.r = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0741c(AbstractC0741c abstractC0741c, int i6) {
        if (abstractC0741c.f21435o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0741c.f21435o = true;
        abstractC0741c.f21431k = this;
        this.f21429i = abstractC0741c;
        this.f21430j = EnumC0765g3.f21464h & i6;
        this.f21433m = EnumC0765g3.l(i6, abstractC0741c.f21433m);
        AbstractC0741c abstractC0741c2 = abstractC0741c.f21428h;
        this.f21428h = abstractC0741c2;
        if (V0()) {
            abstractC0741c2.f21436p = true;
        }
        this.f21432l = abstractC0741c.f21432l + 1;
    }

    private j$.util.S X0(int i6) {
        int i10;
        int i11;
        AbstractC0741c abstractC0741c = this.f21428h;
        j$.util.S s10 = abstractC0741c.f21434n;
        if (s10 != null) {
            abstractC0741c.f21434n = null;
            if (abstractC0741c.r && abstractC0741c.f21436p) {
                AbstractC0741c abstractC0741c2 = abstractC0741c.f21431k;
                int i12 = 1;
                while (abstractC0741c != this) {
                    int i13 = abstractC0741c2.f21430j;
                    if (abstractC0741c2.V0()) {
                        if (EnumC0765g3.SHORT_CIRCUIT.r(i13)) {
                            i13 &= ~EnumC0765g3.f21476u;
                        }
                        s10 = abstractC0741c2.U0(abstractC0741c, s10);
                        if (s10.hasCharacteristics(64)) {
                            i10 = (~EnumC0765g3.f21475t) & i13;
                            i11 = EnumC0765g3.f21474s;
                        } else {
                            i10 = (~EnumC0765g3.f21474s) & i13;
                            i11 = EnumC0765g3.f21475t;
                        }
                        i13 = i11 | i10;
                        i12 = 0;
                    }
                    abstractC0741c2.f21432l = i12;
                    abstractC0741c2.f21433m = EnumC0765g3.l(i13, abstractC0741c.f21433m);
                    i12++;
                    AbstractC0741c abstractC0741c3 = abstractC0741c2;
                    abstractC0741c2 = abstractC0741c2.f21431k;
                    abstractC0741c = abstractC0741c3;
                }
            }
            if (i6 != 0) {
                this.f21433m = EnumC0765g3.l(i6, this.f21433m);
            }
            return s10;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final InterfaceC0818r2 I0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        f0(s10, J0((InterfaceC0818r2) Objects.requireNonNull(interfaceC0818r2)));
        return interfaceC0818r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final InterfaceC0818r2 J0(InterfaceC0818r2 interfaceC0818r2) {
        Objects.requireNonNull(interfaceC0818r2);
        AbstractC0741c abstractC0741c = this;
        while (abstractC0741c.f21432l > 0) {
            AbstractC0741c abstractC0741c2 = abstractC0741c.f21429i;
            interfaceC0818r2 = abstractC0741c.W0(abstractC0741c2.f21433m, interfaceC0818r2);
            abstractC0741c = abstractC0741c2;
        }
        return interfaceC0818r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I0 K0(j$.util.S s10, boolean z10, IntFunction intFunction) {
        if (this.f21428h.r) {
            return N0(this, s10, z10, intFunction);
        }
        D0 D0 = D0(k0(s10), intFunction);
        I0(s10, D0);
        return D0.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object L0(P3 p32) {
        if (this.f21435o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21435o = true;
        return this.f21428h.r ? p32.k(this, X0(p32.o())) : p32.y(this, X0(p32.o()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final I0 M0(IntFunction intFunction) {
        AbstractC0741c abstractC0741c;
        if (this.f21435o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21435o = true;
        if (this.f21428h.r && (abstractC0741c = this.f21429i) != null && V0()) {
            this.f21432l = 0;
            return T0(abstractC0741c.X0(0), abstractC0741c, intFunction);
        }
        return K0(X0(0), true, intFunction);
    }

    abstract I0 N0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10, IntFunction intFunction);

    abstract boolean O0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC0770h3 P0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC0770h3 Q0() {
        AbstractC0741c abstractC0741c = this;
        while (abstractC0741c.f21432l > 0) {
            abstractC0741c = abstractC0741c.f21429i;
        }
        return abstractC0741c.P0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R0() {
        return EnumC0765g3.ORDERED.r(this.f21433m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ j$.util.S S0() {
        return X0(0);
    }

    I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    j$.util.S U0(AbstractC0741c abstractC0741c, j$.util.S s10) {
        return T0(s10, abstractC0741c, new C0736b(0)).spliterator();
    }

    abstract boolean V0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.util.S Y0() {
        AbstractC0741c abstractC0741c = this.f21428h;
        if (this == abstractC0741c) {
            if (this.f21435o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f21435o = true;
            j$.util.S s10 = abstractC0741c.f21434n;
            if (s10 != null) {
                abstractC0741c.f21434n = null;
                return s10;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException();
    }

    abstract j$.util.S Z0(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.util.S a1(j$.util.S s10) {
        return this.f21432l == 0 ? s10 : Z0(this, new C0731a(s10, 0), this.f21428h.r);
    }

    @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
    public final void close() {
        this.f21435o = true;
        this.f21434n = null;
        AbstractC0741c abstractC0741c = this.f21428h;
        Runnable runnable = abstractC0741c.f21437q;
        if (runnable != null) {
            abstractC0741c.f21437q = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final void f0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        Objects.requireNonNull(interfaceC0818r2);
        if (EnumC0765g3.SHORT_CIRCUIT.r(this.f21433m)) {
            g0(s10, interfaceC0818r2);
            return;
        }
        interfaceC0818r2.c(s10.getExactSizeIfKnown());
        s10.forEachRemaining(interfaceC0818r2);
        interfaceC0818r2.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final boolean g0(j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        AbstractC0741c abstractC0741c = this;
        while (abstractC0741c.f21432l > 0) {
            abstractC0741c = abstractC0741c.f21429i;
        }
        interfaceC0818r2.c(s10.getExactSizeIfKnown());
        boolean O0 = abstractC0741c.O0(s10, interfaceC0818r2);
        interfaceC0818r2.end();
        return O0;
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final boolean isParallel() {
        return this.f21428h.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final long k0(j$.util.S s10) {
        if (EnumC0765g3.SIZED.r(this.f21433m)) {
            return s10.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final InterfaceC0771i onClose(Runnable runnable) {
        if (this.f21435o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC0741c abstractC0741c = this.f21428h;
        Runnable runnable2 = abstractC0741c.f21437q;
        if (runnable2 != null) {
            runnable = new O3(runnable2, runnable);
        }
        abstractC0741c.f21437q = runnable;
        return this;
    }

    public final InterfaceC0771i parallel() {
        this.f21428h.r = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0850z0
    public final int s0() {
        return this.f21433m;
    }

    public final InterfaceC0771i sequential() {
        this.f21428h.r = false;
        return this;
    }

    public j$.util.S spliterator() {
        if (this.f21435o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f21435o = true;
        AbstractC0741c abstractC0741c = this.f21428h;
        if (this == abstractC0741c) {
            j$.util.S s10 = abstractC0741c.f21434n;
            if (s10 != null) {
                abstractC0741c.f21434n = null;
                return s10;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return Z0(this, new C0731a(this, 1), abstractC0741c.r);
    }
}
