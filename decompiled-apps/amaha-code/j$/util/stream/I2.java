package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class I2 extends E2 {

    /* renamed from: c  reason: collision with root package name */
    private Y2 f21298c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21298c.accept(j10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21298c = j10 > 0 ? new Y2((int) j10) : new Y2();
    }

    @Override // j$.util.stream.AbstractC0794m2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        long[] jArr = (long[]) this.f21298c.b();
        Arrays.sort(jArr);
        InterfaceC0818r2 interfaceC0818r2 = this.f21507a;
        interfaceC0818r2.c(jArr.length);
        int i6 = 0;
        if (this.f21273b) {
            int length = jArr.length;
            while (i6 < length) {
                long j10 = jArr[i6];
                if (interfaceC0818r2.e()) {
                    break;
                }
                interfaceC0818r2.accept(j10);
                i6++;
            }
        } else {
            int length2 = jArr.length;
            while (i6 < length2) {
                interfaceC0818r2.accept(jArr[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
    }
}
