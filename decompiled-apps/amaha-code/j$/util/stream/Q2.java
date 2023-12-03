package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class Q2 extends E2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f21369c;

    /* renamed from: d  reason: collision with root package name */
    private int f21370d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        long[] jArr = this.f21369c;
        int i6 = this.f21370d;
        this.f21370d = i6 + 1;
        jArr[i6] = j10;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21369c = new long[(int) j10];
    }

    @Override // j$.util.stream.AbstractC0794m2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = 0;
        Arrays.sort(this.f21369c, 0, this.f21370d);
        InterfaceC0818r2 interfaceC0818r2 = this.f21507a;
        interfaceC0818r2.c(this.f21370d);
        if (this.f21273b) {
            while (i6 < this.f21370d && !interfaceC0818r2.e()) {
                interfaceC0818r2.accept(this.f21369c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f21370d) {
                interfaceC0818r2.accept(this.f21369c[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
        this.f21369c = null;
    }
}
