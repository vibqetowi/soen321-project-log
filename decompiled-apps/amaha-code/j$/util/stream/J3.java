package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class J3 extends L3 implements j$.util.S, Consumer {
    Object f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J3(j$.util.S s10, long j10, long j11) {
        super(s10, j10, j11);
    }

    J3(j$.util.S s10, J3 j32) {
        super(s10, j32);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.L3
    protected final j$.util.S b(j$.util.S s10) {
        return new J3(s10, this);
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0800n3 c0800n3 = null;
        while (true) {
            K3 f = f();
            if (f == K3.NO_MORE) {
                return;
            }
            K3 k32 = K3.MAYBE_MORE;
            j$.util.S s10 = this.f21324a;
            if (f != k32) {
                s10.forEachRemaining(consumer);
                return;
            }
            int i6 = this.f21326c;
            if (c0800n3 == null) {
                c0800n3 = new C0800n3(i6);
            } else {
                c0800n3.f21527a = 0;
            }
            long j10 = 0;
            while (s10.tryAdvance(c0800n3)) {
                j10++;
                if (j10 >= i6) {
                    break;
                }
            }
            if (j10 == 0) {
                return;
            }
            long a10 = a(j10);
            for (int i10 = 0; i10 < a10; i10++) {
                consumer.accept(c0800n3.f21520b[i10]);
            }
        }
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != K3.NO_MORE && this.f21324a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
