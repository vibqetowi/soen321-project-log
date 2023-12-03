package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N3 extends AbstractC0775i3 {
    N3(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        super(abstractC0850z0, s10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N3(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        super(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final void d() {
        C0740b3 c0740b3 = new C0740b3();
        this.f21494h = c0740b3;
        Objects.requireNonNull(c0740b3);
        this.f21492e = this.f21489b.J0(new M3(c0740b3, 0));
        this.f = new C0731a(this, 6);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final AbstractC0775i3 e(j$.util.S s10) {
        return new N3(this.f21489b, s10, this.f21488a);
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21494h != null || this.f21495i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        M3 m32 = new M3(consumer, 1);
        this.f21489b.I0(this.f21491d, m32);
        this.f21495i = true;
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a10 = a();
        if (a10) {
            C0740b3 c0740b3 = (C0740b3) this.f21494h;
            long j10 = this.f21493g;
            if (c0740b3.f21446c != 0) {
                if (j10 < c0740b3.count()) {
                    for (int i6 = 0; i6 <= c0740b3.f21446c; i6++) {
                        long j11 = c0740b3.f21447d[i6];
                        Object[] objArr = c0740b3.f[i6];
                        if (j10 < objArr.length + j11) {
                            obj = objArr[(int) (j10 - j11)];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else if (j10 >= c0740b3.f21445b) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                obj = c0740b3.f21427e[(int) j10];
            }
            consumer.accept(obj);
        }
        return a10;
    }
}
