package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
abstract class I3 extends L3 implements j$.util.O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public I3(j$.util.O o10, long j10, long j11) {
        super(o10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I3(j$.util.O o10, I3 i32) {
        super(o10, i32);
    }

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0795m3 abstractC0795m3 = null;
        while (true) {
            K3 f = f();
            if (f == K3.NO_MORE) {
                return;
            }
            K3 k32 = K3.MAYBE_MORE;
            j$.util.S s10 = this.f21324a;
            if (f != k32) {
                ((j$.util.O) s10).forEachRemaining(obj);
                return;
            }
            int i6 = this.f21326c;
            if (abstractC0795m3 == null) {
                abstractC0795m3 = i(i6);
            } else {
                abstractC0795m3.f21508b = 0;
            }
            long j10 = 0;
            while (((j$.util.O) s10).tryAdvance(abstractC0795m3)) {
                j10++;
                if (j10 >= i6) {
                    break;
                }
            }
            if (j10 == 0) {
                return;
            }
            abstractC0795m3.a(obj, a(j10));
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    protected abstract void g(Object obj);

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

    protected abstract AbstractC0795m3 i(int i6);

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != K3.NO_MORE && ((j$.util.O) this.f21324a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
