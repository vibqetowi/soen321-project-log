package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0852z2 extends C {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ long f21610s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f21611t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0852z2(AbstractC0741c abstractC0741c, int i6, long j10, long j11) {
        super(abstractC0741c, i6);
        this.f21610s = j10;
        this.f21611t = j11;
    }

    static j$.util.F d1(j$.util.F f, long j10, long j11, long j12) {
        long j13;
        long j14;
        if (j10 <= j12) {
            long j15 = j12 - j10;
            j14 = j11 >= 0 ? Math.min(j11, j15) : j15;
            j13 = 0;
        } else {
            j13 = j10;
            j14 = j11;
        }
        return new F3(f, j13, j14);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        long k02 = abstractC0741c.k0(s10);
        return (k02 <= 0 || !s10.hasCharacteristics(16384)) ? !EnumC0765g3.ORDERED.r(abstractC0741c.s0()) ? AbstractC0850z0.b0(this, d1((j$.util.F) abstractC0741c.a1(s10), this.f21610s, this.f21611t, k02), true) : (I0) new B2(this, abstractC0741c, s10, intFunction, this.f21610s, this.f21611t).invoke() : AbstractC0850z0.b0(abstractC0741c, AbstractC0850z0.Y(abstractC0741c.Q0(), s10, this.f21610s, this.f21611t), true);
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S U0(AbstractC0741c abstractC0741c, j$.util.S s10) {
        long k02 = abstractC0741c.k0(s10);
        if (k02 <= 0 || !s10.hasCharacteristics(16384)) {
            return !EnumC0765g3.ORDERED.r(abstractC0741c.s0()) ? d1((j$.util.F) abstractC0741c.a1(s10), this.f21610s, this.f21611t, k02) : ((I0) new B2(this, abstractC0741c, s10, new O0(7), this.f21610s, this.f21611t).invoke()).spliterator();
        }
        long j10 = this.f21610s;
        return new x3((j$.util.F) abstractC0741c.a1(s10), j10, AbstractC0850z0.X(j10, this.f21611t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        return new C0848y2(this, interfaceC0818r2);
    }
}
