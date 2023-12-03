package j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0788l1 extends AbstractC0798n1 implements j$.util.O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0788l1(H0 h02) {
        super(h02);
    }

    @Override // j$.util.O
    public final void forEachRemaining(Object obj) {
        if (this.f21514a == null) {
            return;
        }
        if (this.f21517d != null) {
            do {
            } while (tryAdvance(obj));
            return;
        }
        j$.util.S s10 = this.f21516c;
        if (s10 != null) {
            ((j$.util.O) s10).forEachRemaining(obj);
            return;
        }
        ArrayDeque b10 = b();
        while (true) {
            H0 h02 = (H0) AbstractC0798n1.a(b10);
            if (h02 == null) {
                this.f21514a = null;
                return;
            }
            h02.g(obj);
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

    @Override // j$.util.O
    public final boolean tryAdvance(Object obj) {
        H0 h02;
        if (c()) {
            boolean tryAdvance = ((j$.util.O) this.f21517d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f21516c == null && (h02 = (H0) AbstractC0798n1.a(this.f21518e)) != null) {
                    j$.util.O spliterator = h02.spliterator();
                    this.f21517d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f21514a = null;
            }
            return tryAdvance;
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
