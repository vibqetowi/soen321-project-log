package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class H2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private W2 f21291c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        this.f21291c.accept(i6);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21291c = j10 > 0 ? new W2((int) j10) : new W2();
    }

    @Override // j$.util.stream.AbstractC0789l2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        int[] iArr = (int[]) this.f21291c.b();
        Arrays.sort(iArr);
        InterfaceC0818r2 interfaceC0818r2 = this.f21504a;
        interfaceC0818r2.c(iArr.length);
        int i6 = 0;
        if (this.f21268b) {
            int length = iArr.length;
            while (i6 < length) {
                int i10 = iArr[i6];
                if (interfaceC0818r2.e()) {
                    break;
                }
                interfaceC0818r2.accept(i10);
                i6++;
            }
        } else {
            int length2 = iArr.length;
            while (i6 < length2) {
                interfaceC0818r2.accept(iArr[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
    }
}
