package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class G2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private U2 f21287c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        this.f21287c.accept(d10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21287c = j10 > 0 ? new U2((int) j10) : new U2();
    }

    @Override // j$.util.stream.AbstractC0784k2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        double[] dArr = (double[]) this.f21287c.b();
        Arrays.sort(dArr);
        InterfaceC0818r2 interfaceC0818r2 = this.f21501a;
        interfaceC0818r2.c(dArr.length);
        int i6 = 0;
        if (this.f21263b) {
            int length = dArr.length;
            while (i6 < length) {
                double d10 = dArr[i6];
                if (interfaceC0818r2.e()) {
                    break;
                }
                interfaceC0818r2.accept(d10);
                i6++;
            }
        } else {
            int length2 = dArr.length;
            while (i6 < length2) {
                interfaceC0818r2.accept(dArr[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
    }
}
