package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0828t2 extends AbstractC0769h2 {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ long f21553s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f21554t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0828t2(AbstractC0741c abstractC0741c, int i6, long j10, long j11) {
        super(abstractC0741c, i6);
        this.f21553s = j10;
        this.f21554t = j11;
    }

    static j$.util.S b1(j$.util.S s10, long j10, long j11, long j12) {
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
        return new J3(s10, j13, j14);
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        long k02 = abstractC0741c.k0(s10);
        return (k02 <= 0 || !s10.hasCharacteristics(16384)) ? !EnumC0765g3.ORDERED.r(abstractC0741c.s0()) ? AbstractC0850z0.a0(this, b1(abstractC0741c.a1(s10), this.f21553s, this.f21554t, k02), true, intFunction) : (I0) new B2(this, abstractC0741c, s10, intFunction, this.f21553s, this.f21554t).invoke() : AbstractC0850z0.a0(abstractC0741c, AbstractC0850z0.Y(abstractC0741c.Q0(), s10, this.f21553s, this.f21554t), true, intFunction);
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S U0(AbstractC0741c abstractC0741c, j$.util.S s10) {
        long k02 = abstractC0741c.k0(s10);
        if (k02 <= 0 || !s10.hasCharacteristics(16384)) {
            return !EnumC0765g3.ORDERED.r(abstractC0741c.s0()) ? b1(abstractC0741c.a1(s10), this.f21553s, this.f21554t, k02) : ((I0) new B2(this, abstractC0741c, s10, new C0736b(26), this.f21553s, this.f21554t).invoke()).spliterator();
        }
        j$.util.S a12 = abstractC0741c.a1(s10);
        long j10 = this.f21553s;
        return new D3(a12, j10, AbstractC0850z0.X(j10, this.f21554t));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        return new C0823s2(this, interfaceC0818r2);
    }
}
