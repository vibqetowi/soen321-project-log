package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class P2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f21360c;

    /* renamed from: d  reason: collision with root package name */
    private int f21361d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(InterfaceC0818r2 interfaceC0818r2) {
        super(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0809p2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        int[] iArr = this.f21360c;
        int i10 = this.f21361d;
        this.f21361d = i10 + 1;
        iArr[i10] = i6;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21360c = new int[(int) j10];
    }

    @Override // j$.util.stream.AbstractC0789l2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = 0;
        Arrays.sort(this.f21360c, 0, this.f21361d);
        InterfaceC0818r2 interfaceC0818r2 = this.f21504a;
        interfaceC0818r2.c(this.f21361d);
        if (this.f21268b) {
            while (i6 < this.f21361d && !interfaceC0818r2.e()) {
                interfaceC0818r2.accept(this.f21360c[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f21361d) {
                interfaceC0818r2.accept(this.f21360c[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
        this.f21360c = null;
    }
}
