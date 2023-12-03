package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes3.dex */
final class R2 extends F2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f21374d;

    /* renamed from: e  reason: collision with root package name */
    private int f21375e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(InterfaceC0818r2 interfaceC0818r2, Comparator comparator) {
        super(interfaceC0818r2, comparator);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f21374d;
        int i6 = this.f21375e;
        this.f21375e = i6 + 1;
        objArr[i6] = obj;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21374d = new Object[(int) j10];
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = 0;
        Arrays.sort(this.f21374d, 0, this.f21375e, this.f21283b);
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        interfaceC0818r2.c(this.f21375e);
        if (this.f21284c) {
            while (i6 < this.f21375e && !interfaceC0818r2.e()) {
                interfaceC0818r2.accept((InterfaceC0818r2) this.f21374d[i6]);
                i6++;
            }
        } else {
            while (i6 < this.f21375e) {
                interfaceC0818r2.accept((InterfaceC0818r2) this.f21374d[i6]);
                i6++;
            }
        }
        interfaceC0818r2.end();
        this.f21374d = null;
    }
}
