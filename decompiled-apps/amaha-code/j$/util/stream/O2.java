package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class O2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private double[] f21352c;

    /* renamed from: d  reason: collision with root package name */
    private int f21353d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0804o2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        double[] dArr = this.f21352c;
        int i6 = this.f21353d;
        this.f21353d = i6 + 1;
        dArr[i6] = d10;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21352c = new double[(int) j10];
    }

    @Override // j$.util.stream.AbstractC0784k2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = 0;
        Arrays.sort(this.f21352c, 0, this.f21353d);
        InterfaceC0818r2 interfaceC0818r2 = this.f21501a;
        interfaceC0818r2.c(this.f21353d);
        if (this.f21263b) {
            while (i6 < this.f21353d && !interfaceC0818r2.e()) {
                interfaceC0818r2.accept(this.f21352c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f21353d) {
                interfaceC0818r2.accept(this.f21352c[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
        this.f21352c = null;
    }
}
