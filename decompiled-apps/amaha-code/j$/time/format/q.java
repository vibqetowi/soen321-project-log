package j$.time.format;

import j$.time.AbstractC0689a;
import j$.time.chrono.AbstractC0693b;
import j$.time.chrono.InterfaceC0694c;
import j$.util.Objects;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q extends k {

    /* renamed from: i  reason: collision with root package name */
    static final j$.time.j f20921i = j$.time.j.h0(2000, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private final int f20922g;

    /* renamed from: h  reason: collision with root package name */
    private final InterfaceC0694c f20923h;

    private q(j$.time.temporal.p pVar, int i6, int i10, int i11, InterfaceC0694c interfaceC0694c, int i12) {
        super(pVar, i6, i10, G.NOT_NEGATIVE, i12);
        this.f20922g = i11;
        this.f20923h = interfaceC0694c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j$.time.temporal.p pVar, j$.time.j jVar) {
        this(pVar, 2, 2, 0, jVar, 0);
        if (jVar == null) {
            long j10 = 0;
            if (!pVar.n().i(j10)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j10 + k.f[2] > 2147483647L) {
                throw new j$.time.d("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(j$.time.temporal.p pVar, j$.time.j jVar, int i6) {
        this(pVar, 2, 2, 0, jVar, i6);
    }

    @Override // j$.time.format.k
    final long b(A a10, long j10) {
        long abs = Math.abs(j10);
        InterfaceC0694c interfaceC0694c = this.f20923h;
        long l2 = interfaceC0694c != null ? AbstractC0693b.r(a10.d()).E(interfaceC0694c).l(this.f20898a) : this.f20922g;
        long[] jArr = k.f;
        if (j10 >= l2) {
            long j11 = jArr[this.f20899b];
            if (j10 < l2 + j11) {
                return abs % j11;
            }
        }
        return abs % jArr[this.f20900c];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final boolean c(x xVar) {
        if (xVar.l()) {
            return super.c(xVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.p] */
    @Override // j$.time.format.k
    public final int d(final x xVar, final long j10, final int i6, final int i10) {
        int i11;
        InterfaceC0694c interfaceC0694c = this.f20923h;
        if (interfaceC0694c != null) {
            i11 = xVar.h().E(interfaceC0694c).l(this.f20898a);
            xVar.a(new Consumer() { // from class: j$.time.format.p
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j$.time.chrono.n nVar = (j$.time.chrono.n) obj;
                    q.this.d(xVar, j10, i6, i10);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return AbstractC0689a.c(this, consumer);
                }
            });
        } else {
            i11 = this.f20922g;
        }
        int i12 = i10 - i6;
        int i13 = this.f20899b;
        if (i12 == i13 && j10 >= 0) {
            long j11 = k.f[i13];
            long j12 = i11;
            long j13 = j12 - (j12 % j11);
            j10 = i11 > 0 ? j13 + j10 : j13 - j10;
            if (j10 < j12) {
                j10 += j11;
            }
        }
        return xVar.o(this.f20898a, j10, i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k e() {
        return this.f20902e == -1 ? this : new q(this.f20898a, this.f20899b, this.f20900c, this.f20922g, this.f20923h, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k f(int i6) {
        return new q(this.f20898a, this.f20899b, this.f20900c, this.f20922g, this.f20923h, this.f20902e + i6);
    }

    @Override // j$.time.format.k
    public final String toString() {
        Integer valueOf = Integer.valueOf(this.f20922g);
        Object obj = this.f20923h;
        if (obj == null) {
            obj = Objects.requireNonNull(valueOf, "defaultObj");
        }
        return "ReducedValue(" + this.f20898a + "," + this.f20899b + "," + this.f20900c + "," + obj + ")";
    }
}
